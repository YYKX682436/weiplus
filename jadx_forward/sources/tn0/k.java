package tn0;

/* loaded from: classes3.dex */
public final class k implements com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver f502246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f502247b;

    public k(com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver tXMusicPlayObserver, tn0.w0 w0Var) {
        this.f502246a = tXMusicPlayObserver;
        this.f502247b = w0Var;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
    /* renamed from: onComplete */
    public void mo10551x815f5438(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "playLocalBgmAudio onComplete " + i17 + ", " + i18);
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver tXMusicPlayObserver = this.f502246a;
        if (tXMusicPlayObserver != null) {
            tXMusicPlayObserver.mo10551x815f5438(i17, i18);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
    /* renamed from: onPlayProgress */
    public void mo10552xfd1c900(int i17, long j17, long j18) {
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver tXMusicPlayObserver = this.f502246a;
        if (tXMusicPlayObserver != null) {
            tXMusicPlayObserver.mo10552xfd1c900(i17, j17, j18);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
    /* renamed from: onStart */
    public void mo10553xb05099c3(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "playLocalBgmAudio onStart " + i17 + ", " + i18);
        this.f502247b.N = i18 == 0;
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver tXMusicPlayObserver = this.f502246a;
        if (tXMusicPlayObserver != null) {
            tXMusicPlayObserver.mo10553xb05099c3(i17, i18);
        }
    }
}
