package sx5;

/* loaded from: classes13.dex */
public class a1 implements sx5.a, android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener, android.view.ScaleGestureDetector.OnScaleGestureListener {
    public android.widget.ImageView A;
    public android.widget.TextView B;
    public android.widget.TextView C;
    public android.view.OrientationEventListener C1;
    public android.widget.TextView D;
    public boolean D1;
    public android.widget.TextView E;
    public java.util.Timer E1;
    public android.widget.TextView F;
    public android.widget.TextView G;
    public boolean G1;
    public android.widget.TextView H;
    public sx5.d I;

    /* renamed from: J, reason: collision with root package name */
    public android.webkit.WebChromeClient.CustomViewCallback f495202J;
    public android.graphics.drawable.Drawable J1;
    public android.view.GestureDetector K;
    public android.view.ScaleGestureDetector L;
    public boolean L1;
    public boolean M;
    public boolean M1;
    public double N;
    public boolean N1;
    public boolean O1;
    public double P;
    public int P1;
    public double Q;
    public boolean R;
    public int T;
    public int W;
    public int X;
    public boolean Y;
    public com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 Z;

    /* renamed from: d, reason: collision with root package name */
    public android.app.Application f495203d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f495204e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 f495205f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f495206g;

    /* renamed from: h, reason: collision with root package name */
    public sx5.z0 f495207h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f495208i;

    /* renamed from: l1, reason: collision with root package name */
    public float f495209l1;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f495210m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f495211n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.p3213xdb7d1c3f.p3214x6b0147b.C27838xb89041b7 f495212o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f495213p;

    /* renamed from: p0, reason: collision with root package name */
    public android.media.AudioManager f495214p0;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ProgressBar f495216q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f495217r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f495218s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.p3213xdb7d1c3f.p3214x6b0147b.C27836xf642ced5 f495219t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f495220u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f495221v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.FrameLayout f495222w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f495223x;

    /* renamed from: x0, reason: collision with root package name */
    public int f495224x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.Window f495225x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f495226y;

    /* renamed from: y0, reason: collision with root package name */
    public double f495227y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.view.WindowManager.LayoutParams f495228y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f495229z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f495230z1;
    public double S = 1.0d;
    public int U = -3;
    public int V = -3;

    /* renamed from: p1, reason: collision with root package name */
    public float f495215p1 = 1.0f;
    public boolean A1 = false;
    public boolean B1 = false;
    public int F1 = 0;
    public final android.app.Application.ActivityLifecycleCallbacks H1 = new sx5.k0(this);
    public final sx5.y0 I1 = new sx5.m0(this);
    public sx5.x0 K1 = sx5.x0.None;

