package df;

/* loaded from: classes15.dex */
public final class z extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 {

    /* renamed from: d, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 f311148d;

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 f311149e;

    /* renamed from: f, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 f311150f;

    /* renamed from: g, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344 f311151g;

    /* renamed from: h, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04 f311152h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f311153i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f311154m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f311155n;

    /* renamed from: o, reason: collision with root package name */
    public int f311156o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.SurfaceTexture f311157p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56 flutterSurfaceView) {
        super(context, flutterSurfaceView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterSurfaceView, "flutterSurfaceView");
        this.f311153i = new java.util.concurrent.CopyOnWriteArraySet();
        this.f311154m = new java.util.concurrent.CopyOnWriteArraySet();
        this.f311156o = -1;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(8);
        }
        this.f311148d = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface;
        this.f311150f = flutterSurfaceView;
        flutterSurfaceView.getHolder().addCallback(new df.o(this, flutterSurfaceView));
    }

    public static final void a(df.z zVar, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079) {
        zVar.getClass();
        if (enumC28568xbdfb1079 == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface) {
            java.util.Iterator it = new java.util.LinkedList(zVar.f311154m).iterator();
            while (it.hasNext()) {
                ((df.q) it.next()).a();
            }
        } else if (enumC28568xbdfb1079 == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture) {
            java.util.Iterator it6 = new java.util.LinkedList(zVar.f311153i).iterator();
            while (it6.hasNext()) {
                ((df.q) it6.next()).a();
            }
        }
    }

    public static final void b(df.z zVar, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079, df.q qVar) {
        zVar.getClass();
        if (qVar == null) {
            return;
        }
        if (enumC28568xbdfb1079 == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface) {
            zVar.f311154m.remove(qVar);
        } else if (enumC28568xbdfb1079 == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture) {
            zVar.f311153i.remove(qVar);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1
    /* renamed from: attachToFlutterEngine */
    public void mo124142x11d031be(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e flutterEngine) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterEngine, "flutterEngine");
        super.mo124142x11d031be(flutterEngine);
        onConfigurationChanged(getContext().getResources().getConfiguration());
    }

    public final void c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Context context2 = getContext();
        android.content.MutableContextWrapper mutableContextWrapper = context2 instanceof android.content.MutableContextWrapper ? (android.content.MutableContextWrapper) context2 : null;
        if (mutableContextWrapper == null) {
            return;
        }
        mutableContextWrapper.setBaseContext(context);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1
    /* renamed from: convertToImageView */
    public void mo124143x2f386ab2() {
        super.mo124143x2f386ab2();
        this.f311149e = this.f311150f;
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04 c28548x2ab8be04 = this.f311152h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c28548x2ab8be04);
        this.f311150f = c28548x2ab8be04;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1
    /* renamed from: createImageView */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04 mo124144x74550d04() {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04 mo124144x74550d04 = super.mo124144x74550d04();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo124144x74550d04, "createImageView(...)");
        this.f311152h = mo124144x74550d04;
        return mo124144x74550d04;
    }

    public final void d() {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.b(this)) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e17 = this.f311150f;
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 c28552x398ac0c4 = interfaceC28648x8c0b9e17 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 ? (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4) interfaceC28648x8c0b9e17 : null;
            android.view.TextureView.SurfaceTextureListener surfaceTextureListener = c28552x398ac0c4 != null ? c28552x398ac0c4.getSurfaceTextureListener() : null;
            df.f1 f1Var = surfaceTextureListener instanceof df.f1 ? (df.f1) surfaceTextureListener : null;
            if (f1Var != null) {
                f1Var.f310990f = true;
            }
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e172 = this.f311150f;
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 c28552x398ac0c42 = interfaceC28648x8c0b9e172 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 ? (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4) interfaceC28648x8c0b9e172 : null;
            this.f311157p = c28552x398ac0c42 != null ? c28552x398ac0c42.getSurfaceTexture() : null;
        }
    }

    public final void e(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 mode, boolean z17) {
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchFlutterRenderSurface-");
        sb6.append(this.f311156o);
        sb6.append(" end, this.renderMode:");
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079 = this.f311148d;
        sb6.append(enumC28568xbdfb1079);
        sb6.append(", to mode:");
        sb6.append(mode);
        sb6.append(", enforced:");
        sb6.append(z17);
        sb6.append(", isInSwapSurface:");
        sb6.append(m137271xccfd02b());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineFlutterView", sb6.toString(), new java.lang.Object[0]);
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb10792 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface;
        if (mode == enumC28568xbdfb1079) {
            super.m137284xfa380ad9(false);
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineFlutterView", "switchRenderSurface toSwapSurface, do enforced job", new java.lang.Object[0]);
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28556xc05070.m137297x7fe94d14(this, false, true);
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137264x385aa5fd = m137264x385aa5fd();
                if (m137264x385aa5fd != null) {
                    m137264x385aa5fd.m138019xd94bbdc8();
                }
                java.lang.Object obj = this.f311151g;
                view = obj instanceof android.view.View ? (android.view.View) obj : null;
                if (view != null) {
                    view.getLayoutParams().width = 1;
                    view.getLayoutParams().height = 1;
                    view.requestLayout();
                }
                this.f311150f.mo137197x669ed6f1(false);
                return;
            }
            return;
        }
        super.m137284xfa380ad9(true);
        java.lang.Object obj2 = this.f311151g;
        view = obj2 instanceof android.view.View ? (android.view.View) obj2 : null;
        if (view != null) {
            view.getLayoutParams().width = -1;
            view.getLayoutParams().height = -1;
            view.requestLayout();
        }
        if (z17) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137264x385aa5fd2 = m137264x385aa5fd();
            if (m137264x385aa5fd2 != null) {
                m137264x385aa5fd2.m138019xd94bbdc8();
            }
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28556xc05070.m137297x7fe94d14(this, true, true);
            java.lang.Object obj3 = this.f311151g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type android.view.View");
            ((android.view.View) obj3).bringToFront();
            this.f311150f.mo137197x669ed6f1(true);
        }
    }

    public final java.lang.Object f(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        android.view.Surface surface;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e17 = this.f311150f;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344 interfaceC28651x6b183344 = this.f311151g;
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb10792 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (enumC28568xbdfb1079 == enumC28568xbdfb10792 && (interfaceC28648x8c0b9e17 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4)) {
            if (interfaceC28648x8c0b9e17.mo137196x1f8c622()) {
                return f0Var;
            }
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
            rVar.k();
            ((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4) interfaceC28648x8c0b9e17).setVisibility(0);
            post(new df.w(rVar, interfaceC28648x8c0b9e17, this, enumC28568xbdfb1079));
            java.lang.Object j17 = rVar.j();
            return j17 == pz5.a.f440719d ? j17 : f0Var;
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb10793 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface;
        if (enumC28568xbdfb1079 != enumC28568xbdfb10793 || !(interfaceC28651x6b183344 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallbackC28575x40f7bb38) || ((surface = ((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallbackC28575x40f7bb38) interfaceC28651x6b183344).getHolder().getSurface()) != null && surface.isValid())) {
            return f0Var;
        }
        p3325xe03a0797.p3326xc267989b.r rVar2 = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar2.k();
        df.y yVar = new df.y(rVar2, this, enumC28568xbdfb1079);
        if (enumC28568xbdfb1079 == enumC28568xbdfb10793) {
            this.f311154m.add(yVar);
        } else if (enumC28568xbdfb1079 == enumC28568xbdfb10792) {
            this.f311153i.add(yVar);
        }
        java.lang.Object j18 = rVar2.j();
        return j18 == pz5.a.f440719d ? j18 : f0Var;
    }

    /* renamed from: getOldRenderSurface */
    public final android.graphics.SurfaceTexture m124145x2556cec6() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e17 = this.f311150f;
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 c28552x398ac0c4 = interfaceC28648x8c0b9e17 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 ? (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4) interfaceC28648x8c0b9e17 : null;
        if ((c28552x398ac0c4 != null ? c28552x398ac0c4.getSurfaceTexture() : null) == null) {
            return this.f311157p;
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e172 = this.f311150f;
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 c28552x398ac0c42 = interfaceC28648x8c0b9e172 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 ? (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4) interfaceC28648x8c0b9e172 : null;
        if (c28552x398ac0c42 != null) {
            return c28552x398ac0c42.getSurfaceTexture();
        }
        return null;
    }

    /* renamed from: getRenderMode */
    public final io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 m124146x3569ec4f() {
        return this.f311148d;
    }

    /* renamed from: getRenderSurface */
    public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 m124147x19cc2a81() {
        return this.f311150f;
    }

    @Override // android.view.View
    public android.content.res.Resources getResources() {
        android.content.res.Resources resources = getContext().getResources();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources, "getResources(...)");
        return resources;
    }

    /* renamed from: getSkylineWindowId */
    public final int m124148xee406eaa() {
        return this.f311156o;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outAttrs, "outAttrs");
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        yz5.l lVar = this.f311155n;
        if (lVar != null) {
            lVar.mo146xb9724478(onCreateInputConnection);
        }
        return onCreateInputConnection;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1, android.view.View
    public void onProvideAutofillVirtualStructure(android.view.ViewStructure structure, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(structure, "structure");
        try {
            super.onProvideAutofillVirtualStructure(structure, i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SkylineFlutterView", "onProvideAutofillVirtualStructure fail: e:" + e17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        if (view instanceof io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344 interfaceC28651x6b183344 = (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344) view;
            this.f311151g = interfaceC28651x6b183344;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC28651x6b183344);
            if (interfaceC28651x6b183344 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.TextureViewSurfaceTextureListenerC28577x96fffc8a) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new df.s(interfaceC28651x6b183344, this));
            } else if (interfaceC28651x6b183344 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallbackC28575x40f7bb38) {
                ((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallbackC28575x40f7bb38) interfaceC28651x6b183344).getHolder().addCallback(new df.t(interfaceC28651x6b183344, this));
            }
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        if ((view instanceof io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f311151g, view)) {
            this.f311151g = null;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1
    /* renamed from: revertImageView */
    public void mo124149x5beb491c(java.lang.Runnable onDone) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDone, "onDone");
        super.mo124149x5beb491c(onDone);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e17 = this.f311149e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC28648x8c0b9e17);
        this.f311150f = interfaceC28648x8c0b9e17;
        this.f311149e = null;
    }

    /* renamed from: setOnCreateInputConnectionListener */
    public final void m124150x97646c1f(yz5.l lVar) {
        this.f311155n = lVar;
    }

    /* renamed from: setRenderSurface */
    public final void m124151xaca290f5(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interfaceC28648x8c0b9e17, "<set-?>");
        this.f311150f = interfaceC28648x8c0b9e17;
    }

    /* renamed from: setSkylineWindowId */
    public final void m124152x2517081e(int i17) {
        this.f311156o = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 flutterTextureView) {
        super(context, flutterTextureView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterTextureView, "flutterTextureView");
        this.f311153i = new java.util.concurrent.CopyOnWriteArraySet();
        this.f311154m = new java.util.concurrent.CopyOnWriteArraySet();
        this.f311156o = -1;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(8);
        }
        this.f311148d = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture;
        this.f311150f = flutterTextureView;
        flutterTextureView.setSurfaceTextureListener(new df.f1(flutterTextureView.getSurfaceTextureListener(), new df.p(this, flutterTextureView)));
    }
}
