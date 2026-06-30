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
    public android.widget.TextView f86363J;
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
    public android.widget.Button f86364p0;

    /* renamed from: w, reason: collision with root package name */
    public final int f86365w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12697x85b15aaf f86366x;

    /* renamed from: x0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f86367x0;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.RelativeLayout f86368y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f86369z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y r7, ui1.y r8) {
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
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAdapter");
                throw null;
            }
            java.util.List<fl1.h1> list = r1Var.f345384d;
            if (list.size() == 1) {
                fl1.h1 h1Var = (fl1.h1) list.get(0);
                if (h1Var != null && (str2 = h1Var.f345315d) != null) {
                    arrayList.add(str2);
                }
            } else {
                for (fl1.h1 h1Var2 : list) {
                    if ((h1Var2 != null && h1Var2.f345317f == z17) && (str = h1Var2.f345315d) != null) {
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
    /* renamed from: getSelectedItem */
    public final fl1.h1 m2017xf85aaec4() {
        fl1.r1 r1Var = this.R;
        if (r1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAdapter");
            throw null;
        }
        for (fl1.h1 h1Var : r1Var.f345384d) {
            boolean z17 = false;
            if (h1Var != null && h1Var.f345317f) {
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar2 = this.f86367x0;
        if (yVar2 != null) {
            p(yVar2);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("component");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchConfigurationChanged(android.content.res.Configuration configuration) {
        super.dispatchConfigurationChanged(configuration);
        android.widget.RelativeLayout relativeLayout = this.f86368y;
        if (relativeLayout != null) {
            relativeLayout.addOnLayoutChangeListener(new ah1.c(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("requestContainer");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent keyEvent) {
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
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

    /* renamed from: getAppBrandName */
    public java.lang.String m2018x97f42c07() {
        return this.E;
    }

    /* renamed from: getApplyWording */
    public java.lang.String m2019xb3dc8bc0() {
        return this.K;
    }

    /* renamed from: getIconUrl */
    public java.lang.String m2020x9f7ace00() {
        return this.M;
    }

    /* renamed from: getItemCheckedListener */
    public fl1.i1 m2021xd89a92b2() {
        return this.T;
    }

    @Override // ui1.z
    /* renamed from: getLastPointerDownTouchEvent */
    public android.view.MotionEvent mo2022x28e740ce() {
        return this.C;
    }

    /* renamed from: getListener */
    public final ui1.y m2023xcc17022a() {
        return this.B;
    }

    /* renamed from: getRequestDesc */
    public java.lang.String m2024x1e5bcc8a() {
        return this.G;
    }

    /* renamed from: getSimpleDetailDesc */
    public java.lang.String m2025x9251794a() {
        return this.I;
    }

    @Override // si1.k0
    public si1.j0 h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1 r1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        android.content.Context mo50352x76847179 = component.mo50352x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo50352x76847179, "getContext(...)");
        ah1.i0 i0Var = new ah1.i0(mo50352x76847179);
        i0Var.m2045x6d440884(str);
        return i0Var;
    }

    @Override // ui1.z
    public void o(boolean z17) {
        android.widget.ImageView imageView = this.U;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mExplainIv");
            throw null;
        }
        imageView.setVisibility(z17 ? 0 : 8);
        android.widget.ImageView imageView2 = this.U;
        if (imageView2 != null) {
            imageView2.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79553xad1ac4b4, b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a)));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mExplainIv");
            throw null;
        }
    }

    @Override // si1.i0
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        animate().cancel();
        animate().translationY(getMeasuredHeight()).setDuration(300L).withEndAction(new ah1.b(this)).start();
    }

    @Override // si1.i0
    public void r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component) {
        android.view.ViewGroup viewGroup;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) component;
        this.f86367x0 = yVar;
        android.content.Context mo50352x76847179 = yVar.mo50352x76847179();
        android.app.Activity activity = mo50352x76847179 instanceof android.app.Activity ? (android.app.Activity) mo50352x76847179 : null;
        if (activity != null && (viewGroup = (android.view.ViewGroup) activity.findViewById(android.R.id.content)) != null) {
            viewGroup.addView(this, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        bringToFront();
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        getViewTreeObserver().addOnPreDrawListener(new ah1.g(this, component));
        boolean z17 = !com.p314xaae8f345.mm.ui.bk.C();
        int i17 = this.f86365w;
        B(i17, z17, true);
        setBackgroundColor(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar2 = this.f86367x0;
        if (yVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("component");
            throw null;
        }
        android.content.Context mo50352x768471792 = yVar2.mo50352x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a = mo50352x768471792 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) mo50352x768471792 : null;
        if (activityC12666xc288131a != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1211x73978ca2.AbstractActivityC12733x36a678ba.d7(activityC12666xc288131a, i17);
        }
    }

    @Override // ui1.z
    /* renamed from: setAppBrandName */
    public void mo2026xce3d2713(java.lang.String str) {
        this.E = str;
        android.widget.TextView textView = this.D;
        if (textView != null) {
            textView.setText(str);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mNameTv");
            throw null;
        }
    }

    @Override // ui1.z
    /* renamed from: setApplyWording */
    public void mo2027xea2586cc(java.lang.String str) {
        this.K = str;
        android.widget.TextView textView = this.f86363J;
        if (textView != null) {
            textView.setText(str);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mApplyWordingTv");
            throw null;
        }
    }

    @Override // ui1.z
    /* renamed from: setExplainOnClickListener */
    public void mo2028x78fb63c8(android.view.View.OnClickListener onClickListener) {
        android.widget.ImageView imageView = this.U;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mExplainIv");
            throw null;
        }
    }

    @Override // ui1.z
    /* renamed from: setFunctionButtonOnClickListener */
    public void mo2029x3aaeeaf1(android.view.View.OnClickListener onClickListener) {
        android.widget.TextView textView = this.V;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("funcTv");
            throw null;
        }
    }

    @Override // ui1.z
    /* renamed from: setFunctionButtonText */
    public void mo2030x8f8b3d79(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            android.widget.TextView textView = this.V;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("funcTv");
                throw null;
            }
            textView.setText("");
            android.widget.TextView textView2 = this.V;
            if (textView2 != null) {
                textView2.setVisibility(4);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("funcTv");
                throw null;
            }
        }
        android.widget.TextView textView3 = this.V;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("funcTv");
            throw null;
        }
        textView3.setText(str);
        android.widget.TextView textView4 = this.V;
        if (textView4 != null) {
            textView4.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("funcTv");
            throw null;
        }
    }

    @Override // ui1.z
    /* renamed from: setFunctionButtonTextColor */
    public void mo2031x5951856a(int i17) {
        android.widget.TextView textView = this.V;
        if (textView != null) {
            textView.setTextColor(i17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("funcTv");
            throw null;
        }
    }

    @Override // ui1.z
    /* renamed from: setFunctionButtonVisibility */
    public void mo2032xf1caf25e(int i17) {
        android.widget.TextView textView = this.V;
        if (textView != null) {
            textView.setVisibility(i17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("funcTv");
            throw null;
        }
    }

    @Override // fl1.e2
    /* renamed from: setIExternalToolsHelper */
    public void mo2005x1f85dcf7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1 r1Var) {
        fl1.s sVar = this.A;
        if (sVar != null) {
            sVar.f345393m = r1Var;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("userAgreementComponent");
            throw null;
        }
    }

    @Override // ui1.z
    /* renamed from: setIconUrl */
    public void mo2033x12ec1b74(java.lang.String str) {
        this.M = str;
        l01.b bVar = l01.d0.f396294a;
        android.widget.ImageView imageView = this.L;
        if (imageView != null) {
            bVar.a(imageView, m2020x9f7ace00(), com.p314xaae8f345.mm.R.C30861xcebc809e.cbh, l01.q0.f396320d);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mIconIv");
            throw null;
        }
    }

    @Override // ui1.z
    /* renamed from: setItemCheckedListener */
    public void mo2034x26df5226(fl1.i1 i1Var) {
        this.T = i1Var;
        fl1.r1 r1Var = this.R;
        if (r1Var != null) {
            r1Var.f345385e = i1Var;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAdapter");
            throw null;
        }
    }

    /* renamed from: setListener */
    public final void m2035xc6cf6336(ui1.y yVar) {
        this.B = yVar;
    }

    @Override // ui1.z
    /* renamed from: setNegativeButtonText */
    public void mo2036xc499c596(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        android.widget.Button button = this.W;
        if (button != null) {
            button.setText(str);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBtnReject");
            throw null;
        }
    }

    @Override // ui1.z
    /* renamed from: setOnListItemLongClickListener */
    public void mo2037x3aaa4d8e(fl1.j1 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        fl1.r1 r1Var = this.R;
        if (r1Var != null) {
            r1Var.f345386f = listener;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAdapter");
            throw null;
        }
    }

    @Override // ui1.z
    /* renamed from: setPositiveButtonText */
    public void mo2038xd611ee5a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        android.widget.Button button = this.f86364p0;
        if (button != null) {
            button.setText(str);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBtnAccept");
            throw null;
        }
    }

    @Override // ui1.z
    /* renamed from: setRequestDesc */
    public void mo2039xb4c13ffe(java.lang.String str) {
        this.G = str;
        android.widget.TextView textView = this.F;
        if (textView != null) {
            textView.setText(str);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDescTv");
            throw null;
        }
    }

    @Override // ui1.z
    /* renamed from: setScope */
    public void mo2040x53aeff12(java.lang.String scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        this.N = scope;
    }

    @Override // ui1.z
    /* renamed from: setSelectListItem */
    public void mo2041x3f8132ef(java.util.List<fl1.h1> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.List list2 = this.Q;
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list2).addAll(list);
        fl1.r1 r1Var = this.R;
        if (r1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAdapter");
            throw null;
        }
        r1Var.m8146xced61ae5();
        android.widget.LinearLayout linearLayout = this.P;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSelectListLayout");
            throw null;
        }
        linearLayout.setVisibility(0);
        java.lang.String m2025x9251794a = m2025x9251794a();
        if (m2025x9251794a == null || m2025x9251794a.length() == 0) {
            android.widget.TextView textView = this.H;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSimpleDetailDescTv");
                throw null;
            }
            textView.setVisibility(8);
        }
        android.view.View view = this.S;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPageJsAuthorizePresenterUIView", "setSelectListItem", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPageJsAuthorizePresenterUIView", "setSelectListItem", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ui1.z
    /* renamed from: setSimpleDetailDesc */
    public void mo2042x364e0e56(java.lang.String str) {
        this.I = str;
        if (str == null || str.length() == 0) {
            return;
        }
        android.widget.TextView textView = this.H;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSimpleDetailDescTv");
            throw null;
        }
        textView.setText(str);
        android.widget.TextView textView2 = this.H;
        if (textView2 != null) {
            textView2.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSimpleDetailDescTv");
            throw null;
        }
    }

    @Override // fl1.e2
    /* renamed from: setUserAgreementCheckBoxWording */
    public void mo2015xf085c78(java.lang.String wording) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        fl1.s sVar = this.A;
        if (sVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("userAgreementComponent");
            throw null;
        }
        sVar.mo2015xf085c78(wording);
        android.widget.LinearLayout linearLayout = this.f86369z;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("buttonGroup");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = ym5.x.a(getContext(), 24.0f);
        layoutParams2.removeRule(12);
    }

    @Override // fl1.e2
    /* renamed from: setUserAgreementCheckedAlertListener */
    public void mo2016x99ddcea6(fl1.j2 j2Var) {
        fl1.s sVar = this.A;
        if (sVar != null) {
            sVar.f345395o = j2Var;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("userAgreementComponent");
            throw null;
        }
    }
}
