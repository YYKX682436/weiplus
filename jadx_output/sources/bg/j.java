package bg;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg.f f19810f;

    public j(bg.f fVar, int i17, int i18) {
        this.f19810f = fVar;
        this.f19808d = i17;
        this.f19809e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        sf.f fVar;
        bg.f fVar2 = this.f19810f;
        int i17 = this.f19808d;
        int i18 = this.f19809e;
        if (!fVar2.B) {
            com.tencent.mars.xlog.Log.i(fVar2.A(), "onMediaPlayerInfo, mp released");
            return;
        }
        com.tencent.mars.xlog.Log.i(fVar2.A(), "onInfo, what:%d, extra:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 701) {
            fVar2.f19778v = fVar2.f19764h.isPlaying();
            com.tencent.mars.xlog.Log.i(fVar2.A(), "onInfo, buffering start, isPlayingBeforeBuffering:%b", java.lang.Boolean.valueOf(fVar2.f19778v));
            if (fVar2.U()) {
                ((fg1.b0) fVar2.f19765i).i();
            }
            dg.b bVar = fVar2.f19773q;
            if (bVar != null) {
                ye1.e eVar = fVar2.f19764h;
                fg1.z zVar = (fg1.z) bVar;
                dg.f b17 = zVar.b();
                ig1.a aVar = zVar.f261922c;
                aVar.getClass();
                if (eVar == null || b17 == null) {
                    return;
                }
                ig1.c cVar = aVar.f291341a;
                if (cVar.f291353k <= 0) {
                    cVar.f291351i++;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    cVar.f291353k = java.lang.System.currentTimeMillis();
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
                    com.tencent.mars.xlog.Log.i(fVar2.A(), "onMediaPlayerVideoFirstFrame, mp released");
                    return;
                }
                com.tencent.mars.xlog.Log.i(fVar2.A(), "onMediaPlayerVideoFirstFrame");
                if (fVar2.f19773q == null || (fVar = fVar2.f19775s) == null) {
                    return;
                }
                oe1.b2.a(fVar.getAppId());
                return;
            }
            return;
        }
        boolean isPlaying = fVar2.f19764h.isPlaying();
        com.tencent.mars.xlog.Log.i(fVar2.A(), "onInfo, buffering end, isPlayingBeforeBuffering:%b, isCurrentPlaying:%b", java.lang.Boolean.valueOf(fVar2.f19778v), java.lang.Boolean.valueOf(isPlaying));
        if (fVar2.f19778v) {
            fVar2.f19778v = false;
            if (isPlaying && fVar2.U()) {
                com.tencent.mars.xlog.Log.i(fVar2.A(), "onInfo, buffering end, notify video play");
                ((fg1.b0) fVar2.f19765i).g(false);
            }
        } else if (!isPlaying && fVar2.U()) {
            com.tencent.mars.xlog.Log.i(fVar2.A(), "onInfo, buffering end, notify video pause");
            ((fg1.b0) fVar2.f19765i).f(false);
        }
        dg.b bVar2 = fVar2.f19773q;
        if (bVar2 != null) {
            ye1.e eVar2 = fVar2.f19764h;
            fg1.z zVar2 = (fg1.z) bVar2;
            dg.f b18 = zVar2.b();
            ig1.a aVar2 = zVar2.f261922c;
            aVar2.getClass();
            if (eVar2 == null || b18 == null) {
                return;
            }
            ig1.c cVar2 = aVar2.f291341a;
            if (cVar2.f291353k <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoProfileReport", "onMediaPlayerVideoBufferEnd, but has not call onMediaPlayerVideoBufferStart, why?");
                return;
            }
            if (cVar2.f291354l <= 0) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                cVar2.f291354l = java.lang.System.currentTimeMillis();
                fg1.q0 q0Var2 = (fg1.q0) b18;
                q0Var2.a(1234L, 51L, 1L, false);
                long j17 = cVar2.f291354l - cVar2.f291353k;
                cVar2.f291352j += j17;
                q0Var2.a(1234L, 53L, j17, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoProfileReport", "onMediaPlayerVideoBufferEnd, bufferTime:%s", java.lang.Long.valueOf(j17));
                if (oe1.x1.c(eVar2)) {
                    q0Var2.a(1234L, 99L, 1L, false);
                    q0Var2.a(1234L, 101L, j17, false);
                } else if (aVar2.b(eVar2)) {
                    q0Var2.a(1234L, 104L, 1L, false);
                    q0Var2.a(1234L, 106L, j17, false);
                }
            }
            cVar2.f291353k = 0L;
            cVar2.f291354l = 0L;
        }
    }
}
