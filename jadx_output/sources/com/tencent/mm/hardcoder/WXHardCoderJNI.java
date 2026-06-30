package com.tencent.mm.hardcoder;

/* loaded from: classes15.dex */
public interface WXHardCoderJNI extends i95.m {
    static com.tencent.mm.hardcoder.WXHardCoderJNI getInstance() {
        return (com.tencent.mm.hardcoder.WXHardCoderJNI) i95.n0.c(com.tencent.mm.hardcoder.WXHardCoderJNI.class);
    }

    boolean getDebug();

    boolean getEnable();

    boolean getHCKVPerReport();

    long getHcAlbumScrollAction();

    int getHcAlbumScrollCPU();

    int getHcAlbumScrollDelay();

    boolean getHcAlbumScrollEnable();

    int getHcAlbumScrollIO();

    boolean getHcAlbumScrollThr();

    int getHcAlbumScrollTimeout();

    int getHcBeginTimeHour();

    int getHcBeginTimeMin();

    boolean getHcBgEnable();

    long getHcBizAction();

    int getHcBizCPU();

    int getHcBizDelay();

    boolean getHcBizEnable();

    int getHcBizIO();

    boolean getHcBizThr();

    int getHcBizTimeout();

    long getHcBootAction();

    int getHcBootCPU();

    int getHcBootDelay();

    boolean getHcBootEnable();

    int getHcBootIO();

    boolean getHcBootThr();

    int getHcBootTimeout();

    long getHcDBActionQuery();

    long getHcDBActionWrite();

    int getHcDBCPU();

    int getHcDBDelayQuery();

    int getHcDBDelayWrite();

    boolean getHcDBEnable();

    int getHcDBIO();

    boolean getHcDBThr();

    int getHcDBTimeout();

    int getHcDBTimeoutBusy();

    long getHcDecodePicAction();

    int getHcDecodePicCPU();

    int getHcDecodePicDelay();

    boolean getHcDecodePicEnable();

    int getHcDecodePicIO();

    boolean getHcDecodePicThr();

    int getHcDecodePicTimeout();

    long getHcEncodeVideoAction();

    int getHcEncodeVideoCPU();

    int getHcEncodeVideoDelay();

    boolean getHcEncodeVideoEnable();

    int getHcEncodeVideoIO();

    boolean getHcEncodeVideoThr();

    int getHcEncodeVideoTimeout();

    int getHcEndTimeHour();

    int getHcEndTimeMin();

    long getHcEnterChattingAction();

    int getHcEnterChattingCPU();

    int getHcEnterChattingDelay();

    boolean getHcEnterChattingEnable();

    int getHcEnterChattingIO();

    boolean getHcEnterChattingThr();

    int getHcEnterChattingTimeout();

    long getHcGifAction();

    int getHcGifCPU();

    int getHcGifDelay();

    boolean getHcGifEnable();

    long getHcGifFrameAction();

    int getHcGifFrameCPU();

    int getHcGifFrameDelay();

    boolean getHcGifFrameEnable();

    int getHcGifFrameIO();

    boolean getHcGifFrameThr();

    int getHcGifFrameTimeout();

    int getHcGifIO();

    boolean getHcGifThr();

    int getHcGifTimeout();

    boolean getHcKVFtReport();

    boolean getHcKVPerReport();

    long getHcMediaGalleryScrollAction();

    int getHcMediaGalleryScrollCPU();

    int getHcMediaGalleryScrollDelay();

    boolean getHcMediaGalleryScrollEnable();

    int getHcMediaGalleryScrollIO();

    boolean getHcMediaGalleryScrollThr();

    int getHcMediaGalleryScrollTimeout();

    long getHcMiniProgramLaunchAction();

    int getHcMiniProgramLaunchCPU();

    int getHcMiniProgramLaunchDelay();

    boolean getHcMiniProgramLaunchEnable();

    int getHcMiniProgramLaunchIO();

    boolean getHcMiniProgramLaunchThr();

    int getHcMiniProgramLaunchTimeout();

    long getHcQuitChattingAction();

    int getHcQuitChattingCPU();

    int getHcQuitChattingDelay();

    boolean getHcQuitChattingEnable();

    int getHcQuitChattingIO();

    boolean getHcQuitChattingThr();

    int getHcQuitChattingTimeout();

    long getHcReceiveMsgAction();

    int getHcReceiveMsgCPU();

    int getHcReceiveMsgDelay();

    boolean getHcReceiveMsgEnable();

    int getHcReceiveMsgIO();

    boolean getHcReceiveMsgThr();

    int getHcReceiveMsgTimeout();

    int getHcRetryInterval();

    long getHcSNSMsgScrollAction();

    int getHcSNSMsgScrollCPU();

    int getHcSNSMsgScrollDelay();

    boolean getHcSNSMsgScrollEnable();

    int getHcSNSMsgScrollIO();

    boolean getHcSNSMsgScrollThr();

    int getHcSNSMsgScrollTimeout();

    long getHcSNSScrollAction();

    int getHcSNSScrollCPU();

    int getHcSNSScrollDelay();

    boolean getHcSNSScrollEnable();

