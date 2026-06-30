package bg;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f19798d;

    public h(bg.f fVar) {
        this.f19798d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ye1.e eVar;
        bg.f fVar = this.f19798d;
        if (!fVar.B) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "onMediaPlayerPrepared, mp released");
            return;
        }
        com.tencent.mars.xlog.Log.i(fVar.A(), "onPrepared");
        dg.b bVar = fVar.f19773q;
        if (bVar != null) {
            ye1.e eVar2 = fVar.f19764h;
            long duration = eVar2 != null ? eVar2.getDuration() : 0;
            fg1.z zVar = (fg1.z) bVar;
            dg.f b17 = zVar.b();
            ig1.a aVar = zVar.f261922c;
            aVar.getClass();
            if (eVar2 != null && b17 != null) {
                ig1.c cVar = aVar.f291341a;
                if (cVar.f291348f <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoProfileReport", "onMediaPlayerVideoPrepareEnd, but has not call onMediaPlayerVideoPrepareStart, why?");
                } else {
                    if (cVar.f291349g <= 0) {
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        cVar.f291349g = java.lang.System.currentTimeMillis();
                        fg1.q0 q0Var = (fg1.q0) b17;
                        q0Var.a(1234L, 21L, 1L, false);
                        long j17 = cVar.f291349g - cVar.f291348f;
                        cVar.f291350h = j17;
                        q0Var.a(1234L, 23L, j17, false);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoProfileReport", "onMediaPlayerVideoPrepareEnd, prepareTime:%s", java.lang.Long.valueOf(j17));
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
                    if (cVar.f291347e <= 0 && duration > 0) {
                        long j18 = (long) ((duration * 1.0d) / 1000.0d);
                        cVar.f291347e = j18;
                        ((fg1.q0) b17).a(1234L, 35L, 1L, false);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoProfileReport", "onMediaPlayerVideoPrepareEnd, duration:%s", java.lang.Long.valueOf(j18));
                    }
                }
            }
        }
        fVar.f19786z = true;
        fVar.r(false);
        if (fVar.U() && (eVar = fVar.f19764h) != null) {
            dg.e eVar3 = fVar.f19765i;
            int videoWidth = eVar != null ? eVar.getVideoWidth() : 0;
            int B = fVar.B();
            ye1.e eVar4 = fVar.f19764h;
            ((fg1.b0) eVar3).e(videoWidth, B, eVar4 != null ? eVar4.getDuration() : 0);
            long currentTimeMillis = java.lang.System.currentTimeMillis() - fVar.F1;
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.VideoPluginHandler", "updateLoadMetaDataCostTime onVideoLoadedMetaData cost:%dms", java.lang.Long.valueOf(currentTimeMillis));
            fVar.f19764h.v(currentTimeMillis);
        }
        bg.a aVar2 = fVar.E1;
        if (aVar2 != null) {
            ye1.e eVar5 = fVar.f19764h;
            android.util.Size size = new android.util.Size(eVar5 != null ? eVar5.getVideoWidth() : 0, fVar.B());
            lm1.t tVar = (lm1.t) aVar2;
            size.toString();
            tVar.f319363e = size;
            tVar.a();
        }
        long j19 = fVar.f19780x;
        if (j19 > 0) {
            fVar.R(j19);
            fVar.f19780x = 0L;
        }
        boolean z18 = !fVar.S;
        if (fVar.f19775s.m() instanceof com.tencent.mm.plugin.appbrand.page.v5) {
            z18 = com.tencent.mm.plugin.appbrand.extendplugin.f.a(fVar.f19775s);
        } else {
            com.tencent.mars.xlog.Log.w(fVar.A(), "onPrepared, component is not page view");
        }
        if (!z18 && !fVar.K1.a(fVar.f19775s) && !fVar.W) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "onPrepared, stop video auto play when webview in background");
            fVar.U = new java.util.concurrent.atomic.AtomicBoolean(fVar.f19783y || fVar.f19779w);
            return;
        }
        fVar.W = false;
        if (!fVar.f19783y && !fVar.f19779w) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "onPrepared, not set start play when prepared");
            return;
        }
        com.tencent.mars.xlog.Log.i(fVar.A(), "onPrepared, start play when prepared, mStartWhenPrepared:%s, mControlStartWhenPrepared:%s", java.lang.Boolean.valueOf(fVar.f19783y), java.lang.Boolean.valueOf(fVar.f19779w));
        if (fVar.f19774r != null) {
            fg1.u uVar = fVar.f19774r;
            if (((java.lang.Boolean) ((b06.b) uVar.f261902h).b(uVar, fg1.u.f261894m[1])).booleanValue()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.VideoPluginHandler", "onMediaPlayerPreparedInternal: castMediaPresent, avoid play when prepared");
                return;
            }
        }
        fVar.K(fVar.f19783y, true);
    }
}
