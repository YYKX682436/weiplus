package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class e1 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.f1 f97023d;

    public e1(com.tencent.mm.plugin.downloader.model.f1 f1Var) {
        this.f97023d = f1Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (gVar != null) {
            gVar.toString();
        }
        if (hVar != null) {
            hVar.toString();
        }
        if (i17 == -21006) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileWebNetDownloader", "duplicate request, ignore this request, media id is %s", str);
            return 0;
        }
        com.tencent.mm.plugin.downloader.model.f1 f1Var = this.f97023d;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileWebNetDownloader", "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
            com.tencent.mm.plugin.downloader.model.f1.g(f1Var, str, 4, i17, null);
            return 0;
        }
        if (gVar == null) {
            if (hVar != null) {
                int i18 = hVar.field_retCode;
                if (i18 != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FileWebNetDownloader", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", str, java.lang.Integer.valueOf(i18), hVar);
                    com.tencent.mm.plugin.downloader.model.f1.g(f1Var, str, 4, hVar.field_retCode, null);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FileWebNetDownloader", "cdn trans suceess, media id : %s", str);
                    com.tencent.mm.plugin.downloader.model.f1.g(f1Var, str, 3, 0, null);
                }
            }
            return 0;
        }
        long j17 = gVar.field_finishedLength;
        long j18 = gVar.field_toltalLength;
        f1Var.getClass();
        h02.a f17 = com.tencent.mm.plugin.downloader.model.m0.f(str);
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Boolean.valueOf(f17 != null);
        objArr[1] = str;
        objArr[2] = java.lang.Long.valueOf(j17);
        objArr[3] = java.lang.Long.valueOf(j18);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileWebNetDownloader", "updateProgressChange, info is %s %s %d %d", objArr);
        if (f17 != null) {
            java.util.HashMap hashMap = f1Var.f97030d;
            java.lang.Long l17 = (java.lang.Long) hashMap.get(f17.field_downloadUrl);
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            if (l17 == null || valueOf.longValue() - l17.longValue() >= 500) {
                hashMap.put(f17.field_downloadUrl, valueOf);
                f17.field_status = 1;
                f17.field_downloadedSize = j17;
                f17.field_totalSize = j18;
                com.tencent.mm.plugin.downloader.model.m0.l(f17);
                f1Var.f97212a.f(f17.field_downloadId, str, j17, j18);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
