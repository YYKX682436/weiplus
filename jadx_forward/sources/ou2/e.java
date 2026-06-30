package ou2;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final pu2.b f430468a = new pu2.b();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f430469b = new java.util.LinkedHashMap();

    public void a(ts5.m calculator, ts5.p uniqueTag, boolean z17) {
        java.util.List arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(calculator, "calculator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueTag, "uniqueTag");
        ts5.a aVar = uniqueTag.f503274a;
        java.util.List list = (java.util.List) this.f430469b.remove(uniqueTag);
        if (!z17) {
            if (list == null || list.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TraceWorker", "#calculateAndReport data stream not exist. uniqueTag=" + uniqueTag);
                return;
            }
        }
        if (list == null) {
            try {
                arrayList = new java.util.ArrayList();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TraceWorker", e17.toString());
                return;
            }
        } else {
            arrayList = list;
        }
        org.json.JSONObject a17 = calculator.a(p3321xbce91901.jvm.p3324x21ffc6bd.m0.b(arrayList), uniqueTag);
        int ordinal = aVar.ordinal();
        pu2.b bVar = this.f430468a;
        if (ordinal == 1) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("sample_size", java.lang.Integer.valueOf(list != null ? list.size() : 0));
            bVar.a(uniqueTag, new pu2.a(2002, 0, a17, linkedHashMap));
        } else if (ordinal == 2) {
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            linkedHashMap2.put("sample_size", java.lang.Integer.valueOf(list != null ? list.size() : 0));
            bVar.a(uniqueTag, new pu2.a(2003, 0, a17, linkedHashMap2));
        } else {
            int ordinal2 = aVar.ordinal();
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
            linkedHashMap3.put("sample_size", java.lang.Integer.valueOf(list != null ? list.size() : 0));
            bVar.a(uniqueTag, new pu2.a(ordinal2, 0, a17, linkedHashMap3));
        }
    }
}
