package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0002¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/ContentFloatBallCollapseView;", "Landroid/widget/FrameLayout;", "", "visibility", "Ljz5/f0;", "setVisibility", "getCurrentMaskHeight", "getCurrentMasWidth", "getPositionY", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ball.view.ContentFloatBallCollapseView */
/* loaded from: classes14.dex */
public final class C12914xc9f89b34 extends android.widget.FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final int f174918q = qp1.c0.f447227c;

    /* renamed from: r, reason: collision with root package name */
    public static final int f174919r = qp1.c0.f447228d;

    /* renamed from: s, reason: collision with root package name */
    public static final int f174920s;

    /* renamed from: d, reason: collision with root package name */
    public android.view.WindowManager f174921d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f174922e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 f174923f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12927xb2f1d9af f174924g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f174925h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Boolean f174926i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 f174927m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Point f174928n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f174929o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Integer f174930p;

    static {
        pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
        int a17 = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 1);
        ((ov.p0) j0Var).getClass();
        f174920s = qp1.e0.a(a17);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12914xc9f89b34(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f174921d = (android.view.WindowManager) systemService;
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ehz, this);
        qp1.j.c(this.f174921d, this, 0, 0, null, null);
        setVisibility(8);
        this.f174922e = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.f564865ad2);
        this.f174923f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) findViewById(com.p314xaae8f345.mm.R.id.sgz);
        this.f174925h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.f564864ad1);
        this.f174924g = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12927xb2f1d9af) findViewById(com.p314xaae8f345.mm.R.id.f564866sh0);
        rp1.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7.T;
        int i17 = pp1.b.f438931g;
        int i18 = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7.W * 2) + i17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = this.f174923f;
        int i19 = f174918q;
        qp1.g0.e(c22645x24069159, i19, i17);
        qp1.g0.e(this.f174924g, i19, i17);
        qp1.g0.e(this.f174922e, i19, i18);
        android.view.ViewGroup.LayoutParams layoutParams = null;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContentFloatBallCollapseView", "updateCollapseViewSize width: " + i19 + ", height: " + i18);
            android.view.ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            android.view.WindowManager.LayoutParams layoutParams3 = layoutParams2 instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams2 : null;
            if (layoutParams3 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContentFloatBallCollapseView", "initCollapseViewSize windowLayoutParams is null");
            } else {
                layoutParams3.width = i19;
                layoutParams3.height = i18;
                android.view.WindowManager windowManager = this.f174921d;
                if (windowManager != null) {
                    windowManager.updateViewLayout(this, layoutParams3);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ContentFloatBallCollapseView", th6, "updateCollapseViewSize exception", new java.lang.Object[0]);
        }
        qp1.g0.e(this.f174925h, qp1.e0.a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9)), qp1.e0.a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz)));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f174925h;
        if (c22699x3dcdb352 != null) {
            android.view.ViewGroup.LayoutParams layoutParams4 = c22699x3dcdb352.getLayoutParams();
            if (layoutParams4 != null) {
                if (layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams) {
                    int a17 = qp1.e0.a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj));
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams4;
                    marginLayoutParams.setMarginStart(a17);
                    marginLayoutParams.setMarginEnd(a17);
                }
                layoutParams = layoutParams4;
            }
            c22699x3dcdb352.setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x240691592 = this.f174923f;
        if (c22645x240691592 != null) {
            c22645x240691592.m81436x205ac394(qp1.e0.a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12927xb2f1d9af c12927xb2f1d9af = this.f174924g;
        if (c12927xb2f1d9af != null) {
            c12927xb2f1d9af.m54164x205ac394(qp1.e0.a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12927xb2f1d9af c12927xb2f1d9af2 = this.f174924g;
        if (c12927xb2f1d9af2 != null) {
            c12927xb2f1d9af2.a(f174920s, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aku));
        }
    }

    public final void b(float f17, int i17, int i18, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = this.f174927m;
        if (c12917x19ac03e7 == null) {
            return;
        }
        int m54107x2c96741a = (int) c12917x19ac03e7.m54107x2c96741a();
        int max = (int) (java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, f17)) * f174919r);
        int i19 = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7.W * 2) + max;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = this.f174923f;
        int i27 = f174918q;
        qp1.g0.e(c22645x24069159, i27, max);
        qp1.g0.e(this.f174924g, i27, max);
        int i28 = i27 + m54107x2c96741a;
        qp1.g0.e(this.f174922e, i28, i19);
        int i29 = i18 + ((int) ((r1 - i19) / 2.0f));
        int i37 = z17 ? i17 : i17 - m54107x2c96741a;
        try {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
            if (i17 == layoutParams2.x && i29 == layoutParams2.y && max == layoutParams2.height) {
                return;
            }
            layoutParams2.x = i37;
            layoutParams2.y = i29;
            layoutParams2.width = i28;
            layoutParams2.height = i19;
            if (this.f174928n == null) {
                this.f174928n = new android.graphics.Point();
            }
            android.graphics.Point point = this.f174928n;
            if (point != null) {
                point.x = i37;
            }
            if (point != null) {
                point.y = i29;
            }
            boolean z18 = this.f174929o;
            java.lang.Integer num = this.f174930p;
            if (z18) {
                if (num != null) {
                    super.setVisibility(num.intValue());
                }
                this.f174929o = false;
                this.f174930p = null;
            }
            android.view.WindowManager windowManager = this.f174921d;
            if (windowManager != null) {
                windowManager.updateViewLayout(this, layoutParams2);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ContentFloatBallCollapseView", th6, "updateCollapseViewPosition fail", new java.lang.Object[0]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = this.f174927m;
        return c12917x19ac03e7 != null ? c12917x19ac03e7.dispatchTouchEvent(motionEvent) : super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: getCurrentMasWidth */
    public final int m54088x7a08860a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = this.f174923f;
        if (c22645x24069159 != null) {
            return c22645x24069159.getWidth();
        }
        return 0;
    }

    /* renamed from: getCurrentMaskHeight */
    public final int m54089x3b500d6() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = this.f174923f;
        if (c22645x24069159 != null) {
            return c22645x24069159.getHeight();
        }
        return 0;
    }

    /* renamed from: getPositionY */
    public final int m54090x652dfd9a() {
        android.graphics.Point point = this.f174928n;
        if (point != null) {
            return point.y;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            return layoutParams2.y;
        }
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = this.f174927m;
        if (c12917x19ac03e7 != null) {
            c12917x19ac03e7.E(configuration);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = this.f174927m;
        return c12917x19ac03e7 != null ? c12917x19ac03e7.onInterceptTouchEvent(ev6) : super.onInterceptTouchEvent(ev6);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = this.f174927m;
        return c12917x19ac03e7 != null ? c12917x19ac03e7.onTouchEvent(event) : super.onTouchEvent(event);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        java.util.Objects.toString(this.f174928n);
        if (this.f174928n == null && i17 == 0) {
            this.f174929o = true;
            this.f174930p = java.lang.Integer.valueOf(i17);
        } else {
            this.f174929o = false;
            this.f174930p = null;
            super.setVisibility(i17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12914xc9f89b34(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            a(context);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ContentFloatBallCollapseView", e17, "init exception", new java.lang.Object[0]);
        }
    }
}
