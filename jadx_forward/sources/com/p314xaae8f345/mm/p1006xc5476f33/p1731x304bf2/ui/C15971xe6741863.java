package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameIndexListView */
/* loaded from: classes8.dex */
public class C15971xe6741863 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f implements xn5.a0 {

    /* renamed from: t2, reason: collision with root package name */
    public static int f222383t2 = 0;

    /* renamed from: u2, reason: collision with root package name */
    public static boolean f222384u2 = true;

    /* renamed from: v2, reason: collision with root package name */
    public static int f222385v2;

    /* renamed from: w2, reason: collision with root package name */
    public static int f222386w2;

    /* renamed from: x2, reason: collision with root package name */
    public static boolean f222387x2;

    /* renamed from: i2, reason: collision with root package name */
    public final android.content.Context f222388i2;

    /* renamed from: j2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.u3 f222389j2;

    /* renamed from: k2, reason: collision with root package name */
    public m53.y1 f222390k2;

    /* renamed from: l2, reason: collision with root package name */
    public boolean f222391l2;

    /* renamed from: m2, reason: collision with root package name */
    public android.widget.Scroller f222392m2;

    /* renamed from: n2, reason: collision with root package name */
    public android.widget.ImageView f222393n2;

    /* renamed from: o2, reason: collision with root package name */
    public android.widget.ImageView f222394o2;

    /* renamed from: p2, reason: collision with root package name */
    public android.view.View f222395p2;

    /* renamed from: q2, reason: collision with root package name */
    public float f222396q2;

    /* renamed from: r2, reason: collision with root package name */
    public int f222397r2;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f222398s2;

    public C15971xe6741863(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f222391l2 = true;
        this.f222388i2 = context;
    }

    /* renamed from: getSourceScene */
    public static int m64756xd419dffb() {
        return f222383t2;
    }

    /* renamed from: setCanPulldown */
    public static void m64757xabebf695(boolean z17) {
        f222387x2 = z17;
    }

    /* renamed from: setDefaultPadding */
    public static void m64758xfdf2d792(int i17) {
        f222385v2 = i17;
    }

    /* renamed from: setInitPadding */
    public static void m64759x8eda571f(int i17) {
        f222386w2 = i17;
        f222384u2 = true;
    }

    /* renamed from: setSourceScene */
    public static void m64760x6a7f536f(int i17) {
        f222383t2 = i17;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f222395p2 != null && this.f222392m2.computeScrollOffset()) {
            this.f222395p2.setPadding(0, this.f222392m2.getCurrY(), 0, 0);
            int i17 = (int) (((r1 - r0) / f222385v2) * 255.0f);
            this.f222394o2.setAlpha(255 - i17);
            this.f222393n2.setAlpha(i17);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View view;
        if (!f222387x2 || this.f222395p2 == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        boolean z17 = false;
        if (action == 0) {
            this.f222398s2 = false;
            this.f222396q2 = motionEvent.getRawY();
        } else if (action == 2) {
            if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) getLayoutManager()).w() == 0 && (view = this.f222395p2) != null && view.getTop() == 0) {
                z17 = true;
            }
            if (z17) {
                if (this.f222398s2) {
                    return true;
                }
                int rawY = (int) (motionEvent.getRawY() - this.f222396q2);
                if (this.f222395p2.getPaddingTop() <= f222385v2 + this.f222397r2) {
                    if (rawY > 0 && java.lang.Math.abs(rawY) >= this.f222397r2) {
                        this.f222398s2 = true;
                        this.f222392m2.startScroll(0, this.f222395p2.getPaddingTop(), 0, -this.f222395p2.getPaddingTop(), 500);
                        this.f222393n2.setClickable(true);
                        invalidate();
                        motionEvent.setAction(3);
                        super.dispatchTouchEvent(motionEvent);
                        return true;
                    }
                } else if (this.f222395p2.getPaddingTop() >= (-this.f222397r2) && rawY < 0 && java.lang.Math.abs(rawY) >= this.f222397r2) {
                    this.f222398s2 = true;
                    this.f222392m2.startScroll(0, 0, 0, f222385v2, 500);
                    invalidate();
                    motionEvent.setAction(3);
                    super.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void n1() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        m53.x1 x1Var = new m53.x1();
        m53.y1 y1Var = this.f222390k2;
        x1Var.f405701d = y1Var != null ? y1Var.f405734e : null;
        lVar.f152197a = x1Var;
        lVar.f152198b = new m53.y1();
        lVar.f152199c = "/cgi-bin/mmgame-bin/getgameindex4feedslist";
        lVar.f152200d = 2943;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.r3 r3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.r3(this);
        java.lang.Object obj = this.f222388i2;
        com.p314xaae8f345.mm.p944x882e457a.z2.e(a17, r3Var, false, obj instanceof im5.b ? (im5.b) obj : null);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.content.Context context = this.f222388i2;
        this.f222397r2 = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.f222392m2 = new android.widget.Scroller(context);
        mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(getContext()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.u3 u3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.u3(this);
        this.f222389j2 = u3Var;
        mo7960x6cab2c8d(u3Var);
        N(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.s3(this, getResources(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560701rs));
        m53681x626a4c3f(com.p314xaae8f345.mm.R.C30864xbddafb2a.bfv);
        m53683x6891e372(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.q3(this));
        m1(true);
        n1();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (f222384u2 || this.f222395p2 == null || this.f222394o2 == null || this.f222393n2 == null) {
            android.view.View childAt = getChildAt(0);
            this.f222395p2 = childAt;
            if (childAt != null) {
                childAt.setPadding(0, f222386w2, 0, 0);
                this.f222394o2 = (android.widget.ImageView) this.f222395p2.findViewById(com.p314xaae8f345.mm.R.id.n0h);
                this.f222393n2 = (android.widget.ImageView) this.f222395p2.findViewById(com.p314xaae8f345.mm.R.id.ahg);
            }
            f222384u2 = false;
        }
    }
}