    int getHcSNSScrollIO();

    boolean getHcSNSScrollThr();

    int getHcSNSScrollTimeout();

    long getHcSNSUserScrollAction();

    int getHcSNSUserScrollCPU();

    int getHcSNSUserScrollDelay();

    boolean getHcSNSUserScrollEnable();

    int getHcSNSUserScrollIO();

    boolean getHcSNSUserScrollThr();

    int getHcSNSUserScrollTimeout();

    long getHcSendMsgAction();

    int getHcSendMsgCPU();

    int getHcSendMsgDelay();

    boolean getHcSendMsgEnable();

    int getHcSendMsgIO();

    boolean getHcSendMsgThr();

    int getHcSendMsgTimeout();

    long getHcSendPicMsgAction();

    int getHcSendPicMsgCPU();

    int getHcSendPicMsgDelay();

    boolean getHcSendPicMsgEnable();

    int getHcSendPicMsgIO();

    boolean getHcSendPicMsgThr();

    int getHcSendPicMsgTimeout();

    boolean getHcTimeLimit();

    int getHcTimeoutMargin();

    int getHcUinHash();

    long getHcUpdateChatroomAction();

    int getHcUpdateChatroomCPU();

    int getHcUpdateChatroomDelay();

    boolean getHcUpdateChatroomEnable();

    int getHcUpdateChatroomIO();

    long getHcUpdateChatroomMemberCount();

    boolean getHcUpdateChatroomThr();

    int getHcUpdateChatroomTimeout();

    long getParameters(int i17, com.tencent.mm.hardcoder.a aVar, org.json.JSONObject jSONObject);

    long getParameters(int i17, com.tencent.mm.hardcoder.a aVar, java.lang.String... strArr);

    int initHardCoder(com.tencent.mm.hardcoder.o oVar, com.tencent.mm.hardcoder.r rVar, com.tencent.mm.hardcoder.i iVar);

    boolean isCheckEnv();

    boolean isHCEnable();

    int isRunning();

    java.lang.String readServerAddr(boolean z17);

    int registerGetParametersCallback(int i17, com.tencent.mm.hardcoder.a aVar, java.lang.String... strArr);

    long registerSystemEventCallback(com.tencent.mm.hardcoder.q qVar);

    void reloadSPConfig(int i17);

    void reportFPS(int i17, long j17, int i18, long j18, long j19);

    void reportIDKey(boolean z17, int i17, int i18, boolean z18);

    void setDebug(boolean z17);

    void setHcAlbumScrollAction(long j17);

    void setHcAlbumScrollCPU(int i17);

    void setHcAlbumScrollDelay(int i17);

    void setHcAlbumScrollEnable(boolean z17);

    void setHcAlbumScrollIO(int i17);

    void setHcAlbumScrollThr(boolean z17);

    void setHcAlbumScrollTimeout(int i17);

    void setHcBeginTimeHour(int i17);

    void setHcBeginTimeMin(int i17);

    void setHcBgEnable(boolean z17);

    void setHcBizAction(long j17);

    void setHcBizCPU(int i17);

    void setHcBizDelay(int i17);

    void setHcBizEnable(boolean z17);

    void setHcBizIO(int i17);

    void setHcBizThr(boolean z17);

    void setHcBizTimeout(int i17);

    void setHcBootAction(long j17);

    void setHcBootCPU(int i17);

    void setHcBootDelay(int i17);

    void setHcBootEnable(boolean z17);

    void setHcBootIO(int i17);

    void setHcBootThr(boolean z17);

    void setHcBootTimeout(int i17);

    void setHcDBActionQuery(long j17);

    void setHcDBActionWrite(long j17);

    void setHcDBCPU(int i17);

    void setHcDBDelayQuery(int i17);

    void setHcDBDelayWrite(int i17);

    void setHcDBEnable(boolean z17);

    void setHcDBIO(int i17);

    void setHcDBThr(boolean z17);

    void setHcDBTimeout(int i17);

    void setHcDBTimeoutBusy(int i17);

    void setHcDecodePicAction(long j17);

    void setHcDecodePicCPU(int i17);

    void setHcDecodePicDelay(int i17);

    void setHcDecodePicEnable(boolean z17);

    void setHcDecodePicIO(int i17);

    void setHcDecodePicThr(boolean z17);

    void setHcDecodePicTimeout(int i17);

    void setHcEnable(boolean z17);

    void setHcEncodeVideoAction(long j17);

    void setHcEncodeVideoCPU(int i17);

    void setHcEncodeVideoDelay(int i17);

    void setHcEncodeVideoEnable(boolean z17);

    void setHcEncodeVideoIO(int i17);

    void setHcEncodeVideoThr(boolean z17);

    void setHcEncodeVideoTimeout(int i17);

    void setHcEndTimeHour(int i17);

    void setHcEndTimeMin(int i17);

    void setHcEnterChattingAction(long j17);

    void setHcEnterChattingCPU(int i17);

    void setHcEnterChattingDelay(int i17);

    void setHcEnterChattingEnable(boolean z17);

    void setHcEnterChattingIO(int i17);

    void setHcEnterChattingThr(boolean z17);

