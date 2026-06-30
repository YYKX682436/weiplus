package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class c4 implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f226741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226743f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226744g;

    public c4(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f226741d = j17;
        this.f226742e = str;
        this.f226743f = str2;
        this.f226744g = str3;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onC2CDownloadCompleted */
    public void mo562xf8a76f8e(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CronetTaskResult cronetTaskResult;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "pag resource download end , cost：%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f226741d));
        if (c2CDownloadResult != null && (cronetTaskResult = c2CDownloadResult.f17862xd968619f) != null && cronetTaskResult.f18043xa7c31030 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "pag resource download end, fileId:%s, statusCode:%d, profile:%s", this.f226742e, java.lang.Integer.valueOf(cronetTaskResult.f18044xec0a8ff), c2CDownloadResult.f17862xd968619f.f18043xa7c31030);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c2CDownloadResult.f17871x139cb015);
        java.lang.String str2 = this.f226744g;
        java.lang.String str3 = this.f226743f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "pag resource download result.errorCode ：%s， tempFilePath ：%s , md5：%s , file downaload md5:%s ", valueOf, str3, str2, com.p314xaae8f345.mm.vfs.w6.p(str3));
        int i17 = c2CDownloadResult.f17871x139cb015;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "pag resource download failed:%s", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(991, 28);
        } else if (!com.p314xaae8f345.mm.vfs.w6.j(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "pag resource download File fail:%s", str3);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(991, 28);
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.i(str3, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.e())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(991, 29);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(991, 30);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo563x617c4940(java.lang.String str, long j17, long j18, boolean z17) {
    }
}
