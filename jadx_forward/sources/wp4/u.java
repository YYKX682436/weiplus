package wp4;

/* loaded from: classes4.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f529975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f529976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f529977f;

    public u(java.lang.String str, int i17, int i18) {
        this.f529975d = str;
        this.f529976e = i17;
        this.f529977f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String workTagId = this.f529975d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportUploadAction >> workTagId: ");
        sb6.append(workTagId);
        sb6.append(", action: ");
        sb6.append(7);
        sb6.append(", lastWorkType: ");
        int i17 = this.f529976e;
        sb6.append(i17);
        sb6.append(", currentWorkType: ");
        int i18 = this.f529977f;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeVideoTecReporter", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b c6893x57fb842b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b();
        c6893x57fb842b.p(workTagId);
        c6893x57fb842b.f142084d = 7;
        c6893x57fb842b.f142087g = i17;
        c6893x57fb842b.f142088h = i18;
        c6893x57fb842b.k();
    }
}
