package bh2;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f20867a;

    /* renamed from: b, reason: collision with root package name */
    public final bh2.a f20868b;

    /* renamed from: c, reason: collision with root package name */
    public bh2.b f20869c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam f20870d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20871e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20872f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bh2.l f20873g;

    public j(bh2.l lVar, java.lang.String songUniqueId, bh2.a data) {
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        kotlin.jvm.internal.o.g(data, "data");
        this.f20873g = lVar;
        this.f20867a = songUniqueId;
        this.f20868b = data;
        int i17 = data.f20850a;
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam = new com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam(i17, data.f20851b);
        audioMusicParam.publish = true;
        this.f20870d = audioMusicParam;
        lVar.f20875a.getAudioEffectManager().setMusicObserver(i17, new bh2.i(lVar, this));
    }

    public final void a() {
        this.f20872f = false;
        bh2.l lVar = this.f20873g;
        com.tencent.liteav.audio.TXAudioEffectManager audioEffectManager = lVar.f20875a.getAudioEffectManager();
        bh2.a aVar = this.f20868b;
        audioEffectManager.stopPlayMusic(aVar.f20850a);
        lVar.f20875a.getAudioEffectManager().setMusicObserver(aVar.f20850a, null);
        bh2.b bVar = this.f20869c;
        java.lang.String str = this.f20867a;
        if (bVar != null) {
            bVar.o2(str);
        }
        com.tencent.mars.xlog.Log.i(lVar.f20879e, "onPlayBGMStop data.id " + aVar.f20850a + ", " + str);
    }

    public final void b() {
        this.f20872f = false;
        bh2.l lVar = this.f20873g;
        com.tencent.liteav.audio.TXAudioEffectManager audioEffectManager = lVar.f20875a.getAudioEffectManager();
        bh2.a aVar = this.f20868b;
        audioEffectManager.pausePlayMusic(aVar.f20850a);
        bh2.b bVar = this.f20869c;
        java.lang.String str = this.f20867a;
        if (bVar != null) {
            bVar.g1(str);
        }
        com.tencent.mars.xlog.Log.i(lVar.f20879e, "onPlayBGMPause data.id " + aVar.f20850a + ", " + str);
    }

    public final void c() {
        this.f20872f = true;
        bh2.l lVar = this.f20873g;
        com.tencent.liteav.audio.TXAudioEffectManager audioEffectManager = lVar.f20875a.getAudioEffectManager();
        bh2.a aVar = this.f20868b;
        long musicCurrentPosInMS = audioEffectManager.getMusicCurrentPosInMS(aVar.f20850a);
        lVar.f20875a.getAudioEffectManager().resumePlayMusic(aVar.f20850a);
        bh2.b bVar = this.f20869c;
        java.lang.String str = this.f20867a;
        if (bVar != null) {
            bVar.s0(str, musicCurrentPosInMS);
        }
        com.tencent.mars.xlog.Log.i(lVar.f20879e, "onPlayBGMResumed data.id " + aVar.f20850a + ", " + str);
    }

    public final void d(long j17) {
        bh2.l lVar = this.f20873g;
        com.tencent.mars.xlog.Log.i(lVar.f20879e, "seek: " + j17);
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam = this.f20870d;
        audioMusicParam.startTimeMS = j17;
        lVar.f20875a.getAudioEffectManager().startPlayMusic(audioMusicParam);
    }

    public final void e(int i17) {
        bh2.l lVar = this.f20873g;
        java.lang.String str = lVar.f20879e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setMusicLocalVolume: ");
        sb6.append(i17);
        sb6.append(" id: ");
        bh2.a aVar = this.f20868b;
        sb6.append(aVar.f20850a);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        lVar.f20875a.getAudioEffectManager().setMusicPlayoutVolume(aVar.f20850a, i17);
    }

    public final void f(int i17) {
        this.f20873g.f20875a.getAudioEffectManager().setMusicPublishVolume(this.f20868b.f20850a, i17);
    }

    public final void g() {
        bh2.l lVar = this.f20873g;
        java.lang.String str = lVar.f20879e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPlayMusic id: ");
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam = this.f20870d;
        sb6.append(audioMusicParam.f46245id);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        lVar.f20875a.getAudioEffectManager().startPlayMusic(audioMusicParam);
    }
}
