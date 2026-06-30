package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class r2 extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f284604b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f284605c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f284606d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f284607e;

    /* renamed from: f, reason: collision with root package name */
    public int f284608f;

    /* renamed from: g, reason: collision with root package name */
    public int f284609g;

    /* renamed from: h, reason: collision with root package name */
    public int f284610h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.q2 f284611i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View.OnClickListener f284612j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f284604b = context;
        this.f284608f = 5;
        this.f284611i = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.q2.f284593e;
        setContentView(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cbs, (android.view.ViewGroup) null));
        setOutsideTouchable(true);
        setFocusable(true);
        android.view.View findViewById = getContentView().findViewById(com.p314xaae8f345.mm.R.id.ovk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f284605c = findViewById;
        android.view.View findViewById2 = getContentView().findViewById(com.p314xaae8f345.mm.R.id.jge);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f284606d = findViewById2;
        getContentView().setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.p2(this));
    }

    public final void a(android.view.View anchor) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
        if (!this.f284607e) {
            getContentView().measure(0, 0);
            this.f284607e = true;
        }
        int measuredWidth = getContentView().getMeasuredWidth();
        int measuredHeight = getContentView().getMeasuredHeight();
        int[] iArr = new int[2];
        anchor.getLocationInWindow(iArr);
        int width = iArr[0] + ((anchor.getWidth() - measuredWidth) / 2);
        int i18 = iArr[1] - measuredHeight;
        android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(this.f284604b);
        int i19 = h17.x;
        int i27 = h17.y;
        int i28 = this.f284608f;
        int i29 = (i19 - i28) - measuredWidth;
        int i37 = i28 + 0;
        if (width <= i29 && width < i37) {
            width = i37;
        }
        android.view.View view = this.f284605c;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.view.View view2 = this.f284606d;
        android.view.ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((android.widget.RelativeLayout.LayoutParams) layoutParams).setMarginStart(((iArr[0] + (anchor.getWidth() / 2)) - width) - (view.getMeasuredWidth() / 2));
        if (i18 <= this.f284610h) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.q2 q2Var = this.f284611i;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.q2 q2Var2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.q2.f284592d;
            if (q2Var != q2Var2) {
                float f17 = 180;
                getContentView().setRotation(getContentView().getRotation() + f17);
                view2.setRotation(view2.getRotation() + f17);
                this.f284611i = q2Var2;
            }
            i17 = i18 + this.f284609g + measuredHeight + anchor.getHeight();
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.q2 q2Var3 = this.f284611i;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.q2 q2Var4 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.q2.f284593e;
            if (q2Var3 != q2Var4) {
                float f18 = 180;
                getContentView().setRotation(getContentView().getRotation() + f18);
                view2.setRotation(view2.getRotation() + f18);
                this.f284611i = q2Var4;
            }
            i17 = i18 - this.f284609g;
        }
        setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f575638ec);
        showAtLocation(anchor, 0, width, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(java.lang.String.format("popX:%s, popY:%s, sw:%s, sh:%s, pw:%s, ph:%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredHeight)}, 6)), "format(...)");
    }
}