    public void A(double d17) {
        by5.c4.f("XWebNativeInterface", "xwebToJS, videoPlaybackRate rate:" + d17);
        w(new sx5.b0(this));
        this.f495205f.mo14660x738236e6(java.lang.String.format("xwebVideoBridge.xwebToJS_Video_RateChange(%f);", java.lang.Double.valueOf(d17)), new sx5.q(this));
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o0
    public void a(double d17) {
        by5.c4.f("XWebNativeInterface", "xwebToJS, videoSeek time:" + d17);
        this.f495205f.mo14660x738236e6(java.lang.String.format("xwebVideoBridge.xwebToJS_Video_Seek(%f);", java.lang.Double.valueOf(d17)), new sx5.p(this));
    }

    @Override // sx5.a
    public void b(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        com.p314xaae8f345.p3210x3857dc.n1 n1Var;
        by5.c4.f("XWebNativeInterface", "onShowCustomView");
        if (!this.D1) {
            sx5.z0 z0Var = new sx5.z0(p());
            this.f495207h = z0Var;
            z0Var.setId(com.p314xaae8f345.p3222x9cba06de.R.id.f61370x55c3faff);
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(p());
            this.f495208i = frameLayout;
            frameLayout.setId(com.p314xaae8f345.p3222x9cba06de.R.id.f61369xd9f8058b);
            android.view.GestureDetector gestureDetector = new android.view.GestureDetector(p(), this);
            this.K = gestureDetector;
            gestureDetector.setOnDoubleTapListener(this);
            this.L = new android.view.ScaleGestureDetector(p(), this);
            this.K.setIsLongpressEnabled(false);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(p()).inflate(com.p314xaae8f345.p3222x9cba06de.R.C27875xbddafb2a.f61377x8ab5ae76, (android.view.ViewGroup) null);
            this.f495211n = viewGroup;
            viewGroup.setVisibility(8);
            this.f495221v = (android.widget.LinearLayout) this.f495211n.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61336x444e37e5);
            android.widget.ImageView imageView = (android.widget.ImageView) this.f495211n.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61325xcb9ffce2);
            this.f495223x = imageView;
            imageView.setOnClickListener(new sx5.r(this));
            this.f495216q = (android.widget.ProgressBar) this.f495211n.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61345xd30b5a4f);
            this.f495212o = (com.p314xaae8f345.p3210x3857dc.p3213xdb7d1c3f.p3214x6b0147b.C27838xb89041b7) this.f495211n.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61335x706b2fbc);
            com.p314xaae8f345.p3210x3857dc.p3213xdb7d1c3f.p3214x6b0147b.C27836xf642ced5 c27836xf642ced5 = (com.p314xaae8f345.p3210x3857dc.p3213xdb7d1c3f.p3214x6b0147b.C27836xf642ced5) this.f495211n.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61330x764a104a);
            this.f495219t = c27836xf642ced5;
            c27836xf642ced5.m120243x96eaeb6d(this.K);
            this.f495219t.setOnTouchListener(new sx5.c0(this));
            this.f495220u = (android.widget.LinearLayout) this.f495211n.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61337x9976d8ac);
            this.f495213p = this.f495211n.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61332x78195777);
            this.f495217r = (android.widget.TextView) this.f495211n.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61362xadd45070);
            this.f495218s = (android.widget.TextView) this.f495211n.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61364xb6141cc5);
            sx5.d dVar = new sx5.d(this.f495211n.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61343xb85e1ad6));
            this.I = dVar;
            dVar.f495247a = new sx5.o0(this);
            android.widget.ImageView imageView2 = (android.widget.ImageView) this.f495211n.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61327xcba54a14);
            this.f495226y = imageView2;
            if (this.A1) {
                imageView2.setVisibility(0);
                this.f495226y.setOnClickListener(new sx5.r0(this));
            } else {
                imageView2.setVisibility(8);
            }
            android.widget.TextView textView = (android.widget.TextView) this.f495211n.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61350x37494d72);
            this.B = textView;
            if (this.B1) {
                textView.setVisibility(0);
                this.B.setOnClickListener(new sx5.s0(this));
            } else {
                textView.setVisibility(8);
            }
            android.widget.ImageView imageView3 = (android.widget.ImageView) this.f495211n.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61326xcba1b119);
            this.f495229z = imageView3;
            imageView3.setOnClickListener(new sx5.t0(this));
            android.widget.ImageView imageView4 = (android.widget.ImageView) this.f495211n.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61328xcba6832f);
            this.A = imageView4;
            imageView4.setOnClickListener(new sx5.u0(this));
            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) this.f495211n.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61333x145c172a);
            this.f495222w = frameLayout2;
            android.widget.TextView textView2 = (android.widget.TextView) frameLayout2.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61351x8a2bbef7);
            this.C = textView2;
            textView2.setOnClickListener(new sx5.v0(this));
            android.widget.TextView textView3 = (android.widget.TextView) this.f495222w.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61352xbb4c205c);
            this.D = textView3;
            textView3.setOnClickListener(new sx5.w0(this));
            android.widget.TextView textView4 = (android.widget.TextView) this.f495222w.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61353x8a2bbf11);
            this.E = textView4;
            textView4.setOnClickListener(new sx5.h(this));
            android.widget.TextView textView5 = (android.widget.TextView) this.f495222w.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61354x8a2bbf16);
            this.F = textView5;
            textView5.setOnClickListener(new sx5.i(this));
            android.widget.TextView textView6 = (android.widget.TextView) this.f495222w.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61355x8a2bbf30);
            this.G = textView6;
            textView6.setOnClickListener(new sx5.j(this));
            android.widget.TextView textView7 = (android.widget.TextView) this.f495222w.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61356x8a2bbf4f);
            this.H = textView7;
            textView7.setOnClickListener(new sx5.k(this));
            this.D1 = true;
        }
        this.f495210m = view;
        this.f495202J = customViewCallback;
        if (view != null || this.f495205f.m120171x1f05d274()) {
            if (this.f495205f.m120171x1f05d274()) {
                com.p314xaae8f345.p3210x3857dc.n1 n1Var2 = by5.s0.f118128c;
                if (n1Var2 != null) {
                    n1Var2.b(577L, 53L, 1L);
                }
            } else if (this.f495205f.m120170x43962b60() && (n1Var = by5.s0.f118128c) != null) {
                n1Var.b(577L, 57L, 1L);
            }
            l();
        }
        o();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o0
    public void c() {
        by5.c4.f("XWebNativeInterface", "xwebToJS, videoPause");
        this.f495205f.mo14660x738236e6("xwebVideoBridge.xwebToJS_Video_NewPause();", new sx5.n(this));
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o0
    public boolean d() {
        return true;
    }

    @Override // sx5.a
    public void e() {
        by5.c4.f("XWebNativeInterface", "onHideCustomView");
        by5.c4.f("XWebNativeInterface", "resumeFocus");
        if ((this.f495205f.mo120158xfb86a31b() instanceof android.view.ViewGroup) && this.W != 0) {
            ((android.view.ViewGroup) this.f495205f.mo120158xfb86a31b()).setDescendantFocusability(this.W);
            this.W = 0;
        }
        if ((this.f495205f.mo120167xbfee89b7() instanceof android.view.ViewGroup) && this.X != 0) {
            ((android.view.ViewGroup) this.f495205f.mo120158xfb86a31b()).setDescendantFocusability(this.X);
            this.X = 0;
        }
        n();
        if (this.D1) {
            this.D1 = false;
            this.f495206g = null;
            this.f495207h = null;
            this.f495208i = null;
            android.view.GestureDetector gestureDetector = this.K;
            if (gestureDetector != null) {
                gestureDetector.setOnDoubleTapListener(null);
                this.K = null;
            }
            this.L = null;
            this.f495211n = null;
            this.I = null;
            this.f495213p = null;
            this.f495216q = null;
            this.f495217r = null;
            this.f495218s = null;
            this.f495212o = null;
            this.f495219t.m120243x96eaeb6d(null);
            this.f495219t.setOnTouchListener(null);
            this.f495219t = null;
            this.f495221v = null;
            this.f495220u = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.f495222w = null;
            this.f495229z.setOnClickListener(null);
            this.f495229z = null;
            this.A.setOnClickListener(null);
            this.A = null;
            this.f495223x.setOnClickListener(null);
            this.f495223x = null;
            this.f495226y.setOnClickListener(null);
            this.f495226y = null;
            by5.c4.f("XWebNativeInterface", "uninitView");
        }
        this.f495210m = null;
        android.webkit.WebChromeClient.CustomViewCallback customViewCallback = this.f495202J;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f495202J = null;
        }
    }

    @Override // sx5.a
    public boolean f(java.lang.Object obj) {
        by5.c4.f("XWebNativeInterface", "setVideoJsCallback:" + obj);
        this.Z = (com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369) obj;
        return true;
    }

    @Override // sx5.a
    public void g(boolean z17, boolean z18) {
        if (this.f495205f == null || !z18 || this.f495230z1 == null) {
            return;
        }
        by5.c4.f("XWebNativeInterface", "evaluteJavascript, isPageStart:" + z17);
        java.lang.String str = this.f495230z1;
        if (z17) {
            str = "window.addEventListener('DOMContentLoaded', function() {" + str + "});this.xwebReturn = function (){return \"1\";};this.xwebReturn()";
        }
        this.f495205f.mo14660x738236e6(str, new sx5.l(this));
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o0
    public void h() {
        by5.c4.f("XWebNativeInterface", "xwebToJS, videoPlay");
        this.f495205f.mo14660x738236e6("xwebVideoBridge.xwebToJS_Video_NewPlay();", new sx5.m(this));
    }

    @Override // sx5.a
    public void i(boolean z17) {
        by5.c4.f("XWebNativeInterface", "disableJsCallback:" + z17);
        this.Y = z17;
    }

    @Override // sx5.a
    public void j(java.lang.Object obj) {
        try {
            new by5.i0(obj, "addJavascriptInterface", java.lang.Object.class, java.lang.String.class).b(this, "xwebToNative");
        } catch (java.lang.Exception e17) {
            by5.c4.d("XWebNativeInterface", "registerJavascriptInterface, error", e17);
        }
    }

    public final android.app.Activity k(android.content.Context context) {
        android.content.Context baseContext;
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (!(context instanceof android.content.ContextWrapper) || (baseContext = ((android.content.ContextWrapper) context).getBaseContext()) == context) {
            return null;
        }
        return k(baseContext);
    }

    public void l() {
        android.view.SurfaceView r17;
        by5.c4.f("XWebNativeInterface", "attach start");
        if (this.N1) {
            by5.c4.f("XWebNativeInterface", "attach, has entered fullscreen");
            return;
        }
        android.app.Activity z17 = z();
        if (z17 == null) {
            by5.c4.f("XWebNativeInterface", "attach, activity is null");
            return;
        }
        this.f495204e = new java.lang.ref.WeakReference(z17);
        android.view.OrientationEventListener orientationEventListener = this.C1;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.C1 = null;
        }
        sx5.n0 n0Var = new sx5.n0(this, p().getApplicationContext(), 3);
        this.C1 = n0Var;
        n0Var.enable();
        this.f495207h.m165463xbe929a2(this.I1);
        android.app.Application application = z17.getApplication();
        this.f495203d = application;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this.H1);
        }
        by5.c4.f("XWebNativeInterface", "registerActivityLifecycleCallback activity:" + z17 + ", mApplication:" + this.f495203d);
        v();
        sx5.x0 x0Var = this.K1;
        if (x0Var == sx5.x0.None) {
            this.K1 = sx5.x0.Attaching;
        } else if (x0Var == sx5.x0.Detaching) {
            this.K1 = sx5.x0.DetachingAttached;
            return;
        }
        this.N1 = true;
        ((android.widget.FrameLayout) z17.getWindow().getDecorView()).addView(this.f495207h, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        this.f495207h.setBackgroundColor(0);
        if (this.f495205f.m120171x1f05d274()) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f495205f.mo120158xfb86a31b().getParent();
            this.f495206g = viewGroup;
            viewGroup.removeView(this.f495205f.mo120158xfb86a31b());
            this.f495207h.addView(this.f495205f.mo120158xfb86a31b(), this.f495207h.getChildCount());
            this.f495208i.setBackgroundColor(0);
            w(new sx5.p0(this));
        } else {
            t(true);
            this.K1 = sx5.x0.Attached;
        }
        android.view.View view = this.f495210m;
        if (view != null) {
            this.f495208i.addView(view);
            this.f495208i.setBackgroundColor(0);
            sx5.z0 z0Var = this.f495207h;
            z0Var.addView(this.f495208i, z0Var.getChildCount(), new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
            if (this.f495205f.m120170x43962b60()) {
                android.view.View view2 = this.f495210m;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/xweb/extension/video/XWebNativeInterface", "attach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/xweb/extension/video/XWebNativeInterface", "attach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        this.f495207h.addView(this.f495211n, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        if (this.f495205f.m120170x43962b60() && (r17 = r(this.f495210m)) != null) {
            r17.setZOrderMediaOverlay(true);
        }
        android.graphics.drawable.Drawable background = this.f495205f.mo120158xfb86a31b().getBackground();
        this.J1 = background;
        if (background != null) {
            this.J1 = background.getConstantState().newDrawable().mutate();
        }
        this.f495205f.mo120158xfb86a31b().setBackground(new android.graphics.drawable.ColorDrawable(-16777216));
        if (this.f495205f.m120170x43962b60()) {
            this.f495207h.postDelayed(new sx5.q0(this), 200L);
        }
        by5.c4.f("XWebNativeInterface", "attach end");
    }

    public final boolean m(double d17) {
        return java.lang.Double.isInfinite(d17) || d17 <= 0.0d;
    }

    public void n() {
        by5.c4.f("XWebNativeInterface", "detach start");
        if (!this.N1) {
            by5.c4.f("XWebNativeInterface", "detach, has exited fullscreen");
            return;
        }
        this.f495204e = null;
        this.f495214p0 = null;
        this.f495225x1 = null;
        this.f495228y1 = null;
        android.view.OrientationEventListener orientationEventListener = this.C1;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.C1 = null;
        }
        this.f495207h.m165463xbe929a2(null);
        by5.c4.f("XWebNativeInterface", "unRegisterActivityLifecycleCallback application:" + this.f495203d);
        android.app.Application application = this.f495203d;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.H1);
            this.f495203d = null;
        }
        sx5.x0 x0Var = this.K1;
        if (x0Var == sx5.x0.Attached) {
            this.K1 = sx5.x0.Detaching;
        } else if (x0Var == sx5.x0.Attaching) {
            this.K1 = sx5.x0.AttachingDetached;
            return;
        }
        if (this.J1 != null) {
            this.f495205f.mo120158xfb86a31b().setBackground(this.J1);
            this.J1 = null;
        } else {
            this.f495205f.mo120158xfb86a31b().setBackground(new android.graphics.drawable.ColorDrawable(0));
        }
        if (this.f495205f.m120171x1f05d274()) {
            this.f495207h.removeView(this.f495205f.mo120158xfb86a31b());
            this.f495206g.addView(this.f495205f.mo120158xfb86a31b(), 0);
        }
        android.view.View view = this.f495210m;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            android.widget.FrameLayout frameLayout = this.f495208i;
            if (parent == frameLayout) {
                frameLayout.removeView(this.f495210m);
            }
        }
        android.view.ViewParent parent2 = this.f495208i.getParent();
        sx5.z0 z0Var = this.f495207h;
        if (parent2 == z0Var) {
            z0Var.removeView(this.f495208i);
        }
        android.view.ViewParent parent3 = this.f495211n.getParent();
        sx5.z0 z0Var2 = this.f495207h;
        if (parent3 == z0Var2) {
            z0Var2.removeView(this.f495211n);
        }
        this.f495211n.setVisibility(8);
        int i17 = this.U;
        if (i17 != -3) {
            x(i17);
            this.U = -3;
        }
        t(false);
        if (this.f495207h.getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) this.f495207h.getParent()).removeView(this.f495207h);
        }
        sx5.x0 x0Var2 = this.K1;
        sx5.x0 x0Var3 = sx5.x0.DetachingAttached;
        sx5.x0 x0Var4 = sx5.x0.None;
        if (x0Var2 == x0Var3) {
            this.K1 = x0Var4;
            l();
        } else {
            this.K1 = x0Var4;
        }
        this.N1 = false;
        this.M = false;
        by5.c4.f("XWebNativeInterface", "detach end");
    }

    public final void o() {
        int descendantFocusability;
        int descendantFocusability2;
        if ((this.f495205f.mo120158xfb86a31b() instanceof android.view.ViewGroup) && (descendantFocusability2 = ((android.view.ViewGroup) this.f495205f.mo120158xfb86a31b()).getDescendantFocusability()) != 131072) {
            this.W = descendantFocusability2;
            ((android.view.ViewGroup) this.f495205f.mo120158xfb86a31b()).setDescendantFocusability(131072);
        }
        if ((this.f495205f.mo120167xbfee89b7() instanceof android.view.ViewGroup) && (descendantFocusability = ((android.view.ViewGroup) this.f495205f.mo120167xbfee89b7()).getDescendantFocusability()) != 131072) {
            this.X = descendantFocusability;
            ((android.view.ViewGroup) this.f495205f.mo120167xbfee89b7()).setDescendantFocusability(131072);
        }
        by5.c4.f("XWebNativeInterface", "fixFocus, requestFocus return:" + this.f495205f.mo120158xfb86a31b().requestFocus());
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        by5.c4.f("XWebNativeInterface", "xwebToJS, videoChangeStatus");
        this.f495205f.mo14660x738236e6("xwebVideoBridge.xwebToJS_Video_Play();", new sx5.o(this));
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        this.F1 = 0;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector scaleGestureDetector) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0124, code lost:
    
        if (r3 < 0.0d) goto L50;
     */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onScroll(android.view.MotionEvent r16, android.view.MotionEvent r17, float r18, float r19) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sx5.a1.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        android.widget.FrameLayout frameLayout = this.f495222w;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            w(new sx5.b0(this));
            return true;
        }
        java.util.Timer timer = this.E1;
        if (timer != null) {
            timer.cancel();
            this.E1.purge();
            this.E1 = null;
        }
        if (by5.b.a(p()).b()) {
            w(new sx5.w(this));
        } else {
            if (this.f495221v.getVisibility() == 0) {
                w(new sx5.x(this));
            } else {
                w(new sx5.w(this));
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        return true;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onSpecialVideoEnterFullscreen */
    public void m165443xdda473b2(int i17) {
        by5.c4.f("XWebNativeInterface", "onSpecialVideoEnterFullscreen:" + i17);
        boolean m120171x1f05d274 = this.f495205f.m120171x1f05d274();
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = by5.s0.f118128c;
        if (n1Var != null) {
            int i18 = i17 == 0 ? m120171x1f05d274 ? 163 : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de : i17 == 1 ? m120171x1f05d274 ? 164 : 160 : i17 == 2 ? m120171x1f05d274 ? 165 : 161 : i17 == 3 ? m120171x1f05d274 ? 166 : 162 : 0;
            if (i18 > 0) {
                n1Var.b(577L, i18, 1L);
            }
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onSpecialVideoHook */
    public void m165444x18141b84(int i17) {
        by5.c4.f("XWebNativeInterface", "onSpecialVideoHook:" + i17);
        boolean m120171x1f05d274 = this.f495205f.m120171x1f05d274();
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = by5.s0.f118128c;
        if (n1Var != null) {
            int i18 = i17 == 0 ? m120171x1f05d274 ? 155 : 151 : i17 == 1 ? m120171x1f05d274 ? 156 : 152 : i17 == 2 ? m120171x1f05d274 ? 157 : com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5 : i17 == 3 ? m120171x1f05d274 ? 158 : 154 : 0;
            if (i18 > 0) {
                n1Var.b(577L, i18, 1L);
            }
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onVideoEmptied */
    public boolean m165445xbb35520() {
        by5.c4.f("XWebNativeInterface", "onVideoEmptied");
        com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 interfaceC27815xc8aac369 = this.Z;
        if (interfaceC27815xc8aac369 == null) {
            return false;
        }
        interfaceC27815xc8aac369.mo51514xbb35520();
        return true;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onVideoEnded */
    public void m165446x653dba3e() {
        by5.c4.f("XWebNativeInterface", "onVideoEnded");
        com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 interfaceC27815xc8aac369 = this.Z;
        if (interfaceC27815xc8aac369 != null) {
            interfaceC27815xc8aac369.mo51515x653dba3e();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onVideoEnterFullscreen */
    public void m165447x80540b37(boolean z17, long j17, double d17, double d18, boolean z18, boolean z19, double d19, double d27, double[] dArr) {
        double d28;
        com.p314xaae8f345.p3210x3857dc.n1 n1Var;
        com.p314xaae8f345.p3210x3857dc.n1 n1Var2;
        by5.c4.f("XWebNativeInterface", "onVideoEnterFullscreen, isVideoTag:" + z17 + ",width:" + d17 + ",height:" + d18 + ",pause:" + z18 + ",seeking:" + z19 + ",currentTime:" + d19 + ",duration:" + d27 + ", accessibility:" + by5.b.a(p()).b());
        com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 interfaceC27815xc8aac369 = this.Z;
        if (interfaceC27815xc8aac369 != null) {
            d28 = d27;
            interfaceC27815xc8aac369.mo51516x80540b37(z17, j17, d17, d18, z18, z19, d19, d27, dArr);
        } else {
            d28 = d27;
        }
        if (this.f495205f.m120171x1f05d274()) {
            com.p314xaae8f345.p3210x3857dc.n1 n1Var3 = by5.s0.f118128c;
            if (n1Var3 != null) {
                n1Var3.b(577L, 54L, 1L);
            }
        } else if (this.f495205f.m120170x43962b60() && (n1Var = by5.s0.f118128c) != null) {
            n1Var.b(577L, 58L, 1L);
        }
        if (z17) {
            if (this.f495205f.m120171x1f05d274()) {
                com.p314xaae8f345.p3210x3857dc.n1 n1Var4 = by5.s0.f118128c;
                if (n1Var4 != null) {
                    n1Var4.b(577L, 55L, 1L);
                }
            } else if (this.f495205f.m120170x43962b60() && (n1Var2 = by5.s0.f118128c) != null) {
                n1Var2.b(577L, 59L, 1L);
            }
            this.M = true;
        } else {
            this.M = false;
        }
        this.N = d28;
        this.P = d17;
        this.Q = d18;
        if (z19) {
            m165455xe204b4ee();
        } else {
            m165454x59df1e13();
        }
        w(new sx5.h0(this, d17, d18, z17));
        m165457x26b58cf2(d19, d27, dArr);
        w(new sx5.d0(this, z18));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onVideoError */
    public void m165448x653fc18c(int i17, java.lang.String str) {
        by5.c4.f("XWebNativeInterface", "onVideoError");
        com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 interfaceC27815xc8aac369 = this.Z;
        if (interfaceC27815xc8aac369 != null) {
            interfaceC27815xc8aac369.mo51517x653fc18c(i17, str);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onVideoExitFullscreen */
    public void m165449xf70b0875() {
        by5.c4.f("XWebNativeInterface", "onVideoExitFullscreen");
        this.M = false;
        com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 interfaceC27815xc8aac369 = this.Z;
        if (interfaceC27815xc8aac369 != null) {
            interfaceC27815xc8aac369.mo51518xf70b0875();
        }
        w(new sx5.i0(this));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onVideoPause */
    public void m165450x65d3157a() {
        by5.c4.f("XWebNativeInterface", "onVideoPause");
        com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 interfaceC27815xc8aac369 = this.Z;
        if (interfaceC27815xc8aac369 != null) {
            interfaceC27815xc8aac369.mo51519x65d3157a();
        }
        w(new sx5.d0(this, true));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onVideoPlay */
    public void m165451x4d9b9b30() {
        by5.c4.f("XWebNativeInterface", "onVideoPlay");
        com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 interfaceC27815xc8aac369 = this.Z;
        if (interfaceC27815xc8aac369 != null) {
            interfaceC27815xc8aac369.mo51520x4d9b9b30();
        }
        w(new sx5.d0(this, false));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onVideoPlaying */
    public void m165452x4f11eeb2() {
        by5.c4.f("XWebNativeInterface", "onVideoPlaying");
        com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 interfaceC27815xc8aac369 = this.Z;
        if (interfaceC27815xc8aac369 != null) {
            interfaceC27815xc8aac369.mo51521x4f11eeb2();
        }
        w(new sx5.z(this));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onVideoRateChange */
    public void m165453x53fe47ac(double d17) {
        by5.c4.f("XWebNativeInterface", "onVideoRateChange, rate:" + d17);
        this.S = d17;
        com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 interfaceC27815xc8aac369 = this.Z;
        if (interfaceC27815xc8aac369 != null) {
            interfaceC27815xc8aac369.mo51522x53fe47ac(d17);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onVideoSeeked */
    public void m165454x59df1e13() {
        by5.c4.f("XWebNativeInterface", "onVideoSeeked");
        com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 interfaceC27815xc8aac369 = this.Z;
        if (interfaceC27815xc8aac369 != null) {
            interfaceC27815xc8aac369.mo51523x59df1e13();
        }
        w(new sx5.z(this));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onVideoSeeking */
    public void m165455xe204b4ee() {
        by5.c4.f("XWebNativeInterface", "onVideoSeeking");
        com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 interfaceC27815xc8aac369 = this.Z;
        if (interfaceC27815xc8aac369 != null) {
            interfaceC27815xc8aac369.mo51524xe204b4ee();
        }
        w(new sx5.y(this));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onVideoSizeUpdate */
    public void m165456x78db6326(double d17, double d18) {
        com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 interfaceC27815xc8aac369 = this.Z;
        if (interfaceC27815xc8aac369 != null) {
            interfaceC27815xc8aac369.mo51525x78db6326(d17, d18);
        }
        if (this.Q == d18 && this.P == d17) {
            return;
        }
        by5.c4.f("XWebNativeInterface", "onVideoSizeUpdate width:" + d17 + ", height:" + d18);
        this.P = d17;
        this.Q = d18;
        w(new sx5.j0(this, d17, d18));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onVideoTimeUpdate */
    public void m165457x26b58cf2(double d17, double d18, double[] dArr) {
        this.N = d18;
        com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 interfaceC27815xc8aac369 = this.Z;
        if (interfaceC27815xc8aac369 != null) {
            interfaceC27815xc8aac369.mo51526x26b58cf2(d17, d18, dArr);
        }
        w(new sx5.f0(this, true, d17));
        w(new sx5.g0(this, d18, dArr));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onVideoVolumeChange */
    public void m165458x6b84ff66(boolean z17) {
        by5.c4.f("XWebNativeInterface", "onVideoVolumeChange, muted:" + z17);
        this.R = z17;
        com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 interfaceC27815xc8aac369 = this.Z;
        if (interfaceC27815xc8aac369 != null) {
            interfaceC27815xc8aac369.mo51527x6b84ff66(z17);
        }
        w(new sx5.e0(this, this.R));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onVideoWaiting */
    public void m165459xaf06b4d1() {
        by5.c4.f("XWebNativeInterface", "onVideoWaiting");
        com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 interfaceC27815xc8aac369 = this.Z;
        if (interfaceC27815xc8aac369 != null) {
            interfaceC27815xc8aac369.mo51528xaf06b4d1();
        }
        w(new sx5.y(this));
    }

    public final android.content.Context p() {
        return this.f495205f.getContext();
    }

    public final java.lang.String q(double d17, double d18) {
        java.lang.String format = java.lang.String.format(java.util.Locale.getDefault(), "%02d", java.lang.Integer.valueOf((int) (d17 / 3600.0d)));
        int i17 = (int) (d17 % 3600.0d);
        java.lang.String format2 = java.lang.String.format(java.util.Locale.getDefault(), "%02d", java.lang.Integer.valueOf(i17 / 60));
        java.lang.String format3 = java.lang.String.format(java.util.Locale.getDefault(), "%02d", java.lang.Integer.valueOf(i17 % 60));
        return d18 > 3600.0d ? java.lang.String.format(java.util.Locale.getDefault(), "%s:%s:%s", format, format2, format3) : java.lang.String.format(java.util.Locale.getDefault(), "%s:%s", format2, format3);
    }

    public final android.view.SurfaceView r(android.view.View view) {
        if (view instanceof android.view.SurfaceView) {
            return (android.view.SurfaceView) view;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
            android.view.SurfaceView r17 = r(viewGroup.getChildAt(i17));
            if (r17 != null) {
                return r17;
            }
        }
        return null;
    }

    public final android.view.TextureView s(android.view.View view) {
        if (view instanceof android.view.TextureView) {
            return (android.view.TextureView) view;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
            android.view.TextureView s17 = s(viewGroup.getChildAt(i17));
            if (s17 != null) {
                return s17;
            }
        }
        return null;
    }

    public void t(boolean z17) {
        android.app.Activity z18 = z();
        if (z18 == null) {
            by5.c4.f("XWebNativeInterface", "onActivityFullscreen, activity is null");
            return;
        }
        if (!z17) {
            if (this.M1) {
                z18.getWindow().addFlags(2048);
            }
            if (!this.L1) {
                z18.getWindow().clearFlags(1024);
            }
            if (this.O1) {
                return;
            }
            this.f495207h.setSystemUiVisibility(this.P1);
            return;
        }
        if ((z18.getWindow().getAttributes().flags & 2048) != 0) {
            this.M1 = true;
            z18.getWindow().clearFlags(2048);
        } else {
            this.M1 = false;
        }
        if ((z18.getWindow().getAttributes().flags & 1024) != 0) {
            this.L1 = true;
        } else {
            this.L1 = false;
            z18.getWindow().addFlags(1024);
        }
        if ((this.f495207h.getSystemUiVisibility() & 4096) != 0 && (this.f495207h.getSystemUiVisibility() & 4) != 0 && (this.f495207h.getSystemUiVisibility() & 2) != 0) {
            this.O1 = true;
            return;
        }
        this.O1 = false;
        this.P1 = this.f495207h.getSystemUiVisibility();
        sx5.z0 z0Var = this.f495207h;
        z0Var.setSystemUiVisibility(z0Var.getSystemUiVisibility() | 4096 | 4 | 2);
    }

    public void u(int i17, int i18) {
        int i19;
        int max;
        int min;
        android.app.Activity z17 = z();
        if (z17 == null) {
            by5.c4.f("XWebNativeInterface", "onVideoSizeChanged, activity is null");
            return;
        }
        if (i17 == 0 || i18 == 0) {
            by5.c4.f("XWebNativeInterface", "onVideoSizeChanged width == 0 || height == 0 return");
            return;
        }
        if (this.U == -3) {
            this.U = z17.getRequestedOrientation();
        }
        if (i17 <= i18) {
            i19 = 1;
            x(1);
        } else {
            x(0);
            i19 = 0;
        }
        this.V = i19;
        by5.c4.f("XWebNativeInterface", "onVideoSizeChanged, currentOrientation:" + i19);
        android.view.View view = this.f495210m;
        if (view != null) {
            android.view.Display defaultDisplay = ((android.view.WindowManager) p().getSystemService("window")).getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point(0, 0);
            defaultDisplay.getSize(point);
            if (i19 == 0) {
                min = java.lang.Math.max(point.x, point.y);
                max = java.lang.Math.min(point.x, point.y);
            } else {
                max = java.lang.Math.max(point.x, point.y);
                min = java.lang.Math.min(point.x, point.y);
            }
            double d17 = (i17 * 1.0d) / i18;
            double d18 = min;
            double d19 = max;
            if (d17 >= (d18 * 1.0d) / d19) {
                max = (int) (d18 * (1.0d / d17));
            } else {
                min = (int) (d19 * d17);
            }
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(min, max, 17));
        }
    }

    public void v() {
        android.app.Activity z17;
        if (this.f495214p0 == null) {
            this.f495214p0 = (android.media.AudioManager) p().getSystemService("audio");
        }
        this.f495224x0 = this.f495214p0.getStreamMaxVolume(3);
        this.f495227y0 = this.f495214p0.getStreamVolume(3);
        if (this.f495225x1 == null && (z17 = z()) != null) {
            this.f495225x1 = z17.getWindow();
        }
        android.view.Window window = this.f495225x1;
        if (window != null && this.f495228y1 == null) {
            this.f495228y1 = window.getAttributes();
        }
        android.view.WindowManager.LayoutParams layoutParams = this.f495228y1;
        if (layoutParams != null) {
            float f17 = layoutParams.screenBrightness;
            this.f495215p1 = f17;
            if (f17 == -1.0f) {
                try {
                    this.f495215p1 = (float) (android.provider.Settings.System.getInt(p().getContentResolver(), "screen_brightness") / 256.0d);
                } catch (android.provider.Settings.SettingNotFoundException e17) {
                    by5.c4.d("XWebNativeInterface", "get brightness error", e17);
                }
            }
        }
    }

    public void w(java.lang.Runnable runnable) {
        if (this.Y) {
            return;
        }
        sx5.u uVar = new sx5.u(this, runnable);
        android.app.Activity z17 = z();
        if (z17 != null) {
            z17.runOnUiThread(uVar);
        } else {
            this.f495205f.mo120158xfb86a31b().post(uVar);
        }
    }

    public final void x(int i17) {
        android.app.Activity z17 = z();
        if (z17 == null) {
            by5.c4.f("XWebNativeInterface", "setRequestedOrientation activity = null");
            return;
        }
        com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 interfaceC27815xc8aac369 = this.Z;
        if (interfaceC27815xc8aac369 == null || !interfaceC27815xc8aac369.mo74541x45294025(i17)) {
            z17.setRequestedOrientation(i17);
        } else {
            by5.c4.f("XWebNativeInterface", "setRequestedOrientation by wechat client");
        }
    }

    public void y() {
        java.util.Timer timer = this.E1;
        if (timer != null) {
            timer.cancel();
            this.E1.purge();
            this.E1 = null;
        }
        if (by5.b.a(p()).b()) {
            return;
        }
        java.util.Timer timer2 = new java.util.Timer();
        this.E1 = timer2;
        timer2.schedule(new sx5.v(this), 7000L);
    }

    public final android.app.Activity z() {
        android.app.Activity k17 = k(this.f495205f.getContext());
        if (k17 == null) {
            by5.c4.c("XWebNativeInterface", "tryGetActivity but no Activity");
        }
        return k17;
    }
}
