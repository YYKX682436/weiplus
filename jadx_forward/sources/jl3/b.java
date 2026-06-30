package jl3;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f381742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jl3.d f381743e;

    public b(jl3.d dVar, int i17) {
        this.f381743e = dVar;
        this.f381742d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        jl3.c cVar = this.f381743e.f381754q;
        if (cVar != null) {
            rl3.o oVar = (rl3.o) cVar;
            rl3.p pVar = oVar.f478797a;
            int i17 = this.f381742d;
            if (i17 != 1) {
                if (i17 == -2 || i17 == 5 || i17 == 19) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new rl3.m(oVar, i17));
                    return;
                } else {
                    if (i17 == -1 || i17 == 6 || i17 == 4) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new rl3.n(oVar));
                        rl3.p.w(pVar, pVar.f478798k, i17);
                        return;
                    }
                    return;
                }
            }
            jl3.d dVar = pVar.f478800m;
            if (dVar == null || pVar.f478803p || pVar.f478799l == null) {
                return;
            }
            pVar.f478799l.j(xl3.c.c(dVar.f381745e.f98879e, dVar.f381749i));
            if (pVar.t(pVar.f478798k) && !pVar.s()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicPlayer", "request focus error");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "startPlay");
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i iVar = pVar.f478799l;
                if (iVar != null) {
                    iVar.h();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MusicPlayer", e17, "startPlay", new java.lang.Object[0]);
            }
            pVar.f478803p = true;
            pVar.f478801n = false;
        }
    }
}
