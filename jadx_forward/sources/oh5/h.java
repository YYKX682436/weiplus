package oh5;

/* loaded from: classes.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f427030d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.util.ArrayList arrayList) {
        super(1);
        this.f427030d = arrayList;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.String string = it.getString("so");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String str = (java.lang.String) r26.n0.f0(string, new java.lang.String[]{"/"}, false, 0, 6, null).get(r1.size() - 1);
        java.lang.String string2 = it.getString("size");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        long parseLong = java.lang.Long.parseLong(string2);
        java.lang.Long l17 = (java.lang.Long) ((java.util.LinkedHashMap) oh5.j.f427033a).get(str);
        if (parseLong > (l17 != null ? l17.longValue() : oh5.j.f427034b)) {
            this.f427030d.add(new oh5.p(str, parseLong));
        }
        return jz5.f0.f384359a;
    }
}
