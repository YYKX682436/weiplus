package go0;

/* loaded from: classes14.dex */
public class f0 implements et0.q, go0.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f355291d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f355292e = jz5.h.b(go0.t.f355385d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f355293f = jz5.h.b(go0.s.f355368d);

    /* renamed from: g, reason: collision with root package name */
    public final android.os.HandlerThread f355294g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f355295h;

    /* renamed from: i, reason: collision with root package name */
    public rs0.h f355296i;

    /* renamed from: m, reason: collision with root package name */
    public ft0.d f355297m;

    /* renamed from: n, reason: collision with root package name */
    public android.opengl.EGLSurface f355298n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f355299o;

    /* renamed from: p, reason: collision with root package name */
    public go0.f1 f355300p;

    /* renamed from: q, reason: collision with root package name */
    public kn0.i f355301q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.a f355302r;

    public f0(boolean z17, boolean z18) {
        this.f355291d = z18;
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("MicroMsg.LiveCoreRender", 10);
        this.f355294g = a17;
        a17.start();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17.getLooper());
        this.f355295h = n3Var;
        n3Var.mo50293x3498a0(new go0.d(this, z17));
    }

    @Override // go0.i0
    public void a(java.lang.Object obj, boolean z17) {
        l(new go0.u(this, obj, z17));
    }

    public final wo.q1 c() {
        is0.c c17;
        is0.c c18;
        ft0.d dVar = this.f355297m;
        int i17 = 0;
        int i18 = (dVar == null || (c18 = dVar.c()) == null) ? 0 : c18.f375933m;
        ft0.d dVar2 = this.f355297m;
        if (dVar2 != null && (c17 = dVar2.c()) != null) {
            i17 = c17.f375934n;
        }
        return new wo.q1(i18, i17);
    }

    public final int d() {
        return ((java.lang.Number) ((jz5.n) this.f355293f).mo141623x754a37bb()).intValue();
    }

    public final int e() {
        return ((java.lang.Number) ((jz5.n) this.f355292e).mo141623x754a37bb()).intValue();
    }

    public go0.f1 f(boolean z17, boolean z18, boolean z19) {
        return new go0.f1(z17, z18, z19);
    }

    @Override // et0.q
    /* renamed from: getEGLContext */
    public android.opengl.EGLContext mo8977xe0fe423b() {
        rs0.h hVar = this.f355296i;
        if (hVar != null) {
            return hVar.f480827c;
        }
        return null;
    }

    @Override // et0.q
    /* renamed from: getFrameDataCallback */
    public di3.o mo8978x89bef366() {
        ft0.d dVar = this.f355297m;
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    @Override // et0.q
    /* renamed from: getPreviewTexture */
    public is0.c mo8982xa9fb0529() {
        go0.f1 f1Var = this.f355300p;
        if (f1Var != null) {
            return f1Var.g();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0024, code lost:
    
        if ((r1.mo50287xb9a7fe99()) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(yz5.l r6) {
        /*
            r5 = this;
            go0.f1 r0 = r5.f355300p
            if (r0 != 0) goto L5
            goto L3f
        L5:
            if (r6 != 0) goto L16
            com.tencent.mm.sdk.platformtools.b4 r1 = r0.P
            if (r1 == 0) goto Le
            r1.d()
        Le:
            com.tencent.mm.sdk.platformtools.b4 r1 = r0.P
            if (r1 == 0) goto L3d
            r1.m77787xbe88f509()
            goto L3d
        L16:
            com.tencent.mm.sdk.platformtools.b4 r1 = r0.P
            r2 = 1
            if (r1 == 0) goto L26
            boolean r1 = r1.mo50287xb9a7fe99()
            if (r1 != r2) goto L23
            r1 = r2
            goto L24
        L23:
            r1 = 0
        L24:
            if (r1 == 0) goto L34
        L26:
            com.tencent.mm.sdk.platformtools.b4 r1 = new com.tencent.mm.sdk.platformtools.b4
            go0.e1 r3 = new go0.e1
            r3.<init>(r0)
            java.lang.String r4 = "LiveRenderFpsCounter"
            r1.<init>(r4, r3, r2)
            r0.P = r1
        L34:
            com.tencent.mm.sdk.platformtools.b4 r1 = r0.P
            if (r1 == 0) goto L3d
            r2 = 1000(0x3e8, double:4.94E-321)
            r1.c(r2, r2)
        L3d:
            r0.N = r6
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: go0.f0.h(yz5.l):void");
    }

    public final void i(int i17, int i18) {
        l(new go0.a0(i17, i18, this));
    }

    @Override // et0.q
    public void j() {
    }

    @Override // et0.r
    public void l(final yz5.a r17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "r");
        this.f355295h.mo50293x3498a0(new java.lang.Runnable(r17) { // from class: go0.r

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f355365d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "function");
                this.f355365d = r17;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f355365d.mo152xb9724478();
            }
        });
    }

    @Override // et0.q
    public void m(ms0.c renderer, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderer, "renderer");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.LiveCoreRender", "setPreviewRenderer cpuCrop:" + z17, new java.lang.Object[0]);
        ft0.d dVar = this.f355297m;
        if (dVar != null) {
            ft0.d.h(dVar, false, false, 3, null);
        }
        ft0.d fVar = z17 ? new ft0.f(this) : new ft0.h(this);
        this.f355297m = fVar;
        fVar.i(renderer);
        ft0.d dVar2 = this.f355297m;
        if (dVar2 != null) {
            dVar2.f(null, null);
        }
        ft0.d dVar3 = this.f355297m;
        if (dVar3 != null) {
            dVar3.f347993a.l(new ft0.a(dVar3, new go0.v(this), true, 0));
        }
    }

    @Override // et0.q
    /* renamed from: release */
    public void mo8984x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreRender", "release live render manager");
        l(new go0.o(this));
    }

    @Override // et0.r
    /* renamed from: requestRender */
    public void mo46859x511cb905() {
        l(new go0.q(this));
    }

    @Override // et0.q
    /* renamed from: setOnDrawListener */
    public void mo8988x4ac79299(yz5.l lVar) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.LiveCoreRender", "setOnDrawListener", new java.lang.Object[0]);
        ft0.d dVar = this.f355297m;
        if (dVar != null) {
            dVar.f347997e = lVar;
        }
    }

    @Override // et0.q
    public void u(yz5.l lVar) {
        ft0.d dVar = this.f355297m;
        if ((dVar != null ? dVar.b() : null) == null) {
            this.f355302r = new go0.x(lVar, this);
            return;
        }
        if (lVar != null) {
            ft0.d dVar2 = this.f355297m;
            lVar.mo146xb9724478(dVar2 != null ? dVar2.b() : null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryCameraPreview  ");
        ft0.d dVar3 = this.f355297m;
        sb6.append(dVar3 != null ? dVar3.b() : null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.LiveCoreRender", sb6.toString(), new java.lang.Object[0]);
    }

    @Override // et0.q
    public void w(ts0.c cameraConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cameraConfig, "cameraConfig");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.LiveCoreRender", "updateCameraConfig:" + cameraConfig, new java.lang.Object[0]);
        ft0.d dVar = this.f355297m;
        if (dVar != null) {
            dVar.j(cameraConfig);
        }
    }

    @Override // et0.q
    public void y() {
        ms0.c cVar;
        ft0.d dVar = this.f355297m;
        if (dVar == null || (cVar = dVar.f347995c) == null) {
            return;
        }
        cVar.f412488k = true;
    }
}
