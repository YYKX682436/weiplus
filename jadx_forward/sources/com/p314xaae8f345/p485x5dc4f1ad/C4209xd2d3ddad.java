package com.p314xaae8f345.p485x5dc4f1ad;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0007¨\u0006\u000f"}, d2 = {"Lcom/tencent/magicbrush/MagicBrush;", "Lcom/tencent/magicbrush/MBRuntime;", "", "windowId", "Ljz5/f0;", "onBindWindowInWorker", "onFirstFrameRendered", "canvasId", "virtualElementId", "type", "onScreenCanvasRenderingContextCreated", "yg/y", "yg/z", "yg/a0", "yg/b0", "lib-magicbrush-nano_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.tencent.magicbrush.MagicBrush */
/* loaded from: classes7.dex */
public final class C4209xd2d3ddad extends com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f130119q = 0;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.p485x5dc4f1ad.c0 f130120k;

    /* renamed from: l, reason: collision with root package name */
    public final hh.d f130121l = new hh.d();

    /* renamed from: m, reason: collision with root package name */
    public final hh.d f130122m = new hh.d();

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.p485x5dc4f1ad.ui.C4215x4dd65873 f130123n = new com.p314xaae8f345.p485x5dc4f1ad.ui.C4215x4dd65873();

    /* renamed from: o, reason: collision with root package name */
    public final yg.b f130124o = new yg.b(this);

    /* renamed from: p, reason: collision with root package name */
    public final yg.b0 f130125p;

    public C4209xd2d3ddad(com.p314xaae8f345.p485x5dc4f1ad.a aVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f130120k = aVar;
        com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83.MBParams mBParams = aVar.H;
        this.f130111b = mBParams;
        dh.a aVar2 = aVar.f130138g;
        if (aVar2 != null) {
            mBParams.f16201xd592344d = new ch.f(aVar2, this);
        }
        com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1591x6c90f41d c1591x6c90f41d = aVar.f130139h.f543592e;
        if (c1591x6c90f41d != null) {
            c1591x6c90f41d.mo17099xd2af33bf(new yg.z(this));
        }
        this.f130114e = c1591x6c90f41d;
        this.f130110a = m34762x73c02ff3(this.f130111b, c1591x6c90f41d, new com.p314xaae8f345.p485x5dc4f1ad.p488x21ffc6bd.C4214x629228c1(this));
        ch.a aVar3 = aVar.f130133b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar3);
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.set_jsthread_handler ", new java.lang.Object[0]);
        if (this.f130116g != null) {
            ah.i.a("MicroMsg.MagicBrush.MBRuntime", "Why you set_jsthread_handler twice, unexpected behaviour.", new java.lang.Object[0]);
        } else {
            this.f130116g = new ch.g(this.f130110a, aVar3);
        }
        this.f130115f = new com.p314xaae8f345.p485x5dc4f1ad.p486xa7b754fd.C4211x20e2c38e(this);
        this.f130125p = aVar.f130140i;
        this.f130117h = gh.c.f353333h.a(this, this.f130116g, this.f130111b.f16187x9cfe4154);
        if (this.f130116g == null) {
            throw new java.lang.IllegalStateException("[MBRuntime] JsThreadHandler not registered.");
        }
        if (this.f130115f == null) {
            throw new java.lang.IllegalStateException("[MBRuntime] ExternalTextureMgr not registered.");
        }
        if (this.f130110a == 0) {
            ah.i.b("MicroMsg.MagicBrush.MBRuntime", "init. mNativeInst == 0", new java.lang.Object[0]);
        } else {
            n(new java.lang.Runnable() { // from class: yg.i$$c
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83.this;
                    abstractC4208x204d5c83.m34771xb90145c7(abstractC4208x204d5c83.f130110a, abstractC4208x204d5c83.f130115f);
                }
            });
        }
        yz5.a aVar4 = aVar.f130134c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar4);
        n(new yg.RunnableC30790x37186a(aVar4, this));
    }

    @Override // com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83
    /* renamed from: b, reason: from getter */
    public yg.b getF130124o() {
        return this.f130124o;
    }

    /* renamed from: onBindWindowInWorker */
    public final void m34796x72675eef(int i17) {
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4215x4dd65873 f130123n;
        try {
            ah.i.b("MagicBrush", "onBindWindowInWorker", new java.lang.Object[0]);
            com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this.f130112c;
            com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 m34847xff3f9123 = (abstractC4208x204d5c83 == null || (f130123n = abstractC4208x204d5c83.getF130123n()) == null) ? null : f130123n.m34847xff3f9123(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m34847xff3f9123);
            m34847xff3f9123.a(this);
        } catch (java.lang.Exception e17) {
            ah.i.c("MagicBrush", e17, "bindWindowInWorker failed", new java.lang.Object[0]);
        }
    }

    /* renamed from: onFirstFrameRendered */
    public final void m34797x452e7cb1(int i17) {
        try {
            this.f130122m.c(new yg.d0(i17));
        } catch (java.lang.Exception e17) {
            ah.i.c("MagicBrush", e17, "dispatch event failed", new java.lang.Object[0]);
        }
    }

    /* renamed from: onScreenCanvasRenderingContextCreated */
    public final void m34798xc962802(int i17, int i18, int i19) {
        try {
            this.f130123n.m34846x2ff5b9(i18).getRenderingContextListeners().d(new yg.e0(i19));
        } catch (java.lang.Exception e17) {
            ah.i.a("MagicBrush", "onScreenCanvasRenderingContextCreated error: " + e17, new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83
    /* renamed from: p, reason: from getter */
    public yg.b0 getF130125p() {
        return this.f130125p;
    }

    @Override // com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83
    /* renamed from: q, reason: from getter */
    public com.p314xaae8f345.p485x5dc4f1ad.ui.C4215x4dd65873 getF130123n() {
        return this.f130123n;
    }

    public void r() {
        ah.i.b("MagicBrush", "MagicBrush is destroying...", new java.lang.Object[0]);
        ah.i.b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.destroy", new java.lang.Object[0]);
        yg.h hVar = this.f130118i;
        android.os.Handler handler = hVar.f543600d;
        if (handler != null) {
            handler.removeCallbacks(hVar.f543601e);
            hVar.f543600d = null;
        }
        if (this.f130110a == 0) {
            ah.i.b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.destroy skip outside", new java.lang.Object[0]);
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized (this) {
                if (this.f130110a == 0) {
                    ah.i.b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.destroy skip inside, lock [%d]ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                } else {
                    this.f130117h.a();
                    long j17 = this.f130110a;
                    this.f130116g = null;
                    this.f130114e = null;
                    this.f130110a = 0L;
                    m34763x23caefe3(j17);
                }
            }
        }
        this.f130123n.m34845xcb40d13d();
        this.f130121l.b();
        this.f130122m.b();
        ah.i.b("MagicBrush", "MagicBrush is destroying...[done]", new java.lang.Object[0]);
    }

    public final yg.b s() {
        return this.f130124o;
    }

    public final void t(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        ah.i.b("MagicBrush", "hy: trigger load ".concat(name), new java.lang.Object[0]);
        ah.d.b(name);
        java.lang.String a17 = ah.d.f86246b.a(name);
        if (a17 != null) {
            if (!(a17.length() == 0)) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, "mmbox2d")) {
                    m34772x6180d42c(this.f130110a, a17);
                    return;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, "mmphysx")) {
                    m34773x6242fa75(this.f130110a, a17);
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(strategy, "strategy");
        if (this.f130117h.b() == strategy) {
            return;
        }
        ah.i.b("MagicBrush", "MagicBrush is changing AnimationFrameHandler strategy from " + this.f130117h.b() + " to " + strategy, new java.lang.Object[0]);
        gh.a aVar = gh.c.f353333h;
        ch.g jsThreadHandler = this.f130116g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jsThreadHandler, "jsThreadHandler");
        final gh.c a17 = aVar.a(this, jsThreadHandler, strategy);
        n(new java.lang.Runnable() { // from class: yg.x$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad.f130119q;
                com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad this$0 = com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad.this;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                gh.c toChange = a17;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toChange, "$toChange");
                gh.c cVar = this$0.f130117h;
                cVar.h();
                this$0.f130117h = toChange;
                toChange.i();
                cVar.a();
            }
        });
    }
}
