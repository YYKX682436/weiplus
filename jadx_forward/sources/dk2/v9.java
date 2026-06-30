package dk2;

/* loaded from: classes10.dex */
public final class v9 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.ca f315774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315776f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315777g;

    public v9(dk2.ca caVar, java.lang.String str, yz5.l lVar, yz5.l lVar2) {
        this.f315774d = caVar;
        this.f315775e = str;
        this.f315776f = lVar;
        this.f315777g = lVar2;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        pm0.v.X(new dk2.u9(this.f315774d, str, i17, this.f315775e, this.f315776f, hVar, this.f315777g));
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayDownloadManager", "onDataAvailable: " + str + ", offset: " + j17 + ", length: " + j18);
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayDownloadManager", "onM3U8Ready: " + str);
    }

    @Override // dn.n
    /* renamed from: onMoovReady */
    public void mo65708xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayDownloadManager", "onMoovReady: " + str + ", offset: " + j17 + ", length: " + j18);
    }
}
