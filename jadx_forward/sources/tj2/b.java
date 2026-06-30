package tj2;

/* loaded from: classes10.dex */
public final class b extends wj2.c0 {
    public android.view.ViewGroup D1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // wj2.c0, oj2.o, wj2.w
    public void R() {
        super.R();
        android.view.ViewGroup viewGroup = this.D1;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("clickContainView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int C0 = zl2.r4.C0(zl2.r4.f555483a, 0, 0, 3, null);
            df2.nv nvVar = (df2.nv) m174009x3a33aac1().o(df2.nv.class);
            marginLayoutParams.topMargin = C0 + (nvVar != null ? nvVar.f312423q : 0);
        }
    }

    @Override // wj2.c0, oj2.o
    public void a0() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.df6, (android.view.ViewGroup) this, false);
        int i17 = com.p314xaae8f345.mm.R.id.afh;
        if (((android.widget.Space) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.afh)) != null) {
            i17 = com.p314xaae8f345.mm.R.id.fxv;
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fxv);
            if (c1073x7e08a787 != null) {
                i17 = com.p314xaae8f345.mm.R.id.che;
                if (((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.che)) != null) {
                    i17 = com.p314xaae8f345.mm.R.id.eop;
                    android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.eop);
                    if (a17 != null) {
                        fg2.j1.a(a17);
                        i17 = com.p314xaae8f345.mm.R.id.f566099ep0;
                        android.view.View a18 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566099ep0);
                        if (a18 != null) {
                            fg2.k1.a(a18);
                            i17 = com.p314xaae8f345.mm.R.id.evg;
                            android.view.View a19 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.evg);
                            if (a19 != null) {
                                fg2.v0.a(a19);
                                i17 = com.p314xaae8f345.mm.R.id.fa_;
                                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1515xd1075a44.C14247x773fe6c4) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fa_)) != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.fag;
                                    if (((android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fag)) != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.fah;
                                        if (((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fah)) != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.fak;
                                            android.view.View a27 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fak);
                                            if (a27 != null) {
                                                fg2.r0.a(a27);
                                                i17 = com.p314xaae8f345.mm.R.id.fal;
                                                android.view.View a28 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fal);
                                                if (a28 != null) {
                                                    fg2.x0.a(a28);
                                                    i17 = com.p314xaae8f345.mm.R.id.fnz;
                                                    if (((android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fnz)) != null) {
                                                        i17 = com.p314xaae8f345.mm.R.id.f566369fo0;
                                                        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566369fo0)) != null) {
                                                            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate;
                                                            int i18 = com.p314xaae8f345.mm.R.id.f566371fo3;
                                                            if (((android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566371fo3)) != null) {
                                                                i18 = com.p314xaae8f345.mm.R.id.f568213m42;
                                                                if (((android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f568213m42)) != null) {
                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a7872, "getRoot(...)");
                                                                    f0(c1073x7e08a7872);
                                                                    this.D1 = c1073x7e08a787;
                                                                    android.view.ViewGroup.LayoutParams layoutParams = c1073x7e08a787.getLayoutParams();
                                                                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                                                                    if (marginLayoutParams != null) {
                                                                        marginLayoutParams.topMargin = zl2.r4.C0(zl2.r4.f555483a, 0, 0, 3, null);
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                            }
                                                            i17 = i18;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // wj2.c0, oj2.o, wj2.w, lj2.u0
    /* renamed from: getAnchorAudioModeLayout */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124425xd504a5f8() {
        return null;
    }

    @Override // wj2.c0, oj2.o, wj2.w, lj2.u0
    /* renamed from: getAnchorCriticalLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124426x1ce0d634() {
        return null;
    }

    @Override // oj2.o
    /* renamed from: getClickRoot */
    public android.view.ViewGroup mo151577x8a4c27d4() {
        android.view.ViewGroup viewGroup = this.D1;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("clickContainView");
        throw null;
    }

    @Override // wj2.c0, oj2.o, wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124429x4ed4a76f() {
        return null;
    }

    @Override // wj2.c0, oj2.o, wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
    }

    @Override // wj2.c0, oj2.o, wj2.w, lj2.u0
    /* renamed from: getLotteryBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124434x83df3d46() {
        return null;
    }

    @Override // wj2.c0, oj2.o, wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    @Override // wj2.c0, lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "FullCoverPkOtherAnchorWidget";
    }

    @Override // wj2.c0, oj2.o, wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    @Override // wj2.c0, wj2.w
    public void x() {
    }
}
