package bg;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f101341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f101342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg.f f101343f;

    public j(bg.f fVar, int i17, int i18) {
        this.f101343f = fVar;
        this.f101341d = i17;
        this.f101342e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        sf.f fVar;
        bg.f fVar2 = this.f101343f;
        int i17 = this.f101341d;
        int i18 = this.f101342e;
        if (!fVar2.B) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar2.A(), "onMediaPlayerInfo, mp released");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar2.A(), "onInfo, what:%d, extra:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 701) {
            fVar2.f101311v = fVar2.f101297h.mo1856xc00617a4();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar2.A(), "onInfo, buffering start, isPlayingBeforeBuffering:%b", java.lang.Boolean.valueOf(fVar2.f101311v));
            if (fVar2.U()) {
                ((fg1.b0) fVar2.f101298i).i();
            }
            dg.b bVar = fVar2.f101306q;
            if (bVar != null) {
                ye1.e eVar = fVar2.f101297h;
                fg1.z zVar = (fg1.z) bVar;
                dg.f b17 = zVar.b();
                ig1.a aVar = zVar.f343455c;
                aVar.getClass();
                if (eVar == null || b17 == null) {
                    return;
                }
                ig1.c cVar = aVar.f372874a;
                if (cVar.f372886k <= 0) {
                    cVar.f372884i++;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    cVar.f372886k = java.lang.System.currentTimeMillis();
                    fg1.q0 q0Var = (fg1.q0) b17;
                    q0Var.a(1234L, 50L, 1L, false);
                    if (oe1.x1.c(eVar)) {
                        q0Var.a(1234L, 98L, 1L, false);
                        return;
                    } else {
                        if (aVar.b(eVar)) {
                            q0Var.a(1234L, 103L, 1L, false);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i17 != 702) {
            if (i17 == 3) {
                if (!fVar2.B) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar2.A(), "onMediaPlayerVideoFirstFrame, mp released");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar2.A(), "onMediaPlayerVideoFirstFrame");
                if (fVar2.f101306q == null || (fVar = fVar2.f101308s) == null) {
                    return;
                }
                oe1.b2.a(fVar.mo50271x74292566());
                return;
            }
            return;
        }
        boolean mo1856xc00617a4 = fVar2.f101297h.mo1856xc00617a4();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar2.A(), "onInfo, buffering end, isPlayingBeforeBuffering:%b, isCurrentPlaying:%b", java.lang.Boolean.valueOf(fVar2.f101311v), java.lang.Boolean.valueOf(mo1856xc00617a4));
        if (fVar2.f101311v) {
            fVar2.f101311v = false;
            if (mo1856xc00617a4 && fVar2.U()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar2.A(), "onInfo, buffering end, notify video play");
                ((fg1.b0) fVar2.f101298i).g(false);
            }
        } else if (!mo1856xc00617a4 && fVar2.U()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar2.A(), "onInfo, buffering end, notify video pause");
            ((fg1.b0) fVar2.f101298i).f(false);
        }
        dg.b bVar2 = fVar2.f101306q;
        if (bVar2 != null) {
            ye1.e eVar2 = fVar2.f101297h;
            fg1.z zVar2 = (fg1.z) bVar2;
            dg.f b18 = zVar2.b();
            ig1.a aVar2 = zVar2.f343455c;
            aVar2.getClass();
            if (eVar2 == null || b18 == null) {
                return;
            }
            ig1.c cVar2 = aVar2.f372874a;
            if (cVar2.f372886k <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoProfileReport", "onMediaPlayerVideoBufferEnd, but has not call onMediaPlayerVideoBufferStart, why?");
                return;
            }
            if (cVar2.f372887l <= 0) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                cVar2.f372887l = java.lang.System.currentTimeMillis();
                fg1.q0 q0Var2 = (fg1.q0) b18;
                q0Var2.a(1234L, 51L, 1L, false);
                long j17 = cVar2.f372887l - cVar2.f372886k;
                cVar2.f372885j += j17;
                q0Var2.a(1234L, 53L, j17, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoProfileReport", "onMediaPlayerVideoBufferEnd, bufferTime:%s", java.lang.Long.valueOf(j17));
                if (oe1.x1.c(eVar2)) {
                    q0Var2.a(1234L, 99L, 1L, false);
                    q0Var2.a(1234L, 101L, j17, false);
                } else if (aVar2.b(eVar2)) {
                    q0Var2.a(1234L, 104L, 1L, false);
                    q0Var2.a(1234L, 106L, j17, false);
                }
            }
            cVar2.f372886k = 0L;
            cVar2.f372887l = 0L;
        }
    }
}
