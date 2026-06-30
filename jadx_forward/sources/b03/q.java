package b03;

/* loaded from: classes11.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f98393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f98394e;

    public q(long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f98393d = j17;
        this.f98394e = interfaceC29045xdcb5ca57;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.m137635xcd29dd68(com.p314xaae8f345.mm.p775xd2ae381c.p776x2e06d1.C10700xb01f0b48.INSTANCE.m45338x9f058f5c());
        e50.j1 j1Var = e50.j1.f331041a;
        j1Var.c();
        if (j1Var.a() && e50.j1.f331043c) {
            int m137566x6c8b1a50 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.m137566x6c8b1a50();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CachedFlutterEngines", "vulkanTestResult:" + m137566x6c8b1a50);
            if (m137566x6c8b1a50 >= 0) {
                boolean z17 = m137566x6c8b1a50 > 0;
                j1Var.b().D(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52909x9bfe27d4, android.os.Build.MODEL);
                j1Var.b().G("vulkan_test_result", z17);
                e50.j1.f331043c = false;
                e50.j1.f331044d = z17;
            }
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CachedFlutterEngines", "init FlutterLoader cost:" + (android.os.SystemClock.elapsedRealtime() - this.f98393d) + " ms");
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f98394e.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
    }
}
