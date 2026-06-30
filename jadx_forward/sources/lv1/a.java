package lv1;

/* loaded from: classes8.dex */
public class a extends fv1.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13093xec21e540 f403025e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13093xec21e540 serviceC13093xec21e540) {
        this.f403025e = serviceC13093xec21e540;
    }

    @Override // fv1.c
    public boolean Ba(java.lang.String str) {
        hv1.d.f().c(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadService", "removeDownloadTask: true");
        return true;
    }

    @Override // fv1.c
    public boolean Je(java.lang.String str) {
        hv1.d.f().d(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadService", "pauseDownloadTask: true");
        return true;
    }

    @Override // fv1.c
    public void Vf() {
    }

    @Override // fv1.c
    public void Wb() {
        vk0.e eVar = vk0.c.f519284a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13093xec21e540 serviceC13093xec21e540 = this.f403025e;
        if (eVar.b(serviceC13093xec21e540)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadService", "addIPCTaskMarker");
        eVar.a(serviceC13093xec21e540);
    }

    @Override // fv1.c
    public void X8(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadService", "notifyNetworkChange: " + i17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37522xde9f63df();
        if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
            com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84235xde9f63df();
        }
    }

    @Override // fv1.c
    public int aa(com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00 c13091xf399cf00) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadService", "resumeDownloadTask: %s", c13091xf399cf00.f177032e);
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_CDNDownloadService_2";
        mVar.F = c13091xf399cf00.f177031d;
        mVar.f69601xaca5bdda = c13091xf399cf00.f177033f;
        mVar.f69595x6d25b0d9 = c13091xf399cf00.f177034g;
        vz.y1 y1Var = (vz.y1) i95.n0.c(vz.y1.class);
        java.lang.String str = c13091xf399cf00.f177032e;
        ((uz.a2) y1Var).getClass();
        mVar.f323344z = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.a(str);
        vz.y1 y1Var2 = (vz.y1) i95.n0.c(vz.y1.class);
        java.lang.String str2 = c13091xf399cf00.f177035h;
        ((uz.a2) y1Var2).getClass();
        mVar.I = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.a(str2);
        mVar.f323320f = com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13093xec21e540.f177048e;
        mVar.A = c13091xf399cf00.f177037m;
        mVar.B = c13091xf399cf00.f177038n;
        mVar.E = c13091xf399cf00.f177040p;
        mVar.G = c13091xf399cf00.f177039o;
        mVar.H = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13093xec21e540.a(this.f403025e, mVar, c13091xf399cf00.f177036i);
        int g17 = hv1.d.f().g(mVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadService", "resumeDownloadTask: " + g17);
        return g17;
    }

    @Override // fv1.c
    public void ca(fv1.f fVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadService", "registerCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13093xec21e540.f177047d = fVar;
    }

    @Override // fv1.c
    public void d3(fv1.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13093xec21e540.f177047d = null;
    }

    @Override // fv1.c
    public void m5() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadService", "removeIPCTaskMarker");
        vk0.c.f519284a.c(this.f403025e);
    }

    @Override // fv1.c
    public com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13092x802fa47f p6(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0 c4446x11b6e6e0 = (com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class);
        if (c4446x11b6e6e0 == null) {
            c4446x11b6e6e0 = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0(com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179());
            com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37617xa38667cc(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class, c4446x11b6e6e0);
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnTaskStateInfo m37751x7d770260 = c4446x11b6e6e0.m37751x7d770260(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13092x802fa47f c13092x802fa47f = new com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13092x802fa47f();
        if (m37751x7d770260 != null) {
            c13092x802fa47f.f177044d = m37751x7d770260.f18033xa1f4a0c;
            c13092x802fa47f.f177046f = (int) m37751x7d770260.f18032xb68f8349;
            c13092x802fa47f.f177045e = (int) m37751x7d770260.f18031xe78f40da;
        }
        return c13092x802fa47f;
    }

    @Override // fv1.c
    public int y2(com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00 c13091xf399cf00) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadService", "addDownloadTask: %s filepath:%s", c13091xf399cf00.f177032e, c13091xf399cf00.f177034g);
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_CDNDownloadService_1";
        mVar.F = c13091xf399cf00.f177031d;
        mVar.f69601xaca5bdda = c13091xf399cf00.f177033f;
        mVar.f69595x6d25b0d9 = c13091xf399cf00.f177034g;
        vz.y1 y1Var = (vz.y1) i95.n0.c(vz.y1.class);
        java.lang.String str = c13091xf399cf00.f177032e;
        ((uz.a2) y1Var).getClass();
        mVar.f323344z = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.a(str);
        vz.y1 y1Var2 = (vz.y1) i95.n0.c(vz.y1.class);
        java.lang.String str2 = c13091xf399cf00.f177035h;
        ((uz.a2) y1Var2).getClass();
        mVar.I = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.a(str2);
        mVar.f323320f = com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13093xec21e540.f177048e;
        mVar.A = c13091xf399cf00.f177037m;
        mVar.B = c13091xf399cf00.f177038n;
        mVar.G = c13091xf399cf00.f177039o;
        mVar.E = c13091xf399cf00.f177040p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13093xec21e540.a(this.f403025e, mVar, c13091xf399cf00.f177036i);
        int b17 = hv1.d.f().b(mVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadService", "addDownloadTask: " + b17);
        return b17;
    }
}
