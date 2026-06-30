package re5;

/* loaded from: classes11.dex */
public final class e0 implements ok4.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f476103a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6452x1b1ee249 f476104b;

    /* renamed from: c, reason: collision with root package name */
    public final long f476105c;

    public e0(java.util.Map reportParams, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6452x1b1ee249 fileVideoPlayerReportStruct, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        reportParams = (i17 & 1) != 0 ? new java.util.LinkedHashMap() : reportParams;
        j17 = (i17 & 4) != 0 ? java.lang.System.currentTimeMillis() : j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportParams, "reportParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileVideoPlayerReportStruct, "fileVideoPlayerReportStruct");
        this.f476103a = reportParams;
        this.f476104b = fileVideoPlayerReportStruct;
        this.f476105c = j17;
    }

    @Override // ok4.d
    public void a(int i17) {
    }

    @Override // ok4.d
    public void e() {
    }

    @Override // ok4.d
    public void g(int i17, int i18) {
    }

    @Override // ok4.d
    public void h() {
    }

    @Override // ok4.d
    public void l(boolean z17, java.lang.String str) {
        re5.d[] dVarArr = re5.d.f476095d;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6452x1b1ee249 c6452x1b1ee249 = this.f476104b;
        c6452x1b1ee249.f137925d = c6452x1b1ee249.b("EventId", "tp_on_prepare", true);
        c6452x1b1ee249.f137926e = c6452x1b1ee249.b("EventParams", r26.i0.t(java.lang.String.valueOf(ri.l0.a(kz5.c1.t(this.f476103a))), ",", ";", false), true);
        c6452x1b1ee249.k();
    }

    @Override // ok4.d
    /* renamed from: onCompleted */
    public void mo123988xaa8b332c() {
    }

    @Override // ok4.d
    /* renamed from: onError */
    public void mo123989xaf8aa769(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Video.LocalVideoPlayerReporter", "onError: errorCode=" + i17 + ", errorType=" + i18);
        java.util.Map t17 = kz5.c1.t(this.f476103a);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        re5.e[] eVarArr = re5.e.f476102d;
        t17.put("tp_error_code", valueOf);
        t17.put("tp_error_type", java.lang.Integer.valueOf(i18));
        re5.d[] dVarArr = re5.d.f476095d;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6452x1b1ee249 c6452x1b1ee249 = this.f476104b;
        c6452x1b1ee249.f137925d = c6452x1b1ee249.b("EventId", "tp_on_error", true);
        c6452x1b1ee249.f137926e = c6452x1b1ee249.b("EventParams", r26.i0.t(java.lang.String.valueOf(ri.l0.a(t17)), ",", ";", false), true);
        c6452x1b1ee249.k();
    }

    @Override // ok4.d
    /* renamed from: onPause */
    public void mo123990xb01dfb57() {
    }

    @Override // ok4.d
    /* renamed from: onStart */
    public void mo123991xb05099c3() {
    }

    @Override // ok4.d
    /* renamed from: onStop */
    public void mo123992xc39f8281() {
    }

    @Override // ok4.d
    public void q() {
    }

    @Override // ok4.d
    public void s() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.LocalVideoPlayerReporter", "onFirstVideoFrame");
        java.util.Map t17 = kz5.c1.t(this.f476103a);
        re5.e[] eVarArr = re5.e.f476102d;
        t17.put("tp_start_play_duration", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f476105c));
        re5.d[] dVarArr = re5.d.f476095d;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6452x1b1ee249 c6452x1b1ee249 = this.f476104b;
        c6452x1b1ee249.f137925d = c6452x1b1ee249.b("EventId", "tp_on_first_frame", true);
        c6452x1b1ee249.f137926e = c6452x1b1ee249.b("EventParams", r26.i0.t(java.lang.String.valueOf(ri.l0.a(t17)), ",", ";", false), true);
        c6452x1b1ee249.k();
    }

    @Override // ok4.d
    public void t(int i17, long j17, long j18) {
        java.util.Objects.toString(this.f476103a);
    }
}
