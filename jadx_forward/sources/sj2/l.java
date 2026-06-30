package sj2;

/* loaded from: classes10.dex */
public final class l extends sj2.i {
    public final fg2.q0 N;
    public final wj2.j0 P;
    public wj2.j0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570460av1, (android.view.ViewGroup) this, false);
        int i17 = com.p314xaae8f345.mm.R.id.f8q;
        android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f8q);
        if (a17 != null) {
            fg2.a0 a18 = fg2.a0.a(a17);
            i17 = com.p314xaae8f345.mm.R.id.fa_;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fa_);
            if (textView != null) {
                i17 = com.p314xaae8f345.mm.R.id.fag;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fag);
                if (frameLayout != null) {
                    i17 = com.p314xaae8f345.mm.R.id.faj;
                    android.view.View a19 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.faj);
                    if (a19 != null) {
                        fg2.h0 a27 = fg2.h0.a(a19);
                        i17 = com.p314xaae8f345.mm.R.id.rmf;
                        android.view.View a28 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.rmf);
                        if (a28 != null) {
                            fg2.t0 a29 = fg2.t0.a(a28);
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea c22641xff2656ea = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea) inflate;
                            int i18 = com.p314xaae8f345.mm.R.id.jj8;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.jj8);
                            if (textView2 != null) {
                                i18 = com.p314xaae8f345.mm.R.id.jja;
                                android.view.View a37 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.jja);
                                if (a37 != null) {
                                    i18 = com.p314xaae8f345.mm.R.id.n0k;
                                    p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.n0k);
                                    if (c1073x7e08a787 != null) {
                                        this.N = new fg2.q0(c22641xff2656ea, a18, textView, frameLayout, a27, a29, c22641xff2656ea, textView2, a37, c1073x7e08a787);
                                        addView(c22641xff2656ea);
                                        c22641xff2656ea.setOnClickListener(this);
                                        android.widget.LinearLayout linearLayout = a29.f343848a;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linearLayout, "getRoot(...)");
                                        this.P = new wj2.j0(linearLayout, pluginAbility, service);
                                        frameLayout.setOnClickListener(this);
                                        return;
                                    }
                                }
                            }
                            i17 = i18;
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    /* renamed from: getMicHeartText */
    private final android.widget.TextView m164668xb52f4282() {
        if (!this.M) {
            return this.N.f343791c;
        }
        android.view.ViewGroup T = m174009x3a33aac1().T();
        if (T != null) {
            return (android.widget.TextView) T.findViewById(com.p314xaae8f345.mm.R.id.fa_);
        }
        return null;
    }

    /* renamed from: getVideoFocusMuteView */
    private final android.view.View m164669xde348a91() {
        android.view.ViewGroup T;
        lj2.v0 m174009x3a33aac1 = m174009x3a33aac1();
        if (m174009x3a33aac1 == null || (T = m174009x3a33aac1.T()) == null) {
            return null;
        }
        return T.findViewById(com.p314xaae8f345.mm.R.id.fag);
    }

    @Override // wj2.w
    public void S(android.widget.TextView textView) {
        super.S(textView);
        if (!m174009x3a33aac1().a0().n() || textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    @Override // sj2.m
    public void a() {
    }

    @Override // sj2.i
    public void b0(boolean z17) {
        android.widget.TextView m164668xb52f4282;
        android.view.ViewGroup T;
        android.view.ViewGroup T2;
        android.view.View findViewById;
        float b17 = i65.a.b(getContext(), 8);
        if (!(D() ? zl2.r4.f555483a.x1() : !Z())) {
            b17 = 0.0f;
        }
        fg2.q0 q0Var = this.N;
        android.graphics.drawable.Drawable background = q0Var.f343795g.getBackground();
        android.graphics.drawable.GradientDrawable gradientDrawable = background instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(b17);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea c22641xff2656ea = q0Var.f343789a;
        if (z17) {
            c22641xff2656ea.m81431x205ac394(0.0f);
        } else {
            c22641xff2656ea.m81431x205ac394(b17);
        }
        xh2.a m145850xf6df7a5e = m145850xf6df7a5e();
        if (m145850xf6df7a5e != null) {
            if (z17) {
                lj2.v0 m174009x3a33aac1 = m174009x3a33aac1();
                if (m174009x3a33aac1 != null && (T2 = m174009x3a33aac1.T()) != null && (findViewById = T2.findViewById(com.p314xaae8f345.mm.R.id.rmf)) != null) {
                    this.Q = new wj2.j0(findViewById, m174009x3a33aac1(), m174010xb411027f());
                }
                wj2.j0 j0Var = this.Q;
                if (j0Var != null) {
                    j0Var.b(m145850xf6df7a5e, new lj2.e0(j0Var.f528222a, lj2.f0.f400389e));
                }
            } else {
                wj2.j0 j0Var2 = this.P;
                if (j0Var2 != null) {
                    j0Var2.b(m145850xf6df7a5e, new lj2.e0(this, lj2.f0.f400389e));
                }
            }
        }
        if (m145849x949ba2a5() != null) {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = q0Var.f343796h;
            if (z17) {
                c1073x7e08a787.setVisibility(8);
                android.view.View m164669xde348a91 = m164669xde348a91();
                if (m164669xde348a91 != null) {
                    m164669xde348a91.setOnClickListener(new sj2.k(this));
                }
            } else {
                c1073x7e08a787.setVisibility(0);
                u(q0Var.f343794f);
            }
        }
        lj2.v0 m174009x3a33aac12 = m174009x3a33aac1();
        if (m174009x3a33aac12 != null && (T = m174009x3a33aac12.T()) != null && this.M && !D()) {
            android.widget.ImageView imageView = (android.widget.ImageView) T.findViewById(com.p314xaae8f345.mm.R.id.vnr);
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            T.setVisibility(0);
            T.setOnClickListener(new sj2.j(this));
            km2.q m145849x949ba2a5 = m145849x949ba2a5();
            android.view.View findViewById2 = T.findViewById(com.p314xaae8f345.mm.R.id.jj8);
            if (m145849x949ba2a5 != null && findViewById2 != null) {
                ((android.widget.TextView) findViewById2).setText(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nse, zl2.r4.D0(zl2.r4.f555483a, m145849x949ba2a5.f390705c, m145849x949ba2a5.f390706d, false, 4, null)));
            }
            km2.q m145849x949ba2a52 = m145849x949ba2a5();
            android.view.View findViewById3 = T.findViewById(com.p314xaae8f345.mm.R.id.tig);
            if (m145849x949ba2a52 != null && findViewById3 != null) {
                ya2.g gVar = ya2.h.f542017a;
                java.lang.String str = m145849x949ba2a52.f390705c;
                if (!(str != null ? r26.i0.n(str, "@finder", false) : false) || m145849x949ba2a52.f390710h) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "onFocusHeaderShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "onFocusHeaderShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "onFocusHeaderShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "onFocusHeaderShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        S(m164668xb52f4282());
        if (!A() || (m164668xb52f4282 = m164668xb52f4282()) == null) {
            return;
        }
        m174012xaf0594a2(m164668xb52f4282);
        m164668xb52f4282.setOnClickListener(this);
    }

    @Override // sj2.m
    public void d() {
    }

    @Override // lj2.u0
    public void e() {
        S(m164668xb52f4282());
    }

    @Override // wj2.w, lj2.u0
    public void f(boolean z17, int i17, boolean z18) {
        android.view.View m164669xde348a91;
        super.f(z17, i17, z18);
        boolean B = B();
        fg2.q0 q0Var = this.N;
        if (!B && (!G() || !m174009x3a33aac1().a0().F())) {
            if (this.M && (m164669xde348a91 = m164669xde348a91()) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m164669xde348a91, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "notifyMicUserTalkingStateChange", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m164669xde348a91.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(m164669xde348a91, "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "notifyMicUserTalkingStateChange", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            q0Var.f343792d.setVisibility(8);
            return;
        }
        if (!this.M) {
            q0Var.f343792d.setVisibility(0);
            return;
        }
        android.view.View m164669xde348a912 = m164669xde348a91();
        if (m164669xde348a912 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m164669xde348a912, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "notifyMicUserTalkingStateChange", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m164669xde348a912.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(m164669xde348a912, "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "notifyMicUserTalkingStateChange", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // sj2.i, wj2.w, lj2.u0
    /* renamed from: getAnchorAudioModeLayout */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124425xd504a5f8() {
        return null;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    /* renamed from: getAnchorCriticalLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124426x1ce0d634() {
        return null;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    /* renamed from: getBattleResultWidget */
    public /* bridge */ /* synthetic */ ai2.a mo124427x4f7d778f() {
        return null;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    /* renamed from: getBattleTipsWidget */
    public /* bridge */ /* synthetic */ qi2.s1 mo124428x3f645dea() {
        return null;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124429x4ed4a76f() {
        return null;
    }

    @Override // sj2.i, wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
    }

    @Override // sj2.i, wj2.w, sj2.m
    /* renamed from: getGiftRootView */
    public android.view.ViewGroup mo124433x9681e6d() {
        android.widget.RelativeLayout relativeLayout = this.N.f343793e.f343595a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "getRoot(...)");
        return relativeLayout;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    /* renamed from: getLotteryBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124434x83df3d46() {
        return null;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    /* renamed from: getLuckyMoneyRootView */
    public android.view.ViewGroup mo124447xe76ca375() {
        android.widget.RelativeLayout relativeLayout = this.N.f343790b.f343469a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "getRoot(...)");
        return relativeLayout;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    @Override // sj2.i
    /* renamed from: getRoundCornerConstraintLayout */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea mo164659xafdbe1d4() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea c22641xff2656ea = this.N.f343789a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22641xff2656ea, "getRoot(...)");
        return c22641xff2656ea;
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "FocusVideoCoverWidget";
    }

    @Override // sj2.i, wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.q0 q0Var = this.N;
        int id6 = q0Var.f343789a.getId();
        boolean z17 = false;
        if (valueOf != null && valueOf.intValue() == id6) {
            if (this.M && !E()) {
                a0();
                return;
            } else if (G()) {
                wj2.w.U(this, 0, 1, null);
                return;
            } else {
                X();
                return;
            }
        }
        int id7 = q0Var.f343792d.getId();
        if (valueOf != null && valueOf.intValue() == id7) {
            L();
            return;
        }
        android.widget.TextView m164668xb52f4282 = m164668xb52f4282();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, m164668xb52f4282 != null ? java.lang.Integer.valueOf(m164668xb52f4282.getId()) : null)) {
            android.widget.TextView m164668xb52f42822 = m164668xb52f4282();
            if (m164668xb52f42822 != null) {
                if (m164668xb52f42822.getVisibility() == 0) {
                    z17 = true;
                }
            }
            if (z17) {
                H();
            }
        }
    }

    @Override // wj2.w, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wj2.j0 j0Var = this.P;
        if (j0Var != null) {
            j0Var.c();
        }
        wj2.j0 j0Var2 = this.Q;
        if (j0Var2 != null) {
            j0Var2.c();
        }
    }
}
