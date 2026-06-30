package bh2;

/* loaded from: classes10.dex */
public final class i implements com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bh2.l f102398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bh2.j f102399b;

    public i(bh2.l lVar, bh2.j jVar) {
        this.f102398a = lVar;
        this.f102399b = jVar;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
    /* renamed from: onComplete */
    public void mo10551x815f5438(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102398a.f102412e, "playBgMusic onComplete " + i17 + ", " + i18);
        bh2.j jVar = this.f102399b;
        bh2.b bVar = jVar.f102402c;
        if (bVar != null) {
            bVar.P1(jVar.f102400a, i18);
        }
        jVar.f102405f = false;
        jVar.f102404e = true;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
    /* renamed from: onPlayProgress */
    public void mo10552xfd1c900(int i17, long j17, long j18) {
        bh2.j jVar = this.f102399b;
        bh2.b bVar = jVar.f102402c;
        if (bVar != null) {
            bVar.y2(jVar.f102400a, j17, j18);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
    /* renamed from: onStart */
    public void mo10553xb05099c3(int i17, int i18) {
        bh2.j jVar = this.f102399b;
        bh2.b bVar = jVar.f102402c;
        if (bVar != null) {
            bVar.a0(jVar.f102400a, i18);
        }
        jVar.f102405f = true;
        jVar.f102404e = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102398a.f102412e, "onBGMStart " + i17 + ", " + i18);
    }
}
