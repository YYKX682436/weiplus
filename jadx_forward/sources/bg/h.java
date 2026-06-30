package bg;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f101331d;

    public h(bg.f fVar) {
        this.f101331d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ye1.e eVar;
        bg.f fVar = this.f101331d;
        if (!fVar.B) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onMediaPlayerPrepared, mp released");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onPrepared");
        dg.b bVar = fVar.f101306q;
        if (bVar != null) {
            ye1.e eVar2 = fVar.f101297h;
            long mo1852x51e8b0a = eVar2 != null ? eVar2.mo1852x51e8b0a() : 0;
            fg1.z zVar = (fg1.z) bVar;
            dg.f b17 = zVar.b();
            ig1.a aVar = zVar.f343455c;
            aVar.getClass();
            if (eVar2 != null && b17 != null) {
                ig1.c cVar = aVar.f372874a;
                if (cVar.f372881f <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoProfileReport", "onMediaPlayerVideoPrepareEnd, but has not call onMediaPlayerVideoPrepareStart, why?");
                } else {
                    if (cVar.f372882g <= 0) {
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        cVar.f372882g = java.lang.System.currentTimeMillis();
                        fg1.q0 q0Var = (fg1.q0) b17;
                        q0Var.a(1234L, 21L, 1L, false);
                        long j17 = cVar.f372882g - cVar.f372881f;
                        cVar.f372883h = j17;
                        q0Var.a(1234L, 23L, j17, false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoProfileReport", "onMediaPlayerVideoPrepareEnd, prepareTime:%s", java.lang.Long.valueOf(j17));
                        if (oe1.x1.c(eVar2)) {
                            q0Var.a(1234L, 46L, 1L, false);
                            q0Var.a(1234L, 48L, j17, false);
                        } else if (aVar.b(eVar2)) {
                            q0Var.a(1234L, 93L, 1L, false);
                            q0Var.a(1234L, 95L, j17, false);
                        } else if (oe1.x1.d(eVar2)) {
                            q0Var.a(1234L, 41L, 1L, false);
                            q0Var.a(1234L, 43L, j17, false);
                        }
                    }
                    if (cVar.f372880e <= 0 && mo1852x51e8b0a > 0) {
                        long j18 = (long) ((mo1852x51e8b0a * 1.0d) / 1000.0d);
                        cVar.f372880e = j18;
                        ((fg1.q0) b17).a(1234L, 35L, 1L, false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoProfileReport", "onMediaPlayerVideoPrepareEnd, duration:%s", java.lang.Long.valueOf(j18));
                    }
                }
            }
        }
        fVar.f101319z = true;
        fVar.r(false);
        if (fVar.U() && (eVar = fVar.f101297h) != null) {
            dg.e eVar3 = fVar.f101298i;
            int mo1855x8d5c7601 = eVar != null ? eVar.mo1855x8d5c7601() : 0;
            int B = fVar.B();
            ye1.e eVar4 = fVar.f101297h;
            ((fg1.b0) eVar3).e(mo1855x8d5c7601, B, eVar4 != null ? eVar4.mo1852x51e8b0a() : 0);
            long currentTimeMillis = java.lang.System.currentTimeMillis() - fVar.F1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.VideoPluginHandler", "updateLoadMetaDataCostTime onVideoLoadedMetaData cost:%dms", java.lang.Long.valueOf(currentTimeMillis));
            fVar.f101297h.v(currentTimeMillis);
        }
        bg.a aVar2 = fVar.E1;
        if (aVar2 != null) {
            ye1.e eVar5 = fVar.f101297h;
            android.util.Size size = new android.util.Size(eVar5 != null ? eVar5.mo1855x8d5c7601() : 0, fVar.B());
            lm1.t tVar = (lm1.t) aVar2;
            size.toString();
            tVar.f400896e = size;
            tVar.a();
        }
        long j19 = fVar.f101313x;
        if (j19 > 0) {
            fVar.R(j19);
            fVar.f101313x = 0L;
        }
        boolean z18 = !fVar.S;
        if (fVar.f101308s.m() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
            z18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.f.a(fVar.f101308s);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(fVar.A(), "onPrepared, component is not page view");
        }
        if (!z18 && !fVar.K1.a(fVar.f101308s) && !fVar.W) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onPrepared, stop video auto play when webview in background");
            fVar.U = new java.util.concurrent.atomic.AtomicBoolean(fVar.f101316y || fVar.f101312w);
            return;
        }
        fVar.W = false;
        if (!fVar.f101316y && !fVar.f101312w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onPrepared, not set start play when prepared");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onPrepared, start play when prepared, mStartWhenPrepared:%s, mControlStartWhenPrepared:%s", java.lang.Boolean.valueOf(fVar.f101316y), java.lang.Boolean.valueOf(fVar.f101312w));
        if (fVar.f101307r != null) {
            fg1.u uVar = fVar.f101307r;
            if (((java.lang.Boolean) ((b06.b) uVar.f343435h).b(uVar, fg1.u.f343427m[1])).booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.VideoPluginHandler", "onMediaPlayerPreparedInternal: castMediaPresent, avoid play when prepared");
                return;
            }
        }
        fVar.K(fVar.f101316y, true);
    }
}
