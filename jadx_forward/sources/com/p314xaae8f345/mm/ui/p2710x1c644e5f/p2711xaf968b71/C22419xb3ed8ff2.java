package com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/ui/halfscreen/custom/CircleToSearchHalfScreen;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroid/content/Context;", "activityContext", "Ldh5/a;", "halfScreenParam", "<init>", "(Landroid/content/Context;Ldh5/a;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen */
/* loaded from: classes14.dex */
public final class C22419xb3ed8ff2 extends com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 {
    public static final /* synthetic */ int U = 0;
    public final jz5.g G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f290370J;
    public final jz5.g K;
    public final jz5.g L;
    public final jz5.g M;
    public final jz5.g N;
    public com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 P;
    public com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 Q;
    public float R;
    public final com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22420x4bdd384 S;
    public final yz5.a T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen$setHeightEventListener$1] */
    public C22419xb3ed8ff2(android.content.Context activityContext, dh5.a halfScreenParam) {
        super(activityContext, halfScreenParam);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityContext, "activityContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(halfScreenParam, "halfScreenParam");
        m7479x8cdac1b();
        this.G = jz5.h.b(new ch5.n(this));
        this.H = jz5.h.b(new ch5.s(this));
        this.I = jz5.h.b(new ch5.b0(this));
        this.f290370J = jz5.h.b(new ch5.t(this));
        this.K = jz5.h.b(new ch5.a0(this));
        this.L = jz5.h.b(new ch5.r(this));
        this.M = jz5.h.b(new ch5.v(this));
        this.N = jz5.h.b(new ch5.u(this));
        this.S = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6006xc073954f>() { // from class: com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen$setHeightEventListener$1
            {
                super(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2.this);
                this.f39173x3fe91575 = 1033669471;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6006xc073954f c6006xc073954f) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6006xc073954f event = c6006xc073954f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.bu buVar = event.f136300g;
                int i17 = buVar.f87818a;
                com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2 c22419xb3ed8ff2 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2.this;
                if (i17 != ((java.lang.Number) ((jz5.n) c22419xb3ed8ff2.N).mo141623x754a37bb()).intValue()) {
                    return false;
                }
                com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 c22418xd23ce184 = c22419xb3ed8ff2.Q;
                if (c22418xd23ce184 != null) {
                    c22418xd23ce184.b(buVar.f87819b, buVar.f87820c, new ch5.z(buVar, c22419xb3ed8ff2));
                }
                event.f136301h.f87937a = true;
                return true;
            }
        };
        this.T = new ch5.q(this);
    }

    public static final com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a C0(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2 c22419xb3ed8ff2) {
        return (com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) ((jz5.n) c22419xb3ed8ff2.L).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public void A0(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37) {
        super.A0(abstractActivityC22579xbed01a37);
        this.P = abstractActivityC22579xbed01a37;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        c0Var.f391645d = true;
        if (abstractActivityC22579xbed01a37 != null) {
            abstractActivityC22579xbed01a37.m81234x153530cc(new ch5.x(c0Var, this, abstractActivityC22579xbed01a37));
        }
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 c22418xd23ce184 = this.Q;
        if (c22418xd23ce184 != null) {
            c22418xd23ce184.m80701xdf36bd7c(new ch5.y(this));
        }
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 c22418xd23ce1842 = this.Q;
        if (c22418xd23ce1842 == null) {
            return;
        }
        c22418xd23ce1842.m80703x6e7f8925((yz5.p) ((jz5.n) this.K).mo141623x754a37bb());
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public void B0(android.view.Window window) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
        window.setWindowAnimations(0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    /* renamed from: getLayoutId */
    public int mo80693x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e0_;
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public bh5.l m0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new ch5.k(context, 0, 2, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public boolean n0() {
        return ((java.lang.Boolean) ((jz5.n) this.M).mo141623x754a37bb()).booleanValue();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
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
            window.setNavigationBarColor(this.f290337e.o() ? 0 : -16777216);
        }
        return mo2553xb69168e3;
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflaterOri, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflaterOri, "inflaterOri");
        android.view.View mo7503x18bad100 = super.mo7503x18bad100(inflaterOri, viewGroup, bundle);
        mo7503x18bad100.setOnClickListener(null);
        mo7503x18bad100.setClickable(false);
        return mo7503x18bad100;
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7, p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialog) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        super.onDismiss(dialog);
        ((ch5.q) this.T).mo152xb9724478();
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
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 c22418xd23ce184;
        android.view.ViewGroup.LayoutParams layoutParams;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        if (!((java.lang.Boolean) ((jz5.n) this.H).mo141623x754a37bb()).booleanValue() || (c22418xd23ce184 = (com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184) t0().findViewById(com.p314xaae8f345.mm.R.id.u19)) == null) {
            c22418xd23ce184 = null;
        } else {
            c22418xd23ce184.f290362f = o0();
            int intValue = ((java.lang.Number) ((jz5.n) this.G).mo141623x754a37bb()).intValue();
            c22418xd23ce184.f290366m = intValue - 10;
            android.view.View view2 = c22418xd23ce184.f290362f;
            if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
                layoutParams.height = intValue;
                android.view.View view3 = c22418xd23ce184.f290362f;
                if (view3 != null) {
                    view3.setLayoutParams(layoutParams);
                }
            }
            c22418xd23ce184.m80704xcd832def(new ch5.l(this));
            c22418xd23ce184.m80702x54f1d05(new ch5.m(this));
        }
        this.Q = c22418xd23ce184;
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public int p0() {
        return ((java.lang.Number) ((jz5.n) this.G).mo141623x754a37bb()).intValue();
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public int q0() {
        return -16777216;
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public float s0() {
        return 0.0f;
    }
}
