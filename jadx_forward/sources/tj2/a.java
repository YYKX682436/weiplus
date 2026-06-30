package tj2;

/* loaded from: classes10.dex */
public final class a extends wj2.y {
    public android.view.View F1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // wj2.y, oj2.l, wj2.w
    public void R() {
        super.R();
        android.view.View view = this.F1;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("clickContainView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int C0 = zl2.r4.C0(zl2.r4.f555483a, 0, 0, 3, null);
            df2.nv nvVar = (df2.nv) m174009x3a33aac1().o(df2.nv.class);
            marginLayoutParams.topMargin = C0 + (nvVar != null ? nvVar.f312423q : 0);
        }
    }

    @Override // wj2.y, oj2.l
    public void a0() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dnl, (android.view.ViewGroup) this, false);
        int i17 = com.p314xaae8f345.mm.R.id.g9c;
        if (((android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.g9c)) != null) {
            i17 = com.p314xaae8f345.mm.R.id.f1j;
            if (((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f1j)) != null) {
                i17 = com.p314xaae8f345.mm.R.id.afh;
                if (((android.widget.Space) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.afh)) != null) {
                    i17 = com.p314xaae8f345.mm.R.id.fxv;
                    p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fxv);
                    if (c1073x7e08a787 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.ejn;
                        if (((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.ejn)) != null) {
                            i17 = com.p314xaae8f345.mm.R.id.eop;
                            android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.eop);
                            if (a17 != null) {
                                fg2.j1.a(a17);
                                i17 = com.p314xaae8f345.mm.R.id.f566099ep0;
                                android.view.View a18 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566099ep0);
                                if (a18 != null) {
                                    fg2.k1.a(a18);
                                    i17 = com.p314xaae8f345.mm.R.id.f566105er0;
                                    if (((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566105er0)) != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.ewh;
                                        if (((android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.ewh)) != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.f566244f85;
                                            android.view.View a19 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566244f85);
                                            if (a19 != null) {
                                                fg2.u.a(a19);
                                                i17 = com.p314xaae8f345.mm.R.id.f8q;
                                                android.view.View a27 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f8q);
                                                if (a27 != null) {
                                                    fg2.y.a(a27);
                                                    i17 = com.p314xaae8f345.mm.R.id.f_i;
                                                    if (((android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f_i)) != null) {
                                                        i17 = com.p314xaae8f345.mm.R.id.fa_;
                                                        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1515xd1075a44.C14247x773fe6c4) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fa_)) != null) {
                                                            i17 = com.p314xaae8f345.mm.R.id.fak;
                                                            android.view.View a28 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fak);
                                                            if (a28 != null) {
                                                                fg2.r0.a(a28);
                                                                i17 = com.p314xaae8f345.mm.R.id.fal;
                                                                android.view.View a29 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fal);
                                                                if (a29 != null) {
                                                                    fg2.x0.a(a29);
                                                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea c22641xff2656ea = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea) inflate;
                                                                    int i18 = com.p314xaae8f345.mm.R.id.fqg;
                                                                    android.view.View a37 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fqg);
                                                                    if (a37 != null) {
                                                                        fg2.v1.a(a37);
                                                                        i18 = com.p314xaae8f345.mm.R.id.f567850qn3;
                                                                        if (((android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f567850qn3)) != null) {
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22641xff2656ea, "getRoot(...)");
                                                                            d0(c22641xff2656ea);
                                                                            this.F1 = c1073x7e08a787;
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
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // oj2.l
    /* renamed from: getClickView */
    public android.view.View mo151527x8a4de197() {
        android.view.View view = this.F1;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("clickContainView");
        throw null;
    }

    @Override // wj2.y, oj2.l, wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
    }

    @Override // wj2.y, oj2.l, wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    @Override // wj2.y, lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "FullCoverPkAnchorSelfWidget";
    }
}
