package vn4;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f519967a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f519968b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f519969c;

    public a(java.lang.String name, java.lang.String relPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(relPath, "relPath");
        this.f519967a = relPath;
        java.util.List f07 = r26.n0.f0(name, new java.lang.String[]{"_"}, false, 0, 6, null);
        if (f07.size() == 3) {
            this.f519968b = (java.lang.String) f07.get(0);
            this.f519969c = (java.lang.String) f07.get(1);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HpRevertHelper", "parse Patch Info error! name=".concat(name));
            this.f519968b = "";
            this.f519969c = "";
        }
    }
}
