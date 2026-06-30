package bh2;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f102400a;

    /* renamed from: b, reason: collision with root package name */
    public final bh2.a f102401b;

    /* renamed from: c, reason: collision with root package name */
    public bh2.b f102402c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam f102403d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f102404e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f102405f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bh2.l f102406g;

    public j(bh2.l lVar, java.lang.String songUniqueId, bh2.a data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f102406g = lVar;
        this.f102400a = songUniqueId;
        this.f102401b = data;
        int i17 = data.f102383a;
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam = new com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam(i17, data.f102384b);
        audioMusicParam.f14522xf1f89d0f = true;
        this.f102403d = audioMusicParam;
        lVar.f102408a.mo30282x5f1b9a9c().mo29055xe624d2d9(i17, new bh2.i(lVar, this));
    }

    public final void a() {
        this.f102405f = false;
        bh2.l lVar = this.f102406g;
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a mo30282x5f1b9a9c = lVar.f102408a.mo30282x5f1b9a9c();
        bh2.a aVar = this.f102401b;
        mo30282x5f1b9a9c.mo29069x17324d6f(aVar.f102383a);
        lVar.f102408a.mo30282x5f1b9a9c().mo29055xe624d2d9(aVar.f102383a, null);
        bh2.b bVar = this.f102402c;
        java.lang.String str = this.f102400a;
        if (bVar != null) {
            bVar.o2(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f102412e, "onPlayBGMStop data.id " + aVar.f102383a + ", " + str);
    }

    public final void b() {
        this.f102405f = false;
        bh2.l lVar = this.f102406g;
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a mo30282x5f1b9a9c = lVar.f102408a.mo30282x5f1b9a9c();
        bh2.a aVar = this.f102401b;
        mo30282x5f1b9a9c.mo29050xff20a1fb(aVar.f102383a);
        bh2.b bVar = this.f102402c;
        java.lang.String str = this.f102400a;
        if (bVar != null) {
            bVar.g1(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f102412e, "onPlayBGMPause data.id " + aVar.f102383a + ", " + str);
    }

    public final void c() {
        this.f102405f = true;
        bh2.l lVar = this.f102406g;
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a mo30282x5f1b9a9c = lVar.f102408a.mo30282x5f1b9a9c();
        bh2.a aVar = this.f102401b;
        long mo29047x8f832095 = mo30282x5f1b9a9c.mo29047x8f832095(aVar.f102383a);
        lVar.f102408a.mo30282x5f1b9a9c().mo29052x96288da4(aVar.f102383a);
        bh2.b bVar = this.f102402c;
        java.lang.String str = this.f102400a;
        if (bVar != null) {
            bVar.s0(str, mo29047x8f832095);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f102412e, "onPlayBGMResumed data.id " + aVar.f102383a + ", " + str);
    }

    public final void d(long j17) {
        bh2.l lVar = this.f102406g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f102412e, "seek: " + j17);
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam = this.f102403d;
        audioMusicParam.f14523x91dc3c35 = j17;
        lVar.f102408a.mo30282x5f1b9a9c().mo29068x79fb7d0f(audioMusicParam);
    }

    public final void e(int i17) {
        bh2.l lVar = this.f102406g;
        java.lang.String str = lVar.f102412e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setMusicLocalVolume: ");
        sb6.append(i17);
        sb6.append(" id: ");
        bh2.a aVar = this.f102401b;
        sb6.append(aVar.f102383a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        lVar.f102408a.mo30282x5f1b9a9c().mo29057xc0cc2931(aVar.f102383a, i17);
    }

    public final void f(int i17) {
        this.f102406g.f102408a.mo30282x5f1b9a9c().mo29058x6f0d32e6(this.f102401b.f102383a, i17);
    }

    public final void g() {
        bh2.l lVar = this.f102406g;
        java.lang.String str = lVar.f102412e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPlayMusic id: ");
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam = this.f102403d;
        sb6.append(audioMusicParam.f127778id);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        lVar.f102408a.mo30282x5f1b9a9c().mo29068x79fb7d0f(audioMusicParam);
    }
}
