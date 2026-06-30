package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class x1 extends me.imid.swipebacklayout.lib.SwipeBackLayout implements android.content.DialogInterface {
    public android.content.DialogInterface.OnClickListener G;
    public android.content.DialogInterface.OnClickListener H;
    public android.view.animation.Animation I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.animation.Animation f87242J;
    public com.tencent.mm.plugin.appbrand.page.i3 K;
    public final al1.b L;
    public final android.widget.ImageView M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(android.content.Context context) {
        super(context, null);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.appbrand.page.ve.a(this);
        c(new com.tencent.mm.plugin.appbrand.page.q1(this));
        vj5.h hVar = new vj5.h(context);
        hVar.setClickable(true);
        hVar.setBackgroundColor(-1);
        hVar.setWillNotDraw(false);
        hVar.s(false);
        hVar.B(0, true, true);
        addView(hVar, new android.view.ViewGroup.LayoutParams(-1, -1));
        setContentView(hVar);
        al1.b bVar = new al1.b(context);
        bVar.setFullscreenMode(false);
        bVar.setBackButtonClickListener(new com.tencent.mm.plugin.appbrand.page.r1(this));
        bVar.setCloseButtonClickListener(new com.tencent.mm.plugin.appbrand.page.s1(this));
        hVar.addView(bVar, new android.widget.FrameLayout.LayoutParams(-1, com.tencent.mm.plugin.appbrand.widget.b.a(context)));
        this.L = bVar;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488053fk, (android.view.ViewGroup) hVar, false);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483111wv)).setText(com.tencent.mm.R.string.f490199nq);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483109wt)).setText(com.tencent.mm.R.string.f490198np);
        hVar.addView(inflate);
        android.view.ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = com.tencent.mm.plugin.appbrand.widget.b.a(context);
        }
        this.M = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483110wu);
        findViewById(com.tencent.mm.R.id.f483109wt).setOnClickListener(new com.tencent.mm.plugin.appbrand.page.t1(this));
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        dismiss();
        android.content.DialogInterface.OnClickListener onClickListener = this.H;
        if (onClickListener != null) {
            onClickListener.onClick(this, -2);
        }
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        android.view.animation.Animation animation = this.I;
        if (animation != null) {
            animation.cancel();
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.ui.uc.f211081d);
        this.I = loadAnimation;
        kotlin.jvm.internal.o.d(loadAnimation);
        loadAnimation.setAnimationListener(new com.tencent.mm.plugin.appbrand.page.v1(this));
        android.view.animation.Animation animation2 = this.I;
        kotlin.jvm.internal.o.d(animation2);
        startAnimation(animation2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent keyEvent) {
        if (this.I != null || this.f87242J != null) {
            return true;
        }
        boolean z17 = false;
        if (keyEvent != null && keyEvent.getAction() == 0) {
            if (keyEvent != null && keyEvent.getKeyCode() == 4) {
                z17 = true;
            }
            if (z17) {
                nf.o.a(getContext());
                dismiss();
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // me.imid.swipebacklayout.lib.SwipeBackLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.I == null && this.f87242J == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public final android.content.DialogInterface.OnClickListener getNegativeButton() {
        return this.H;
    }

    public final android.content.DialogInterface.OnClickListener getPositiveButton() {
        return this.G;
    }

    public final void i() {
        android.view.animation.Animation animation = getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        android.view.animation.Animation animation2 = getAnimation();
        if (animation2 != null) {
            animation2.setAnimationListener(null);
        }
        android.view.ViewParent parent = getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        al1.b bVar = this.L;
        if (bVar != null) {
            bVar.f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = null;
        this.H = null;
        this.I = null;
        this.f87242J = null;
        this.K = null;
    }

    public final void setNegativeButton(android.content.DialogInterface.OnClickListener onClickListener) {
        this.H = onClickListener;
    }

    public final void setPositiveButton(android.content.DialogInterface.OnClickListener onClickListener) {
        this.G = onClickListener;
    }
}
