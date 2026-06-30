package com.tencent.magicbrush;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0007¨\u0006\u000f"}, d2 = {"Lcom/tencent/magicbrush/MagicBrush;", "Lcom/tencent/magicbrush/MBRuntime;", "", "windowId", "Ljz5/f0;", "onBindWindowInWorker", "onFirstFrameRendered", "canvasId", "virtualElementId", "type", "onScreenCanvasRenderingContextCreated", "yg/y", "yg/z", "yg/a0", "yg/b0", "lib-magicbrush-nano_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class MagicBrush extends com.tencent.magicbrush.MBRuntime {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f48586q = 0;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.magicbrush.c0 f48587k;

    /* renamed from: l, reason: collision with root package name */
    public final hh.d f48588l = new hh.d();

    /* renamed from: m, reason: collision with root package name */
    public final hh.d f48589m = new hh.d();

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.magicbrush.ui.MBViewManager f48590n = new com.tencent.magicbrush.ui.MBViewManager();

    /* renamed from: o, reason: collision with root package name */
    public final yg.b f48591o = new yg.b(this);

    /* renamed from: p, reason: collision with root package name */
    public final yg.b0 f48592p;

    public MagicBrush(com.tencent.magicbrush.a aVar, kotlin.jvm.internal.i iVar) {
        this.f48587k = aVar;
        com.tencent.magicbrush.MBRuntime.MBParams mBParams = aVar.H;
        this.f48578b = mBParams;
        dh.a aVar2 = aVar.f48605g;
        if (aVar2 != null) {
            mBParams.file_system_ = new ch.f(aVar2, this);
        }
        com.github.henryye.nativeiv.BaseImageDecodeService baseImageDecodeService = aVar.f48606h.f462059e;
        if (baseImageDecodeService != null) {
            baseImageDecodeService.addDecodeEventListener(new yg.z(this));
        }
        this.f48581e = baseImageDecodeService;
        this.f48577a = nativeCreate(this.f48578b, baseImageDecodeService, new com.tencent.magicbrush.internal.EventDispatcher(this));
        ch.a aVar3 = aVar.f48600b;
        kotlin.jvm.internal.o.d(aVar3);
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.set_jsthread_handler ", new java.lang.Object[0]);
        if (this.f48583g != null) {
            ah.i.a("MicroMsg.MagicBrush.MBRuntime", "Why you set_jsthread_handler twice, unexpected behaviour.", new java.lang.Object[0]);
        } else {
            this.f48583g = new ch.g(this.f48577a, aVar3);
        }
        this.f48582f = new com.tencent.magicbrush.ext_texture.MBExternalTexturePlugin(this);
        this.f48592p = aVar.f48607i;
        this.f48584h = gh.c.f271800h.a(this, this.f48583g, this.f48578b.animationFrameHandlerStrategy);
        if (this.f48583g == null) {
            throw new java.lang.IllegalStateException("[MBRuntime] JsThreadHandler not registered.");
        }
        if (this.f48582f == null) {
            throw new java.lang.IllegalStateException("[MBRuntime] ExternalTextureMgr not registered.");
        }
        if (this.f48577a == 0) {
            ah.i.b("MicroMsg.MagicBrush.MBRuntime", "init. mNativeInst == 0", new java.lang.Object[0]);
        } else {
            n(new java.lang.Runnable() { // from class: yg.i$$c
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.magicbrush.MBRuntime mBRuntime = com.tencent.magicbrush.MBRuntime.this;
                    mBRuntime.nativeInit(mBRuntime.f48577a, mBRuntime.f48582f);
                }
            });
        }
        yz5.a aVar4 = aVar.f48601c;
        kotlin.jvm.internal.o.d(aVar4);
        n(new yg.x$$b(aVar4, this));
    }

    @Override // com.tencent.magicbrush.MBRuntime
    /* renamed from: b, reason: from getter */
    public yg.b getF48591o() {
        return this.f48591o;
    }

    public final void onBindWindowInWorker(int i17) {
        com.tencent.magicbrush.ui.MBViewManager f48590n;
        try {
            ah.i.b("MagicBrush", "onBindWindowInWorker", new java.lang.Object[0]);
            com.tencent.magicbrush.MBRuntime mBRuntime = this.f48579c;
            com.tencent.magicbrush.ui.MagicBrushView findOrNull = (mBRuntime == null || (f48590n = mBRuntime.getF48590n()) == null) ? null : f48590n.findOrNull(i17);
            kotlin.jvm.internal.o.d(findOrNull);
            findOrNull.a(this);
        } catch (java.lang.Exception e17) {
            ah.i.c("MagicBrush", e17, "bindWindowInWorker failed", new java.lang.Object[0]);
        }
    }

    public final void onFirstFrameRendered(int i17) {
        try {
            this.f48589m.c(new yg.d0(i17));
        } catch (java.lang.Exception e17) {
            ah.i.c("MagicBrush", e17, "dispatch event failed", new java.lang.Object[0]);
        }
    }

    public final void onScreenCanvasRenderingContextCreated(int i17, int i18, int i19) {
        try {
            this.f48590n.find(i18).getRenderingContextListeners().d(new yg.e0(i19));
        } catch (java.lang.Exception e17) {
            ah.i.a("MagicBrush", "onScreenCanvasRenderingContextCreated error: " + e17, new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.magicbrush.MBRuntime
    /* renamed from: p, reason: from getter */
    public yg.b0 getF48592p() {
        return this.f48592p;
    }

    @Override // com.tencent.magicbrush.MBRuntime
    /* renamed from: q, reason: from getter */
    public com.tencent.magicbrush.ui.MBViewManager getF48590n() {
        return this.f48590n;
    }

    public void r() {
        ah.i.b("MagicBrush", "MagicBrush is destroying...", new java.lang.Object[0]);
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.destroy", new java.lang.Object[0]);
        yg.h hVar = this.f48585i;
        android.os.Handler handler = hVar.f462067d;
        if (handler != null) {
            handler.removeCallbacks(hVar.f462068e);
            hVar.f462067d = null;
        }
        if (this.f48577a == 0) {
            ah.i.b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.destroy skip outside", new java.lang.Object[0]);
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized (this) {
                if (this.f48577a == 0) {
                    ah.i.b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.destroy skip inside, lock [%d]ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                } else {
                    this.f48584h.a();
                    long j17 = this.f48577a;
                    this.f48583g = null;
                    this.f48581e = null;
                    this.f48577a = 0L;
                    nativeDestroy(j17);
                }
            }
        }
        this.f48590n.clear$lib_magicbrush_nano_release();
        this.f48588l.b();
        this.f48589m.b();
        ah.i.b("MagicBrush", "MagicBrush is destroying...[done]", new java.lang.Object[0]);
    }

    public final yg.b s() {
        return this.f48591o;
    }

    public final void t(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        ah.i.b("MagicBrush", "hy: trigger load ".concat(name), new java.lang.Object[0]);
        ah.d.b(name);
        java.lang.String a17 = ah.d.f4713b.a(name);
        if (a17 != null) {
            if (!(a17.length() == 0)) {
                if (kotlin.jvm.internal.o.b(name, "mmbox2d")) {
                    nativeLazyLoadBox2D(this.f48577a, a17);
                    return;
                } else if (kotlin.jvm.internal.o.b(name, "mmphysx")) {
                    nativeLazyLoadPhysx(this.f48577a, a17);
                    return;
                } else {
                    ah.i.a("MagicBrush", "hy: not support", new java.lang.Object[0]);
                    return;
                }
            }
        }
        ah.i.a("MagicBrush", "hy: can not find " + name + " path", new java.lang.Object[0]);
    }

    public final void u(gh.b strategy) {
        kotlin.jvm.internal.o.g(strategy, "strategy");
        if (this.f48584h.b() == strategy) {
            return;
        }
        ah.i.b("MagicBrush", "MagicBrush is changing AnimationFrameHandler strategy from " + this.f48584h.b() + " to " + strategy, new java.lang.Object[0]);
        gh.a aVar = gh.c.f271800h;
        ch.g jsThreadHandler = this.f48583g;
        kotlin.jvm.internal.o.f(jsThreadHandler, "jsThreadHandler");
        final gh.c a17 = aVar.a(this, jsThreadHandler, strategy);
        n(new java.lang.Runnable() { // from class: yg.x$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.tencent.magicbrush.MagicBrush.f48586q;
                com.tencent.magicbrush.MagicBrush this$0 = com.tencent.magicbrush.MagicBrush.this;
                kotlin.jvm.internal.o.g(this$0, "this$0");
                gh.c toChange = a17;
                kotlin.jvm.internal.o.g(toChange, "$toChange");
                gh.c cVar = this$0.f48584h;
                cVar.h();
                this$0.f48584h = toChange;
                toChange.i();
                cVar.a();
            }
        });
    }
}
