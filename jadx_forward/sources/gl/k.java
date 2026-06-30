package gl;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public cv.v0 f354298a;

    /* renamed from: b, reason: collision with root package name */
    public long f354299b;

    public final void a(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6330x511aadfc c6330x511aadfc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6330x511aadfc();
        c6330x511aadfc.f136875e = i17;
        c6330x511aadfc.f136880j = i18;
        if (i18 == 0 && i19 != -1) {
            cv.v0 v0Var = this.f354298a;
            c6330x511aadfc.f136881k = c6330x511aadfc.b("CurrentDevice", java.lang.String.valueOf(v0Var != null ? java.lang.Integer.valueOf(v0Var.f304049a) : null), true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            cv.v0 v0Var2 = this.f354298a;
            sb6.append(v0Var2 != null ? java.lang.Integer.valueOf(v0Var2.f304049a) : null);
            sb6.append('-');
            sb6.append(i19);
            c6330x511aadfc.f136877g = c6330x511aadfc.b("RouteTo", sb6.toString(), true);
        }
        c6330x511aadfc.f136874d = 4;
        c6330x511aadfc.o();
        c6330x511aadfc.k();
    }

    public final void b(int i17, cv.v0 targetDevice, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetDevice, "targetDevice");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6330x511aadfc c6330x511aadfc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6330x511aadfc();
        c6330x511aadfc.f136875e = i17;
        cv.v0 v0Var = this.f354298a;
        c6330x511aadfc.f136881k = c6330x511aadfc.b("CurrentDevice", java.lang.String.valueOf(v0Var != null ? java.lang.Integer.valueOf(v0Var.f304049a) : null), true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        cv.v0 v0Var2 = this.f354298a;
        sb6.append(v0Var2 != null ? java.lang.Integer.valueOf(v0Var2.f304049a) : null);
        sb6.append('-');
        sb6.append(targetDevice.f304049a);
        c6330x511aadfc.f136877g = c6330x511aadfc.b("RouteTo", sb6.toString(), true);
        long j17 = this.f354299b;
        c6330x511aadfc.f136879i = j17 != 0 ? android.os.SystemClock.elapsedRealtime() - j17 : 0L;
        c6330x511aadfc.f136874d = 1;
        c6330x511aadfc.f136876f = i18;
        c6330x511aadfc.f136878h = z17 ? 1 : 0;
        c6330x511aadfc.o();
        c6330x511aadfc.k();
        this.f354298a = targetDevice;
        this.f354299b = android.os.SystemClock.elapsedRealtime();
    }
}
