package ah1;

/* loaded from: classes7.dex */
public class c0 extends vj5.h implements eb1.d {
    public android.widget.Button A;
    public android.widget.Button B;
    public android.widget.TextView C;
    public android.widget.TextView D;
    public android.widget.TextView E;
    public android.widget.LinearLayout F;
    public androidx.recyclerview.widget.RecyclerView G;
    public android.widget.TextView H;
    public android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.LinearLayout f4812J;
    public vi1.l0 K;
    public fl1.s L;
    public java.lang.String M;
    public java.lang.String N;
    public java.util.ArrayList P;
    public yz5.l Q;
    public yz5.a R;
    public yz5.a S;
    public yz5.a T;
    public yz5.a U;
    public yz5.a V;
    public yz5.l W;

    /* renamed from: p0, reason: collision with root package name */
    public final int f4813p0;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.y f4814w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.RelativeLayout f4815x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f4816y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f4817z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c0(com.tencent.mm.plugin.appbrand.y r9) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah1.c0.<init>(com.tencent.mm.plugin.appbrand.y):void");
    }

    @Override // eb1.d
    public si1.i0 b(com.tencent.mm.plugin.appbrand.y component, java.lang.String appId, vi1.j2 j2Var, com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem, vi1.f0 f0Var) {
        xi1.g windowAndroid;
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(phoneItem, "phoneItem");
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = component.t3();
        if (t37 == null || (windowAndroid = t37.getWindowAndroid()) == null) {
            windowAndroid = component.getWindowAndroid();
            kotlin.jvm.internal.o.d(windowAndroid);
        }
        xi1.g gVar = windowAndroid;
        int c17 = com.tencent.mm.plugin.appbrand.widget.input.l2.c(getContext()) + com.tencent.mm.ui.zk.a(getContext(), 250);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new vi1.z3(context, c17, gVar, appId, j2Var, phoneItem, f0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchConfigurationChanged(android.content.res.Configuration configuration) {
        super.dispatchConfigurationChanged(configuration);
        android.widget.RelativeLayout relativeLayout = this.f4815x;
        if (relativeLayout != null) {
            relativeLayout.addOnLayoutChangeListener(new ah1.l(this));
        } else {
            kotlin.jvm.internal.o.o("mRootView");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent keyEvent) {
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(this)) {
            if ((keyEvent != null && 4 == keyEvent.getKeyCode()) && (keyDispatcherState = getKeyDispatcherState()) != null) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                }
                if (1 == keyEvent.getAction() && !keyEvent.isCanceled() && keyDispatcherState.isTracking(keyEvent)) {
                    getOnCancel().invoke();
                    p(this.f4814w);
                    return true;
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // eb1.d
    public void f(boolean z17) {
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.lzz);
        imageView.setVisibility(z17 ? 0 : 8);
        if (!z17) {
            imageView.setOnClickListener(null);
        } else {
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icon_info, b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_0_Alpha_0_3)));
            imageView.setOnClickListener(new ah1.b0(this));
        }
    }

    public java.lang.String getAppBrandName() {
        return this.M;
    }

    public java.lang.String getIconUrl() {
        return this.N;
    }

    public yz5.l getOnAccept() {
        return this.Q;
    }

    public yz5.a getOnAddPhoneNumber() {
        return this.U;
    }

    public yz5.a getOnCancel() {
        return this.S;
    }

    public yz5.a getOnDeny() {
        return this.R;
    }

    public yz5.a getOnExplain() {
        return this.T;
    }

    public yz5.a getOnManagePhoneNumber() {
        return this.V;
    }

    public yz5.l getOnPhoneItemSelect() {
        return this.W;
    }

    public java.util.ArrayList<com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem> getPhoneItems() {
        return this.P;
    }

    @Override // si1.k0
    public si1.j0 h(com.tencent.mm.plugin.appbrand.jsapi.l component, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.r1 r1Var) {
        kotlin.jvm.internal.o.g(component, "component");
        android.content.Context context = component.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ah1.i0 i0Var = new ah1.i0(context);
        i0Var.setExplainContent(str);
        return i0Var;
    }

    @Override // si1.i0
    public void p(com.tencent.mm.plugin.appbrand.jsapi.l component) {
        kotlin.jvm.internal.o.g(component, "component");
        animate().cancel();
        animate().translationY(getMeasuredHeight()).setDuration(300L).withEndAction(new ah1.k(this)).start();
    }

    @Override // si1.i0
    public void r(com.tencent.mm.plugin.appbrand.jsapi.l component) {
        android.view.ViewGroup viewGroup;
        kotlin.jvm.internal.o.g(component, "component");
        android.content.Context context = component.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (viewGroup = (android.view.ViewGroup) activity.findViewById(android.R.id.content)) != null) {
            viewGroup.addView(this, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        bringToFront();
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        getViewTreeObserver().addOnPreDrawListener(new ah1.z(this, component));
        boolean z17 = !com.tencent.mm.ui.bk.C();
        int i17 = this.f4813p0;
        B(i17, z17, true);
        setBackgroundColor(i17);
        android.content.Context context2 = this.f4814w.getContext();
        com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI = context2 instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI ? (com.tencent.mm.plugin.appbrand.ui.AppBrandUI) context2 : null;
        if (appBrandUI != null) {
            com.tencent.mm.plugin.appbrand.ui.wxa_container.AppBrandContainerFragmentActivity.d7(appBrandUI, i17);
        }
    }

    @Override // eb1.d
    public void setAppBrandName(java.lang.String str) {
        this.M = str;
        android.widget.TextView textView = this.f4817z;
        if (textView == null) {
            kotlin.jvm.internal.o.o("mNameTv");
            throw null;
        }
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }

    @Override // eb1.d
    public void setDialogApplyWording(java.lang.String wording) {
        kotlin.jvm.internal.o.g(wording, "wording");
        android.widget.TextView textView = this.E;
        if (textView == null) {
            kotlin.jvm.internal.o.o("mApplyWordingTv");
            throw null;
        }
        textView.setVisibility(wording.length() > 0 ? 0 : 8);
        android.widget.TextView textView2 = this.E;
        if (textView2 != null) {
            textView2.setText(wording);
        } else {
            kotlin.jvm.internal.o.o("mApplyWordingTv");
            throw null;
        }
    }

    @Override // eb1.d
    public void setDialogRequestDesc(java.lang.String wording) {
        kotlin.jvm.internal.o.g(wording, "wording");
        if (wording.length() > 0) {
            android.widget.TextView textView = this.C;
            if (textView == null) {
                kotlin.jvm.internal.o.o("mRequestDescTv");
                throw null;
            }
            textView.setText(wording);
            android.widget.TextView textView2 = this.C;
            if (textView2 != null) {
                textView2.setVisibility(0);
            } else {
                kotlin.jvm.internal.o.o("mRequestDescTv");
                throw null;
            }
        }
    }

    @Override // eb1.d
    public void setDialogSubDesc(java.lang.String desc) {
        kotlin.jvm.internal.o.g(desc, "desc");
        if (desc.length() > 0) {
            android.widget.TextView textView = this.D;
            if (textView == null) {
                kotlin.jvm.internal.o.o("mSimpleDetailDescTv");
                throw null;
            }
            textView.setText(desc);
            android.widget.TextView textView2 = this.D;
            if (textView2 != null) {
                textView2.setVisibility(0);
            } else {
                kotlin.jvm.internal.o.o("mSimpleDetailDescTv");
                throw null;
            }
        }
    }

    @Override // fl1.e2
    public void setIExternalToolsHelper(com.tencent.mm.plugin.appbrand.jsapi.r1 r1Var) {
        fl1.s sVar = this.L;
        if (sVar != null) {
            sVar.f263860m = r1Var;
        } else {
            kotlin.jvm.internal.o.o("userAgreementComponent");
            throw null;
        }
    }

    @Override // eb1.d
    public void setIconUrl(java.lang.String str) {
        this.N = str;
        l01.b bVar = l01.d0.f314761a;
        android.widget.ImageView imageView = this.f4816y;
        if (imageView != null) {
            bVar.a(imageView, getIconUrl(), com.tencent.mm.R.drawable.cbh, l01.q0.f314787d);
        } else {
            kotlin.jvm.internal.o.o("mIconIv");
            throw null;
        }
    }

    @Override // eb1.d
    public void setOnAccept(yz5.l value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.Q = value;
        android.widget.Button button = this.A;
        if (button == null) {
            kotlin.jvm.internal.o.o("mBtnAccept");
            throw null;
        }
        java.lang.CharSequence text = button.getText();
        if (text == null || text.length() == 0) {
            android.widget.Button button2 = this.A;
            if (button2 != null) {
                button2.setText(getContext().getResources().getString(com.tencent.mm.R.string.a4f));
            } else {
                kotlin.jvm.internal.o.o("mBtnAccept");
                throw null;
            }
        }
    }

    @Override // eb1.d
    public void setOnAddPhoneNumber(yz5.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.U = aVar;
    }

    @Override // eb1.d
    public void setOnCancel(yz5.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.S = aVar;
    }

    @Override // eb1.d
    public void setOnDeny(yz5.a value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.R = value;
        android.widget.Button button = this.B;
        if (button == null) {
            kotlin.jvm.internal.o.o("mBtnReject");
            throw null;
        }
        java.lang.CharSequence text = button.getText();
        if (text == null || text.length() == 0) {
            android.widget.Button button2 = this.B;
            if (button2 != null) {
                button2.setText(getContext().getResources().getString(com.tencent.mm.R.string.a4j));
            } else {
                kotlin.jvm.internal.o.o("mBtnReject");
                throw null;
            }
        }
    }

    @Override // eb1.d
    public void setOnExplain(yz5.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.T = aVar;
    }

    @Override // eb1.d
    public void setOnManagePhoneNumber(yz5.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.V = aVar;
    }

    @Override // eb1.d
    public void setOnPhoneItemSelect(yz5.l value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.W = value;
        android.widget.Button button = this.A;
        if (button == null) {
            kotlin.jvm.internal.o.o("mBtnAccept");
            throw null;
        }
        java.lang.CharSequence text = button.getText();
        if (text == null || text.length() == 0) {
            android.widget.Button button2 = this.A;
            if (button2 != null) {
                button2.setText(getContext().getResources().getString(com.tencent.mm.R.string.a4f));
            } else {
                kotlin.jvm.internal.o.o("mBtnAccept");
                throw null;
            }
        }
    }

    @Override // eb1.d
    public void setPhoneItems(java.util.ArrayList<com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem> value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.P = value;
        this.f4814w.m(new ah1.y(this));
    }

    @Override // fl1.e2
    public void setUserAgreementCheckBoxWording(java.lang.String wording) {
        kotlin.jvm.internal.o.g(wording, "wording");
        fl1.s sVar = this.L;
        if (sVar == null) {
            kotlin.jvm.internal.o.o("userAgreementComponent");
            throw null;
        }
        sVar.setUserAgreementCheckBoxWording(wording);
        android.widget.LinearLayout linearLayout = this.f4812J;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("buttonGroup");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = ym5.x.a(getContext(), 24.0f);
        layoutParams2.removeRule(12);
    }

    @Override // fl1.e2
    public void setUserAgreementCheckedAlertListener(fl1.j2 j2Var) {
        fl1.s sVar = this.L;
        if (sVar != null) {
            sVar.f263862o = j2Var;
        } else {
            kotlin.jvm.internal.o.o("userAgreementComponent");
            throw null;
        }
    }
}
