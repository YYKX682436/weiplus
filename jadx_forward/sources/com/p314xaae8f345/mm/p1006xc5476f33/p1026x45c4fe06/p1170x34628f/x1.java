package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class x1 extends me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab implements android.content.DialogInterface {
    public android.content.DialogInterface.OnClickListener G;
    public android.content.DialogInterface.OnClickListener H;
    public android.view.animation.Animation I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.animation.Animation f168775J;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 K;
    public final al1.b L;
    public final android.widget.ImageView M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(android.content.Context context) {
        super(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ve.a(this);
        c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.q1(this));
        vj5.h hVar = new vj5.h(context);
        hVar.setClickable(true);
        hVar.setBackgroundColor(-1);
        hVar.setWillNotDraw(false);
        hVar.s(false);
        hVar.B(0, true, true);
        addView(hVar, new android.view.ViewGroup.LayoutParams(-1, -1));
        m147196x590ab8fc(hVar);
        al1.b bVar = new al1.b(context);
        bVar.m2222xad580900(false);
        bVar.mo2215x1ae0b121(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r1(this));
        bVar.mo2218x262881b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.s1(this));
        hVar.addView(bVar, new android.widget.FrameLayout.LayoutParams(-1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.b.a(context)));
        this.L = bVar;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569586fk, (android.view.ViewGroup) hVar, false);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564644wv)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571732nq);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564642wt)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571731np);
        hVar.addView(inflate);
        android.view.ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.b.a(context);
        }
        this.M = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564643wu);
        findViewById(com.p314xaae8f345.mm.R.id.f564642wt).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t1(this));
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
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.ui.uc.f292614d);
        this.I = loadAnimation;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(loadAnimation);
        loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v1(this));
        android.view.animation.Animation animation2 = this.I;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(animation2);
        startAnimation(animation2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent keyEvent) {
        if (this.I != null || this.f168775J != null) {
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

    @Override // me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.I == null && this.f168775J == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    /* renamed from: getNegativeButton */
    public final android.content.DialogInterface.OnClickListener m52246x51f730bd() {
        return this.H;
    }

    /* renamed from: getPositiveButton */
    public final android.content.DialogInterface.OnClickListener m52247x6a4a5b81() {
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
        this.f168775J = null;
        this.K = null;
    }

    /* renamed from: setNegativeButton */
    public final void m52248x19ed98c9(android.content.DialogInterface.OnClickListener onClickListener) {
        this.H = onClickListener;
    }

    /* renamed from: setPositiveButton */
    public final void m52249x3240c38d(android.content.DialogInterface.OnClickListener onClickListener) {
        this.G = onClickListener;
    }
}
