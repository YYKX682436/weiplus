package bh2;

/* loaded from: classes10.dex */
public final class t implements com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bh2.v f102424a;

    public t(bh2.v vVar) {
        this.f102424a = vVar;
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener
    /* renamed from: onChorusError */
    public void mo10555x704000a3(com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusError tXChorusError, java.lang.String str) {
        bh2.v vVar = this.f102424a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f102428c, "onChorusError errorType: " + tXChorusError + ", errorMsg: " + str);
        vVar.f102429d.post(new bh2.n(vVar, tXChorusError));
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener
    /* renamed from: onChorusMusicLoadProgress */
    public void mo10556x4751f613(java.lang.String str, float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102424a.f102428c, "onChorusMusicLoadProgress p0: " + str + ", p1: " + f17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener
    /* renamed from: onChorusMusicLoadSucceed */
    public void mo10557x94eef59c(java.lang.String str, java.util.List list, java.util.List list2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102424a.f102428c, "onChorusMusicLoadSucceed musicId: " + str + ", lyricList: " + list + ", pitchList: " + list2);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener
    /* renamed from: onChorusPaused */
    public void mo10558xa9973df3() {
        bh2.v vVar = this.f102424a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f102428c, "onChorusPaused");
        vVar.f102429d.post(new bh2.o(vVar));
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener
    /* renamed from: onChorusRequireLoadMusic */
    public void mo10559x9a2f6b7f(java.lang.String str) {
        om2.q qVar;
        bh2.v vVar = this.f102424a;
        java.lang.String str2 = vVar.f102428c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onChorusRequireLoadMusic musicId: ");
        sb6.append(str);
        sb6.append(" path: ");
        om2.s sVar = vVar.f102427b;
        sb6.append((sVar == null || (qVar = sVar.f427913c) == null) ? null : qVar.f427906b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        vVar.f102429d.post(new bh2.p(vVar, str));
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener
    /* renamed from: onChorusResumed */
    public void mo10560xf9d531b2() {
        bh2.v vVar = this.f102424a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f102428c, "onChorusResumed");
        vVar.f102429d.post(new bh2.q(vVar));
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener
    /* renamed from: onChorusStarted */
    public void mo10561x4755345c() {
        bh2.v vVar = this.f102424a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f102428c, "onChorusStarted");
        vVar.f102429d.post(new bh2.r(vVar));
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener
    /* renamed from: onChorusStopped */
    public void mo10562x481985a8() {
        bh2.v vVar = this.f102424a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f102428c, "onChorusStopped");
        vVar.f102429d.post(new bh2.s(vVar));
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener
    /* renamed from: onMusicProgressUpdated */
    public void mo10563x7c731168(long j17, long j18) {
        bh2.v vVar = this.f102424a;
        vVar.f102433h = j17;
        bh2.b bVar = vVar.f102431f;
        if (bVar != null) {
            om2.s sVar = vVar.f102427b;
            bVar.y2(sVar != null ? sVar.a() : "", j17, j18);
        }
        if (j17 >= j18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f102428c, "onChorusCompleted");
            vVar.f102429d.post(new bh2.m(vVar));
        }
        vVar.f102434i = java.lang.System.currentTimeMillis();
        java.lang.String str = vVar.f102428c;
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener
    /* renamed from: onNetworkQualityUpdated */
    public void mo10564xc26b1beb(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102424a.f102428c, "onNetworkQualityUpdated quality: " + i17 + ", rtt: " + i18 + ", loss: " + i19);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener
    /* renamed from: onVoicePitchUpdated */
    public void mo10565xe21d538e(int i17, boolean z17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102424a.f102428c, "onVoicePitchUpdated 演唱音高：" + i17 + ", " + z17 + ", " + j17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener
    /* renamed from: onVoiceScoreUpdated */
    public void mo10566x2ec5d7fc(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102424a.f102428c, "onVoiceScoreUpdated 上一句的分数：" + i17 + ", 平均分：" + i18);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener
    /* renamed from: shouldDecryptAudioData */
    public void mo10567x5283ed66(java.nio.ByteBuffer byteBuffer) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102424a.f102428c, "shouldDecryptAudioData");
    }
}
