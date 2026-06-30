package bh2;

/* loaded from: classes10.dex */
public final class t implements com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bh2.v f20891a;

    public t(bh2.v vVar) {
        this.f20891a = vVar;
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener
    public void onChorusError(com.tencent.trtc.TXChorusMusicPlayer.TXChorusError tXChorusError, java.lang.String str) {
        bh2.v vVar = this.f20891a;
        com.tencent.mars.xlog.Log.i(vVar.f20895c, "onChorusError errorType: " + tXChorusError + ", errorMsg: " + str);
        vVar.f20896d.post(new bh2.n(vVar, tXChorusError));
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener
    public void onChorusMusicLoadProgress(java.lang.String str, float f17) {
        com.tencent.mars.xlog.Log.i(this.f20891a.f20895c, "onChorusMusicLoadProgress p0: " + str + ", p1: " + f17);
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener
    public void onChorusMusicLoadSucceed(java.lang.String str, java.util.List list, java.util.List list2) {
        com.tencent.mars.xlog.Log.i(this.f20891a.f20895c, "onChorusMusicLoadSucceed musicId: " + str + ", lyricList: " + list + ", pitchList: " + list2);
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener
    public void onChorusPaused() {
        bh2.v vVar = this.f20891a;
        com.tencent.mars.xlog.Log.i(vVar.f20895c, "onChorusPaused");
        vVar.f20896d.post(new bh2.o(vVar));
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener
    public void onChorusRequireLoadMusic(java.lang.String str) {
        om2.q qVar;
        bh2.v vVar = this.f20891a;
        java.lang.String str2 = vVar.f20895c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onChorusRequireLoadMusic musicId: ");
        sb6.append(str);
        sb6.append(" path: ");
        om2.s sVar = vVar.f20894b;
        sb6.append((sVar == null || (qVar = sVar.f346380c) == null) ? null : qVar.f346373b);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        vVar.f20896d.post(new bh2.p(vVar, str));
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener
    public void onChorusResumed() {
        bh2.v vVar = this.f20891a;
        com.tencent.mars.xlog.Log.i(vVar.f20895c, "onChorusResumed");
        vVar.f20896d.post(new bh2.q(vVar));
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener
    public void onChorusStarted() {
        bh2.v vVar = this.f20891a;
        com.tencent.mars.xlog.Log.i(vVar.f20895c, "onChorusStarted");
        vVar.f20896d.post(new bh2.r(vVar));
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener
    public void onChorusStopped() {
        bh2.v vVar = this.f20891a;
        com.tencent.mars.xlog.Log.i(vVar.f20895c, "onChorusStopped");
        vVar.f20896d.post(new bh2.s(vVar));
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener
    public void onMusicProgressUpdated(long j17, long j18) {
        bh2.v vVar = this.f20891a;
        vVar.f20900h = j17;
        bh2.b bVar = vVar.f20898f;
        if (bVar != null) {
            om2.s sVar = vVar.f20894b;
            bVar.y2(sVar != null ? sVar.a() : "", j17, j18);
        }
        if (j17 >= j18) {
            com.tencent.mars.xlog.Log.i(vVar.f20895c, "onChorusCompleted");
            vVar.f20896d.post(new bh2.m(vVar));
        }
        vVar.f20901i = java.lang.System.currentTimeMillis();
        java.lang.String str = vVar.f20895c;
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener
    public void onNetworkQualityUpdated(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i(this.f20891a.f20895c, "onNetworkQualityUpdated quality: " + i17 + ", rtt: " + i18 + ", loss: " + i19);
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener
    public void onVoicePitchUpdated(int i17, boolean z17, long j17) {
        com.tencent.mars.xlog.Log.i(this.f20891a.f20895c, "onVoicePitchUpdated 演唱音高：" + i17 + ", " + z17 + ", " + j17);
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener
    public void onVoiceScoreUpdated(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i(this.f20891a.f20895c, "onVoiceScoreUpdated 上一句的分数：" + i17 + ", 平均分：" + i18);
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener
    public void shouldDecryptAudioData(java.nio.ByteBuffer byteBuffer) {
        com.tencent.mars.xlog.Log.i(this.f20891a.f20895c, "shouldDecryptAudioData");
    }
}
