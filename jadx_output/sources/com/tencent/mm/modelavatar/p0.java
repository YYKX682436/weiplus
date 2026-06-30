package com.tencent.mm.modelavatar;

/* loaded from: classes5.dex */
public final class p0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv.i0 f70512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelavatar.q0 f70513e;

    public p0(kv.i0 i0Var, com.tencent.mm.modelavatar.q0 q0Var) {
        this.f70512d = i0Var;
        this.f70513e = q0Var;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        if (i17 == -21005) {
            return 0;
        }
        kv.i0 i0Var = this.f70512d;
        if (hVar == null || hVar.field_retCode != 0) {
            if (hVar != null && hVar.field_retCode != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", mediaId, java.lang.Integer.valueOf(i17), gVar, hVar);
                i0Var.d(3, -1, "doScene failed");
                return 0;
            }
            if (i17 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", mediaId, java.lang.Integer.valueOf(i17), gVar, hVar);
                i0Var.d(3, -1, "doScene failed");
            }
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s], aesKey:" + hVar.field_aesKey, mediaId, java.lang.Integer.valueOf(i17), gVar, hVar);
        java.lang.String field_fileId = hVar.field_fileId;
        kotlin.jvm.internal.o.f(field_fileId, "field_fileId");
        java.lang.String field_aesKey = hVar.field_aesKey;
        kotlin.jvm.internal.o.f(field_aesKey, "field_aesKey");
        i0Var.X(field_fileId, field_aesKey);
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "uploadsns cdndone pass: " + (java.lang.System.currentTimeMillis() - this.f70513e.f70518c) + ' ' + hVar.field_filemd5);
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(inbuf, "inbuf");
        return null;
    }
}
