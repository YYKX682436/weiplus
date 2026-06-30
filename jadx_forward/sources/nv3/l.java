package nv3;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f422220a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f422221b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f422222c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f422223d;

    public l(java.lang.String moduleName, java.lang.String pageName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageName, "pageName");
        this.f422220a = moduleName;
        this.f422221b = pageName;
        this.f422222c = "MusicLoadingTimeHelper";
        this.f422223d = new java.util.LinkedHashSet();
    }

    public final void a(long j17) {
        java.util.Set set = this.f422223d;
        if (set.contains(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f422222c, "[markEndLoading] recorded");
            return;
        }
        set.add(java.lang.Long.valueOf(j17));
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((qs2.q) ((w40.e) c17)).rj(this.f422220a, this.f422221b, pm0.v.u(j17), -1);
    }

    public final void b(long j17) {
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        w40.e.eh((w40.e) c17, this.f422220a, this.f422221b, pm0.v.u(j17), 0, 8, null);
    }
}
