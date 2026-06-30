package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.o1.class)
/* loaded from: classes5.dex */
public class bj extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.o1 {

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f280359e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r2 f280360f;

    /* renamed from: g, reason: collision with root package name */
    public long f280361g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f280362h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f280363i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f280364m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f280365n;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        android.view.View c17 = this.f280113d.c(com.p314xaae8f345.mm.R.id.f565193bm2);
        this.f280359e = c17;
        if (c17 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent", "onChattingInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c17, "com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent", "onChattingInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f280361g = 0L;
        this.f280362h = "";
        this.f280364m = 0L;
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        long j17 = this.f280363i;
        if (j17 < i17 || j17 >= i17 + i18) {
            return;
        }
        m0();
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r2 r2Var;
        if (i17 == 1 && (r2Var = this.f280360f) != null && r2Var.isShowing()) {
            this.f280360f.dismiss();
        }
    }

    public void m0() {
        android.view.View view = this.f280359e;
        if (view == null) {
            return;
        }
        if (view.getVisibility() == 0) {
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, this.f280359e.getWidth(), 0.0f, 0.0f);
            translateAnimation.setDuration(300L);
            translateAnimation.setInterpolator(android.view.animation.AnimationUtils.loadInterpolator(this.f280113d.g(), android.R.anim.accelerate_interpolator));
            this.f280359e.startAnimation(translateAnimation);
            this.f280364m = 0L;
            this.f280361g = 0L;
            this.f280363i = 0L;
            this.f280362h = "";
        }
        android.view.View view2 = this.f280359e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent", "dismissMsgTongue", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent", "dismissMsgTongue", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void n0(android.view.View view, android.view.View.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r2 r2Var = this.f280360f;
        if (r2Var != null) {
            r2Var.dismiss();
            this.f280360f = null;
        }
        this.f280360f = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r2(view.getContext());
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        try {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r2 r2Var2 = this.f280360f;
            r2Var2.f284608f = iArr[0];
            r2Var2.f284609g = i65.a.b(view.getContext(), 2);
            this.f280360f.f284610h = i65.a.b(view.getContext(), 100);
            this.f280360f.a(view);
            this.f280360f.f284612j = onClickListener;
        } catch (java.lang.Throwable unused) {
        }
    }

    public void o0(int i17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21532x4955f5be c21532x4955f5be;
        android.view.View view = this.f280359e;
        if (view == null) {
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
        if (i17 == -2) {
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sm) ((sb5.j2) this.f280113d.f542241c.a(sb5.j2.class))).s0()) {
                return;
            }
            layoutParams.setMargins(0, 0, 0, this.f280113d.s().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf) * 3);
        } else {
            if (i17 == 3) {
                layoutParams.setMargins(0, 0, 0, this.f280113d.s().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf) * 3);
                return;
            }
            if (i17 == 0) {
                layoutParams.setMargins(0, 0, 0, this.f280113d.s().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf) * 3);
                return;
            }
            if (i17 != 1) {
                return;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sm smVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sm) ((sb5.j2) this.f280113d.f542241c.a(sb5.j2.class));
            int height = (!smVar.s0() || (c21532x4955f5be = smVar.f281484f) == null) ? 0 : c21532x4955f5be.getHeight();
            if (height < 0 || height <= 0) {
                height = 0;
            }
            layoutParams.setMargins(0, 0, 0, this.f280113d.s().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf) + height);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r2 r2Var = this.f280360f;
        if (r2Var != null) {
            r2Var.dismiss();
        }
    }
}
