package bh2;

/* loaded from: classes10.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bh2.v f20886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f20887e;

    public p(bh2.v vVar, java.lang.String str) {
        this.f20886d = vVar;
        this.f20887e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        om2.q qVar;
        om2.q qVar2;
        bh2.v vVar = this.f20886d;
        if (vVar.f20904l != com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger) {
            com.tencent.trtc.TXChorusMusicPlayer.TXChorusExternalMusicParams tXChorusExternalMusicParams = new com.tencent.trtc.TXChorusMusicPlayer.TXChorusExternalMusicParams();
            om2.s sVar = vVar.f20894b;
            java.lang.String str = null;
            tXChorusExternalMusicParams.musicUrl = (sVar == null || (qVar2 = sVar.f346380c) == null) ? null : qVar2.f346374c;
            tXChorusExternalMusicParams.musicId = this.f20887e;
            if (sVar != null && (qVar = sVar.f346380c) != null) {
                str = qVar.f346373b;
            }
            tXChorusExternalMusicParams.accompanyUrl = str;
            tXChorusExternalMusicParams.isEncrypted = false;
            com.tencent.trtc.TXChorusMusicPlayer tXChorusMusicPlayer = vVar.f20897e;
            if (tXChorusMusicPlayer != null) {
                tXChorusMusicPlayer.loadExternalMusic(tXChorusExternalMusicParams);
            }
            vVar.e(((dh2.w) vVar.f20893a).d() ? bh2.w.f20906e : bh2.w.f20905d);
        }
    }
}
