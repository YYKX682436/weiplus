package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/ting/TingPlayerHalfProfileDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onFragmentViewCreate", "Landroid/content/Context;", "activityContext", "Landroid/content/Intent;", "intent", "Lrk4/z5;", "tingPlayerHalfProfileDialogType", "<init>", "(Landroid/content/Context;Landroid/content/Intent;Lrk4/z5;)V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ting.TingPlayerHalfProfileDialogFragment */
/* loaded from: classes14.dex */
public final class C18710x505d67f extends p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f256161p = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f256162d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f256163e;

    /* renamed from: f, reason: collision with root package name */
    public final rk4.z5 f256164f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f256165g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 f256166h;

    /* renamed from: i, reason: collision with root package name */
    public int f256167i;

    /* renamed from: m, reason: collision with root package name */
    public float f256168m;

    /* renamed from: n, reason: collision with root package name */
    public m40.p0 f256169n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f256170o;

    public C18710x505d67f(android.content.Context activityContext, android.content.Intent intent, rk4.z5 tingPlayerHalfProfileDialogType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityContext, "activityContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingPlayerHalfProfileDialogType, "tingPlayerHalfProfileDialogType");
        this.f256162d = activityContext;
        this.f256163e = intent;
        this.f256164f = tingPlayerHalfProfileDialogType;
        this.f256170o = new rk4.y5(this);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        m7412x53b6de6f(2, android.R.style.Theme.Translucent);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a4a, (android.view.ViewGroup) null);
        android.app.Dialog m7393x15b1203e = m7393x15b1203e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m7393x15b1203e);
        m7393x15b1203e.requestWindowFeature(1);
        android.app.Dialog m7393x15b1203e2 = m7393x15b1203e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m7393x15b1203e2);
        android.view.Window window = m7393x15b1203e2.getWindow();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(window);
        window.requestFeature(1);
        window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575680ff);
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        java.lang.Object systemService = mo7430x19263085 != null ? mo7430x19263085.getSystemService("window") : null;
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        android.view.Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        android.graphics.Point point = new android.graphics.Point();
        if (defaultDisplay != null) {
            defaultDisplay.getRealSize(point);
        }
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = (int) (point.y * 0.0d);
        attributes.gravity = 80;
        window.setAttributes(attributes);
        android.view.View decorView = window.getDecorView();
        float b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12);
        if (decorView != null) {
            decorView.setOutlineProvider(new zl5.a(true, false, b17));
        }
        if (decorView != null) {
            decorView.setClipToOutline(true);
        }
        window.setBackgroundDrawableResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.getDecorView().setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        this.f256165g = inflate;
        android.app.Dialog m7393x15b1203e3 = m7393x15b1203e();
        if (m7393x15b1203e3 != null) {
            m7393x15b1203e3.setOnShowListener(new rk4.q5(this));
        }
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        android.view.View view = this.f256165g;
        if (view != null) {
            view.removeCallbacks(this.f256170o);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialog) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        super.onDismiss(dialog);
        float f17 = this.f256168m;
        if (f17 >= 1.0f) {
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new rk4.r5(this));
        ofFloat.start();
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: onFragmentViewCreate */
    public final void m72052x10f242b0() {
        if (this.f256164f == rk4.z5.f478660e) {
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f256166h;
            if (c22584xf7d97e83 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("profileFragment");
                throw null;
            }
            android.view.View view = c22584xf7d97e83.f292670i;
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = view != null ? (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view.findViewWithTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#AppBarLayout") : null;
            if (c2678xa407981c != null) {
                c2678xa407981c.a(new rk4.s5(this));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        android.view.Window window;
        super.mo7512xb01dfb57();
        android.app.Dialog m7393x15b1203e = m7393x15b1203e();
        if (m7393x15b1203e == null || (window = m7393x15b1203e.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(0);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        android.view.View view = this.f256165g;
        if (view != null) {
            view.postDelayed(this.f256170o, 200L);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        android.app.Dialog m7393x15b1203e = m7393x15b1203e();
        if (m7393x15b1203e != null) {
            m7393x15b1203e.setCanceledOnTouchOutside(true);
        }
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view2 != null) {
            view2.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        }
        android.view.View view3 = this.f256165g;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        layoutParams.height = -1;
        android.view.View view4 = this.f256165g;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        view4.setLayoutParams(layoutParams);
        android.view.View view5 = this.f256165g;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        view5.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307);
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = m7437x54c0aef7().m7630xb2c12e75();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 b17 = lk5.q0.b(this.f256164f == rk4.z5.f478659d ? "com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI" : "com.tencent.mm.plugin.profile.ui.DialogContactInfoUI", this.f256163e, false, 4, null);
        this.f256166h = b17;
        b17.q0(new rk4.u5(this));
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f256166h;
        if (c22584xf7d97e83 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("profileFragment");
            throw null;
        }
        c22584xf7d97e83.mo273xed6858b4().a(this);
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e832 = this.f256166h;
        if (c22584xf7d97e832 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("profileFragment");
            throw null;
        }
        m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.l8l, c22584xf7d97e832, null);
        m7630xb2c12e75.e();
        android.app.Dialog m7393x15b1203e2 = m7393x15b1203e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m7393x15b1203e2);
        android.view.Window window = m7393x15b1203e2.getWindow();
        android.view.View decorView = window != null ? window.getDecorView() : null;
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            lm4.d dVar = new lm4.d(this.f256162d, viewGroup, new rk4.v5(this), new rk4.w5(this));
            dVar.m146059x752e47c8(new rk4.x5(this));
            dVar.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
            android.view.ViewGroup viewGroup2 = dVar.f401080d;
            android.view.View childAt = viewGroup2.getChildAt(0);
            dVar.f401083g = childAt;
            viewGroup2.removeView(childAt);
            dVar.addView(dVar.f401083g);
            viewGroup2.addView(dVar);
            android.view.View view6 = dVar.f401083g;
            float b18 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12);
            if (b18 > 0.0f) {
                if (view6 != null) {
                    view6.setOutlineProvider(new lm4.c(true, false, b18));
                }
                if (view6 != null) {
                    view6.setClipToOutline(true);
                }
            }
            int k17 = i65.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            dVar.f401086m = k17;
            dVar.f401085i = k17 * 0.3f;
        }
    }
}
