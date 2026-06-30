package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes7.dex */
public class t7 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.u7 f225322d;

    public t7(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.u7 u7Var) {
        this.f225322d = u7Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String key, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (gVar != null) {
            long j17 = gVar.f69496x83ec3dd;
            java.util.HashMap hashMap = ra3.a.f475019a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
            dn.m mVar = (dn.m) ra3.a.f475019a.get(key);
            if (mVar != null) {
                mVar.B1 = j17;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.u7 u7Var = this.f225322d;
        if (hVar != null) {
            int i18 = hVar.f69553xb5f54fe9;
            if (i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiUploadToCommonCDN", "cdn upload failed, retCode:%d sceneResult[%s]", java.lang.Integer.valueOf(i18), hVar);
                if (hVar.f69553xb5f54fe9 != -10008 || gVar == null) {
                    u7Var.f224976f.a("fail:cdn com upload error");
                } else {
                    u7Var.f224976f.a("fail:cancel cdn com upload cancel: " + gVar.f69496x83ec3dd);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiUploadToCommonCDN", "cdn upload success, media id : %s  file url=%s   thumb url=%s", key, hVar.f69524x419c440e, hVar.f69560x7b284d5e);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("fileUrl", hVar.f69524x419c440e);
                hashMap2.put("thumbUrl", hVar.f69560x7b284d5e);
                hashMap2.put("fileId", hVar.f69522xf9dbbe9c);
                hashMap2.put("fileSize", java.lang.Long.valueOf(hVar.f69523x17c343e7));
                hashMap2.put("fileKey", hVar.f69502xf11df5f5);
                hashMap2.put("md5", hVar.f69526x419c9c3d);
                u7Var.f224976f.b(hashMap2);
            }
            java.util.HashMap hashMap3 = ra3.a.f475019a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
            ra3.a.f475019a.remove(key);
        }
        if (i17 == 0) {
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiUploadToCommonCDN", "cdn upload failed, startRet : %d", java.lang.Integer.valueOf(i17));
        u7Var.f224976f.a("fail:cdn com call error");
        java.util.HashMap hashMap4 = ra3.a.f475019a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        ra3.a.f475019a.remove(key);
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
