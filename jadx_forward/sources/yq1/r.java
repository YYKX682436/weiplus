package yq1;

/* loaded from: classes8.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f545994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f545995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f545996f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f545997g;

    public r(java.lang.String str, int i17, int i18, int i19) {
        this.f545994d = str;
        this.f545995e = i17;
        this.f545996f = i18;
        this.f545997g = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lr1.c0 c0Var = lr1.c0.f402176a;
        int i17 = this.f545995e;
        int i18 = this.f545996f;
        int i19 = this.f545997g;
        java.lang.String url = this.f545994d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new lr1.z(java.lang.System.currentTimeMillis(), url, i17, i19, i18, 2, null), 2, null);
    }
}
