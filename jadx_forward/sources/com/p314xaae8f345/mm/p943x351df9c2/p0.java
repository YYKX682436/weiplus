package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes5.dex */
public final class p0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv.i0 f152045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p943x351df9c2.q0 f152046e;

    public p0(kv.i0 i0Var, com.p314xaae8f345.mm.p943x351df9c2.q0 q0Var) {
        this.f152045d = i0Var;
        this.f152046e = q0Var;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        if (i17 == -21005) {
            return 0;
        }
        kv.i0 i0Var = this.f152045d;
        if (hVar == null || hVar.f69553xb5f54fe9 != 0) {
            if (hVar != null && hVar.f69553xb5f54fe9 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", mediaId, java.lang.Integer.valueOf(i17), gVar, hVar);
                i0Var.d(3, -1, "doScene failed");
                return 0;
            }
            if (i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", mediaId, java.lang.Integer.valueOf(i17), gVar, hVar);
                i0Var.d(3, -1, "doScene failed");
            }
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s], aesKey:" + hVar.f69502xf11df5f5, mediaId, java.lang.Integer.valueOf(i17), gVar, hVar);
        java.lang.String field_fileId = hVar.f69522xf9dbbe9c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fileId, "field_fileId");
        java.lang.String field_aesKey = hVar.f69502xf11df5f5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_aesKey, "field_aesKey");
        i0Var.X(field_fileId, field_aesKey);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "uploadsns cdndone pass: " + (java.lang.System.currentTimeMillis() - this.f152046e.f152051c) + ' ' + hVar.f69526x419c9c3d);
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inbuf, "inbuf");
        return null;
    }
}
