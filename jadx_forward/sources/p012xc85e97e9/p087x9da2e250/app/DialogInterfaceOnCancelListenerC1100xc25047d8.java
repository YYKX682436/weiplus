package p012xc85e97e9.p087x9da2e250.app;

/* renamed from: androidx.fragment.app.DialogFragment */
/* loaded from: classes14.dex */
public class DialogInterfaceOnCancelListenerC1100xc25047d8 extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {

    /* renamed from: SAVED_BACK_STACK_ID */
    private static final java.lang.String f3376xa931fad2 = "android:backStackId";

    /* renamed from: SAVED_CANCELABLE */
    private static final java.lang.String f3377xf6638bac = "android:cancelable";

    /* renamed from: SAVED_DIALOG_STATE_TAG */
    private static final java.lang.String f3378x6424374d = "android:savedDialogState";

    /* renamed from: SAVED_INTERNAL_DIALOG_SHOWING */
    private static final java.lang.String f3379x10451798 = "android:dialogShowing";

    /* renamed from: SAVED_SHOWS_DIALOG */
    private static final java.lang.String f3380xa38fd389 = "android:showsDialog";

    /* renamed from: SAVED_STYLE */
    private static final java.lang.String f3381xcf7755b9 = "android:style";

    /* renamed from: SAVED_THEME */
    private static final java.lang.String f3382xcf7fadd1 = "android:theme";

    /* renamed from: STYLE_NORMAL */
    public static final int f3383x76375355 = 0;

    /* renamed from: STYLE_NO_FRAME */
    public static final int f3384xdb83c83d = 2;

    /* renamed from: STYLE_NO_INPUT */
    public static final int f3385xdbac769a = 3;

    /* renamed from: STYLE_NO_TITLE */
    public static final int f3386xdc454128 = 1;

    /* renamed from: mCreatingDialog */
    private boolean f3389xf049b32e;

    /* renamed from: mDialog */
    private android.app.Dialog f3390x62415;

    /* renamed from: mDismissed */
    private boolean f3393x84388ebc;

    /* renamed from: mHandler */
    private android.os.Handler f3394xc7640a1d;

    /* renamed from: mShownByMe */
    private boolean f3398xa01af13;

    /* renamed from: mViewDestroyed */
    private boolean f3402xad8bad87;

    /* renamed from: mDismissRunnable */
    private java.lang.Runnable f3392x97adef9a = new p012xc85e97e9.p087x9da2e250.app.q(this);

    /* renamed from: mOnCancelListener */
    private android.content.DialogInterface.OnCancelListener f3396x3205af9a = new p012xc85e97e9.p087x9da2e250.app.r(this);

    /* renamed from: mOnDismissListener */
    private android.content.DialogInterface.OnDismissListener f3397x2e958892 = new p012xc85e97e9.p087x9da2e250.app.s(this);

    /* renamed from: mStyle */
    private int f3400xbec86944 = 0;

    /* renamed from: mTheme */
    private int f3401xbed0c15c = 0;

    /* renamed from: mCancelable */
    private boolean f3388x4cc9ef21 = true;

    /* renamed from: mShowsDialog */
    private boolean f3399x9b62d751 = true;

    /* renamed from: mBackStackId */
    private int f3387xed1eec2f = -1;

    /* renamed from: mObserver */
    private p012xc85e97e9.p093xedfae76a.k0 f3395x39c4fa63 = new p012xc85e97e9.p087x9da2e250.app.t(this);

    /* renamed from: mDialogCreated */
    private boolean f3391xdd892113 = false;

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: createFragmentContainer */
    public p012xc85e97e9.p087x9da2e250.app.s0 mo7390x234f5a75() {
        return new p012xc85e97e9.p087x9da2e250.app.u(this, super.mo7390x234f5a75());
    }

    /* renamed from: dismiss */
    public void mo7391x63a3b28a() {
        j0(false, false);
    }

    /* renamed from: dismissAllowingStateLoss */
    public void m7392x1eb145f1() {
        j0(true, false);
    }

    /* renamed from: getDialog */
    public android.app.Dialog m7393x15b1203e() {
        return this.f3390x62415;
    }

    /* renamed from: getShowsDialog */
    public boolean m7394xcb2c0cc8() {
        return this.f3399x9b62d751;
    }

    /* renamed from: getTheme */
    public int mo7395x75311c13() {
        return this.f3401xbed0c15c;
    }

    /* renamed from: isCancelable */
    public boolean m7396xf202f39e() {
        return this.f3388x4cc9ef21;
    }

