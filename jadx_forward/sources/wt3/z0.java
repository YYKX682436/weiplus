package wt3;

/* loaded from: classes10.dex */
public final class z0 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt3.c1 f531059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f531060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk4.a f531061f;

    public z0(wt3.c1 c1Var, yz5.p pVar, dk4.a aVar) {
        this.f531059d = c1Var;
        this.f531060e = pVar;
        this.f531061f = aVar;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        wt3.c1.a(this.f531059d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAudioManager", "[cacheAudio] onProgress, mediaId:" + str + ", offset:" + j17 + ", total:" + j18);
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        wt3.c1.a(this.f531059d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAudioManager", "[cacheAudio] onFinish, mediaId:" + str + ", ret:" + i17);
        yz5.p pVar = this.f531060e;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.valueOf(i17 == 0), this.f531061f.f316016t);
        }
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String str, long j17, long j18) {
        wt3.c1.a(this.f531059d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAudioManager", "[cacheAudio] onDataAvailable, mediaId:" + str + ", offset:" + j17 + ", length:" + j18);
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String str, java.lang.String str2) {
        wt3.c1.a(this.f531059d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAudioManager", "[cacheAudio] onM3U8Ready, mediaId:" + str);
    }

    @Override // dn.n
    /* renamed from: onMoovReady */
    public void mo65708xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        wt3.c1.a(this.f531059d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAudioManager", "[cacheAudio] onMoovReady, mediaId:" + str + ", offset:" + j17 + ", length:" + j18);
    }
}
