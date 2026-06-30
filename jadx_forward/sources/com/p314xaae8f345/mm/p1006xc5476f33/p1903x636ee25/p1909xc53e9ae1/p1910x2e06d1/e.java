package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f232190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i f232191e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i iVar, boolean z17) {
        this.f232191e = iVar;
        this.f232190d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f232190d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.BasePlayer", "onError, needRetry:%b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i iVar = this.f232191e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.n nVar = iVar.f232196a;
        b21.r rVar = iVar.f232197b;
        rl3.l lVar = (rl3.l) nVar;
        lVar.getClass();
        b21.r j17 = kl3.t.g().j();
        if (j17 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "onError, needRetry:%b", java.lang.Boolean.valueOf(z17));
        rl3.p pVar = lVar.f478794b;
        if (z17) {
            rl3.p.w(pVar, rVar, 20);
        } else {
            rl3.p.w(pVar, rVar, 21);
        }
        if (!j17.a(rVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "send stop event");
            pVar.r(pVar.f478798k);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "stop");
        pVar.mo67222x66343656();
        if (!z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new rl3.k(lVar));
            pVar.r(pVar.f478798k);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "retry system media player again");
        pVar.y(j17, true);
        jl3.d dVar = new jl3.d(rVar, gl3.e.b(rVar.f98879e));
        pVar.f478800m = dVar;
        dVar.f381754q = pVar.f478804q;
        if (dVar.f381750m) {
            dVar.f381750m = false;
            s75.d.b(dVar, "music_download_thread");
        }
        kl3.h hVar = pVar.f478762d;
        if (hVar != null) {
            ((pl3.e) hVar).f438238c.f438230j = pVar.f478800m;
        }
    }
}
