package pi2;

/* loaded from: classes3.dex */
public final class t extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 implements android.view.View.OnClickListener {
    public final qf2.q3 H;
    public final yz5.l I;

    /* renamed from: J, reason: collision with root package name */
    public fg2.l1 f436344J;
    public int K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.content.Context context, qf2.q3 controller, yz5.l back) {
        super(context, false, null, 0.0f, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(back, "back");
        this.H = controller;
        this.I = back;
        this.K = 10;
        this.L = 10;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570487ds4;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View E(zl2.u4 uiMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiMode, "uiMode");
        return android.view.LayoutInflater.from(this.f199716e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570487ds4, (android.view.ViewGroup) z(), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public java.lang.String L() {
        java.lang.String string = this.f199716e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mlo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.mhh;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.mhh);
        if (frameLayout != null) {
            i17 = com.p314xaae8f345.mm.R.id.r2_;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.r2_);
            if (c22661xa3a2b3c0 != null) {
                i17 = com.p314xaae8f345.mm.R.id.f564243r34;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f564243r34);
                if (textView != null) {
                    i17 = com.p314xaae8f345.mm.R.id.s28;
                    android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.s28);
                    if (frameLayout2 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.f569250sa1;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f569250sa1);
                        if (c22699x3dcdb352 != null) {
                            this.f436344J = new fg2.l1((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) rootView, frameLayout, c22661xa3a2b3c0, textView, frameLayout2, c22699x3dcdb352);
                            frameLayout2.setOnClickListener(this);
                            fg2.l1 l1Var = this.f436344J;
                            if (l1Var == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                throw null;
                            }
                            l1Var.f343662b.setOnClickListener(this);
                            fg2.l1 l1Var2 = this.f436344J;
                            if (l1Var2 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                throw null;
                            }
                            android.widget.TextView addPriceText = l1Var2.f343664d;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(addPriceText, "addPriceText");
                            com.p314xaae8f345.mm.ui.fk.a(addPriceText);
                            fg2.l1 l1Var3 = this.f436344J;
                            if (l1Var3 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                throw null;
                            }
                            android.widget.TextView addPriceText2 = l1Var3.f343664d;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(addPriceText2, "addPriceText");
                            hc2.o.a(addPriceText2, false);
                            fg2.l1 l1Var4 = this.f436344J;
                            if (l1Var4 != null) {
                                l1Var4.f343663c.setOnClickListener(this);
                                return;
                            } else {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void T() {
        super.T();
        yz5.l lVar = this.I;
        if (lVar != null) {
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var, boolean z17, int i17) {
        r45.kf5 kf5Var;
        r45.kf5 kf5Var2;
        super.V(e0Var, z17, i17);
        qf2.q3 q3Var = this.H;
        r45.il4 il4Var = ((mm2.o4) q3Var.m56788xbba4bfc0(mm2.o4.class)).U;
        this.K = (il4Var == null || (kf5Var2 = il4Var.f458665g) == null) ? 10 : kf5Var2.f460194i;
        r45.il4 il4Var2 = ((mm2.o4) q3Var.m56788xbba4bfc0(mm2.o4.class)).U;
        this.L = (il4Var2 == null || (kf5Var = il4Var2.f458665g) == null) ? 0 : kf5Var.f460193h;
        e0();
        f0();
        fg2.l1 l1Var = this.f436344J;
        if (l1Var != null) {
            l1Var.f343663c.setEnabled(this.L > 0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    public final void e0() {
        r45.kf5 kf5Var;
        r45.il4 il4Var = ((mm2.o4) this.H.m56788xbba4bfc0(mm2.o4.class)).U;
        int i17 = (il4Var == null || (kf5Var = il4Var.f458665g) == null) ? 0 : kf5Var.f460193h;
        if (this.L > i17) {
            fg2.l1 l1Var = this.f436344J;
            if (l1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            l1Var.f343665e.setAlpha(1.0f);
            fg2.l1 l1Var2 = this.f436344J;
            if (l1Var2 != null) {
                l1Var2.f343665e.setEnabled(true);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
        }
        this.L = i17;
        fg2.l1 l1Var3 = this.f436344J;
        if (l1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        l1Var3.f343665e.setAlpha(0.5f);
        fg2.l1 l1Var4 = this.f436344J;
        if (l1Var4 != null) {
            l1Var4.f343665e.setEnabled(false);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    public final void f0() {
        fg2.l1 l1Var = this.f436344J;
        if (l1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        l1Var.f343664d.setText(java.lang.String.valueOf(this.L));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLivePayMicAddPricePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.l1 l1Var = this.f436344J;
        if (l1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        int id6 = l1Var.f343665e.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            this.L -= this.K;
            e0();
            f0();
        } else {
            fg2.l1 l1Var2 = this.f436344J;
            if (l1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            int id7 = l1Var2.f343662b.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                this.L += this.K;
                f0();
                e0();
            } else {
                fg2.l1 l1Var3 = this.f436344J;
                if (l1Var3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                int id8 = l1Var3.f343663c.getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    int i17 = this.L;
                    pi2.s sVar = new pi2.s(this);
                    qf2.q3 q3Var = this.H;
                    q3Var.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(q3Var, null, null, new qf2.f3(q3Var, i17, sVar, null), 3, null);
                }
            }
        }
        fg2.l1 l1Var4 = this.f436344J;
        if (l1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        l1Var4.f343663c.setEnabled(this.L > 0);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLivePayMicAddPricePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View u() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(this.f199716e);
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80007x8e72c9b1);
        c22699x3dcdb352.setRotation(180.0f);
        c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        c22699x3dcdb352.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(c22699x3dcdb352.getContext(), 12), i65.a.b(c22699x3dcdb352.getContext(), 24)));
        return c22699x3dcdb352;
    }
}
