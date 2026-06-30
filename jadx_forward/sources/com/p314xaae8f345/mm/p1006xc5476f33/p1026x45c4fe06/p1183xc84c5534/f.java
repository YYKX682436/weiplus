package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f169372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.h f169373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.i f169374f;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.h hVar) {
        this.f169374f = iVar;
        this.f169372d = c11510xdd90c2f2;
        this.f169373e = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f169372d;
        if (c11510xdd90c2f2 == null || c11510xdd90c2f2.C0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandGameExtraConfigMgr", "hy: runtime is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.h hVar = this.f169373e;
            if (hVar != null) {
                ((fa1.f) hVar).a(false, null);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = this.f169372d;
        int i17 = c11510xdd90c2f22 instanceof ze.n ? ((ze.n) c11510xdd90c2f22).u0().f128817z : 4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameExtraConfigMgr", "hy: trigger wxa game config update, appServiceType:%d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.i iVar = this.f169374f;
        iVar.f169396c = null;
        iVar.f169397d = null;
        iVar.f169398e = null;
        iVar.f169399f = null;
        iVar.f169400g = null;
        iVar.f169402i = null;
        if (i17 == 19) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f23 = this.f169372d;
        iVar.getClass();
        vd.c cVar = new vd.c();
        if (c11510xdd90c2f23.C0().x() != null && c11510xdd90c2f23.C0().x().getF172191d() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811 f172191d = c11510xdd90c2f23.C0().x().getF172191d();
            r45.pd7 pd7Var = new r45.pd7();
            iVar.f169394a = pd7Var;
            pd7Var.f464504d = f172191d.mo49191x1c82a56c();
            iVar.f169394a.f464505e = f172191d.mo49189x74c4037f();
            iVar.f169394a.f464506f = 0;
        }
        if (c11510xdd90c2f23.E0() != null && c11510xdd90c2f23.E0().f387385r != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6 = c11510xdd90c2f23.E0().f387385r;
            r45.od7 od7Var = new r45.od7();
            iVar.f169395b = od7Var;
            od7Var.f463710d = c11667xc7e59dd6.f156932d;
            od7Var.f463711e = c11667xc7e59dd6.f33456x1c82a56c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 l27 = ((ze.n) c11510xdd90c2f23).l2();
            if (l27 != null) {
                r45.od7 od7Var2 = iVar.f169395b;
                od7Var2.f463712f = l27.f169323f;
                od7Var2.f463714h = l27.f169321d;
                od7Var2.f463713g = 0;
            }
        }
        int streamVolume = ((android.media.AudioManager) c11510xdd90c2f23.f156328d.getSystemService("audio")).getStreamVolume(3);
        r45.qd7 qd7Var = new r45.qd7();
        qd7Var.f465408d = streamVolume == 0;
        r45.ws3 ws3Var = cVar.f516894a;
        ws3Var.f470945d = c11510xdd90c2f23.f156336n;
        ws3Var.f470947f = iVar.f169394a;
        ws3Var.f470946e = iVar.f169395b;
        ws3Var.f470948g = qd7Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.e eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.e(this, cVar);
        nd.b a17 = nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        ((km5.q) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) a17).e1("/cgi-bin/mmgame-bin/getwxagameconfig", null, cVar.f516894a, r45.xs3.class).a(new vd.a(cVar, eVar))).s(new vd.b(eVar));
    }
}
