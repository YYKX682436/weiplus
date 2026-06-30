package bh2;

/* loaded from: classes10.dex */
public final class i implements com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bh2.l f20865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bh2.j f20866b;

    public i(bh2.l lVar, bh2.j jVar) {
        this.f20865a = lVar;
        this.f20866b = jVar;
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(this.f20865a.f20879e, "playBgMusic onComplete " + i17 + ", " + i18);
        bh2.j jVar = this.f20866b;
        bh2.b bVar = jVar.f20869c;
        if (bVar != null) {
            bVar.P1(jVar.f20867a, i18);
        }
        jVar.f20872f = false;
        jVar.f20871e = true;
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i17, long j17, long j18) {
        bh2.j jVar = this.f20866b;
        bh2.b bVar = jVar.f20869c;
        if (bVar != null) {
            bVar.y2(jVar.f20867a, j17, j18);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i17, int i18) {
        bh2.j jVar = this.f20866b;
        bh2.b bVar = jVar.f20869c;
        if (bVar != null) {
            bVar.a0(jVar.f20867a, i18);
        }
        jVar.f20872f = true;
        jVar.f20871e = false;
        com.tencent.mars.xlog.Log.i(this.f20865a.f20879e, "onBGMStart " + i17 + ", " + i18);
    }
}