    void setHcEnterChattingTimeout(int i17);

    void setHcGifAction(long j17);

    void setHcGifCPU(int i17);

    void setHcGifDelay(int i17);

    void setHcGifEnable(boolean z17);

    void setHcGifFrameAction(long j17);

    void setHcGifFrameCPU(int i17);

    void setHcGifFrameDelay(int i17);

    void setHcGifFrameEnable(boolean z17);

    void setHcGifFrameIO(int i17);

    void setHcGifFrameThr(boolean z17);

    void setHcGifFrameTimeout(int i17);

    void setHcGifIO(int i17);

    void setHcGifThr(boolean z17);

    void setHcGifTimeout(int i17);

    void setHcKVFtReport(boolean z17);

    void setHcKVPerReport(boolean z17);

    void setHcMediaGalleryScrollAction(long j17);

    void setHcMediaGalleryScrollCPU(int i17);

    void setHcMediaGalleryScrollDelay(int i17);

    void setHcMediaGalleryScrollEnable(boolean z17);

    void setHcMediaGalleryScrollIO(int i17);

    void setHcMediaGalleryScrollThr(boolean z17);

    void setHcMediaGalleryScrollTimeout(int i17);

    void setHcMiniProgramLaunchAction(long j17);

    void setHcMiniProgramLaunchCPU(int i17);

    void setHcMiniProgramLaunchDelay(int i17);

    void setHcMiniProgramLaunchEnable(boolean z17);

    void setHcMiniProgramLaunchIO(int i17);

    void setHcMiniProgramLaunchThr(boolean z17);

    void setHcMiniProgramLaunchTimeout(int i17);

    void setHcQuitChattingAction(long j17);

    void setHcQuitChattingCPU(int i17);

    void setHcQuitChattingDelay(int i17);

    void setHcQuitChattingEnable(boolean z17);

    void setHcQuitChattingIO(int i17);

    void setHcQuitChattingThr(boolean z17);

    void setHcQuitChattingTimeout(int i17);

    void setHcReceiveMsgAction(long j17);

    void setHcReceiveMsgCPU(int i17);

    void setHcReceiveMsgDelay(int i17);

    void setHcReceiveMsgEnable(boolean z17);

    void setHcReceiveMsgIO(int i17);

    void setHcReceiveMsgThr(boolean z17);

    void setHcReceiveMsgTimeout(int i17);

    void setHcRetryInterval(int i17);

    void setHcSNSMsgScrollAction(long j17);

    void setHcSNSMsgScrollCPU(int i17);

    void setHcSNSMsgScrollDelay(int i17);

    void setHcSNSMsgScrollEnable(boolean z17);

    void setHcSNSMsgScrollIO(int i17);

    void setHcSNSMsgScrollThr(boolean z17);

    void setHcSNSMsgScrollTimeout(int i17);

    void setHcSNSScrollAction(long j17);

    void setHcSNSScrollCPU(int i17);

    void setHcSNSScrollDelay(int i17);

    void setHcSNSScrollEnable(boolean z17);

    void setHcSNSScrollIO(int i17);

    void setHcSNSScrollThr(boolean z17);

    void setHcSNSScrollTimeout(int i17);

    void setHcSNSUserScrollAction(long j17);

    void setHcSNSUserScrollCPU(int i17);

    void setHcSNSUserScrollDelay(int i17);

    void setHcSNSUserScrollEnable(boolean z17);

    void setHcSNSUserScrollIO(int i17);

    void setHcSNSUserScrollThr(boolean z17);

    void setHcSNSUserScrollTimeout(int i17);

    void setHcSendMsgAction(long j17);

    void setHcSendMsgCPU(int i17);

    void setHcSendMsgDelay(int i17);

    void setHcSendMsgEnable(boolean z17);

    void setHcSendMsgIO(int i17);

    void setHcSendMsgThr(boolean z17);

    void setHcSendMsgTimeout(int i17);

    void setHcSendPicMsgAction(long j17);

    void setHcSendPicMsgCPU(int i17);

    void setHcSendPicMsgDelay(int i17);

    void setHcSendPicMsgEnable(boolean z17);

    void setHcSendPicMsgIO(int i17);

    void setHcSendPicMsgThr(boolean z17);

    void setHcSendPicMsgTimeout(int i17);

    void setHcTimeLimit(boolean z17);

    void setHcTimeoutMargin(int i17);

    void setHcUinHash(int i17);

    void setHcUpdateChatroomAction(long j17);

    void setHcUpdateChatroomCPU(int i17);

    void setHcUpdateChatroomDelay(int i17);

    void setHcUpdateChatroomEnable(boolean z17);

    void setHcUpdateChatroomIO(int i17);

    void setHcUpdateChatroomMemberCount(long j17);

    void setHcUpdateChatroomThr(boolean z17);

    void setHcUpdateChatroomTimeout(int i17);

    void setRetryConnectInterval(int i17);

    int startPerformance(boolean z17, int i17, int i18, int i19, int i27, int i28, int i29, long j17, java.lang.String str);

    int stopPerformance(boolean z17, int i17);

    long terminateApp(int i17, long j17);
}
