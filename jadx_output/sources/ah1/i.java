package ah1;

/* loaded from: classes7.dex */
public final class i extends vj5.h implements ui1.z {
    public fl1.s A;
    public ui1.y B;
    public android.view.MotionEvent C;
    public android.widget.TextView D;
    public java.lang.String E;
    public android.widget.TextView F;
    public java.lang.String G;
    public android.widget.TextView H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f4830J;
    public java.lang.String K;
    public android.widget.ImageView L;
    public java.lang.String M;
    public java.lang.String N;
    public android.widget.LinearLayout P;
    public final java.util.List Q;
    public fl1.r1 R;
    public android.view.View S;
    public fl1.i1 T;
    public android.widget.ImageView U;
    public android.widget.TextView V;
    public android.widget.Button W;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.Button f4831p0;

    /* renamed from: w, reason: collision with root package name */
    public final int f4832w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView f4833x;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.y f4834x0;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.RelativeLayout f4835y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f4836z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(com.tencent.mm.plugin.appbrand.y r7, ui1.y r8) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah1.i.<init>(com.tencent.mm.plugin.appbrand.y, ui1.y):void");
    }

    public static final java.util.ArrayList D(ah1.i iVar, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        iVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (android.text.TextUtils.isEmpty(iVar.N)) {
            fl1.r1 r1Var = iVar.R;
            if (r1Var == null) {
                kotlin.jvm.internal.o.o("mAdapter");
                throw null;
            }
            java.util.List<fl1.h1> list = r1Var.f263851d;
            if (list.size() == 1) {
                fl1.h1 h1Var = (fl1.h1) list.get(0);
                if (h1Var != null && (str2 = h1Var.f263782d) != null) {
                    arrayList.add(str2);
                }
            } else {
                for (fl1.h1 h1Var2 : list) {
                    if ((h1Var2 != null && h1Var2.f263784f == z17) && (str = h1Var2.f263782d) != null) {
                        arrayList.add(str);
                    }
                }
            }
        } else {
            arrayList.add(iVar.N);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fl1.h1 getSelectedItem() {
        fl1.r1 r1Var = this.R;
        if (r1Var == null) {
            kotlin.jvm.internal.o.o("mAdapter");
            throw null;
        }
        for (fl1.h1 h1Var : r1Var.f263851d) {
            boolean z17 = false;
            if (h1Var != null && h1Var.f263784f) {
                z17 = true;
            }
            if (z17) {
                return h1Var;
            }
        }
        return null;
    }

    public final void K() {
        ui1.y yVar = this.B;
        if (yVar != null) {
            ui1.y.b(yVar, 3, new java.util.ArrayList(), 0, false, 12, null);
        }
        com.tencent.mm.plugin.appbrand.y yVar2 = this.f4834x0;
        if (yVar2 != null) {
            p(yVar2);
        } else {
            kotlin.jvm.internal.o.o("component");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchConfigurationChanged(android.content.res.Configuration configuration) {
        super.dispatchConfigurationChanged(configuration);
        android.widget.RelativeLayout relativeLayout = this.f4835y;
        if (relativeLayout != null) {
            relativeLayout.addOnLayoutChangeListener(new ah1.c(this));
        } else {
            kotlin.jvm.internal.o.o("requestContainer");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent keyEvent) {
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(this)) {
            boolean z17 = false;
            if (keyEvent != null && 4 == keyEvent.getKeyCode()) {
                z17 = true;
            }
            if (z17 && (keyDispatcherState = getKeyDispatcherState()) != null) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                }
                if (1 == keyEvent.getAction() && !keyEvent.isCanceled() && keyDispatcherState.isTracking(keyEvent)) {
                    K();
                    return true;
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.C = android.view.MotionEvent.obtain(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public java.lang.String getAppBrandName() {
        return this.E;
    }

    public java.lang.String getApplyWording() {
        return this.K;
    }

    public java.lang.String getIconUrl() {
        return this.M;
    }

    public fl1.i1 getItemCheckedListener() {
        return this.T;
    }

    @Override // ui1.z
    public android.view.MotionEvent getLastPointerDownTouchEvent() {
        return this.C;
    }

    public final ui1.y getListener() {
        return this.B;
    }

    public java.lang.String getRequestDesc() {
        return this.G;
    }

    public java.lang.String getSimpleDetailDesc() {
        return this.I;
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

    @Override // ui1.z
    public void o(boolean z17) {
        android.widget.ImageView imageView = this.U;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("mExplainIv");
            throw null;
        }
        imageView.setVisibility(z17 ? 0 : 8);
        android.widget.ImageView imageView2 = this.U;
        if (imageView2 != null) {
            imageView2.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icon_info, b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_0_Alpha_0_3)));
        } else {
            kotlin.jvm.internal.o.o("mExplainIv");
            throw null;
        }
    }

    @Override // si1.i0
    public void p(com.tencent.mm.plugin.appbrand.jsapi.l component) {
        kotlin.jvm.internal.o.g(component, "component");
        animate().cancel();
        animate().translationY(getMeasuredHeight()).setDuration(300L).withEndAction(new ah1.b(this)).start();
    }

    @Override // si1.i0
    public void r(com.tencent.mm.plugin.appbrand.jsapi.l component) {
        android.view.ViewGroup viewGroup;
        kotlin.jvm.internal.o.g(component, "component");
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) component;
        this.f4834x0 = yVar;
        android.content.Context context = yVar.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (viewGroup = (android.view.ViewGroup) activity.findViewById(android.R.id.content)) != null) {
            viewGroup.addView(this, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        bringToFront();
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        getViewTreeObserver().addOnPreDrawListener(new ah1.g(this, component));
        boolean z17 = !com.tencent.mm.ui.bk.C();
        int i17 = this.f4832w;
        B(i17, z17, true);
        setBackgroundColor(i17);
        com.tencent.mm.plugin.appbrand.y yVar2 = this.f4834x0;
        if (yVar2 == null) {
            kotlin.jvm.internal.o.o("component");
            throw null;
        }
        android.content.Context context2 = yVar2.getContext();
        com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI = context2 instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI ? (com.tencent.mm.plugin.appbrand.ui.AppBrandUI) context2 : null;
        if (appBrandUI != null) {
            com.tencent.mm.plugin.appbrand.ui.wxa_container.AppBrandContainerFragmentActivity.d7(appBrandUI, i17);
        }
    }

    @Override // ui1.z
    public void setAppBrandName(java.lang.String str) {
        this.E = str;
        android.widget.TextView textView = this.D;
        if (textView != null) {
            textView.setText(str);
        } else {
            kotlin.jvm.internal.o.o("mNameTv");
            throw null;
        }
    }

    @Override // ui1.z
    public void setApplyWording(java.lang.String str) {
        this.K = str;
        android.widget.TextView textView = this.f4830J;
        if (textView != null) {
            textView.setText(str);
        } else {
            kotlin.jvm.internal.o.o("mApplyWordingTv");
            throw null;
        }
    }

    @Override // ui1.z
    public void setExplainOnClickListener(android.view.View.OnClickListener onClickListener) {
        android.widget.ImageView imageView = this.U;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        } else {
            kotlin.jvm.internal.o.o("mExplainIv");
            throw null;
        }
    }

    @Override // ui1.z
    public void setFunctionButtonOnClickListener(android.view.View.OnClickListener onClickListener) {
        android.widget.TextView textView = this.V;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        } else {
            kotlin.jvm.internal.o.o("funcTv");
            throw null;
        }
    }

    @Override // ui1.z
    public void setFunctionButtonText(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            android.widget.TextView textView = this.V;
            if (textView == null) {
                kotlin.jvm.internal.o.o("funcTv");
                throw null;
            }
            textView.setText("");
            android.widget.TextView textView2 = this.V;
            if (textView2 != null) {
                textView2.setVisibility(4);
                return;
            } else {
                kotlin.jvm.internal.o.o("funcTv");
                throw null;
            }
        }
        android.widget.TextView textView3 = this.V;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("funcTv");
            throw null;
        }
        textView3.setText(str);
        android.widget.TextView textView4 = this.V;
        if (textView4 != null) {
            textView4.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("funcTv");
            throw null;
        }
    }

    @Override // ui1.z
    public void setFunctionButtonTextColor(int i17) {
        android.widget.TextView textView = this.V;
        if (textView != null) {
            textView.setTextColor(i17);
        } else {
            kotlin.jvm.internal.o.o("funcTv");
            throw null;
        }
    }

    @Override // ui1.z
    public void setFunctionButtonVisibility(int i17) {
        android.widget.TextView textView = this.V;
        if (textView != null) {
            textView.setVisibility(i17);
        } else {
            kotlin.jvm.internal.o.o("funcTv");
            throw null;
        }
    }

    @Override // fl1.e2
    public void setIExternalToolsHelper(com.tencent.mm.plugin.appbrand.jsapi.r1 r1Var) {
        fl1.s sVar = this.A;
        if (sVar != null) {
            sVar.f263860m = r1Var;
        } else {
            kotlin.jvm.internal.o.o("userAgreementComponent");
            throw null;
        }
    }

    @Override // ui1.z
    public void setIconUrl(java.lang.String str) {
        this.M = str;
        l01.b bVar = l01.d0.f314761a;
        android.widget.ImageView imageView = this.L;
        if (imageView != null) {
            bVar.a(imageView, getIconUrl(), com.tencent.mm.R.drawable.cbh, l01.q0.f314787d);
        } else {
            kotlin.jvm.internal.o.o("mIconIv");
            throw null;
        }
    }

    @Override // ui1.z
    public void setItemCheckedListener(fl1.i1 i1Var) {
        this.T = i1Var;
        fl1.r1 r1Var = this.R;
        if (r1Var != null) {
            r1Var.f263852e = i1Var;
        } else {
            kotlin.jvm.internal.o.o("mAdapter");
            throw null;
        }
    }

    public final void setListener(ui1.y yVar) {
        this.B = yVar;
    }

    @Override // ui1.z
    public void setNegativeButtonText(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        android.widget.Button button = this.W;
        if (button != null) {
            button.setText(str);
        } else {
            kotlin.jvm.internal.o.o("mBtnReject");
            throw null;
        }
    }

    @Override // ui1.z
    public void setOnListItemLongClickListener(fl1.j1 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        fl1.r1 r1Var = this.R;
        if (r1Var != null) {
            r1Var.f263853f = listener;
        } else {
            kotlin.jvm.internal.o.o("mAdapter");
            throw null;
        }
    }

    @Override // ui1.z
    public void setPositiveButtonText(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        android.widget.Button button = this.f4831p0;
        if (button != null) {
            button.setText(str);
        } else {
            kotlin.jvm.internal.o.o("mBtnAccept");
            throw null;
        }
    }

    @Override // ui1.z
    public void setRequestDesc(java.lang.String str) {
        this.G = str;
        android.widget.TextView textView = this.F;
        if (textView != null) {
            textView.setText(str);
        } else {
            kotlin.jvm.internal.o.o("mDescTv");
            throw null;
        }
    }

    @Override // ui1.z
    public void setScope(java.lang.String scope) {
        kotlin.jvm.internal.o.g(scope, "scope");
        this.N = scope;
    }

    @Override // ui1.z
    public void setSelectListItem(java.util.List<fl1.h1> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.List list2 = this.Q;
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list2).addAll(list);
        fl1.r1 r1Var = this.R;
        if (r1Var == null) {
            kotlin.jvm.internal.o.o("mAdapter");
            throw null;
        }
        r1Var.notifyDataSetChanged();
        android.widget.LinearLayout linearLayout = this.P;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("mSelectListLayout");
            throw null;
        }
        linearLayout.setVisibility(0);
        java.lang.String simpleDetailDesc = getSimpleDetailDesc();
        if (simpleDetailDesc == null || simpleDetailDesc.length() == 0) {
            android.widget.TextView textView = this.H;
            if (textView == null) {
                kotlin.jvm.internal.o.o("mSimpleDetailDescTv");
                throw null;
            }
            textView.setVisibility(8);
        }
        android.view.View view = this.S;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPageJsAuthorizePresenterUIView", "setSelectListItem", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPageJsAuthorizePresenterUIView", "setSelectListItem", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ui1.z
    public void setSimpleDetailDesc(java.lang.String str) {
        this.I = str;
        if (str == null || str.length() == 0) {
            return;
        }
        android.widget.TextView textView = this.H;
        if (textView == null) {
            kotlin.jvm.internal.o.o("mSimpleDetailDescTv");
            throw null;
        }
        textView.setText(str);
        android.widget.TextView textView2 = this.H;
        if (textView2 != null) {
            textView2.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("mSimpleDetailDescTv");
            throw null;
        }
    }

    @Override // fl1.e2
    public void setUserAgreementCheckBoxWording(java.lang.String wording) {
        kotlin.jvm.internal.o.g(wording, "wording");
        fl1.s sVar = this.A;
        if (sVar == null) {
            kotlin.jvm.internal.o.o("userAgreementComponent");
            throw null;
        }
        sVar.setUserAgreementCheckBoxWording(wording);
        android.widget.LinearLayout linearLayout = this.f4836z;
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
        fl1.s sVar = this.A;
        if (sVar != null) {
            sVar.f263862o = j2Var;
        } else {
            kotlin.jvm.internal.o.o("userAgreementComponent");
            throw null;
        }
    }
}
