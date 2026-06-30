package vj2;

/* loaded from: classes10.dex */
public final class a extends oj2.l {
    public android.view.ViewGroup T;
    public android.view.ViewGroup U;
    public android.view.ViewGroup V;
    public android.view.ViewGroup W;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.TextView f519193l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.ViewGroup f519194p0;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.ViewGroup f519195x0;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.ViewGroup f519196y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // oj2.l, wj2.w
    public void R() {
        super.R();
        if (b0()) {
            android.view.ViewGroup viewGroup = this.f519195x0;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smallLayout");
                throw null;
            }
            viewGroup.setVisibility(8);
            android.view.ViewGroup viewGroup2 = this.f519196y0;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("focusLayout");
                throw null;
            }
        }
        android.view.ViewGroup viewGroup3 = this.f519195x0;
        if (viewGroup3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smallLayout");
            throw null;
        }
        viewGroup3.setVisibility(0);
        android.view.ViewGroup viewGroup4 = this.f519196y0;
        if (viewGroup4 != null) {
            viewGroup4.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("focusLayout");
            throw null;
        }
    }

    @Override // oj2.l, sj2.m
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onGiftAnimationStart");
    }

    @Override // oj2.l
    public void a0() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aun, (android.view.ViewGroup) this, false);
        int i17 = com.p314xaae8f345.mm.R.id.g9c;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.g9c);
        if (imageView != null) {
            i17 = com.p314xaae8f345.mm.R.id.f566159ey1;
            android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566159ey1);
            if (a17 != null) {
                fg2.u a18 = fg2.u.a(a17);
                android.view.View a19 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566160ey2);
                if (a19 != null) {
                    fg2.y a27 = fg2.y.a(a19);
                    android.view.View a28 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566164ey5);
                    if (a28 != null) {
                        fg2.v1 a29 = fg2.v1.a(a28);
                        android.view.View a37 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566244f85);
                        if (a37 != null) {
                            fg2.x a38 = fg2.x.a(a37);
                            android.view.View a39 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f8q);
                            if (a39 != null) {
                                fg2.z a47 = fg2.z.a(a39);
                                int i18 = com.p314xaae8f345.mm.R.id.f_i;
                                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f_i);
                                if (frameLayout != null) {
                                    i18 = com.p314xaae8f345.mm.R.id.f_v;
                                    android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f_v);
                                    if (frameLayout2 != null) {
                                        i18 = com.p314xaae8f345.mm.R.id.f_w;
                                        android.view.View a48 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f_w);
                                        if (a48 != null) {
                                            fg2.r0 a49 = fg2.r0.a(a48);
                                            android.view.View a57 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.q7d);
                                            if (a57 != null) {
                                                fg2.s0 a58 = fg2.s0.a(a57);
                                                int i19 = com.p314xaae8f345.mm.R.id.fa_;
                                                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fa_);
                                                if (textView != null) {
                                                    i19 = com.p314xaae8f345.mm.R.id.fak;
                                                    android.view.View a59 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fak);
                                                    if (a59 != null) {
                                                        fg2.r0 a67 = fg2.r0.a(a59);
                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea c22641xff2656ea = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea) inflate;
                                                        android.view.View a68 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.qrl);
                                                        if (a68 != null) {
                                                            fg2.s0 a69 = fg2.s0.a(a68);
                                                            int i27 = com.p314xaae8f345.mm.R.id.fm8;
                                                            if (((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fm8)) != null) {
                                                                i27 = com.p314xaae8f345.mm.R.id.fqg;
                                                                android.view.View a76 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fqg);
                                                                if (a76 != null) {
                                                                    fg2.y1 a77 = fg2.y1.a(a76);
                                                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea c22641xff2656ea2 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.g_m);
                                                                    if (c22641xff2656ea2 != null) {
                                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea c22641xff2656ea3 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.n0k);
                                                                        if (c22641xff2656ea3 != null) {
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22641xff2656ea, "getRoot(...)");
                                                                            m151546x764fb064(c22641xff2656ea);
                                                                            m151542x1da37660(textView);
                                                                            m151541xc9649f78(frameLayout);
                                                                            android.widget.RelativeLayout relativeLayout = a77.f343938a;
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "getRoot(...)");
                                                                            m151545x4d20176c(relativeLayout);
                                                                            android.widget.RelativeLayout relativeLayout2 = a47.f343939a;
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout2, "getRoot(...)");
                                                                            m151540x91c3b56e(relativeLayout2);
                                                                            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = a67.f343815a;
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a787, "getRoot(...)");
                                                                            m151543x96ee7780(c1073x7e08a787);
                                                                            android.widget.RelativeLayout relativeLayout3 = a38.f343923a;
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout3, "getRoot(...)");
                                                                            m151539xe2837de3(relativeLayout3);
                                                                            this.f519195x0 = c22641xff2656ea3;
                                                                            m151544x719c0af4(a69.f343827b);
                                                                            this.f519194p0 = frameLayout2;
                                                                            android.widget.RelativeLayout relativeLayout4 = a29.f343916a;
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout4, "getRoot(...)");
                                                                            this.W = relativeLayout4;
                                                                            android.widget.RelativeLayout relativeLayout5 = a27.f343929a;
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout5, "getRoot(...)");
                                                                            this.V = relativeLayout5;
                                                                            android.widget.RelativeLayout relativeLayout6 = a18.f343875a;
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout6, "getRoot(...)");
                                                                            this.T = relativeLayout6;
                                                                            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = a49.f343815a;
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a7872, "getRoot(...)");
                                                                            this.U = c1073x7e08a7872;
                                                                            this.f519196y0 = c22641xff2656ea2;
                                                                            this.f519193l1 = a58.f343827b;
                                                                            m151538x2eb7dd5d(imageView);
                                                                            return;
                                                                        }
                                                                        i17 = com.p314xaae8f345.mm.R.id.n0k;
                                                                    } else {
                                                                        i17 = com.p314xaae8f345.mm.R.id.g_m;
                                                                    }
                                                                }
                                                            }
                                                            i17 = i27;
                                                        } else {
                                                            i17 = com.p314xaae8f345.mm.R.id.qrl;
                                                        }
                                                    }
                                                }
                                                i17 = i19;
                                            } else {
                                                i17 = com.p314xaae8f345.mm.R.id.q7d;
                                            }
                                        }
                                    }
                                }
                                i17 = i18;
                            } else {
                                i17 = com.p314xaae8f345.mm.R.id.f8q;
                            }
                        } else {
                            i17 = com.p314xaae8f345.mm.R.id.f566244f85;
                        }
                    } else {
                        i17 = com.p314xaae8f345.mm.R.id.f566164ey5;
                    }
                } else {
                    i17 = com.p314xaae8f345.mm.R.id.f566160ey2;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    public final boolean b0() {
        xh2.i iVar;
        xh2.a m145850xf6df7a5e = m145850xf6df7a5e();
        return (m145850xf6df7a5e == null || (iVar = m145850xf6df7a5e.f536054b) == null || iVar.f536086e != 1) ? false : true;
    }

    @Override // oj2.l, sj2.m
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onGiftAnimationEnd");
    }

    @Override // oj2.l, wj2.w, lj2.u0
    /* renamed from: getAnchorAudioModeLayout */
    public android.view.ViewGroup mo124425xd504a5f8() {
        if (!b0()) {
            return m151530xe347cf6c();
        }
        android.view.ViewGroup viewGroup = this.f519194p0;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicFocusAnchorAudioLayout");
        throw null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    /* renamed from: getAnchorCriticalLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124426x1ce0d634() {
        return null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    /* renamed from: getBattleResultWidget */
    public /* bridge */ /* synthetic */ ai2.a mo124427x4f7d778f() {
        return null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    /* renamed from: getBattleTipsWidget */
    public /* bridge */ /* synthetic */ qi2.s1 mo124428x3f645dea() {
        return null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124429x4ed4a76f() {
        return null;
    }

    @Override // oj2.l, wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
    }

    @Override // oj2.l, wj2.w, sj2.m
    /* renamed from: getGiftRootView */
    public android.view.ViewGroup mo124433x9681e6d() {
        if (!b0()) {
            return m151532x3e2ffa0c();
        }
        android.view.ViewGroup viewGroup = this.U;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveFocusMicGiftItemLayout");
        throw null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    /* renamed from: getLotteryBubbleRootView */
    public android.view.ViewGroup mo124434x83df3d46() {
        if (!b0()) {
            return m151528xda6b726f();
        }
        android.view.ViewGroup viewGroup = this.T;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveFocusLotteryBubbleRoot");
        throw null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    /* renamed from: getLuckyMoneyRootView */
    public android.view.ViewGroup mo124447xe76ca375() {
        if (!b0()) {
            return m151529xbf9ab862();
        }
        android.view.ViewGroup viewGroup = this.V;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveFocusLuckyMoneyBubbleUiRoot");
        throw null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    @Override // oj2.l
    /* renamed from: getMicTagText */
    public android.widget.TextView mo151536xf4907796() {
        return b0() ? this.f519193l1 : m151533xf748dbe8();
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "GrabFocusCoverAnchorWidget";
    }

    @Override // oj2.l, wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public android.view.ViewGroup mo124442x86ddad3() {
        if (!b0()) {
            return m151534x9d534e60();
        }
        android.view.ViewGroup viewGroup = this.W;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveFocusVoteBubbleRoot");
        throw null;
    }
}
