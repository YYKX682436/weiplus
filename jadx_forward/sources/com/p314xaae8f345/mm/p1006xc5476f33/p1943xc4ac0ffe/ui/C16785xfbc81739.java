package com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui;

/* renamed from: com.tencent.mm.plugin.patmsg.ui.PatPopupWindow */
/* loaded from: classes5.dex */
public class C16785xfbc81739 extends android.widget.PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f234429a;

    /* renamed from: b, reason: collision with root package name */
    public int f234430b;

    /* renamed from: c, reason: collision with root package name */
    public int f234431c;

    /* renamed from: d, reason: collision with root package name */
    public int f234432d;

    /* renamed from: e, reason: collision with root package name */
    public int f234433e;

    /* renamed from: f, reason: collision with root package name */
    public int f234434f;

    /* renamed from: g, reason: collision with root package name */
    public int f234435g;

    /* renamed from: h, reason: collision with root package name */
    public int f234436h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f234437i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f234438j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f234439k;

    public C16785xfbc81739(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public void a(android.view.View view, int i17, int i18, android.widget.FrameLayout.LayoutParams layoutParams, boolean z17, boolean z18, boolean z19) {
        this.f234439k = view;
        if (z19) {
            setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f575982yy);
        } else if (i18 == 2) {
            if (z17) {
                setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f575981oo);
            } else {
                setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f575979nc);
            }
        } else if (z17) {
            setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f575980om);
        }
        if (getBackground() == null) {
            setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        }
        android.view.View contentView = getContentView();
        if (contentView == null) {
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = layoutParams.leftMargin;
        layoutParams2.rightMargin = layoutParams.rightMargin;
        layoutParams2.topMargin = layoutParams.topMargin;
        layoutParams2.bottomMargin = layoutParams.bottomMargin;
        contentView.setLayoutParams(layoutParams2);
        int i19 = com.p314xaae8f345.mm.ui.bk.t().widthPixels;
        int i27 = com.p314xaae8f345.mm.ui.bk.t().heightPixels;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        setWidth(-2);
        setHeight(-2);
        if (i17 == 0) {
            this.f234432d = i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561234cx);
        } else if (i17 == 1) {
            this.f234432d = iArr[0];
        } else if (i17 == 2) {
            this.f234432d = (i19 - iArr[0]) - view.getWidth();
        } else if (i17 == 3) {
            this.f234432d = i19 - iArr[0];
        } else if (i17 == 4) {
            this.f234432d = iArr[0] + view.getWidth();
        }
        if (i18 == 0) {
            this.f234433e = i27;
        } else if (i18 == 1) {
            this.f234433e = iArr[1];
        } else if (i18 == 2) {
            this.f234433e = (i27 - iArr[1]) - view.getHeight();
        } else if (i18 == 3) {
            this.f234433e = (i27 - iArr[1]) + view.getHeight();
        } else if (i18 == 4) {
            this.f234433e = iArr[1] + view.getHeight();
        }
        android.widget.FrameLayout frameLayout = this.f234429a;
        frameLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.f234432d, android.view.View.MeasureSpec.getMode(Integer.MIN_VALUE)), android.view.View.MeasureSpec.makeMeasureSpec(this.f234433e, android.view.View.MeasureSpec.getMode(Integer.MIN_VALUE)));
        setWidth(java.lang.Math.min(frameLayout.getMeasuredWidth(), this.f234432d));
        setHeight(java.lang.Math.min(frameLayout.getMeasuredHeight(), this.f234433e));
        frameLayout.getMeasuredWidth();
        frameLayout.getMeasuredHeight();
        view.getLocationInWindow(new int[2]);
        this.f234430b = 0;
        this.f234431c = 0;
        if (i17 == 0) {
            this.f234430b = (-(frameLayout.getMeasuredWidth() - view.getWidth())) / 2;
        } else if (i17 == 1) {
            this.f234430b = -frameLayout.getMeasuredWidth();
        } else if (i17 == 2) {
            this.f234430b = view.getWidth();
        } else if (i17 == 4) {
            this.f234430b = view.getWidth() - frameLayout.getMeasuredWidth();
        }
        if (i18 == 0) {
            this.f234431c = (-view.getHeight()) - ((frameLayout.getMeasuredHeight() - view.getHeight()) / 2);
        } else if (i18 == 1) {
            this.f234431c = ((-frameLayout.getMeasuredHeight()) - view.getHeight()) + com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        } else if (i18 == 2) {
            this.f234431c -= com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        } else if (i18 == 3) {
            this.f234431c = -view.getHeight();
        } else if (i18 == 4) {
            this.f234431c = -frameLayout.getMeasuredHeight();
        }
        if (z18) {
            this.f234436h = 0;
            this.f234437i = new pp3.l(this, view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.f234437i);
        }
        if (isShowing()) {
            update(view, this.f234430b, this.f234431c, getWidth(), getHeight());
        } else {
            showAsDropDown(view, this.f234430b, this.f234431c);
        }
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        this.f234436h = 0;
        android.view.View view = this.f234439k;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f234437i);
        }
    }

    @Override // android.widget.PopupWindow
    public android.view.View getContentView() {
        return this.f234429a.getChildAt(0);
    }

    @Override // android.widget.PopupWindow
    public void setContentView(android.view.View view) {
        android.widget.FrameLayout frameLayout = this.f234429a;
        frameLayout.removeAllViews();
        frameLayout.addView(view);
    }

    @Override // android.widget.PopupWindow
    public void update() {
        super.update();
    }

    public C16785xfbc81739(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f234438j = new int[2];
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f234429a = frameLayout;
        super.setContentView(frameLayout);
    }

    public C16785xfbc81739(android.view.View view) {
        this(view.getContext(), null);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(view.getContext());
        this.f234429a = frameLayout;
        super.setContentView(frameLayout);
        setContentView(view);
    }
}
