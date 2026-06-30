package pe;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f435124a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f435125b;

    public e(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a() {
        java.lang.String str = this.f435125b;
        if (str == null || str.length() == 0) {
            try {
                java.util.HashMap hashMap = this.f435124a;
                java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.size());
                for (java.util.Map.Entry entry : hashMap.entrySet()) {
                    java.lang.String str2 = (java.lang.String) entry.getKey();
                    java.lang.Object value = entry.getValue();
                    arrayList.add(value instanceof org.json.JSONObject ? str2 + '=' + fp.s0.a(value.toString()) : str2 + '=' + value);
                }
                this.f435125b = kz5.n0.g0(arrayList, "&", null, null, 0, null, null, 62, null);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.ExptMapping", "reportValue::get exception:" + e17);
            }
        }
        java.lang.String str3 = this.f435125b;
        return str3 == null ? "" : str3;
    }
}