    public final void j0(boolean z17, boolean z18) {
        if (this.f3393x84388ebc) {
            return;
        }
        this.f3393x84388ebc = true;
        this.f3398xa01af13 = false;
        android.app.Dialog dialog = this.f3390x62415;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f3390x62415.dismiss();
            if (!z18) {
                if (android.os.Looper.myLooper() == this.f3394xc7640a1d.getLooper()) {
                    onDismiss(this.f3390x62415);
                } else {
                    this.f3394xc7640a1d.post(this.f3392x97adef9a);
                }
            }
        }
        this.f3402xad8bad87 = true;
        if (this.f3387xed1eec2f >= 0) {
            m7454x171a637d().m7703x93613e90(this.f3387xed1eec2f, 1);
            this.f3387xed1eec2f = -1;
            return;
        }
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = m7454x171a637d().m7630xb2c12e75();
        m7630xb2c12e75.j(this);
        if (z17) {
            m7630xb2c12e75.e();
        } else {
            m7630xb2c12e75.d();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onAttach */
    public void mo7397x3b13c504(android.content.Context context) {
        super.mo7397x3b13c504(context);
        m7476x3136103a().mo7807xc74540ab(this.f3395x39c4fa63);
        if (this.f3398xa01af13) {
            return;
        }
        this.f3393x84388ebc = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        this.f3394xc7640a1d = new android.os.Handler();
        this.f3399x9b62d751 = this.f3421xb66d4acf == 0;
        if (bundle != null) {
            this.f3400xbec86944 = bundle.getInt(f3381xcf7755b9, 0);
            this.f3401xbed0c15c = bundle.getInt(f3382xcf7fadd1, 0);
            this.f3388x4cc9ef21 = bundle.getBoolean(f3377xf6638bac, true);
            this.f3399x9b62d751 = bundle.getBoolean(f3380xa38fd389, this.f3399x9b62d751);
            this.f3387xed1eec2f = bundle.getInt(f3376xa931fad2, -1);
        }
    }

    /* renamed from: onCreateDialog */
    public android.app.Dialog mo2553xb69168e3(android.os.Bundle bundle) {
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(3)) {
            mo7591x9616526c();
        }
        return new android.app.Dialog(m7550xf0c4608a(), mo7395x75311c13());
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        super.mo7399xa6664a60();
        android.app.Dialog dialog = this.f3390x62415;
        if (dialog != null) {
            this.f3402xad8bad87 = true;
            dialog.setOnDismissListener(null);
            this.f3390x62415.dismiss();
            if (!this.f3393x84388ebc) {
                onDismiss(this.f3390x62415);
            }
            this.f3390x62415 = null;
            this.f3391xdd892113 = false;
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDetach */
    public void mo7400x3f5eee52() {
        super.mo7400x3f5eee52();
        if (!this.f3398xa01af13 && !this.f3393x84388ebc) {
            this.f3393x84388ebc = true;
        }
        m7476x3136103a().mo522xb5bdeb7a(this.f3395x39c4fa63);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        if (this.f3402xad8bad87) {
            return;
        }
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(3)) {
            mo7591x9616526c();
        }
        j0(true, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: onFindViewById */
    public android.view.View m7401xc53b4c6f(int i17) {
        android.app.Dialog dialog = this.f3390x62415;
        if (dialog != null) {
            return dialog.findViewById(i17);
        }
        return null;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onGetLayoutInflater */
    public android.view.LayoutInflater mo7402x3b271d6c(android.os.Bundle bundle) {
        android.view.LayoutInflater mo7402x3b271d6c = super.mo7402x3b271d6c(bundle);
        boolean z17 = this.f3399x9b62d751;
        if (!z17 || this.f3389xf049b32e) {
            if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                new java.lang.StringBuilder("getting layout inflater for DialogFragment ").append(this);
            }
            return mo7402x3b271d6c;
        }
        if (z17 && !this.f3391xdd892113) {
            try {
                this.f3389xf049b32e = true;
                android.app.Dialog mo2553xb69168e3 = mo2553xb69168e3(bundle);
                this.f3390x62415 = mo2553xb69168e3;
                if (this.f3399x9b62d751) {
                    mo2554x8b5a9225(mo2553xb69168e3, this.f3400xbec86944);
                    android.content.Context mo7438x76847179 = mo7438x76847179();
                    if (mo7438x76847179 instanceof android.app.Activity) {
                        this.f3390x62415.setOwnerActivity((android.app.Activity) mo7438x76847179);
                    }
                    this.f3390x62415.setCancelable(this.f3388x4cc9ef21);
                    this.f3390x62415.setOnCancelListener(this.f3396x3205af9a);
                    this.f3390x62415.setOnDismissListener(this.f3397x2e958892);
                    this.f3391xdd892113 = true;
                } else {
                    this.f3390x62415 = null;
                }
            } finally {
                this.f3389xf049b32e = false;
            }
        }
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
            mo7591x9616526c();
        }
        android.app.Dialog dialog = this.f3390x62415;
        return dialog != null ? mo7402x3b271d6c.cloneInContext(dialog.getContext()) : mo7402x3b271d6c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: onHasView */
    public boolean m7403x79316580() {
        return this.f3391xdd892113;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onSaveInstanceState */
    public void mo7404xa71a2260(android.os.Bundle bundle) {
        super.mo7404xa71a2260(bundle);
        android.app.Dialog dialog = this.f3390x62415;
        if (dialog != null) {
            android.os.Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(f3379x10451798, false);
            bundle.putBundle(f3378x6424374d, onSaveInstanceState);
        }
        int i17 = this.f3400xbec86944;
        if (i17 != 0) {
            bundle.putInt(f3381xcf7755b9, i17);
        }
        int i18 = this.f3401xbed0c15c;
        if (i18 != 0) {
            bundle.putInt(f3382xcf7fadd1, i18);
        }
        boolean z17 = this.f3388x4cc9ef21;
        if (!z17) {
            bundle.putBoolean(f3377xf6638bac, z17);
        }
        boolean z18 = this.f3399x9b62d751;
        if (!z18) {
            bundle.putBoolean(f3380xa38fd389, z18);
        }
        int i19 = this.f3387xed1eec2f;
        if (i19 != -1) {
            bundle.putInt(f3376xa931fad2, i19);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStart */
    public void mo7405xb05099c3() {
        super.mo7405xb05099c3();
        android.app.Dialog dialog = this.f3390x62415;
        if (dialog != null) {
            this.f3402xad8bad87 = false;
            dialog.show();
            android.view.View decorView = this.f3390x62415.getWindow().getDecorView();
            decorView.setTag(com.p314xaae8f345.mm.R.id.p28, this);
            decorView.setTag(com.p314xaae8f345.mm.R.id.p2_, this);
            o4.j.b(decorView, this);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public void mo7406xc39f8281() {
        super.mo7406xc39f8281();
        android.app.Dialog dialog = this.f3390x62415;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewStateRestored */
    public void mo7407xed07c83(android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        super.mo7407xed07c83(bundle);
        if (this.f3390x62415 == null || bundle == null || (bundle2 = bundle.getBundle(f3378x6424374d)) == null) {
            return;
        }
        this.f3390x62415.onRestoreInstanceState(bundle2);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: performCreateView */
    public void mo7408x50ac3002(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        super.mo7408x50ac3002(layoutInflater, viewGroup, bundle);
        if (this.f3462x628b0b2 != null || this.f3390x62415 == null || bundle == null || (bundle2 = bundle.getBundle(f3378x6424374d)) == null) {
            return;
        }
        this.f3390x62415.onRestoreInstanceState(bundle2);
    }

    /* renamed from: requireDialog */
    public final android.app.Dialog m7409x91e8b0d() {
        android.app.Dialog m7393x15b1203e = m7393x15b1203e();
        if (m7393x15b1203e != null) {
            return m7393x15b1203e;
        }
        throw new java.lang.IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* renamed from: setCancelable */
    public void m7410x8cfcfcd6(boolean z17) {
        this.f3388x4cc9ef21 = z17;
        android.app.Dialog dialog = this.f3390x62415;
        if (dialog != null) {
            dialog.setCancelable(z17);
        }
    }

    /* renamed from: setShowsDialog */
    public void m7411x6191803c(boolean z17) {
        this.f3399x9b62d751 = z17;
    }

    /* renamed from: setStyle */
    public void m7412x53b6de6f(int i17, int i18) {
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
            mo7591x9616526c();
        }
        this.f3400xbec86944 = i17;
        if (i17 == 2 || i17 == 3) {
            this.f3401xbed0c15c = android.R.style.Theme.Panel;
        }
        if (i18 != 0) {
            this.f3401xbed0c15c = i18;
        }
    }

    /* renamed from: setupDialog */
    public void mo2554x8b5a9225(android.app.Dialog dialog, int i17) {
        if (i17 != 1 && i17 != 2) {
            if (i17 != 3) {
                return;
            }
            android.view.Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: show */
    public void mo7414x35dafd(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d, java.lang.String str) {
        this.f3393x84388ebc = false;
        this.f3398xa01af13 = true;
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = abstractC1104xc1ad431d.m7630xb2c12e75();
        m7630xb2c12e75.h(0, this, str, 1);
        m7630xb2c12e75.d();
    }

    /* renamed from: showNow */
    public void m7415x7b381a99(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d, java.lang.String str) {
        this.f3393x84388ebc = false;
        this.f3398xa01af13 = true;
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = abstractC1104xc1ad431d.m7630xb2c12e75();
        m7630xb2c12e75.h(0, this, str, 1);
        m7630xb2c12e75.f();
    }

    /* renamed from: show */
    public int m7413x35dafd(p012xc85e97e9.p087x9da2e250.app.i2 i2Var, java.lang.String str) {
        this.f3393x84388ebc = false;
        this.f3398xa01af13 = true;
        i2Var.h(0, this, str, 1);
        this.f3402xad8bad87 = false;
        int p17 = ((p012xc85e97e9.p087x9da2e250.app.a) i2Var).p(false);
        this.f3387xed1eec2f = p17;
        return p17;
    }
}
