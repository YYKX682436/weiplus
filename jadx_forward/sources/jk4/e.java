package jk4;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public jk4.b f381683a;

    /* renamed from: b, reason: collision with root package name */
    public long f381684b;

    /* renamed from: c, reason: collision with root package name */
    public long f381685c;

    /* renamed from: d, reason: collision with root package name */
    public long f381686d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f381687e = new java.util.HashMap();

    public final void a(int i17, jk4.a info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.HashMap hashMap = this.f381687e;
        if (hashMap.isEmpty() || this.f381686d <= 0) {
            this.f381686d = info.f381665b;
        }
        jk4.b bVar = this.f381683a;
        if (bVar != null) {
            info.f381670g = (int) ((((float) bVar.f381676b) * 1.0f) / bVar.f381675a);
            info.f381671h = bVar.f381677c;
            info.f381672i = bVar.f381678d;
            bVar.f381675a = 0;
            bVar.f381676b = 0L;
            bVar.f381677c = 0;
            bVar.f381678d = 0;
        }
        hashMap.put(java.lang.Integer.valueOf(i17), info);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MV.MvReportInfo", i17 + ", " + info);
    }

    /* renamed from: toString */
    public java.lang.String m141073x9616526c() {
        java.util.Set entrySet = this.f381687e.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        return kz5.n0.g0(entrySet, null, null, null, 0, null, jk4.d.f381682d, 31, null);
    }
}
