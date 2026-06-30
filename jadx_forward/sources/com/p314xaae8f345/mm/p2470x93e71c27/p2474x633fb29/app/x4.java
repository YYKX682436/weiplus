package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes12.dex */
public class x4 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z4 f270674d;

    public x4(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z4 z4Var) {
        this.f270674d = z4Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z4 z4Var = this.f270674d;
        java.lang.String str2 = z4Var.f270726q;
        if (i17 == -21005) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttachForHandOff", "summerbig cdnCallback ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", z4Var.f270726q);
            z4Var.f270723n = false;
            z4Var.f270724o.removeMessages(1);
            return 0;
        }
        if (i17 != 0) {
            z4Var.f270723n = false;
            z4Var.f270724o.removeMessages(1);
            ((d73.i) i95.n0.c(d73.i.class)).Qi(z4Var.f270719g, "");
            return 0;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = z4Var.f270720h;
        long j17 = dVar.f68112x10a0fed7;
        if (j17 == 105) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttachForHandOff", "attach upload has paused, status:%d", java.lang.Long.valueOf(j17));
            z4Var.f270723n = false;
            z4Var.f270724o.removeMessages(1);
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(z4Var.f270726q);
            return 0;
        }
        if (gVar != null) {
            dVar.f68103x4a777c2 = c01.id.e();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2 = z4Var.f270720h;
            long j18 = gVar.f69496x83ec3dd;
            dVar2.f68109x90a9378 = j18;
            z4Var.f270721i = j18;
            return 0;
        }
        if (hVar != null) {
            int i18 = hVar.f69553xb5f54fe9;
            if (i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadAppAttachForHandOff", "summerbig cdnCallback sceneResult.retCode :%d arg[%s] info[%s]", java.lang.Integer.valueOf(i18), hVar.f69503x4b6e3d91, hVar.f69564xd94f6271, "", "", "", "", "", "", "", hVar.f323300b);
                z4Var.f270723n = false;
                z4Var.f270724o.removeMessages(1);
                ((d73.i) i95.n0.c(d73.i.class)).Qi(z4Var.f270719g, "");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadAppAttachForHandOff", "summerbig cdnCallback upload attach by cdn, isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], signature[%s]", java.lang.Integer.valueOf(hVar.f69501xb9d727af), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(hVar.f69521xc9ff4d81), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(z4Var.f270720h.f68111xda9bc3b3));
                z4Var.f270723n = false;
                z4Var.f270724o.removeMessages(1);
                ((d73.i) i95.n0.c(d73.i.class)).Kg(z4Var.f270719g, hVar.f69522xf9dbbe9c, hVar.f69502xf11df5f5);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
