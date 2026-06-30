package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public gj3.h f231408a;

    /* renamed from: b, reason: collision with root package name */
    public cj3.n f231409b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f231410c;

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f231411d;

    /* renamed from: e, reason: collision with root package name */
    public jz5.l f231412e;

    /* renamed from: mImageReaderWrapper */
    private jj3.b f37688x7d842002;

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 view, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        jj3.j jVar = e().f353930i;
        synchronized (jVar) {
            if (jVar.f381555g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.RenderTargetHolder", "already closed");
                return;
            }
            jj3.c cVar = (jj3.c) jVar.f381553e.get(userName);
            if (cVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MTR.RenderTargetHolder", "arrayMap already has " + userName + " key");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.a(), view)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.RenderTargetHolder", "already has same targetHolder register");
                    return;
                }
                jVar.a(cVar);
            }
            jj3.c cVar2 = new jj3.c(userName, new java.lang.ref.WeakReference(view), null, null, false, 28, null);
            view.m67065xd3312f9a(new jj3.e(userName, cVar2));
            view.m67066xeba5354f(new jj3.f(userName, cVar2, jVar));
            view.m67067xb7ba2d98(new jj3.h(userName, jVar, view));
            jVar.f381553e.put(userName, cVar2);
        }
    }

    public final void b() {
        android.graphics.SurfaceTexture surfaceTexture;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.MultiTalkRenderLogic", "close");
        this.f37688x7d842002 = null;
        jz5.l lVar = this.f231412e;
        if (lVar != null && (surfaceTexture = (android.graphics.SurfaceTexture) lVar.f384367e) != null) {
            surfaceTexture.release();
        }
        this.f231412e = null;
        cj3.n nVar = this.f231409b;
        if (nVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.MultiTalkEngineOp", "stopDecodeVideo");
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.R(null);
            nVar.f123432c = false;
        }
        this.f231409b = null;
        gj3.h hVar = this.f231408a;
        if (hVar != null) {
            hVar.close();
        }
        this.f231408a = null;
    }

    public final void c() {
        jj3.j jVar;
        gj3.h hVar = this.f231408a;
        if (hVar != null && (jVar = hVar.f353930i) != null) {
            android.util.ArrayMap arrayMap = jVar.f381553e;
            jj3.c cVar = (jj3.c) arrayMap.get("MTR_ENCODER_TARGET");
            if (cVar != null) {
                jVar.a(cVar);
            }
            jj3.d a17 = cVar != null ? cVar.a() : null;
            jj3.b bVar = a17 instanceof jj3.b ? (jj3.b) a17 : null;
            if (bVar != null) {
                bVar.close();
            }
            arrayMap.remove("MTR_ENCODER_TARGET");
        }
        this.f37688x7d842002 = null;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f231411d;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        this.f231411d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u1
            if (r0 == 0) goto L13
            r0 = r7
            com.tencent.mm.plugin.multitalk.model.u1 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u1) r0
            int r1 = r0.f231686g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f231686g = r1
            goto L18
        L13:
            com.tencent.mm.plugin.multitalk.model.u1 r0 = new com.tencent.mm.plugin.multitalk.model.u1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f231684e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f231686g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f231683d
            com.tencent.mm.plugin.multitalk.model.a2 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L61
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            gj3.h r7 = r6.e()
            jz5.l r2 = r6.f231412e
            if (r2 != 0) goto L66
            java.lang.String r2 = "MicroMsg.MTR.MultiTalkRenderLogic"
            java.lang.String r4 = "getCameraSurfaceTexture: create camera texture"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4)
            ij3.l r2 = ij3.m.f373245e
            ij3.m r2 = ij3.m.f373246f
            ij3.f r4 = r7.f353927f
            oz5.l r2 = r4.mo7096x348d9a(r2)
            com.tencent.mm.plugin.multitalk.model.v1 r4 = new com.tencent.mm.plugin.multitalk.model.v1
            r5 = 0
            r4.<init>(r7, r5)
            r0.f231683d = r6
            r0.f231686g = r3
            java.lang.Object r7 = p3325xe03a0797.p3326xc267989b.l.g(r2, r4, r0)
            if (r7 != r1) goto L60
            return r1
        L60:
            r0 = r6
        L61:
            r2 = r7
            jz5.l r2 = (jz5.l) r2
            r0.f231412e = r2
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final gj3.h e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.MultiTalkRenderLogic", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        gj3.h hVar = this.f231408a;
        if (hVar != null && hVar.f353926e) {
            return hVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.MultiTalkRenderLogic", "real init");
        gj3.h hVar2 = new gj3.h();
        this.f231408a = hVar2;
        return hVar2;
    }

    public final void f() {
        gj3.h e17 = e();
        if (this.f231409b == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MTR.MultiTalkRenderLogic", java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().v()), new java.lang.Object[0]);
            this.f231409b = new cj3.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.w1(e17), e17.f353929h);
        }
    }

    public final void g(int i17, int i18) {
        gj3.h e17 = e();
        jj3.b bVar = new jj3.b();
        if (bVar.f381535d != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.ImageReaderWrapper", "already has an instance, release first");
            bVar.close();
        }
        android.media.ImageReader newInstance = android.media.ImageReader.newInstance(i18, i18, 1, 2);
        bVar.f381535d = newInstance;
        if (newInstance != null) {
            newInstance.setOnImageAvailableListener(new jj3.a(bVar), null);
        }
        jj3.j jVar = e17.f353930i;
        jVar.getClass();
        android.util.ArrayMap arrayMap = jVar.f381553e;
        if (arrayMap.get("MTR_ENCODER_TARGET") != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MTR.RenderTargetHolder", "arrayMap already has encoder target");
        }
        arrayMap.put("MTR_ENCODER_TARGET", new jj3.c("MTR_ENCODER_TARGET", new java.lang.ref.WeakReference(bVar), null, null, false, 28, null));
        this.f37688x7d842002 = bVar;
        this.f231411d = p3325xe03a0797.p3326xc267989b.z0.a(((fj3.n) ((jz5.n) e17.f353933o).mo141623x754a37bb()).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        f();
    }

    public final void h(java.lang.String userName) {
        fj3.k a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.MultiTalkRenderLogic", "refreshWindow ".concat(userName));
        gj3.h hVar = this.f231408a;
        if (hVar == null || (a17 = hVar.a()) == null) {
            return;
        }
        a17.a(new hj3.n(userName, new mj3.g(-1, -1, -1, false, false, 24, null)));
    }

    public final void i(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.MultiTalkRenderLogic", "setVirtualBackgroundState: curState " + this.f231410c + ", newState " + z17);
        this.f231410c = z17;
        rq4.u.f480642a.b(z17 ? 1 : 2, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().d());
    }

    public final void j(java.lang.String wxUserName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUserName, "wxUserName");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MTR.MultiTalkRenderLogic", "startDecodeScreen", new java.lang.Object[0]);
        f();
        cj3.n nVar = this.f231409b;
        if (nVar != null) {
            int c17 = zj3.j.c(wxUserName);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y1 y1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y1(this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.MultiTalkEngineOp", "startDecodeScreen");
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().v()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.MultiTalkEngineOp", "startDecodeScreen: ilink callbcak mode");
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.R(nVar.f123435f);
            } else if (nVar.f123433d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MTR.MultiTalkEngineOp", "screen decode runner is working");
            } else {
                nVar.f123433d = true;
                y1Var.mo146xb9724478(new cj3.l(new cj3.f(nVar, c17, y1Var)));
            }
        }
    }

    public final void k() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MTR.MultiTalkRenderLogic", "stopDecodeScreen", new java.lang.Object[0]);
        cj3.n nVar = this.f231409b;
        if (nVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.MultiTalkEngineOp", "stopDecodeScreen");
            nVar.f123433d = false;
        }
    }

    public final void l(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 view, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        jj3.j jVar = e().f353930i;
        synchronized (jVar) {
            jj3.c cVar = (jj3.c) jVar.f381553e.get(userName);
            jj3.c cVar2 = null;
            if (cVar != null) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.a(), view)) {
                    cVar = null;
                }
                if (cVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.RenderTargetHolder", "unbindOutputView " + view + ", " + userName);
                    cVar.f381541e = false;
                    jVar.a(cVar);
                    cVar2 = (jj3.c) jVar.f381553e.remove(userName);
                }
            }
            if (cVar2 == null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MTR.RenderTargetHolder", "unbindOutputView not match current", new java.lang.Object[0]);
            }
        }
    }
}
