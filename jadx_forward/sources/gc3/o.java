package gc3;

/* loaded from: classes9.dex */
public final class o implements gc3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16412xaf564658 f351969a;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16412xaf564658 c16412xaf564658) {
        this.f351969a = c16412xaf564658;
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyVoiceTransLayout", "onDetectStop, someone doStop or time out");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16412xaf564658 c16412xaf564658 = this.f351969a;
        c16412xaf564658.f229155v.d();
        long j17 = c16412xaf564658.f229150q;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c16412xaf564658.f229151r = java.lang.System.currentTimeMillis() - j17;
        if (c16412xaf564658.f229151r < 1000) {
            gc3.n voiceListener = c16412xaf564658.getVoiceListener();
            if (voiceListener != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nh) voiceListener).a(2, c16412xaf564658.getCom.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH java.lang.String());
                return;
            }
            return;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(c16412xaf564658.getCom.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH java.lang.String())) {
            gc3.n voiceListener2 = c16412xaf564658.getVoiceListener();
            if (voiceListener2 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nh) voiceListener2).a(0, c16412xaf564658.getCom.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH java.lang.String());
                return;
            }
            return;
        }
        gc3.n voiceListener3 = c16412xaf564658.getVoiceListener();
        if (voiceListener3 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nh) voiceListener3).a(3, c16412xaf564658.getCom.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH java.lang.String());
        }
    }
}
