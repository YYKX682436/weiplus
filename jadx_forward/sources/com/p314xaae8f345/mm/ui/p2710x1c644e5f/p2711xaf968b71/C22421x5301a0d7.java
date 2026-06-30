package com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/ui/halfscreen/custom/MPWebSearchHomeHalfScreen;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroid/content/Context;", "activityContext", "Ldh5/a;", "halfScreenParam", "<init>", "(Landroid/content/Context;Ldh5/a;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen */
/* loaded from: classes14.dex */
public final class C22421x5301a0d7 extends com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 {
    public static final /* synthetic */ int Z = 0;
    public final jz5.g G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f290372J;
    public final jz5.g K;
    public final jz5.g L;
    public final jz5.g M;
    public final jz5.g N;
    public com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c P;
    public float Q;
    public final jz5.g R;
    public final double S;
    public float T;
    public float U;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d V;
    public final com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22423xc31e3f W;
    public final android.content.DialogInterface.OnShowListener X;
    public final yz5.a Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen$setHeightEventListener$1] */
    public C22421x5301a0d7(android.content.Context activityContext, dh5.a halfScreenParam) {
        super(activityContext, halfScreenParam);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityContext, "activityContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(halfScreenParam, "halfScreenParam");
        this.G = jz5.h.b(new ch5.h0(this));
        this.H = jz5.h.b(new ch5.m0(this));
        this.I = jz5.h.b(new ch5.a1(this));
        this.f290372J = jz5.h.b(new ch5.n0(this));
        this.K = jz5.h.b(new ch5.z0(this));
        this.L = jz5.h.b(new ch5.l0(this));
        this.M = jz5.h.b(new ch5.o0(this));
        this.N = jz5.h.b(new ch5.p0(this));
        this.R = jz5.h.b(new ch5.v0(activityContext));
        this.S = m80692x1e885992().getDoubleExtra("INTENT_KEY_HALFSCREEN_HEIGHT_RATIO", 0.75d);
        this.V = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6007x3510c55a>() { // from class: com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen$eventListener$1
            {
                super(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7.this);
                this.f39173x3fe91575 = 1560711498;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6007x3510c55a c6007x3510c55a) {
                android.view.Window window;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6007x3510c55a event = c6007x3510c55a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                android.app.Dialog m7393x15b1203e = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7.this.m7393x15b1203e();
                if (m7393x15b1203e != null && (window = m7393x15b1203e.getWindow()) != null) {
                    window.setWindowAnimations(0);
                }
                return false;
            }
        };
        this.W = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6006xc073954f>() { // from class: com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen$setHeightEventListener$1
            {
                super(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7.this);
                this.f39173x3fe91575 = 1033669471;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6006xc073954f c6006xc073954f) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6006xc073954f event = c6006xc073954f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.bu buVar = event.f136300g;
                int i17 = buVar.f87818a;
                com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 c22421x5301a0d7 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7.this;
                if (i17 != ((java.lang.Number) ((jz5.n) c22421x5301a0d7.M).mo141623x754a37bb()).intValue()) {
                    return false;
                }
                com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c c22426x8efb1b1c = c22421x5301a0d7.P;
                if (c22426x8efb1b1c != null) {
                    float f17 = buVar.f87821d;
                    float f18 = buVar.f87819b;
                    float f19 = buVar.f87820c;
                    c22426x8efb1b1c.f290384p = buVar.f87822e;
                    if (f17 >= 0.0f || f18 > 0.0f) {
                        pm0.v.X(new ch5.l1(f17, c22426x8efb1b1c, f18, f19));
                    }
                    event.f136301h.f87937a = true;
                }
                return true;
            }
        };
        this.X = new ch5.y0(this);
        this.Y = new ch5.k0(this);
    }

    public static final com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a C0(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 c22421x5301a0d7) {
        return (com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) ((jz5.n) c22421x5301a0d7.L).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public void A0(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37) {
        super.A0(abstractActivityC22579xbed01a37);
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c c22426x8efb1b1c = this.P;
        if (c22426x8efb1b1c != null) {
            c22426x8efb1b1c.m80714x4e740634(new ch5.q0(this));
        }
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c c22426x8efb1b1c2 = this.P;
        if (c22426x8efb1b1c2 == null) {
            return;
        }
        c22426x8efb1b1c2.m80717x6e7f8925(new ch5.r0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public void B0(android.view.Window window) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
        window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575680ff);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8
    /* renamed from: dismiss */
    public void mo7391x63a3b28a() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        super.mo7391x63a3b28a();
        android.view.View view = (android.view.View) ((jz5.n) this.R).mo141623x754a37bb();
        if (view == null || (animate = view.animate()) == null || (alpha = animate.alpha(0.0f)) == null) {
            return;
        }
        alpha.setInterpolator(ta5.h.f498412a.a());
        alpha.setDuration(300L);
        alpha.start();
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    /* renamed from: getLayoutId */
    public int mo80693x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.efe;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        this.V.mo48813x58998cd();
        mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7, p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8
    /* renamed from: onCreateDialog */
    public android.app.Dialog mo2553xb69168e3(android.os.Bundle bundle) {
        android.app.Dialog mo2553xb69168e3 = super.mo2553xb69168e3(bundle);
        android.view.Window window = mo2553xb69168e3.getWindow();
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(q0());
        }
        return mo2553xb69168e3;
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        this.V.mo48814x2efc64();
        mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7, p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialog) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        super.onDismiss(dialog);
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c c22426x8efb1b1c = this.P;
        if (c22426x8efb1b1c != null) {
            c22426x8efb1b1c.m80719x4649918c(null);
        }
        ((ch5.k0) this.Y).mo152xb9724478();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        yz5.l lVar = (yz5.l) ((jz5.n) this.I).mo141623x754a37bb();
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        yz5.l lVar = (yz5.l) ((jz5.n) this.I).mo141623x754a37bb();
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c c22426x8efb1b1c;
        int c17;
        int c18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        n3.m0.a(view, new ch5.s0(this));
        if (!((java.lang.Boolean) ((jz5.n) this.H).mo141623x754a37bb()).booleanValue() || (c22426x8efb1b1c = (com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c) t0().findViewById(com.p314xaae8f345.mm.R.id.u19)) == null) {
            c22426x8efb1b1c = null;
        } else {
            int p07 = p0();
            android.content.Context mo7438x76847179 = mo7438x76847179();
            if (mo7438x76847179 == null) {
                mo7438x76847179 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            if (com.p314xaae8f345.mm.ui.b4.c(mo7438x76847179)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7438x76847179);
                c17 = com.p314xaae8f345.mm.ui.cl.c(mo7438x76847179);
            } else {
                c17 = com.p314xaae8f345.mm.ui.bl.c(mo7438x76847179);
            }
            int w07 = (int) ((w0() - c17) * this.S);
            c22426x8efb1b1c.f290375d = p07 - w07;
            c22426x8efb1b1c.f290376e = w07;
            c22426x8efb1b1c.f290379h = o0();
            c22426x8efb1b1c.f290383o = p07;
            c22426x8efb1b1c.f290384p = true;
            c22426x8efb1b1c.getViewTreeObserver().addOnGlobalLayoutListener(new ch5.f1(c22426x8efb1b1c));
            android.view.View o07 = o0();
            android.content.Context mo7438x768471792 = mo7438x76847179();
            if (mo7438x768471792 == null) {
                mo7438x768471792 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            if (com.p314xaae8f345.mm.ui.b4.c(mo7438x768471792)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7438x768471792);
                c18 = com.p314xaae8f345.mm.ui.cl.c(mo7438x768471792);
            } else {
                c18 = com.p314xaae8f345.mm.ui.bl.c(mo7438x768471792);
            }
            o07.setTranslationY(p07 - ((int) ((w0() - c18) * r3)));
            c22426x8efb1b1c.m80718xcd832def(new ch5.e0(this));
            c22426x8efb1b1c.m80716x54f1d05(new ch5.f0(this));
        }
        this.P = c22426x8efb1b1c;
        if (c22426x8efb1b1c != null) {
            c22426x8efb1b1c.m80719x4649918c(new ch5.g0(this));
        }
        tk5.a b17 = u0().b();
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = b17 instanceof com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 ? (com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) b17 : null;
        if (c22584xf7d97e83 != null) {
            c22584xf7d97e83.q0(new ch5.u0(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public int p0() {
        int c17;
        android.content.Context mo7438x76847179 = mo7438x76847179();
        if (mo7438x76847179 == null) {
            mo7438x76847179 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        if (com.p314xaae8f345.mm.ui.b4.c(mo7438x76847179)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7438x76847179);
            c17 = com.p314xaae8f345.mm.ui.cl.c(mo7438x76847179);
        } else {
            c17 = com.p314xaae8f345.mm.ui.bl.c(mo7438x76847179);
        }
        return w0() - c17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public float s0() {
        return 0.0f;
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    /* renamed from: x0, reason: from getter */
    public android.content.DialogInterface.OnShowListener getX() {
        return this.X;
    }
}
