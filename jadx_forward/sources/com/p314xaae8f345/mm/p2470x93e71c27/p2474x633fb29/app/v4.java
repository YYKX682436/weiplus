package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes12.dex */
public class v4 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 f270643d;

    public v4(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var) {
        this.f270643d = w4Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    public final void a(int i17, dn.h hVar) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var = this.f270643d;
        w4Var.f270648f.f68112x10a0fed7 = 199L;
        boolean mo9952xce0038c9 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(w4Var.f270648f, new java.lang.String[0]);
        if (mo9952xce0038c9) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = w4Var.f270648f;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.y(dVar.f68106x315a5445, dVar.f68107xaaaa6883, dVar.f68105x2c1f0acb, hVar, true);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2 = w4Var.f270648f;
            c01.d9.e().g(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e4(dVar2.f68107xaaaa6883, dVar2.f68106x315a5445, true, hVar, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u4(this, hVar), w4Var.f270655p, dVar2));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:" + mo9952xce0038c9);
        fp.k.a();
        w4Var.getClass();
        w4Var.f270647e.mo815x76e0bfae(3, i17, "", w4Var);
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var = this.f270643d;
        java.lang.String str2 = w4Var.f270659t;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().get(w4Var.f270651i, w4Var.f270648f);
        if (i17 == -21005) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", w4Var.f270659t);
            return 0;
        }
        if (i17 != 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.N(w4Var.f270648f.f72763xa3c65b86, bu.a.b(i17));
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().get(w4Var.f270651i, w4Var.f270648f);
            w4Var.f270648f.f68111xda9bc3b3 = "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback startRet[%d] rowid[%d], reset signature ret[%b]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(w4Var.f270651i), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(w4Var.f270648f, new java.lang.String[0])));
            w4Var.f270647e.mo815x76e0bfae(3, i17, "", w4Var);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4.H(w4Var, null);
            return 0;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = w4Var.f270648f;
        long j17 = dVar.f68112x10a0fed7;
        if (j17 == 105) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttach", "attach upload has paused, status:%d, rowid:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(w4Var.f270651i));
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(w4Var.f270659t);
            w4Var.f270647e.mo815x76e0bfae(3, i17, "attach  has paused, status" + w4Var.f270648f.f68112x10a0fed7, w4Var);
            return 0;
        }
        if (gVar != null) {
            dVar.f68103x4a777c2 = c01.id.e();
            w4Var.f270648f.f68109x90a9378 = gVar.f69496x83ec3dd;
            boolean mo9952xce0038c9 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(w4Var.f270648f, new java.lang.String[0]);
            if (!mo9952xce0038c9) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:" + mo9952xce0038c9);
                fp.k.a();
                w4Var.getClass();
                w4Var.f270647e.mo815x76e0bfae(3, i17, "", w4Var);
            }
            return 0;
        }
        if (hVar != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4.H(w4Var, hVar.f69526x419c9c3d);
            int i18 = hVar.f69553xb5f54fe9;
            if (i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback sceneResult.retCode :%d arg[%s] info[%s]", java.lang.Integer.valueOf(i18), hVar.f69503x4b6e3d91, hVar.f69564xd94f6271, "", "", "", "", "", "", "", hVar.f323300b);
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.N(w4Var.f270648f.f72763xa3c65b86, bu.a.a(hVar.f69553xb5f54fe9));
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().get(w4Var.f270651i, w4Var.f270648f);
                w4Var.f270648f.f68111xda9bc3b3 = "";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback startRet[%d] sceneResult.field_retCode[%d], rowid[%d], reset signature ret[%b]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(hVar.f69553xb5f54fe9), java.lang.Long.valueOf(w4Var.f270651i), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(w4Var.f270648f, new java.lang.String[0])));
                w4Var.f270647e.mo815x76e0bfae(3, hVar.f69553xb5f54fe9, "", w4Var);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback upload attach by cdn, isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], signature[%s]", java.lang.Integer.valueOf(hVar.f69501xb9d727af), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(hVar.f69521xc9ff4d81), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(w4Var.f270648f.f68111xda9bc3b3));
                if (!z17) {
                    a(i17, hVar);
                } else if (!hVar.f69521xc9ff4d81) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig upload check but not exist");
                    if (((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).bj()) {
                        c01.d9.e().g(new g35.e(null, w4Var.f270648f.f68099xfeae815, w4Var.f270650h, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.o4(this, i17)));
                    } else {
                        w4Var.f270654o = false;
                        gm0.j1.e().j(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.p4(this));
                    }
                } else if (((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).bj()) {
                    c01.d9.e().g(new g35.e(w4Var.f270649g, w4Var.f270648f.f68099xfeae815, w4Var.f270650h, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m4(this, i17, hVar)));
                } else {
                    a(i17, hVar);
                }
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
