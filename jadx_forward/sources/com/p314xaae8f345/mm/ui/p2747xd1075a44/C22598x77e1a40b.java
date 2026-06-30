package com.p314xaae8f345.mm.ui.p2747xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\r"}, d2 = {"Lcom/tencent/mm/ui/widget/BasePopupWindow;", "Landroid/widget/PopupWindow;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al5/f", "al5/g", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.BasePopupWindow */
/* loaded from: classes3.dex */
public final class C22598x77e1a40b extends android.widget.PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f292777a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f292778b;

    /* renamed from: c, reason: collision with root package name */
    public int f292779c;

    /* renamed from: d, reason: collision with root package name */
    public int f292780d;

    /* renamed from: e, reason: collision with root package name */
    public int f292781e;

    /* renamed from: f, reason: collision with root package name */
    public int f292782f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22598x77e1a40b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a(android.view.View view, al5.f horizontalAlign, al5.g verticalAlign, int i17, int i18, yz5.a aVar, yz5.a aVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(horizontalAlign, "horizontalAlign");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(verticalAlign, "verticalAlign");
        setFocusable(false);
        setOutsideTouchable(true);
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        setTouchInterceptor(new al5.h(rect, this));
        getContentView().setOnClickListener(new al5.i(this, aVar));
        if (aVar2 != null) {
            setOnDismissListener(new al5.j(this, aVar2));
        }
        if (getBackground() == null) {
            setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.Object[] objArr = {new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3()};
        java.lang.String str = this.f292777a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "measureContentView: %s", objArr);
        int i19 = com.p314xaae8f345.mm.ui.bk.t().widthPixels;
        int i27 = com.p314xaae8f345.mm.ui.bk.t().heightPixels;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "anchorLocation in Window: %d, %d", java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]));
        setWidth(-2);
        setHeight(-2);
        int ordinal = horizontalAlign.ordinal();
        if (ordinal == 0) {
            this.f292781e = i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561234cx);
        } else if (ordinal == 1) {
            this.f292781e = iArr[0];
        } else if (ordinal == 2) {
            this.f292781e = (i19 - iArr[0]) - view.getWidth();
        } else if (ordinal == 3) {
            this.f292781e = i19 - iArr[0];
        } else if (ordinal == 4) {
            this.f292781e = iArr[0] + view.getWidth();
        }
        int ordinal2 = verticalAlign.ordinal();
        if (ordinal2 == 0) {
            this.f292782f = i27;
        } else if (ordinal2 == 1) {
            this.f292782f = iArr[1];
        } else if (ordinal2 == 2) {
            this.f292782f = (i27 - iArr[1]) - view.getHeight();
        } else if (ordinal2 == 3) {
            this.f292782f = (i27 - iArr[1]) + view.getHeight();
        } else if (ordinal2 == 4) {
            this.f292782f = iArr[1] + view.getHeight();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "maxWidth: %d, maxHeight: %d", java.lang.Integer.valueOf(this.f292781e), java.lang.Integer.valueOf(this.f292781e));
        android.widget.FrameLayout frameLayout = this.f292778b;
        frameLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.f292781e, android.view.View.MeasureSpec.getMode(Integer.MIN_VALUE)), android.view.View.MeasureSpec.makeMeasureSpec(this.f292782f, android.view.View.MeasureSpec.getMode(Integer.MIN_VALUE)));
        setWidth(java.lang.Math.min(frameLayout.getMeasuredWidth(), this.f292781e));
        setHeight(java.lang.Math.min(frameLayout.getMeasuredHeight(), this.f292782f));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "computePosition: %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "anchorLocation in Window: %d, %d", java.lang.Integer.valueOf(iArr2[0]), java.lang.Integer.valueOf(iArr2[1]));
        this.f292779c = 0;
        this.f292780d = 0;
        int ordinal3 = horizontalAlign.ordinal();
        if (ordinal3 == 0) {
            this.f292779c = (-(frameLayout.getMeasuredWidth() - view.getWidth())) / 2;
        } else if (ordinal3 == 1) {
            this.f292779c = -frameLayout.getMeasuredWidth();
        } else if (ordinal3 == 2) {
            this.f292779c = view.getWidth();
        } else if (ordinal3 == 3) {
            this.f292779c = 0;
        } else if (ordinal3 == 4) {
            this.f292779c = view.getWidth() - frameLayout.getMeasuredWidth();
        }
        int ordinal4 = verticalAlign.ordinal();
        if (ordinal4 == 0) {
            this.f292780d = (-view.getHeight()) - ((frameLayout.getMeasuredHeight() - view.getHeight()) / 2);
        } else if (ordinal4 == 1) {
            this.f292780d = ((-frameLayout.getMeasuredHeight()) - view.getHeight()) + com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        } else if (ordinal4 == 2) {
            this.f292780d -= com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        } else if (ordinal4 == 3) {
            this.f292780d = -view.getHeight();
        } else if (ordinal4 == 4) {
            this.f292780d = -frameLayout.getMeasuredHeight();
        }
        int i28 = this.f292779c + i17;
        this.f292779c = i28;
        this.f292780d += i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "res of computePosition: x=%d, y=%d", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(this.f292780d));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "will show at location [" + this.f292779c + ", " + this.f292780d + "], isShowing=" + isShowing());
        if (isShowing()) {
            update(view, this.f292779c, this.f292780d, getWidth(), getHeight());
        } else {
            showAsDropDown(view, this.f292779c, this.f292780d);
        }
    }

    @Override // android.widget.PopupWindow
    public android.view.View getContentView() {
        android.view.View childAt = this.f292778b.getChildAt(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
        return childAt;
    }

    @Override // android.widget.PopupWindow
    public void setContentView(android.view.View view) {
        android.widget.FrameLayout frameLayout = this.f292778b;
        frameLayout.removeAllViews();
        frameLayout.addView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22598x77e1a40b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f292777a = "MicroMsg.BasePopupWindow";
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f292778b = frameLayout;
        super.setContentView(frameLayout);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C22598x77e1a40b(android.view.View r3) {
        /*
            r2 = this;
            java.lang.String r0 = "contentView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            r1 = 0
            r2.<init>(r0, r1)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r2.f292778b = r0
            super.setContentView(r0)
            r2.setContentView(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.C22598x77e1a40b.<init>(android.view.View):void");
    }
}
