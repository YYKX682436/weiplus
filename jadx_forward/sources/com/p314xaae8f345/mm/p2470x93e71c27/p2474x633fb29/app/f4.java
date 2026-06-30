package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes4.dex */
public class f4 extends com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3 {
    public f4(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.n16();
        lVar.f152198b = new r45.o16();
        lVar.f152199c = "/cgi-bin/micromsg-bin/setappsetting";
        lVar.f152200d = 396;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f270623d = a17;
        r45.n16 n16Var = (r45.n16) a17.f152243a.f152217a;
        n16Var.f462528d = str;
        n16Var.f462529e = i17;
        n16Var.f462530f = str2;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3
    public void a(byte[] bArr) {
        if (bArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSetAppSetting", "buf is null");
            return;
        }
        try {
            this.f270623d.f152244b.mo13863x347f4535(bArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSetAppSetting", "parse error: " + e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSetAppSetting", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3
    public int b() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3
    public byte[] c() {
        try {
            return ((com.p314xaae8f345.mm.p944x882e457a.m) this.f270623d.mo47979x2d63726f()).mo13852xc3d7db06();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSetAppSetting", "toProtBuf failed: " + e17.getMessage());
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.o16 o16Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSetAppSetting", "errType = " + i18 + ", errCode = " + i19);
        if (i18 == 0 && i18 == 0 && (o16Var = (r45.o16) this.f270623d.f152244b.f152233a) != null) {
            ((kt.a) ap3.e.a()).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z Ri = zo3.p.Ri();
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str2 = o16Var.f463358d;
            ((kt.c) i0Var).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str2, false, false);
            if (j17 != null) {
                j17.f67381x731b46d9 = o16Var.f463359e;
                Ri.mo9952xce0038c9(j17, new java.lang.String[0]);
            }
        }
    }
}
