package zk3;

/* loaded from: classes8.dex */
public final class g0 extends pk3.h implements gp1.y {

    /* renamed from: d, reason: collision with root package name */
    public final long f554982d;

    /* renamed from: e, reason: collision with root package name */
    public long f554983e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f554984f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f554985g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f554986h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f554987i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1902x6580a04.C16615x299ce7dc f554988m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f554989n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f554990o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f554991p;

    /* renamed from: q, reason: collision with root package name */
    public zk3.h f554992q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f554993r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.b f554994s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f554995t;

    /* renamed from: u, reason: collision with root package name */
    public int f554996u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Point f554997v;

    /* renamed from: w, reason: collision with root package name */
    public final android.os.Handler f554998w;

    /* renamed from: x, reason: collision with root package name */
    public final zk3.k f554999x;

    /* renamed from: y, reason: collision with root package name */
    public final zk3.x f555000y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f554982d = 1000L;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f554985g = arrayList;
        this.f554986h = new android.graphics.Rect();
        this.f554993r = jz5.h.b(new zk3.y(this, activity));
        this.f554994s = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.e(arrayList, 0, 2, null);
        this.f554996u = -1;
        this.f554997v = new android.graphics.Point();
        this.f554998w = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f554999x = new zk3.k(this);
        this.f555000y = new zk3.x(this);
    }

    public static final void V6(zk3.g0 g0Var, java.util.List list, boolean z17, boolean z18, boolean z19) {
        g0Var.getClass();
        pm0.v.X(new zk3.t(g0Var, list, z19, z17, z18));
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 0;
    }

    @Override // pk3.h
    public void O6(java.lang.Object obj) {
        java.lang.String m9713x2fec8307;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1902x6580a04.C16617x6dc79c85 f232114j2;
        android.view.ViewTreeObserver viewTreeObserver;
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().H(this);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.jxt);
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = com.p314xaae8f345.mm.ui.bl.i(m158354x19263085(), -1);
        relativeLayout.setLayoutParams(layoutParams2);
        android.widget.TextView textView = (android.widget.TextView) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.jxu);
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai()) {
            m9713x2fec8307 = b3.l.m9713x2fec8307(context, com.p314xaae8f345.mm.R.C30867xcad56011.c0x);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m9713x2fec8307);
        } else {
            m9713x2fec8307 = b3.l.m9713x2fec8307(context, com.p314xaae8f345.mm.R.C30867xcad56011.h0u);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m9713x2fec8307);
        }
        textView.setText(m9713x2fec8307);
        android.widget.ImageView imageView = (android.widget.ImageView) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.jxs);
        this.f554990o = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new zk3.u(this));
        }
        this.f554989n = (android.widget.TextView) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.jkv);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.b bVar = this.f554994s;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.e) bVar;
        zk3.x xVar = this.f555000y;
        eVar.f232094c = xVar;
        this.f554987i = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.jxp);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1902x6580a04.C16615x299ce7dc c16615x299ce7dc = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1902x6580a04.C16615x299ce7dc) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.jxq);
        this.f554988m = c16615x299ce7dc;
        if (c16615x299ce7dc != null && (viewTreeObserver = c16615x299ce7dc.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new zk3.w(this));
        }
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(m158354x19263085());
        zk3.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.C;
        frameLayout.setLayoutParams(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-1, 0));
        this.f554991p = frameLayout;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager) ((jz5.n) this.f554993r).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f554987i;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.C16610x601b3a01) layoutManager).D = c22849x81a93d25;
        final yz5.l lVar = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1902x6580a04.C16616x84c622a1 c16616x84c622a1 = c22849x81a93d25 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1902x6580a04.C16616x84c622a1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1902x6580a04.C16616x84c622a1) c22849x81a93d25 : null;
        if (c16616x84c622a1 != null && (f232114j2 = c16616x84c622a1.getF232114j2()) != null) {
            f232114j2.f232115d = xVar;
        }
        zk3.m mVar = new zk3.m(this, new in5.s() { // from class: com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutConfig$getItemConvertFactory$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                in5.r rVar;
                if (type == 1) {
                    return new xk3.a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.e.this.f232094c);
                }
                if (type != 2) {
                    if (type == 3) {
                        return new xk3.j(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.e.this.f232094c);
                    }
                    if (type == 4) {
                        return new xk3.b(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.e.this.f232094c);
                    }
                    if (type == 5) {
                        return new xk3.d(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.e.this.f232094c);
                    }
                    if (type == 8) {
                        return new xk3.p(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.e.this.f232094c);
                    }
                    switch (type) {
                        case 22:
                        case 25:
                        case 27:
                            return new xk3.v(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.e.this.f232094c);
                        case 23:
                            return new xk3.o(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.e.this.f232094c, true);
                        case 24:
                            return new xk3.o(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.e.this.f232094c, false);
                        case 26:
                            break;
                        case 28:
                        case 29:
                            return new xk3.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.e.this.f232094c);
                        case 30:
                            return new xk3.k(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.e.this.f232094c);
                        default:
                            yz5.l lVar2 = lVar;
                            if (lVar2 != null && (rVar = (in5.r) lVar2.mo146xb9724478(java.lang.Integer.valueOf(type))) != null) {
                                return rVar;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.e.this.getClass();
                            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("FinderGridLayoutConfig", "type invalid", new java.lang.Object[0]);
                            return new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.c();
                    }
                }
                return new xk3.w(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.e.this.f232094c);
            }
        }, this.f554985g);
        this.f554995t = mVar;
        mVar.mo8163xed962dec(this.f554999x);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f554987i;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.mo7967x900dcbe1((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager) ((jz5.n) this.f554993r).mo141623x754a37bb());
            c22849x81a93d252.m7964x8d4ad49c(new zk3.n(this));
            c22849x81a93d252.mo7960x6cab2c8d(this.f554995t);
        }
        bVar.getClass();
        android.view.View view = this.f554991p;
        if (view != null && (c22848x6ddd90cf = this.f554995t) != null) {
            in5.n0.U(c22848x6ddd90cf, view, 0, false, 4, null);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f554995t;
        if (c22848x6ddd90cf2 != null) {
            c22848x6ddd90cf2.f374638o = new zk3.o(this);
        }
        if (c22848x6ddd90cf2 != null) {
            c22848x6ddd90cf2.F = new zk3.p(this);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.f554987i;
        if (c22849x81a93d253 != null) {
            c22849x81a93d253.i(new zk3.q(this));
        }
        this.f554984f = false;
        pm0.v.O("MultiTask_Thread", new zk3.s(this));
    }

    public final void W6() {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class))).Di()) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).q7(0);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        pf5.z zVar = pf5.z.f435481a;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).Y6()) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) zVar.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).q7(0);
            return;
        }
        if (this.f554985g.size() == 0) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity4 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity4, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) zVar.a(activity4).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).q7(1);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity5 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity5, "activity");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) zVar.a(activity5).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).c7()) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity6 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity6, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) zVar.a(activity6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).q7(2);
    }

    @Override // gp1.y
    public void X(java.util.List ballInfoList, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ballInfoList, "ballInfoList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "dataChanged");
    }

    public final void X6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        boolean Y6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).Y6();
        java.util.ArrayList arrayList = this.f554985g;
        if (Y6) {
            if (arrayList.size() == 0) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.k7((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) a17, true, false, false, false, false, false, true, false, 128, null);
            } else {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) zVar.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).T6(true);
            }
        }
        W6();
        if (Y6) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5764x5d346639 c5764x5d346639 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5764x5d346639();
        c5764x5d346639.f136081g.f89551a = arrayList.size() != 0;
        c5764x5d346639.e();
    }

    public final void Y6(boolean z17, boolean z18) {
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskTipsHelper", "setMultiTaskPaneExitDragFlag, flag: true");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("multitask_tips_config").putBoolean("multitask_panel_exit_drag_flag", true);
            return;
        }
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("multitask_tips_config").getBoolean("multitask_panel_exit_drag_flag", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskTipsHelper", "isMultiTaskPanelExitDrag, flag: " + z19);
        if (z19 || !z17) {
            android.widget.TextView textView = this.f554989n;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = this.f554989n;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        android.widget.TextView textView3 = this.f554989n;
        if (textView3 != null) {
            textView3.setAlpha(1.0f);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).Z6(2);
    }

    public final void Z6(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.C16610x601b3a01 layoutManager) {
        int w17;
        int y17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        if (layoutManager.m8020x7e414b06() <= 3 || (w17 = layoutManager.w()) > (y17 = layoutManager.y())) {
            return;
        }
        int i17 = w17;
        while (true) {
            int i18 = 0;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = recyclerView.q0(i17, false);
            in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
            if (s0Var != null) {
                android.view.View findViewById = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvf);
                android.view.View findViewById2 = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvd);
                if (findViewById != null && findViewById2 != null) {
                    android.graphics.Rect rect = this.f554986h;
                    findViewById2.getLocalVisibleRect(rect);
                    int i19 = layoutManager.m8020x7e414b06() == 2 ? com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.S : com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.Q;
                    int height = i19 - rect.height();
                    if (height <= i19 * 0.8f && i17 <= w17 + 1) {
                        i18 = height;
                    }
                    findViewById.setTranslationY(i18);
                    android.view.View findViewById3 = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jva);
                    if ((findViewById3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.p1901x373aa5.C16612x87a7d185 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.p1901x373aa5.C16612x87a7d185) findViewById3 : null) != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.p1901x373aa5.C16612x87a7d185 c16612x87a7d185 = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.p1901x373aa5.C16612x87a7d185) findViewById3;
                        c16612x87a7d185.topOffset = i18;
                        c16612x87a7d185.invalidate();
                    }
                }
            }
            if (i17 == y17) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final int a7(java.lang.String str, int i17) {
        if (str == null) {
            return -1;
        }
        int i18 = 0;
        for (java.lang.Object obj : this.f554985g) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            uk3.a aVar = (uk3.a) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f510057d.f66791xc8a07680, str) && aVar.f510057d.f66793x2262335f == i17) {
                return i18;
            }
            i18 = i19;
        }
        return -1;
    }

    public final void b7(android.view.View view, float f17, float f18) {
        float f19 = 0.0f;
        if (f17 >= 0.5f) {
            float f27 = (f17 - 0.5f) / 0.5f;
            if (f27 >= 0.0f) {
                f19 = 1.0f;
                if (f27 <= 1.0f) {
                    f19 = f27;
                }
            }
            android.widget.ImageView imageView = this.f554990o;
            if (imageView != null) {
                imageView.setAlpha(f19);
            }
            android.widget.TextView textView = this.f554989n;
            if (textView != null) {
                textView.setAlpha(f19);
            }
        } else {
            android.widget.ImageView imageView2 = this.f554990o;
            if (imageView2 != null) {
                imageView2.setAlpha(0.0f);
            }
            android.widget.TextView textView2 = this.f554989n;
            if (textView2 != null) {
                textView2.setAlpha(0.0f);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1902x6580a04.C16615x299ce7dc c16615x299ce7dc = this.f554988m;
        if (c16615x299ce7dc == null) {
            return;
        }
        zk3.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.C;
        c16615x299ce7dc.setTranslationX(0 + (0 * f18));
    }

    public final void c7() {
        int w17;
        int y17;
        android.view.View findViewById;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f554987i;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c22849x81a93d25 != null ? c22849x81a93d25.getLayoutManager() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.C16610x601b3a01 c16610x601b3a01 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.C16610x601b3a01 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.C16610x601b3a01) layoutManager : null;
        if (c16610x601b3a01 == null || (w17 = c16610x601b3a01.w()) > (y17 = c16610x601b3a01.y())) {
            return;
        }
        while (true) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f554987i;
            int i17 = 0;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = c22849x81a93d252 != null ? c22849x81a93d252.q0(w17, false) : null;
            in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
            if (s0Var != null) {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.f554987i;
                if (c22849x81a93d253 != null && (mo7946xf939df19 = c22849x81a93d253.mo7946xf939df19()) != null) {
                    i17 = mo7946xf939df19.mo1894x7e414b06();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "refreshLayout itemCount:" + i17 + ", pos:" + w17);
                if (i17 >= 2 && (findViewById = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.hhd)) != null) {
                    android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                    zk3.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.C;
                    layoutParams.height = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.L;
                    findViewById.getLayoutParams().width = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.K;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvd);
                    if (c22646x1e9ca55 != null) {
                        c22646x1e9ca55.getLayoutParams().height = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.Q;
                    }
                    findViewById.requestLayout();
                }
            }
            if (w17 == y17) {
                return;
            } else {
                w17++;
            }
        }
    }

    public final boolean d7(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, boolean z17, boolean z18) {
        pk3.h b17;
        int size = this.f554985g.size();
        if (size <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1902x6580a04.C16615x299ce7dc c16615x299ce7dc = this.f554988m;
            if (c16615x299ce7dc != null) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1902x6580a04.C16615x299ce7dc.I;
                c16615x299ce7dc.m67204x764d6925(-1);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1902x6580a04.C16615x299ce7dc c16615x299ce7dc2 = this.f554988m;
            if (c16615x299ce7dc2 != null) {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1902x6580a04.C16615x299ce7dc.I;
                c16615x299ce7dc2.m67204x764d6925(1);
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        yk3.i iVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).f232126f;
        if (iVar != null && (b17 = iVar.b(1048576, "MultiTaskForSnapshotMinusScreen")) != null && (b17 instanceof zk3.w0)) {
            zk3.w0 w0Var = (zk3.w0) b17;
            w0Var.f555051e = c16601x7ed0e40c;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = w0Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).Q6(c16601x7ed0e40c != null ? c16601x7ed0e40c.f66793x2262335f : -1)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnapShotMultiTaskUIC", "checkSnapShot, teenmode!, forceShow:%b", java.lang.Boolean.valueOf(z18));
            } else {
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("multitask_tips_config").getBoolean("multitask_first_enter", false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskTipsHelper", "isMultiTaskFirstEnter, flag: " + z19);
                if (z19 || size != 1) {
                    if (size == 1) {
                        if (z18) {
                            boolean z27 = w0Var.m80380x71e92c1d().getVisibility() == 0;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnapShotMultiTaskUIC", "showSnapshotUIC, isVisible:%b", java.lang.Boolean.valueOf(z27));
                            if (!z27) {
                                w0Var.X6();
                                android.view.View m80380x71e92c1d = w0Var.m80380x71e92c1d();
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                                arrayList.add(0);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(m80380x71e92c1d, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "showSnapshotUIC", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                m80380x71e92c1d.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(m80380x71e92c1d, "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "showSnapshotUIC", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                w0Var.m80380x71e92c1d().setTranslationX(0.0f - ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.T + al3.b.f87383b) + 0));
                                ((ku5.t0) ku5.t0.f394148d).a(new zk3.s0(c16601x7ed0e40c, w0Var));
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnapShotMultiTaskUIC", "checkSnapShot, only one size!, forceShow:%b", java.lang.Boolean.valueOf(z18));
                    } else if (z17) {
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = w0Var.m158354x19263085();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) zVar.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).X6(true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnapShotMultiTaskUIC", "checkSnapShot, force hide!");
                    } else {
                        if (w0Var.Y6()) {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = w0Var.f555051e;
                            objArr[0] = c16601x7ed0e40c2 != null ? c16601x7ed0e40c2.f66791xc8a07680 : null;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnapShotMultiTaskUIC", "checkSnapShot, return false,currentShowId:%s", objArr);
                        } else {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c3 = w0Var.f555051e;
                            objArr2[0] = c16601x7ed0e40c3 != null ? c16601x7ed0e40c3.f66791xc8a07680 : null;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnapShotMultiTaskUIC", "checkSnapShot, is hide!, currentShowId:%s", objArr2);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570852c45;
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f437967d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        android.graphics.Point point = this.f554997v;
        this.f554997v = com.p314xaae8f345.mm.ui.bk.h(m80379x76847179());
        if (com.p314xaae8f345.mm.ui.bk.v0() && com.p314xaae8f345.mm.ui.bk.P(m80379x76847179())) {
            this.f554997v.x = com.p314xaae8f345.mm.ui.bk.g();
        }
        if (com.p314xaae8f345.mm.ui.bk.y()) {
            this.f554997v.x = com.p314xaae8f345.mm.ui.bk.f();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "onConfigurationChanged lastOrientation:" + this.f554996u + ",orientation:" + java.lang.Integer.valueOf(newConfig.orientation) + ", screenResolution:" + this.f554997v.x + ", lastScreenResolution:" + point.x);
        int i17 = this.f554996u;
        int i18 = newConfig.orientation;
        if (i17 == i18) {
            int i19 = point.x;
            android.graphics.Point point2 = this.f554997v;
            if (i19 == point2.x && point.y == point2.y) {
                return;
            }
        }
        this.f554996u = i18;
        c7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f554995t;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.mo8165x48eac7b3(this.f554999x);
        }
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().n(this);
    }

    @Override // pk3.b
    public void p9(o75.c event) {
        java.util.HashMap hashMap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) event.f425123d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMultiTaskChange eventId:");
        sb6.append(event.f425120a);
        sb6.append(" id:");
        sb6.append(c16601x7ed0e40c != null ? c16601x7ed0e40c.f66791xc8a07680 : null);
        sb6.append(" type:");
        sb6.append(c16601x7ed0e40c != null ? java.lang.Integer.valueOf(c16601x7ed0e40c.f66793x2262335f) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", sb6.toString());
        o75.b bVar = event.f425120a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, o75.b.f425115c)) {
            pm0.v.X(new zk3.z(c16601x7ed0e40c, this));
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, o75.b.f425117e)) {
            if (c16601x7ed0e40c != null) {
                java.lang.String field_id = c16601x7ed0e40c.f66791xc8a07680;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
                pm0.v.X(new zk3.l(this, field_id, c16601x7ed0e40c.f66793x2262335f, c16601x7ed0e40c));
                return;
            }
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, o75.b.f425116d)) {
            pm0.v.X(new zk3.a0(c16601x7ed0e40c, this));
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, lk3.c.f400546g)) {
            this.f554984f = false;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class)).Zi(new zk3.c0(this));
        } else {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, o75.b.f425118f) || (hashMap = event.f425124e) == null) {
                return;
            }
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                p9((o75.c) ((java.util.Map.Entry) it.next()).getValue());
            }
        }
    }
}
