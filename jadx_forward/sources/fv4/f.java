package fv4;

/* loaded from: classes8.dex */
public final class f extends fv4.g {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f348522b = "";

    /* renamed from: c, reason: collision with root package name */
    public int f348523c;

    /* renamed from: d, reason: collision with root package name */
    public int f348524d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f348525e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.reflect.Field f348526f;

    /* renamed from: g, reason: collision with root package name */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer f348527g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f348528h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f348529i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f348530j;

    /* renamed from: k, reason: collision with root package name */
    public int f348531k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f348532l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f348533m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.SurfaceTexture f348534n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.Surface f348535o;

    /* renamed from: p, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28650xcd7638e5 f348536p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.reflect.Field f348537q;

    /* JADX WARN: Multi-variable type inference failed */
    public static final android.view.Surface j(fv4.f fVar, java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        boolean z17;
        android.view.Surface surface;
        fVar.getClass();
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf interfaceC28721xe81de0bf = obj instanceof io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf ? (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf) obj : null;
        android.view.Surface mo53764xcf572877 = interfaceC28721xe81de0bf != null ? interfaceC28721xe81de0bf.mo53764xcf572877() : null;
        if (android.os.Build.VERSION.SDK_INT != 29) {
            return mo53764xcf572877;
        }
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = fVar.f348527g;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(surfaceProducer != null ? surfaceProducer.getClass().getSimpleName() : null, "SurfaceTextureSurfaceProducer")) {
            return mo53764xcf572877;
        }
        if (fVar.f348529i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "hookGetSurface, resumeFromBg is ture, replace surface");
            if (mo53764xcf572877 != null) {
                mo53764xcf572877.release();
            }
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer2 = fVar.f348527g;
            return surfaceProducer2 != null ? surfaceProducer2.mo138082xadc3e21c() : null;
        }
        if (fVar.f348528h) {
            z17 = true;
        } else {
            if (fVar.f348536p != null) {
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    if (fVar.f348537q == null) {
                        java.lang.reflect.Field declaredField = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28650xcd7638e5.class.getDeclaredField("attached");
                        fVar.f348537q = declaredField;
                        if (declaredField != null) {
                            declaredField.setAccessible(true);
                        }
                    }
                    java.lang.reflect.Field field = fVar.f348537q;
                    java.lang.Object obj2 = field != null ? field.get(fVar.f348536p) : null;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(obj2 instanceof java.lang.Boolean ? (java.lang.Boolean) obj2 : null);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                    m143895xf1229813 = null;
                }
                java.lang.Boolean bool = (java.lang.Boolean) m143895xf1229813;
                fVar.f348528h = bool != null ? bool.booleanValue() : false;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "textureWrapper is null");
            }
            z17 = fVar.f348528h;
        }
        if (z17) {
            return mo53764xcf572877;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "hookGetSurface, gl not attach, just use fake surface");
        if (fVar.f348535o == null) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(false);
                fVar.f348534n = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(1, 1);
                surface = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new android.view.Surface(fVar.f348534n));
            } catch (java.lang.Throwable th7) {
                p3321xbce91901.C29043x91b2b43d.Companion companion4 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                surface = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(surface);
            if (m143898xd4a2fc34 != null) {
                java.lang.String content = "createFakeSurface failed: " + m143898xd4a2fc34.getMessage();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", content);
            }
            android.view.Surface surface2 = p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(surface) ? null : surface;
            fVar.f348535o = surface2;
            if (surface2 != null) {
                surface2.release();
            }
        }
        fVar.f348523c = 0;
        fVar.n();
        return fVar.f348535o;
    }

    public static final void k(fv4.f fVar, java.lang.Object obj, int i17, int i18) {
        android.view.View view;
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        fVar.f348532l = true;
        fVar.f348533m = true;
        int i19 = fVar.f348531k;
        if (i19 > 0 && i18 <= i19) {
            java.lang.String content = "hookResize, SKIP - buffer already large enough, requested: " + i17 + 'x' + i18 + ", preAllocated: " + fVar.f348531k;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", content);
            return;
        }
        fv4.i iVar = fVar.f348538a;
        int i27 = (iVar == null || (view = iVar.f348543d) == null || (resources = view.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 3000 : displayMetrics.heightPixels;
        fVar.f348531k += i27 * 3;
        java.lang.String content2 = "hookResize, PRE-ALLOCATE, requested: " + i17 + 'x' + i18 + ", allocating: " + i17 + 'x' + fVar.f348531k + ", screenHeight: " + i27;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content2, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content2);
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf interfaceC28721xe81de0bf = obj instanceof io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf ? (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf) obj : null;
        if (interfaceC28721xe81de0bf != null) {
            interfaceC28721xe81de0bf.mo53768xc84d9cb4(i17, fVar.f348531k);
        }
    }

    public static final void l(fv4.f fVar, java.lang.Object obj) {
        boolean z17;
        tg0.c2 c2Var;
        tg0.s2 s2Var;
        android.view.View view;
        fVar.getClass();
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf interfaceC28721xe81de0bf = obj instanceof io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf ? (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf) obj : null;
        if (interfaceC28721xe81de0bf != null) {
            fv4.i iVar = fVar.f348538a;
            int height = (iVar == null || (view = iVar.f348543d) == null) ? 0 : view.getHeight();
            fv4.i iVar2 = fVar.f348538a;
            if (iVar2 == null || (c2Var = iVar2.f348542c) == null || (s2Var = c2Var.f500584f) == null) {
                z17 = false;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e = ((ch0.p0) s2Var).f122784a;
                z17 = abstractC19224x1fe3df6e.K;
                abstractC19224x1fe3df6e.K = false;
            }
            if (!z17) {
                int i17 = fVar.f348523c;
                if (i17 < 60) {
                    fVar.f348523c = i17 + 1;
                    fVar.n();
                }
                interfaceC28721xe81de0bf.mo138698x62a02d16();
                return;
            }
            fVar.f348523c = 0;
            interfaceC28721xe81de0bf.mo138698x62a02d16();
            fVar.n();
            java.lang.String content = "hookScheduleFrame, WebView draw, WebView height: " + height;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", content);
        }
    }

    @Override // fv4.g
    public void a() {
        java.lang.Object m143895xf1229813;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            if (this.f348530j && this.f348525e != null && this.f348526f != null) {
                fv4.i iVar = this.f348538a;
                android.view.View view = iVar != null ? iVar.f348543d : null;
                android.view.ViewParent parent = view != null ? view.getParent() : null;
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup == null || !(viewGroup instanceof io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28722xf4c3df9b)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTSPlatformWebView", "dispose: parent is null or not PlatformViewWrapper, skip restore");
                } else {
                    java.lang.reflect.Field field = this.f348526f;
                    if (field != null) {
                        field.set(viewGroup, this.f348525e);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "dispose: restored original renderTarget");
                }
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            java.lang.String content = "dispose: failed to restore renderTarget: " + m143898xd4a2fc34.getMessage();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", content);
        }
        android.view.Surface surface = this.f348535o;
        if (surface != null) {
            surface.release();
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f348534n;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f348535o = null;
        this.f348534n = null;
        this.f348525e = null;
        this.f348526f = null;
        this.f348538a = null;
    }

    @Override // fv4.g
    public android.view.View b() {
        fv4.i iVar = this.f348538a;
        if (iVar != null) {
            return iVar.f348543d;
        }
        return null;
    }

    @Override // fv4.g
    public void c(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff call, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        tg0.c2 c2Var;
        tg0.h2 h2Var;
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(call.f71610xbfc5d0e1, "onSearchResult")) {
            java.lang.String str = (java.lang.String) call.m138433xa13f5ebd("query");
            java.lang.String str2 = (java.lang.String) call.m138433xa13f5ebd("resultJson");
            java.lang.String str3 = str == null ? "" : str;
            java.lang.String str4 = str2 == null ? "" : str2;
            java.lang.Integer num = (java.lang.Integer) call.m138433xa13f5ebd("businessType");
            if (num == null) {
                num = 14;
            }
            java.lang.Integer num2 = (java.lang.Integer) call.m138433xa13f5ebd("offset");
            int i17 = 0;
            if (num2 == null) {
                num2 = 0;
            }
            java.lang.String str5 = (java.lang.String) call.m138433xa13f5ebd("requestId");
            java.lang.String str6 = str5 == null ? "" : str5;
            java.lang.String str7 = (java.lang.String) call.m138433xa13f5ebd("parentSearchId");
            java.lang.String str8 = str7 == null ? "" : str7;
            fv4.i iVar = this.f348538a;
            if (iVar != null && (view = iVar.f348543d) != null && view.getVisibility() == 0) {
                i17 = 1;
            }
            tg0.c1 c1Var = new tg0.c1(i17 ^ 1, 0, null, str3, str4, num.intValue(), num2.intValue(), str6, str8, null, 0, null, 0, 0, 0, 0.0d, 0L, 130566, null);
            fv4.i iVar2 = this.f348538a;
            if (iVar2 == null || (c2Var = iVar2.f348542c) == null || (h2Var = c2Var.f500586h) == null) {
                return;
            }
            ((ch0.h0) h2Var).a(c2Var.f500582d.f500611d, c1Var);
        }
    }

    @Override // fv4.g
    public void d(java.lang.String str) {
        java.lang.Object m143895xf1229813;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348522b, str)) {
            return;
        }
        this.f348522b = str == null ? "" : str;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            org.json.JSONObject jSONObject = str != null ? new org.json.JSONObject(str) : null;
            m(jSONObject != null ? jSONObject.optDouble("height") : 0.0d);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            java.lang.String content = "handleWebViewSizeChanged failed: " + m143898xd4a2fc34;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", content);
        }
    }

    @Override // fv4.g
    public void f(fv4.i ctx) {
        tg0.c2 c2Var;
        tg0.h2 h2Var;
        tg0.c2 c2Var2;
        tg0.c1 c1Var;
        android.view.ViewParent parent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        this.f348538a = ctx;
        android.view.View view = ctx.f348543d;
        java.lang.Double d17 = null;
        if ((view != null ? view.getParent() : null) != null && (parent = view.getParent()) != null) {
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            java.lang.String content = "H5Box, WebView has parent: " + viewGroup;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTSPlatformWebView", content);
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        fv4.i iVar = this.f348538a;
        this.f348524d = (int) ((iVar == null || (c2Var2 = iVar.f348542c) == null || (c1Var = c2Var2.f500588j) == null) ? 0.0d : c1Var.f500577p);
        java.lang.String content2 = "H5Box, init, realHeight: " + this.f348524d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content2, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content2);
        fv4.i iVar2 = this.f348538a;
        if (iVar2 != null && (c2Var = iVar2.f348542c) != null && (h2Var = c2Var.f500586h) != null) {
            qx4.d0 d0Var = ((ch0.h0) h2Var).f122757a;
            java.lang.Double d18 = d0Var.f448936l;
            d0Var.f448936l = null;
            d17 = d18;
        }
        if (d17 != null) {
            m(d17.doubleValue());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTSPlatformWebView", "H5Box no pending height");
        }
    }

    @Override // fv4.g
    public void h(android.view.View flutterView) {
        java.lang.Object m143895xf1229813;
        java.lang.Object m143895xf12298132;
        java.lang.Object m143895xf12298133;
        android.view.View view;
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        android.view.View view2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterView, "flutterView");
        fv4.i iVar = this.f348538a;
        android.view.ViewParent parent = (iVar == null || (view2 = iVar.f348543d) == null) ? null : view2.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (!(viewGroup instanceof io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28722xf4c3df9b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTSPlatformWebView", "hook: parent is not PlatformViewWrapper, skip hook");
            return;
        }
        java.lang.reflect.Field field = this.f348526f;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (field == null) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                java.lang.reflect.Field declaredField = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28722xf4c3df9b.class.getDeclaredField("renderTarget");
                this.f348526f = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
                java.lang.reflect.Field field2 = this.f348526f;
                this.f348525e = field2 != null ? field2.get(viewGroup) : null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "hook: reflect originRenderTarget success");
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                java.lang.String content = "hook: failed to get renderTarget by reflection: " + m143898xd4a2fc34.getMessage();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", content);
            }
        }
        if (this.f348525e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTSPlatformWebView", "hook: originRenderTarget is null, skip further hook");
            q();
            return;
        }
        fv4.i iVar2 = this.f348538a;
        int i17 = (iVar2 == null || (view = iVar2.f348543d) == null || (resources = view.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 3000 : displayMetrics.heightPixels;
        this.f348531k = i17 * 3;
        java.lang.String content2 = "hookResize, PRE-ALLOCATE, allocating: " + this.f348531k + ", screenHeight: " + i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content2, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content2);
        java.lang.Object obj = this.f348525e;
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf interfaceC28721xe81de0bf = obj instanceof io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf ? (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf) obj : null;
        if (interfaceC28721xe81de0bf != null) {
            interfaceC28721xe81de0bf.mo53768xc84d9cb4(interfaceC28721xe81de0bf.mo53765x755bd410(), this.f348531k);
        }
        o();
        if ((this.f348525e instanceof io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28740x95aefe) && this.f348527g == null) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                java.lang.reflect.Field declaredField2 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28740x95aefe.class.getDeclaredField("producer");
                declaredField2.setAccessible(true);
                java.lang.Object obj2 = declaredField2.get(this.f348525e);
                this.f348527g = obj2 instanceof io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer ? (io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer) obj2 : null;
                p();
                if (android.os.Build.VERSION.SDK_INT == 29) {
                    io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = this.f348527g;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(surfaceProducer != null ? surfaceProducer.getClass().getSimpleName() : null, "SurfaceTextureSurfaceProducer")) {
                        java.lang.reflect.Field declaredField3 = java.lang.Class.forName("io.flutter.embedding.engine.renderer.SurfaceTextureSurfaceProducer").getDeclaredField("texture");
                        declaredField3.setAccessible(true);
                        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer2 = this.f348527g;
                        if (surfaceProducer2 != null) {
                            java.lang.Object obj3 = declaredField3.get(surfaceProducer2);
                            java.lang.reflect.Field declaredField4 = java.lang.Class.forName("io.flutter.embedding.engine.renderer.FlutterRenderer$SurfaceTextureRegistryEntry").getDeclaredField("textureWrapper");
                            declaredField4.setAccessible(true);
                            java.lang.Object obj4 = declaredField4.get(obj3);
                            this.f348536p = obj4 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28650xcd7638e5 ? (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28650xcd7638e5) obj4 : null;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "hook: reflect textureWrapper success");
                        }
                    }
                }
                m143895xf12298133 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
            } catch (java.lang.Throwable th7) {
                p3321xbce91901.C29043x91b2b43d.Companion companion4 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf12298133 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
            }
            java.lang.Throwable m143898xd4a2fc342 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf12298133);
            if (m143898xd4a2fc342 != null) {
                java.lang.String content3 = "hook: failed to get surface producer by reflection: " + m143898xd4a2fc342.getMessage();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content3, "content");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", content3);
            }
        }
        if (!this.f348530j) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion5 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(java.lang.Thread.currentThread().getContextClassLoader(), new java.lang.Class[]{io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf.class}, new fv4.b(this));
                java.lang.reflect.Field field3 = this.f348526f;
                if (field3 != null) {
                    field3.set(viewGroup, newProxyInstance);
                }
                this.f348530j = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "hook: proxy renderTarget success");
                m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
            } catch (java.lang.Throwable th8) {
                p3321xbce91901.C29043x91b2b43d.Companion companion6 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th8));
            }
            java.lang.Throwable m143898xd4a2fc343 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf12298132);
            if (m143898xd4a2fc343 != null) {
                this.f348530j = false;
                java.lang.String content4 = "hook: failed to set proxy renderTarget: " + m143898xd4a2fc343.getMessage();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content4, "content");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", content4);
            }
        }
        q();
    }

    @Override // fv4.g
    public void i() {
        this.f348529i = true;
    }

    public synchronized void m(double d17) {
        fv4.c cVar = new fv4.c(this);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            cVar.run();
        } else {
            ((ku5.t0) ku5.t0.f394148d).D(new tg0.e2(cVar));
        }
        int i17 = (int) d17;
        java.lang.String content = "WebView size changed, new height: " + d17 + ", real: " + i17 + ", realHeight: " + this.f348524d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
        if (this.f348524d == i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "WebView size changed, but current height == real, quit");
            return;
        }
        this.f348524d = i17;
        fv4.d dVar = new fv4.d(this, kz5.b1.e(new jz5.l("newHeight", java.lang.Integer.valueOf(i17))));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            dVar.run();
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(new tg0.d2(dVar));
        }
    }

    public void n() {
        android.view.View view;
        fv4.i iVar = this.f348538a;
        java.lang.Object parent = (iVar == null || (view = iVar.f348543d) == null) ? null : view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup instanceof io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28722xf4c3df9b) {
            ((io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28722xf4c3df9b) viewGroup).invalidate();
        }
    }

    public final void o() {
        fv4.i iVar = this.f348538a;
        android.view.View view = iVar != null ? iVar.f348543d : null;
        java.lang.Object parent = view != null ? view.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = this.f348531k;
            viewGroup.setLayoutParams(layoutParams);
        }
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.height = this.f348531k;
            view.setLayoutParams(layoutParams2);
        }
    }

    public final void p() {
        java.lang.Object m143895xf1229813;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = this.f348527g;
            jz5.f0 f0Var = null;
            if (!(surfaceProducer instanceof io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.TextureEntry)) {
                surfaceProducer = null;
            }
            if (surfaceProducer != null) {
                surfaceProducer.mo138097xdd9eabf1(new fv4.e(this));
                f0Var = jz5.f0.f384359a;
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            java.lang.String content = "setupFrameAvailableListener: failed: " + m143898xd4a2fc34.getMessage() + ", fallback to direct scheduleFrame";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", content);
        }
    }

    public final void q() {
        android.view.View view;
        android.view.View view2;
        ev4.d dVar;
        java.lang.Object m143895xf1229813;
        jz5.f0 f0Var;
        tg0.c2 c2Var;
        tg0.h2 h2Var;
        fv4.i iVar = this.f348538a;
        if (iVar != null && (view2 = iVar.f348543d) != null && view2.getVisibility() != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/websearch/searchplatformwebview/logic/PlatformWebViewLogic", "setWebViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/websearch/searchplatformwebview/logic/PlatformWebViewLogic", "setWebViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "setWebViewVisibility, visible: 0");
            fv4.i iVar2 = this.f348538a;
            if (iVar2 != null && (dVar = iVar2.f348545f) != null) {
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.putOpt("visible", 1);
                    fv4.i iVar3 = dVar.f338477b;
                    if (iVar3 == null || (c2Var = iVar3.f348542c) == null || (h2Var = c2Var.f500586h) == null) {
                        f0Var = null;
                    } else {
                        ((ch0.h0) h2Var).b("onWebViewVisibilityChangedInFlutter", jSONObject);
                        f0Var = jz5.f0.f384359a;
                    }
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
                if (m143898xd4a2fc34 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "notifyH5WebViewVisibilityChanged Failed", m143898xd4a2fc34);
                }
            }
        }
        fv4.i iVar4 = this.f348538a;
        if (iVar4 == null || (view = iVar4.f348543d) == null) {
            return;
        }
        if (view.getAlpha() <= 0.5f) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/websearch/searchplatformwebview/logic/PlatformWSFH5ComponentLogic", "showWebView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/websearch/searchplatformwebview/logic/PlatformWSFH5ComponentLogic", "showWebView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if ((viewGroup != null && viewGroup.getVisibility() == 0) || viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(0);
    }
}
