package ah1;

/* loaded from: classes7.dex */
public class c0 extends vj5.h implements eb1.d {
    public android.widget.Button A;
    public android.widget.Button B;
    public android.widget.TextView C;
    public android.widget.TextView D;
    public android.widget.TextView E;
    public android.widget.LinearLayout F;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 G;
    public android.widget.TextView H;
    public android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.LinearLayout f86345J;
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
    public final int f86346p0;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f86347w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.RelativeLayout f86348x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f86349y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f86350z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y r9) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah1.c0.<init>(com.tencent.mm.plugin.appbrand.y):void");
    }

    @Override // eb1.d
    public si1.i0 b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y component, java.lang.String appId, vi1.j2 j2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 phoneItem, vi1.f0 f0Var) {
        xi1.g mo50261xee5260a9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phoneItem, "phoneItem");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = component.t3();
        if (t37 == null || (mo50261xee5260a9 = t37.mo48803xee5260a9()) == null) {
            mo50261xee5260a9 = component.mo50261xee5260a9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo50261xee5260a9);
        }
        xi1.g gVar = mo50261xee5260a9;
        int c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2.c(getContext()) + com.p314xaae8f345.mm.ui.zk.a(getContext(), 250);
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new vi1.z3(context, c17, gVar, appId, j2Var, phoneItem, f0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchConfigurationChanged(android.content.res.Configuration configuration) {
        super.dispatchConfigurationChanged(configuration);
        android.widget.RelativeLayout relativeLayout = this.f86348x;
        if (relativeLayout != null) {
            relativeLayout.addOnLayoutChangeListener(new ah1.l(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRootView");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent keyEvent) {
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.b(this)) {
            if ((keyEvent != null && 4 == keyEvent.getKeyCode()) && (keyDispatcherState = getKeyDispatcherState()) != null) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                }
                if (1 == keyEvent.getAction() && !keyEvent.isCanceled() && keyDispatcherState.isTracking(keyEvent)) {
                    m1995xb94942af().mo152xb9724478();
                    p(this.f86347w);
                    return true;
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // eb1.d
    public void f(boolean z17) {
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.lzz);
        imageView.setVisibility(z17 ? 0 : 8);
        if (!z17) {
            imageView.setOnClickListener(null);
        } else {
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79553xad1ac4b4, b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a)));
            imageView.setOnClickListener(new ah1.b0(this));
        }
    }

    /* renamed from: getAppBrandName */
    public java.lang.String m1991x97f42c07() {
        return this.M;
    }

    /* renamed from: getIconUrl */
    public java.lang.String m1992x9f7ace00() {
        return this.N;
    }

    /* renamed from: getOnAccept */
    public yz5.l m1993xb5f6c93d() {
        return this.Q;
    }

    /* renamed from: getOnAddPhoneNumber */
    public yz5.a m1994xb490fa2b() {
        return this.U;
    }

    /* renamed from: getOnCancel */
    public yz5.a m1995xb94942af() {
        return this.S;
    }

    /* renamed from: getOnDeny */
    public yz5.a m1996x28af9b81() {
        return this.R;
    }

    /* renamed from: getOnExplain */
    public yz5.a m1997x10b3762() {
        return this.T;
    }

    /* renamed from: getOnManagePhoneNumber */
    public yz5.a m1998x4898c5d() {
        return this.V;
    }

    /* renamed from: getOnPhoneItemSelect */
    public yz5.l m1999x74c94168() {
        return this.W;
    }

    /* renamed from: getPhoneItems */
    public java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581> m2000x8053a6e8() {
        return this.P;
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

    @Override // si1.i0
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        animate().cancel();
        animate().translationY(getMeasuredHeight()).setDuration(300L).withEndAction(new ah1.k(this)).start();
    }

    @Override // si1.i0
    public void r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component) {
        android.view.ViewGroup viewGroup;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        android.content.Context mo50352x76847179 = component.mo50352x76847179();
        android.app.Activity activity = mo50352x76847179 instanceof android.app.Activity ? (android.app.Activity) mo50352x76847179 : null;
        if (activity != null && (viewGroup = (android.view.ViewGroup) activity.findViewById(android.R.id.content)) != null) {
            viewGroup.addView(this, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        bringToFront();
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        getViewTreeObserver().addOnPreDrawListener(new ah1.z(this, component));
        boolean z17 = !com.p314xaae8f345.mm.ui.bk.C();
        int i17 = this.f86346p0;
        B(i17, z17, true);
        setBackgroundColor(i17);
        android.content.Context mo50352x768471792 = this.f86347w.mo50352x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a = mo50352x768471792 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) mo50352x768471792 : null;
        if (activityC12666xc288131a != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1211x73978ca2.AbstractActivityC12733x36a678ba.d7(activityC12666xc288131a, i17);
        }
    }

    @Override // eb1.d
    /* renamed from: setAppBrandName */
    public void mo2001xce3d2713(java.lang.String str) {
        this.M = str;
        android.widget.TextView textView = this.f86350z;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mNameTv");
            throw null;
        }
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }

    @Override // eb1.d
    /* renamed from: setDialogApplyWording */
    public void mo2002x2c9d82b4(java.lang.String wording) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        android.widget.TextView textView = this.E;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mApplyWordingTv");
            throw null;
        }
        textView.setVisibility(wording.length() > 0 ? 0 : 8);
        android.widget.TextView textView2 = this.E;
        if (textView2 != null) {
            textView2.setText(wording);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mApplyWordingTv");
            throw null;
        }
    }

    @Override // eb1.d
    /* renamed from: setDialogRequestDesc */
    public void mo2003xb6e62716(java.lang.String wording) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        if (wording.length() > 0) {
            android.widget.TextView textView = this.C;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRequestDescTv");
                throw null;
            }
            textView.setText(wording);
            android.widget.TextView textView2 = this.C;
            if (textView2 != null) {
                textView2.setVisibility(0);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRequestDescTv");
                throw null;
            }
        }
    }

    @Override // eb1.d
    /* renamed from: setDialogSubDesc */
    public void mo2004x25fbcd47(java.lang.String desc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        if (desc.length() > 0) {
            android.widget.TextView textView = this.D;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSimpleDetailDescTv");
                throw null;
            }
            textView.setText(desc);
            android.widget.TextView textView2 = this.D;
            if (textView2 != null) {
                textView2.setVisibility(0);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSimpleDetailDescTv");
                throw null;
            }
        }
    }

    @Override // fl1.e2
    /* renamed from: setIExternalToolsHelper */
    public void mo2005x1f85dcf7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1 r1Var) {
        fl1.s sVar = this.L;
        if (sVar != null) {
            sVar.f345393m = r1Var;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("userAgreementComponent");
            throw null;
        }
    }

    @Override // eb1.d
    /* renamed from: setIconUrl */
    public void mo2006x12ec1b74(java.lang.String str) {
        this.N = str;
        l01.b bVar = l01.d0.f396294a;
        android.widget.ImageView imageView = this.f86349y;
        if (imageView != null) {
            bVar.a(imageView, m1992x9f7ace00(), com.p314xaae8f345.mm.R.C30861xcebc809e.cbh, l01.q0.f396320d);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mIconIv");
            throw null;
        }
    }

    @Override // eb1.d
    /* renamed from: setOnAccept */
    public void mo2007xb0af2a49(yz5.l value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.Q = value;
        android.widget.Button button = this.A;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBtnAccept");
            throw null;
        }
        java.lang.CharSequence text = button.getText();
        if (text == null || text.length() == 0) {
            android.widget.Button button2 = this.A;
            if (button2 != null) {
                button2.setText(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4f));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBtnAccept");
                throw null;
            }
        }
    }

    @Override // eb1.d
    /* renamed from: setOnAddPhoneNumber */
    public void mo2008x588d8f37(yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
        this.U = aVar;
    }

    @Override // eb1.d
    /* renamed from: setOnCancel */
    public void mo2009xb401a3bb(yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
        this.S = aVar;
    }

    @Override // eb1.d
    /* renamed from: setOnDeny */
    public void mo2010x1be4cf8d(yz5.a value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.R = value;
        android.widget.Button button = this.B;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBtnReject");
            throw null;
        }
        java.lang.CharSequence text = button.getText();
        if (text == null || text.length() == 0) {
            android.widget.Button button2 = this.B;
            if (button2 != null) {
                button2.setText(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4j));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBtnReject");
                throw null;
            }
        }
    }

    @Override // eb1.d
    /* renamed from: setOnExplain */
    public void mo2011x5d5ef7d6(yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
        this.T = aVar;
    }

    @Override // eb1.d
    /* renamed from: setOnManagePhoneNumber */
    public void mo2012x52ce4bd1(yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
        this.V = aVar;
    }

    @Override // eb1.d
    /* renamed from: setOnPhoneItemSelect */
    public void mo2013x505f4ddc(yz5.l value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.W = value;
        android.widget.Button button = this.A;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBtnAccept");
            throw null;
        }
        java.lang.CharSequence text = button.getText();
        if (text == null || text.length() == 0) {
            android.widget.Button button2 = this.A;
            if (button2 != null) {
                button2.setText(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4f));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBtnAccept");
                throw null;
            }
        }
    }

    @Override // eb1.d
    /* renamed from: setPhoneItems */
    public void mo2014xae77f4f4(java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581> value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.P = value;
        this.f86347w.m(new ah1.y(this));
    }

    @Override // fl1.e2
    /* renamed from: setUserAgreementCheckBoxWording */
    public void mo2015xf085c78(java.lang.String wording) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        fl1.s sVar = this.L;
        if (sVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("userAgreementComponent");
            throw null;
        }
        sVar.mo2015xf085c78(wording);
        android.widget.LinearLayout linearLayout = this.f86345J;
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
        fl1.s sVar = this.L;
        if (sVar != null) {
            sVar.f345395o = j2Var;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("userAgreementComponent");
            throw null;
        }
    }
}
