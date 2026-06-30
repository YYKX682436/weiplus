package wb1;

/* loaded from: classes7.dex */
public final class h extends eg.a implements gh.r {

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f525908g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f525909h;

    /* renamed from: i, reason: collision with root package name */
    public int f525910i;

    /* renamed from: n, reason: collision with root package name */
    public gh.t f525912n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.Surface f525913o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 f525914p;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f525917s;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f525911m = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public int f525915q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f525916r = -1;

    public static final void r(wb1.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, int i17) {
        hVar.getClass();
        if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("position");
            hVar.f525915q = java.lang.Math.max((int) ik1.w.h(optJSONObject, "width", 0.0f), 1);
            hVar.f525916r = java.lang.Math.max((int) ik1.w.h(optJSONObject, "height", 0.0f), 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar;
            v5Var.w(new wb1.b(hVar));
            hVar.f525909h = v5Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 v37 = v5Var.v3();
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = v37 instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y ? (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) v37 : null;
            ae.r rVar = yVar != null ? (ae.r) yVar.z1(ae.r.class) : null;
            if (rVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("JsApiInsertHTMLCanvasElement", "hy: webgl extension not exists!");
                return;
            }
            com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad w17 = rVar.w();
            if (w17 == null) {
                return;
            }
            boolean optBoolean = jSONObject.optBoolean("scrollSupportedTouchEvent", false);
            hVar.f525910i = jSONObject.optInt("canvasId", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "insert xweb webgl canvas viewId:" + hVar.f525910i + " scrollSupportedTouchEvent:" + optBoolean);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = new com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2(context, hVar);
            c4216x654bedf2.m34867x7867078f(w17);
            c4216x654bedf2.getPreparedListeners().a(new wb1.d(hVar, w17, lVar, i17, k0Var));
            vb1.b bVar = vb1.d.f516006c;
            java.lang.String mo48798x74292566 = v5Var.mo48798x74292566();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
            bVar.a(mo48798x74292566).a(hVar.f525910i, c4216x654bedf2);
            if (optBoolean) {
                c4216x654bedf2.m34866xdd3a8900(false);
            }
            hVar.f525914p = c4216x654bedf2;
            v5Var.U(new wb1.e(lVar, hVar, w17));
            if (v5Var.l2()) {
                java.lang.String mo48798x742925662 = v5Var.mo48798x74292566();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x742925662, "getAppId(...)");
                vb1.d a17 = bVar.a(mo48798x742925662);
                a17.c(hVar.f525910i);
                if (a17.d() == 1) {
                    w17.f();
                }
            }
            v5Var.R(new wb1.f(lVar, hVar, w17));
            hVar.v();
            if (hVar.f525917s) {
                w17.f130116g.k(new wb1.g(lVar, i17, k0Var), false);
            }
        }
    }

    public static final void s(wb1.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = hVar.f525909h;
        if (v5Var != null) {
            vb1.b bVar = vb1.d.f516006c;
            java.lang.String mo48798x74292566 = v5Var.mo48798x74292566();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
            bVar.a(mo48798x74292566).f516009b.remove(java.lang.Integer.valueOf(hVar.f525910i));
            lVar.a(i17, k0Var.o("ok"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "componentView is nul, return");
        k0Var.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 4);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, k0Var.u(str, jSONObject2));
    }

    public static final void t(wb1.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, int i17) {
        gh.t tVar;
        hVar.getClass();
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("position");
        if (optJSONObject != null) {
            int h17 = (int) ik1.w.h(optJSONObject, "width", 0.0f);
            int h18 = (int) ik1.w.h(optJSONObject, "height", 0.0f);
            if (h17 != hVar.f525915q || h18 != hVar.f525916r) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "update surface[" + hVar.f525913o + "] size to [" + h17 + ", " + h18 + ']');
                hVar.f525915q = h17;
                hVar.f525916r = h18;
                android.view.Surface surface = hVar.f525913o;
                if (surface != null && (tVar = hVar.f525912n) != null) {
                    tVar.c(surface, h17, h18);
                }
            }
        }
        lVar.a(i17, k0Var.o("ok"));
    }

    @Override // eg.b
    public boolean b(sf.f fVar) {
        return true;
    }

    @Override // eg.a, eg.b
    public void c(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2;
        if (motionEvent == null || (c4216x654bedf2 = this.f525914p) == null) {
            return;
        }
        c4216x654bedf2.onTouchEvent(motionEvent);
    }

    @Override // eg.a, eg.b
    public synchronized void e() {
        gh.t tVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "plugin destroyed viewId: " + this.f525910i);
        android.view.Surface surface = this.f525913o;
        if (surface != null && (tVar = this.f525912n) != null) {
            tVar.a(surface, false);
        }
        this.f525913o = null;
    }

    @Override // eg.b
    public synchronized java.lang.String f(sf.f invokeContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        invokeContext.l();
        if ((invokeContext instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) invokeContext : null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "invokeContext type not supported");
            return null;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) invokeContext).f159554c instanceof xb1.b) {
            this.f525917s = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) invokeContext).f159553b.optBoolean("transparentBackground", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "is2DCanvas: " + this.f525917s);
        }
        if (!this.f525908g && !this.f525917s) {
            ((java.util.ArrayList) this.f525911m).add(invokeContext);
            return null;
        }
        u(invokeContext);
        return null;
    }

    @Override // gh.r
    /* renamed from: getSurface */
    public java.lang.Object mo131547xcf572877() {
        return gh.q.a(this);
    }

    @Override // gh.r
    /* renamed from: getThisView */
    public android.view.View mo131549xc514bbd9() {
        return null;
    }

    @Override // gh.r
    /* renamed from: getViewType */
    public gh.y mo131550xc321a0f5() {
        return gh.y.VirtualView;
    }

    @Override // eg.a, eg.b
    public synchronized void i(android.view.Surface surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "handlePluginReady mViewId:" + this.f525910i + " inited:" + this.f525908g + " id:" + this.f334030d);
        android.view.Surface surface2 = this.f525913o;
        if (surface2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "destroy previous surface " + surface2);
            gh.t tVar = this.f525912n;
            if (tVar != null) {
                tVar.a(surface2, false);
            }
        }
        this.f525913o = surface;
        if (!this.f525908g && !this.f525917s) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f525911m;
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    u((sf.f) it.next());
                }
                arrayList.clear();
            }
            this.f525908g = true;
        }
        v();
    }

    @Override // gh.r
    public void n(boolean z17, int i17, yz5.l callback, com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
    }

    @Override // gh.r
    /* renamed from: onDestroy */
    public void mo131551xac79a11b() {
    }

    @Override // eg.b
    public void p(android.graphics.SurfaceTexture surfaceTexture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        i(new android.view.Surface(surfaceTexture));
    }

    @Override // gh.r
    /* renamed from: setSurfaceListener */
    public void mo131552xb06c83bf(gh.t tVar) {
        this.f525912n = tVar;
    }

    public final void u(sf.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar = fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) fVar : null;
        if (bVar == null || (m17 = bVar.m()) == null) {
            return;
        }
        wb1.a aVar = new wb1.a(this, fVar, m17);
        qu5.a mo50350x12b4fba4 = m17.mo50350x12b4fba4();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo50350x12b4fba4 != null ? mo50350x12b4fba4.mo50280x23b2dd47() : null, android.os.Looper.myLooper())) {
            aVar.run();
            return;
        }
        qu5.a mo50350x12b4fba42 = m17.mo50350x12b4fba4();
        if (mo50350x12b4fba42 != null) {
            mo50350x12b4fba42.mo50293x3498a0(aVar);
        }
    }

    public final void v() {
        gh.t tVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "update surface[" + this.f525913o + "]: width:" + this.f525915q + ", height:" + this.f525916r + ' ');
        android.view.Surface surface = this.f525913o;
        if (surface == null || (tVar = this.f525912n) == null) {
            return;
        }
        tVar.b(surface, this.f525915q, this.f525916r, false, this.f525917s);
    }
}
