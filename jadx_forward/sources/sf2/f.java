package sf2;

/* loaded from: classes3.dex */
public final class f implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mm2.c1 f488659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sf2.x f488660b;

    public f(mm2.c1 c1Var, sf2.x xVar) {
        this.f488659a = c1Var;
        this.f488660b = xVar;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorMusicSingSongController", "enableSongListDisplayForNewVersion: CGI failed, errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicSingSongController", "enableSongListDisplayForNewVersion: CGI success");
        this.f488659a.Z9((int) r1.f410399q);
        ((mm2.m6) this.f488660b.m56788xbba4bfc0(mm2.m6.class)).f410778m.mo7808x76db6cb1(java.lang.Boolean.TRUE);
    }
}
