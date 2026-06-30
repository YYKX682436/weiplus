package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132;

/* loaded from: classes9.dex */
public class h implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f177698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f177699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f177700f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f177701g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f177702h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f177703i;

    public h(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f177698d = j17;
        this.f177699e = str;
        this.f177700f = str2;
        this.f177701g = str3;
        this.f177702h = str4;
        this.f177703i = str5;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onC2CDownloadCompleted */
    public void mo562xf8a76f8e(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CronetTaskResult cronetTaskResult;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "voice resource download end , cost：%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f177698d));
        if (c2CDownloadResult != null && (cronetTaskResult = c2CDownloadResult.f17862xd968619f) != null && cronetTaskResult.f18043xa7c31030 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "voice resource download end, url:%s, statusCode:%d, profile:%s", this.f177699e, java.lang.Integer.valueOf(cronetTaskResult.f18044xec0a8ff), c2CDownloadResult.f17862xd968619f.f18043xa7c31030);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c2CDownloadResult.f17871x139cb015);
        java.lang.String str2 = this.f177700f;
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str2);
        java.lang.String str3 = this.f177701g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "voice resource download result.errorCode ：%s， tempFilePath ：%s , md5：%s , file downaload md5:%s ", valueOf, str2, str3, p17);
        int i17 = c2CDownloadResult.f17871x139cb015;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "voice resource download failed:%s", java.lang.Integer.valueOf(i17));
            return;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "  download File fail:%s", str2);
            return;
        }
        if (!str3.equalsIgnoreCase(com.p314xaae8f345.mm.vfs.w6.p(str2))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "download md5 check failed，md5 :%s    ,  download md5:%s", str3, com.p314xaae8f345.mm.vfs.w6.p(str2));
            return;
        }
        java.lang.String str4 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.f177711j;
        com.p314xaae8f345.mm.vfs.w6.u(str4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str4);
        java.lang.String str5 = this.f177702h;
        sb6.append(str5);
        sb6.append(".pos");
        java.lang.String sb7 = sb6.toString();
        if (com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", " has this voice resource before ，first delete exist file");
            com.p314xaae8f345.mm.vfs.w6.h(sb7);
        }
        com.p314xaae8f345.mm.vfs.w6.c(str2, sb7);
        com.p314xaae8f345.mm.vfs.w6.h(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "copyFile form %s  to   %s", str2, sb7);
        kd1.e b17 = kd1.e.b();
        java.lang.String str6 = this.f177703i;
        b17.e(str5, sb7, str3, str6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "save config  posID： %s，voicePath：%s ， md5 ：%s , version:%s", str5, sb7, str3, str6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "currentResID %s、download ResID %s", com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.f(), str5);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.f().equals(str5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "set currentResID  for new resource");
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.n(str5);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo563x617c4940(java.lang.String str, long j17, long j18, boolean z17) {
    }
}
