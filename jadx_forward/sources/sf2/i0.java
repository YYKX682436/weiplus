package sf2;

/* loaded from: classes10.dex */
public final class i0 implements com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sf2.j0 f488698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f488700c;

    public i0(sf2.j0 j0Var, java.lang.String str, boolean z17) {
        this.f488698a = j0Var;
        this.f488699b = str;
        this.f488700c = z17;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
    /* renamed from: onComplete */
    public void mo10551x815f5438(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBaseSongAuditionHelper", "[" + this.f488698a.f488707a + "] audition onComplete");
        sf2.j0.l(this.f488698a, this.f488699b, this.f488700c, false, 4, null);
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
    /* renamed from: onPlayProgress */
    public void mo10552xfd1c900(int i17, long j17, long j18) {
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
    /* renamed from: onStart */
    public void mo10553xb05099c3(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sf2.j0 j0Var = this.f488698a;
        sb6.append(j0Var.f488707a);
        sb6.append("] audition onStart: errCode=");
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBaseSongAuditionHelper", sb6.toString());
        if (i18 == 0) {
            j0Var.b();
            return;
        }
        android.content.Context e17 = j0Var.e();
        int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(e17);
        e4Var.f293309c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.or8);
        e4Var.c();
    }
}
