package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1297xed8e89a9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/profile/BizContactInfoDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroidx/lifecycle/x;", "Lyr1/n;", "Ljz5/f0;", "onFragmentViewCreate", "Landroid/content/Context;", "activityContext", "Landroid/content/Intent;", "intent", "<init>", "(Landroid/content/Context;Landroid/content/Intent;)V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment */
/* loaded from: classes14.dex */
public final class C12995x6d6be93 extends p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 implements p012xc85e97e9.p093xedfae76a.x, yr1.n {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f175600s = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f175601d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f175602e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f175603f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 f175604g;

    /* renamed from: h, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c f175605h;

    /* renamed from: i, reason: collision with root package name */
    public yr1.k f175606i;

    /* renamed from: m, reason: collision with root package name */
    public int f175607m;

    /* renamed from: n, reason: collision with root package name */
    public float f175608n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a f175609o;

    /* renamed from: p, reason: collision with root package name */
    public int f175610p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f175611q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Runnable f175612r;

    public C12995x6d6be93(android.content.Context activityContext, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityContext, "activityContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        this.f175601d = activityContext;
        this.f175602e = intent;
        this.f175612r = new yr1.j(this);
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
        android.view.View inflate = inflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a47, (android.view.ViewGroup) null);
        android.app.Dialog m7393x15b1203e = m7393x15b1203e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m7393x15b1203e);
        m7393x15b1203e.requestWindowFeature(1);
        android.app.Dialog m7393x15b1203e2 = m7393x15b1203e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m7393x15b1203e2);
        android.view.Window window = m7393x15b1203e2.getWindow();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(window);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575680ff);
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 80;
        if (this.f175611q) {
            attributes.dimAmount = 0.5f;
            attributes.flags |= 2;
        }
        window.setAttributes(attributes);
        window.setLayout(-1, -2);
        fq1.e.f347040a.g(window.getDecorView(), i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12), true, false);
        window.setBackgroundDrawableResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.getDecorView().setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        this.f175603f = inflate;
        android.app.Dialog m7393x15b1203e3 = m7393x15b1203e();
        if (m7393x15b1203e3 != null) {
            m7393x15b1203e3.setOnShowListener(new yr1.b(this));
        }
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        android.view.View view = this.f175603f;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        view.removeCallbacks(this.f175612r);
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f175604g;
        if (c22584xf7d97e83 != null) {
            c22584xf7d97e83.mo273xed6858b4().c(this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("profileFragment");
            throw null;
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialog) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        super.onDismiss(dialog);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).w8(this);
        float f17 = this.f175608n;
        if (f17 < 1.0f) {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.addUpdateListener(new yr1.c(this));
            ofFloat.start();
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f175609o;
        if (aVar != null) {
            aVar.a(1.0f);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar2 = this.f175609o;
        if (aVar2 != null) {
            aVar2.c(false, false, 0);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar3 = this.f175609o;
        if (aVar3 != null) {
            aVar3.b();
        }
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: onFragmentViewCreate */
    public final void m54326x10f242b0() {
        if (this.f175605h == null) {
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f175604g;
            if (c22584xf7d97e83 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("profileFragment");
                throw null;
            }
            android.view.View view = c22584xf7d97e83.f292670i;
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = view != null ? (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view.findViewWithTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#AppBarLayout") : null;
            this.f175605h = c2678xa407981c;
            if (c2678xa407981c != null) {
                c2678xa407981c.a(new yr1.d(this));
            }
        }
        if (this.f175606i == null) {
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e832 = this.f175604g;
            if (c22584xf7d97e832 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("profileFragment");
                throw null;
            }
            android.view.View view2 = c22584xf7d97e832.f292670i;
            android.view.View findViewWithTag = view2 != null ? view2.findViewWithTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#DragBarContainer") : null;
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e833 = this.f175604g;
            if (c22584xf7d97e833 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("profileFragment");
                throw null;
            }
            android.view.View view3 = c22584xf7d97e833.f292670i;
            android.view.View findViewWithTag2 = view3 != null ? view3.findViewWithTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#DragBarLine") : null;
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e834 = this.f175604g;
            if (c22584xf7d97e834 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("profileFragment");
                throw null;
            }
            android.view.View view4 = c22584xf7d97e834.f292670i;
            android.view.View findViewWithTag3 = view4 != null ? view4.findViewWithTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#DragBarArrow") : null;
            if (findViewWithTag == null || findViewWithTag2 == null || findViewWithTag3 == null) {
                return;
            }
            this.f175606i = new yr1.k(findViewWithTag, findViewWithTag2, findViewWithTag3);
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
        android.view.View view = this.f175603f;
        if (view != null) {
            view.postDelayed(this.f175612r, 200L);
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
        int k17 = i65.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        android.view.View view3 = this.f175603f;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        int i17 = this.f175610p;
        if (i17 <= 0) {
            i17 = (int) (k17 * 0.75d);
        }
        layoutParams.height = i17;
        android.view.View view4 = this.f175603f;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        view4.setLayoutParams(layoutParams);
        android.view.View view5 = this.f175603f;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        view5.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307);
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = m7437x54c0aef7().m7630xb2c12e75();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 b17 = lk5.q0.b("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI", this.f175602e, false, 4, null);
        this.f175604g = b17;
        b17.q0(new yr1.f(this));
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f175604g;
        if (c22584xf7d97e83 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("profileFragment");
            throw null;
        }
        c22584xf7d97e83.mo273xed6858b4().a(this);
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e832 = this.f175604g;
        if (c22584xf7d97e832 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("profileFragment");
            throw null;
        }
        m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.akg, c22584xf7d97e832, null);
        m7630xb2c12e75.e();
        android.app.Dialog m7393x15b1203e2 = m7393x15b1203e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m7393x15b1203e2);
        android.view.Window window = m7393x15b1203e2.getWindow();
        android.view.View decorView = window != null ? window.getDecorView() : null;
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            yr1.m mVar = new yr1.m(this.f175601d, viewGroup, new yr1.g(this), new yr1.h(this));
            mVar.m177547x752e47c8(new yr1.i(this));
            mVar.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
            android.view.ViewGroup viewGroup2 = mVar.f546183d;
            android.view.View childAt = viewGroup2.getChildAt(0);
            mVar.f546186g = childAt;
            viewGroup2.removeView(childAt);
            mVar.addView(mVar.f546186g);
            viewGroup2.addView(mVar);
            fq1.e.f347040a.g(mVar.f546186g, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12), true, false);
            int k18 = i65.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            mVar.f546189m = k18;
            mVar.f546188i = k18 * 0.3f;
        }
    }
}
