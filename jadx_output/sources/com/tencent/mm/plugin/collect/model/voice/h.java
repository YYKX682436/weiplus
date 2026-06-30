package com.tencent.mm.plugin.collect.model.voice;

/* loaded from: classes9.dex */
public class h implements com.tencent.mars.cdn.CdnManager.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f96165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96167f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96168g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96169h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96170i;

    public h(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f96165d = j17;
        this.f96166e = str;
        this.f96167f = str2;
        this.f96168g = str3;
        this.f96169h = str4;
        this.f96170i = str5;
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        com.tencent.mars.cdn.CdnManager.CronetTaskResult cronetTaskResult;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "voice resource download end , cost：%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f96165d));
        if (c2CDownloadResult != null && (cronetTaskResult = c2CDownloadResult.cronetTaskResult) != null && cronetTaskResult.performance != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "voice resource download end, url:%s, statusCode:%d, profile:%s", this.f96166e, java.lang.Integer.valueOf(cronetTaskResult.statusCode), c2CDownloadResult.cronetTaskResult.performance);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c2CDownloadResult.errorCode);
        java.lang.String str2 = this.f96167f;
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(str2);
        java.lang.String str3 = this.f96168g;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "voice resource download result.errorCode ：%s， tempFilePath ：%s , md5：%s , file downaload md5:%s ", valueOf, str2, str3, p17);
        int i17 = c2CDownloadResult.errorCode;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "voice resource download failed:%s", java.lang.Integer.valueOf(i17));
            return;
        }
        if (!com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "  download File fail:%s", str2);
            return;
        }
        if (!str3.equalsIgnoreCase(com.tencent.mm.vfs.w6.p(str2))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "download md5 check failed，md5 :%s    ,  download md5:%s", str3, com.tencent.mm.vfs.w6.p(str2));
            return;
        }
        java.lang.String str4 = com.tencent.mm.plugin.collect.model.voice.m.f96178j;
        com.tencent.mm.vfs.w6.u(str4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str4);
        java.lang.String str5 = this.f96169h;
        sb6.append(str5);
        sb6.append(".pos");
        java.lang.String sb7 = sb6.toString();
        if (com.tencent.mm.vfs.w6.j(sb7)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", " has this voice resource before ，first delete exist file");
            com.tencent.mm.vfs.w6.h(sb7);
        }
        com.tencent.mm.vfs.w6.c(str2, sb7);
        com.tencent.mm.vfs.w6.h(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "copyFile form %s  to   %s", str2, sb7);
        kd1.e b17 = kd1.e.b();
        java.lang.String str6 = this.f96170i;
        b17.e(str5, sb7, str3, str6);
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "save config  posID： %s，voicePath：%s ， md5 ：%s , version:%s", str5, sb7, str3, str6);
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "currentResID %s、download ResID %s", com.tencent.mm.plugin.collect.model.voice.m.f(), str5);
        if (com.tencent.mm.plugin.collect.model.voice.m.f().equals(str5)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "set currentResID  for new resource");
            com.tencent.mm.plugin.collect.model.voice.m.n(str5);
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
    }
}
