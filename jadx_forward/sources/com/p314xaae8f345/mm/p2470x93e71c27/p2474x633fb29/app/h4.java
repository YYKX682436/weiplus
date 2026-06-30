package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes12.dex */
public class h4 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn.h f270454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 f270455e;

    public h4(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var, dn.h hVar) {
        this.f270455e = w4Var;
        this.f270454d = hVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttach", "cdn callback: %s, %s", str, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var = this.f270455e;
        if (i17 != 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.N(w4Var.f270648f.f72763xa3c65b86, bu.a.b(i17));
            w4Var.f270647e.mo815x76e0bfae(3, i17, "", w4Var);
            return 0;
        }
        if (gVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttach", "cdn callback progress: %s, %s, %s", java.lang.Integer.valueOf(gVar.f69499x10a0fed7), java.lang.Long.valueOf(gVar.f69496x83ec3dd), java.lang.Long.valueOf(gVar.f69500x8ab84c59));
        }
        if (hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttach", "cdn callback result: %s, %s", java.lang.Integer.valueOf(hVar.f69553xb5f54fe9), hVar.f323305g);
            int i18 = hVar.f69553xb5f54fe9;
            if (i18 == 0) {
                w4Var.f270648f.f68112x10a0fed7 = 199L;
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(w4Var.f270648f, new java.lang.String[0]);
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = w4Var.f270648f;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(dVar.f68107xaaaa6883, dVar.f68106x315a5445);
                Li.d1(ot0.q.u(ot0.q.v(Li.j()), w4Var.f270648f.f68105x2c1f0acb, hVar));
                ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(Li.m124847x74d37ac6(), Li, true);
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2 = w4Var.f270648f;
                c01.d9.e().g(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e4(dVar2.f68107xaaaa6883, dVar2.f68106x315a5445, true, this.f270454d, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g4(this), w4Var.f270655p, dVar2));
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.N(w4Var.f270648f.f72763xa3c65b86, bu.a.a(i18));
                w4Var.f270647e.mo815x76e0bfae(3, hVar.f69553xb5f54fe9, "", w4Var);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
