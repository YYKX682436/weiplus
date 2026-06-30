package wj2;

/* loaded from: classes10.dex */
public class y extends oj2.l {
    public android.view.ViewGroup A1;
    public android.widget.FrameLayout B1;
    public android.widget.FrameLayout C1;
    public android.widget.TextView D1;
    public android.animation.Animator E1;
    public lj2.c0 T;
    public lj2.p U;
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 V;
    public android.view.ViewGroup W;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.ImageView f528269l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.ViewGroup f528270p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.ImageView f528271p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.TextView f528272x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.ViewGroup f528273x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.TextView f528274y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.TextView f528275y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.widget.Space f528276z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    /* renamed from: setPkExtraValue */
    private final void m174013xd368911e(long j17) {
        android.widget.TextView m174021x80f09de4 = m174021x80f09de4();
        m174021x80f09de4.setText(m174021x80f09de4.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lvh, java.lang.Long.valueOf(j17)));
    }

    @Override // oj2.l, wj2.w
    public void R() {
        android.widget.TextView m151535xb52f4282;
        java.lang.String str;
        java.lang.String str2;
        S(m151535xb52f4282());
        Z(this.f400410h);
        e();
        xh2.a m145850xf6df7a5e = m145850xf6df7a5e();
        if (m145850xf6df7a5e != null) {
            lj2.p m174014x60bec2a4 = m174014x60bec2a4();
            km2.q qVar = m145850xf6df7a5e.f536053a;
            java.lang.String str3 = "";
            if (qVar == null || (str = qVar.f390705c) == null) {
                str = "";
            }
            if (qVar != null && (str2 = qVar.f390703a) != null) {
                str3 = str2;
            }
            m174014x60bec2a4.a(str, str3);
            m174015xabd26bbc().f(m145850xf6df7a5e.f536054b.f364142a < 0.5f);
        }
        if (m174009x3a33aac1().a0().g().size() <= 2) {
            m174037x875dffd2(1.0f);
        } else {
            m174037x875dffd2(0.6f);
        }
        if (!A() || (m151535xb52f4282 = m151535xb52f4282()) == null) {
            return;
        }
        m174012xaf0594a2(m151535xb52f4282);
        m151535xb52f4282.setOnClickListener(this);
    }

    @Override // oj2.l
    public void a0() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.av8, (android.view.ViewGroup) this, false);
        int i17 = com.p314xaae8f345.mm.R.id.g9c;
        if (((android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.g9c)) != null) {
            i17 = com.p314xaae8f345.mm.R.id.f1j;
            if (((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f1j)) != null) {
                i17 = com.p314xaae8f345.mm.R.id.afh;
                if (((android.widget.Space) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.afh)) != null) {
                    i17 = com.p314xaae8f345.mm.R.id.ejn;
                    if (((android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.ejn)) != null) {
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
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    public void b0() {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
        cVar.d(m174018x602fd345());
        if (m()) {
            cVar.e(m174022xa0018989().getId(), 3, m174019xe1d86281().getId(), 4);
            cVar.f(m174022xa0018989().getId(), 1, 0, 1, i65.a.b(m151537xfb84e958().getContext(), 8));
            cVar.e(m174022xa0018989().getId(), 2, m151530xe347cf6c().getId(), 1);
            cVar.e(m151530xe347cf6c().getId(), 1, m174022xa0018989().getId(), 2);
            cVar.e(m151530xe347cf6c().getId(), 3, m174019xe1d86281().getId(), 4);
        } else {
            cVar.f(m174022xa0018989().getId(), 2, 0, 2, i65.a.b(m151537xfb84e958().getContext(), 8));
            cVar.e(m174022xa0018989().getId(), 3, m174019xe1d86281().getId(), 4);
            cVar.e(m151530xe347cf6c().getId(), 3, m174019xe1d86281().getId(), 4);
            cVar.e(m151530xe347cf6c().getId(), 1, 0, 1);
        }
        android.view.ViewGroup m151537xfb84e958 = m151537xfb84e958();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m151537xfb84e958, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) m151537xfb84e958;
        cVar.b(c1073x7e08a787);
        c1073x7e08a787.m7179xd020a803(null);
    }

    @Override // lj2.u0
    public void c(dk2.u4 battleInfo) {
        java.util.LinkedList<r45.qn0> m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(battleInfo, "battleInfo");
        r45.hm1 hm1Var = battleInfo.f315698l;
        if (hm1Var == null || (m75941xfb821914 = hm1Var.m75941xfb821914(1)) == null) {
            return;
        }
        for (r45.qn0 qn0Var : m75941xfb821914) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qn0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "on battle extra type = " + qn0Var.m75939xb282bd08(2) + " total = " + qn0Var.m75942xfb822ef2(1) + ", diff = " + qn0Var.m75942xfb822ef2(0));
            if (qn0Var.m75939xb282bd08(2) == 1 && qn0Var.m75942xfb822ef2(0) > 0) {
                m174013xd368911e(qn0Var.m75942xfb822ef2(0));
                android.animation.Animator animator = this.E1;
                if (animator != null) {
                    animator.cancel();
                }
                boolean z17 = m151530xe347cf6c().getVisibility() == 0;
                if (z17) {
                    m151530xe347cf6c().setVisibility(8);
                }
                m174021x80f09de4().setVisibility(0);
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(m174021x80f09de4(), "alpha", 0.5f, 1.0f);
                ofFloat.setDuration(300L);
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(m174021x80f09de4(), "scaleX", 1.25f, 1.0f);
                ofFloat2.setDuration(300L);
                android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(m174021x80f09de4(), "scaleY", 1.25f, 1.0f);
                ofFloat3.setDuration(300L);
                android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(m174021x80f09de4(), "alpha", 1.0f, 0.0f);
                ofFloat4.setDuration(300L);
                ofFloat4.setStartDelay(3000L);
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                animatorSet.addListener(new wj2.x(this, z17));
                this.E1 = animatorSet;
                animatorSet.start();
            }
        }
    }

    public final void c0() {
        jz5.f0 f0Var;
        lj2.t0 a07 = m174009x3a33aac1().a0();
        if (a07 == null || a07.K() == null) {
            f0Var = null;
        } else {
            m174023x6a4ab8f2().setOnClickListener(this);
            m174028x8faa163d().setOnClickListener(this);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            m174023x6a4ab8f2().setOnClickListener(null);
            m174028x8faa163d().setOnClickListener(null);
        }
    }

    public final void d0(android.view.ViewGroup rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        m151546x764fb064(rootView);
        android.view.View findViewById = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.f1j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        m174034xf30639b9((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) findViewById);
        android.view.View findViewById2 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.f_i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        m151541xc9649f78((android.view.ViewGroup) findViewById2);
        android.view.View findViewById3 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.fqg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        m151545x4d20176c((android.view.ViewGroup) findViewById3);
        android.view.View findViewById4 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.f8q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        m151540x91c3b56e((android.view.ViewGroup) findViewById4);
        android.view.View findViewById5 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.fak);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        m151543x96ee7780((android.view.ViewGroup) findViewById5);
        android.view.View findViewById6 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.f566244f85);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        m151539xe2837de3((android.view.ViewGroup) findViewById6);
        android.view.View findViewById7 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.fa_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        m151542x1da37660((android.widget.TextView) findViewById7);
        android.view.View findViewById8 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.f566099ep0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        m174031x7be51e30(new lj2.c0(findViewById8, m174009x3a33aac1()));
        android.view.View findViewById9 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.eop);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        m174030x108b8bb0(new lj2.p((android.view.ViewGroup) findViewById9));
        android.view.View findViewById10 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.fal);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        m174039xd64a8495((android.view.ViewGroup) findViewById10);
        android.view.View findViewById11 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.fa7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        m174040x45e0c566((android.view.ViewGroup) findViewById11);
        android.view.View findViewById12 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.fa8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        m174042x2da163e0((android.widget.TextView) findViewById12);
        android.view.View findViewById13 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.fap);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        m174041x66616e69((android.widget.TextView) findViewById13);
        android.view.View findViewById14 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.qag);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        m174043x2a4f994a((android.widget.ImageView) findViewById14);
        android.view.View findViewById15 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.qam);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById15, "findViewById(...)");
        m174044xb96188c8((android.widget.ImageView) findViewById15);
        zl2.r4.f555483a.b3(m174025xf6caca6c());
        android.view.View findViewById16 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.fa9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById16, "findViewById(...)");
        m174045xc680afb1((android.view.ViewGroup) findViewById16);
        android.view.View findViewById17 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.qrm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById17, "findViewById(...)");
        m174046x5dfd6f74((android.widget.TextView) findViewById17);
        android.view.View findViewById18 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.afh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById18, "findViewById(...)");
        m174035xa9ceca8d((android.widget.Space) findViewById18);
        android.view.View findViewById19 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.f566105er0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById19, "findViewById(...)");
        m174036x15269058((android.view.ViewGroup) findViewById19);
        android.view.View findViewById20 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.ejn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById20, "findViewById(...)");
        m174033x27581405((android.widget.FrameLayout) findViewById20);
        android.view.View findViewById21 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.ewh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById21, "findViewById(...)");
        m174032xfe2bb90((android.widget.FrameLayout) findViewById21);
        m151538x2eb7dd5d((android.widget.ImageView) m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.g9c));
        android.view.View findViewById22 = m151537xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.f567850qn3);
        android.widget.TextView textView = (android.widget.TextView) findViewById22;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById22, "also(...)");
        m174038x17561158((android.widget.TextView) findViewById22);
    }

    @Override // oj2.l, lj2.u0
    public void e() {
        jz5.f0 f0Var;
        dk2.u4 K;
        c0();
        lj2.t0 a07 = m174009x3a33aac1().a0();
        if (a07 == null || (K = a07.K()) == null) {
            f0Var = null;
        } else {
            if (K.h() || K.i()) {
                android.view.ViewGroup m174022xa0018989 = m174022xa0018989();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m174022xa0018989, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m174022xa0018989.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(m174022xa0018989, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView m151531xeb5fda54 = m151531xeb5fda54();
                if (m151531xeb5fda54 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(m151531xeb5fda54, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    m151531xeb5fda54.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(m151531xeb5fda54, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                java.util.List g17 = m174009x3a33aac1().a0().g();
                if (g17.size() > 1) {
                    if (K.f315693g == 2) {
                        f0(K);
                    } else {
                        e0(K);
                    }
                } else if (g17.size() == 1 && (!m174009x3a33aac1().a0().l().isEmpty())) {
                    f0(K);
                } else {
                    super.e();
                    android.view.ViewGroup m174022xa00189892 = m174022xa0018989();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(m174022xa00189892, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    m174022xa00189892.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(m174022xa00189892, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                super.e();
                android.view.ViewGroup m174022xa00189893 = m174022xa0018989();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(m174022xa00189893, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m174022xa00189893.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(m174022xa00189893, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            super.e();
            m174022xa0018989().setVisibility(8);
        }
    }

    public final void e0(dk2.u4 finderLiveBattleData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderLiveBattleData, "finderLiveBattleData");
        b0();
        m174028x8faa163d().setVisibility(8);
        m174029xcb270900().setText("0");
        m174023x6a4ab8f2().setVisibility(0);
        m174026xf4069e3e().setVisibility(8);
        m174024x2f8ad4f5().setTypeface(android.graphics.Typeface.defaultFromStyle(0));
        m174024x2f8ad4f5().setVisibility(8);
        m174025xf6caca6c().setVisibility(8);
        int h17 = m174009x3a33aac1().a0().h(m145849x949ba2a5());
        m174025xf6caca6c().setText(java.lang.String.valueOf(h17));
        if (h17 == 1) {
            m174025xf6caca6c().setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560611pg));
            m174025xf6caca6c().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ck_));
            m174023x6a4ab8f2().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a8v));
        } else if (h17 == 2) {
            m174025xf6caca6c().setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560639q5));
            m174025xf6caca6c().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cnp));
            m174023x6a4ab8f2().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a8u));
        } else if (h17 != 3) {
            m174025xf6caca6c().setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560638q4));
            m174025xf6caca6c().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cl6));
            m174023x6a4ab8f2().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a8u));
        } else {
            m174025xf6caca6c().setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560638q4));
            m174025xf6caca6c().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cnq));
            m174023x6a4ab8f2().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a8u));
        }
        if (finderLiveBattleData.f315694h != 1) {
            m174025xf6caca6c().setVisibility(0);
            W(m174024x2f8ad4f5());
        } else {
            if (finderLiveBattleData.j()) {
                m174025xf6caca6c().setVisibility(0);
            }
            V(m174024x2f8ad4f5(), m174026xf4069e3e());
        }
    }

    public final void f0(dk2.u4 battleData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(battleData, "battleData");
        b0();
        m174023x6a4ab8f2().setVisibility(8);
        m174025xf6caca6c().setText("0");
        m174024x2f8ad4f5().setText("0");
        m174028x8faa163d().setVisibility(0);
        m174027x83188dbc().setVisibility(8);
        m174029xcb270900().setTypeface(android.graphics.Typeface.defaultFromStyle(0));
        m174029xcb270900().setVisibility(8);
        if (battleData.f315694h == 1) {
            V(m174029xcb270900(), m174027x83188dbc());
        } else {
            W(m174029xcb270900());
        }
        if (n()) {
            m174028x8faa163d().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563331a93));
        } else {
            m174028x8faa163d().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563330a92));
        }
    }

    /* renamed from: getAnchorBattleResultWidget */
    public final lj2.p m174014x60bec2a4() {
        lj2.p pVar = this.U;
        if (pVar != null) {
            return pVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("anchorBattleResultWidget");
        throw null;
    }

    /* renamed from: getAnchorBattleTipWidget */
    public final lj2.c0 m174015xabd26bbc() {
        lj2.c0 c0Var = this.T;
        if (c0Var != null) {
            return c0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("anchorBattleTipWidget");
        throw null;
    }

    /* renamed from: getAnchorCriticalGiftLayout */
    public final android.widget.FrameLayout m174016x6015f284() {
        android.widget.FrameLayout frameLayout = this.C1;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("anchorCriticalGiftLayout");
        throw null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    /* renamed from: getAnchorCriticalLayout */
    public android.widget.FrameLayout mo124426x1ce0d634() {
        return m174017x778b4af9();
    }

    /* renamed from: getAnchorCriticalLayoutView */
    public final android.widget.FrameLayout m174017x778b4af9() {
        android.widget.FrameLayout frameLayout = this.B1;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("anchorCriticalLayoutView");
        throw null;
    }

    /* renamed from: getAudioPkLayout */
    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 m174018x602fd345() {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.V;
        if (c1073x7e08a787 != null) {
            return c1073x7e08a787;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioPkLayout");
        throw null;
    }

    /* renamed from: getBattleBarSpace */
    public final android.widget.Space m174019xe1d86281() {
        android.widget.Space space = this.f528276z1;
        if (space != null) {
            return space;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("battleBarSpace");
        throw null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    /* renamed from: getBattleResultWidget */
    public ai2.a mo124427x4f7d778f() {
        return m174014x60bec2a4();
    }

    @Override // oj2.l, wj2.w, lj2.u0
    /* renamed from: getBattleTipsWidget */
    public qi2.s1 mo124428x3f645dea() {
        return m174015xabd26bbc();
    }

    /* renamed from: getBubbleLayout */
    public final android.view.ViewGroup m174020xdedd954c() {
        android.view.ViewGroup viewGroup = this.A1;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bubbleLayout");
        throw null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public android.widget.FrameLayout mo124429x4ed4a76f() {
        return m174016x6015f284();
    }

    @Override // oj2.l, wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    /* renamed from: getPkExtraView */
    public final android.widget.TextView m174021x80f09de4() {
        android.widget.TextView textView = this.D1;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkExtraView");
        throw null;
    }

    /* renamed from: getPkHearLayout */
    public final android.view.ViewGroup m174022xa0018989() {
        android.view.ViewGroup viewGroup = this.W;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
        throw null;
    }

    /* renamed from: getSingleHeartLayout */
    public final android.view.ViewGroup m174023x6a4ab8f2() {
        android.view.ViewGroup viewGroup = this.f528270p0;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleHeartLayout");
        throw null;
    }

    /* renamed from: getSingleHeartText */
    public final android.widget.TextView m174024x2f8ad4f5() {
        android.widget.TextView textView = this.f528274y0;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleHeartText");
        throw null;
    }

    /* renamed from: getSingleRangeText */
    public final android.widget.TextView m174025xf6caca6c() {
        android.widget.TextView textView = this.f528272x0;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleRangeText");
        throw null;
    }

    /* renamed from: getSoloGiftIcon */
    public final android.widget.ImageView m174026xf4069e3e() {
        android.widget.ImageView imageView = this.f528271p1;
        if (imageView != null) {
            return imageView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("soloGiftIcon");
        throw null;
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "PkAnchorSelfWidget";
    }

    /* renamed from: getTeamGiftIcon */
    public final android.widget.ImageView m174027x83188dbc() {
        android.widget.ImageView imageView = this.f528269l1;
        if (imageView != null) {
            return imageView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamGiftIcon");
        throw null;
    }

    /* renamed from: getTeamHeartLayout */
    public final android.view.ViewGroup m174028x8faa163d() {
        android.view.ViewGroup viewGroup = this.f528273x1;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartLayout");
        throw null;
    }

    /* renamed from: getTeamHeartText */
    public final android.widget.TextView m174029xcb270900() {
        android.widget.TextView textView = this.f528275y1;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartText");
        throw null;
    }

    @Override // oj2.l, sj2.m
    public void h() {
        super.h();
        android.view.ViewGroup mo124433x9681e6d = mo124433x9681e6d();
        if (mo124433x9681e6d != null) {
            mo124433x9681e6d.setVisibility(8);
        }
        android.widget.FrameLayout mo124429x4ed4a76f = mo124429x4ed4a76f();
        if (mo124429x4ed4a76f == null) {
            return;
        }
        mo124429x4ed4a76f.setVisibility(8);
    }

    @Override // lj2.u0
    public void i(boolean z17) {
        xh2.i iVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onBattleBarVisibilityChange " + z17);
        xh2.a aVar = this.f400409g;
        if (!(((aVar == null || (iVar = aVar.f536054b) == null) ? 0.0f : iVar.f364143b) <= 0.1f)) {
            android.widget.Space m174019xe1d86281 = m174019xe1d86281();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m174019xe1d86281, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBattleBarVisibilityChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m174019xe1d86281.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m174019xe1d86281, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBattleBarVisibilityChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (z17 != (m174019xe1d86281().getVisibility() == 0)) {
            u4.g1.a(m151537xfb84e958(), null);
            android.widget.Space m174019xe1d862812 = m174019xe1d86281();
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m174019xe1d862812, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBattleBarVisibilityChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m174019xe1d862812.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m174019xe1d862812, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBattleBarVisibilityChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // lj2.j
    public boolean n() {
        java.lang.String str;
        lj2.t0 a07 = m174009x3a33aac1().a0();
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        if (m145849x949ba2a5 == null || (str = m145849x949ba2a5.f390703a) == null) {
            str = "";
        }
        return a07.m(str) == fj2.k.f344708d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    @Override // oj2.l, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r7) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            r0 = 0
            if (r7 == 0) goto L27
            int r7 = r7.getId()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L28
        L27:
            r7 = r0
        L28:
            android.view.ViewGroup r1 = r6.m174023x6a4ab8f2()
            int r1 = r1.getId()
            r2 = 0
            r3 = 1
            if (r7 != 0) goto L35
            goto L3d
        L35:
            int r4 = r7.intValue()
            if (r4 != r1) goto L3d
        L3b:
            r1 = r3
            goto L50
        L3d:
            android.view.ViewGroup r1 = r6.m174028x8faa163d()
            int r1 = r1.getId()
            if (r7 != 0) goto L48
            goto L4f
        L48:
            int r4 = r7.intValue()
            if (r4 != r1) goto L4f
            goto L3b
        L4f:
            r1 = r2
        L50:
            if (r1 == 0) goto L56
            r6.H()
            goto L81
        L56:
            android.widget.TextView r1 = r6.m151535xb52f4282()
            if (r1 == 0) goto L64
            int r0 = r1.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L64:
            boolean r7 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r7, r0)
            if (r7 == 0) goto L81
            android.widget.TextView r7 = r6.m151535xb52f4282()
            if (r7 == 0) goto L7c
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L78
            r7 = r3
            goto L79
        L78:
            r7 = r2
        L79:
            if (r7 != r3) goto L7c
            r2 = r3
        L7c:
            if (r2 == 0) goto L81
            r6.H()
        L81:
            java.lang.String r7 = "onClick"
            java.lang.String r0 = "(Landroid/view/View;)V"
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget"
            java.lang.String r2 = "android/view/View$OnClickListener"
            yj0.a.h(r6, r1, r2, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wj2.y.onClick(android.view.View):void");
    }

    /* renamed from: setAnchorBattleResultWidget */
    public final void m174030x108b8bb0(lj2.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pVar, "<set-?>");
        this.U = pVar;
    }

    /* renamed from: setAnchorBattleTipWidget */
    public final void m174031x7be51e30(lj2.c0 c0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c0Var, "<set-?>");
        this.T = c0Var;
    }

    /* renamed from: setAnchorCriticalGiftLayout */
    public final void m174032xfe2bb90(android.widget.FrameLayout frameLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameLayout, "<set-?>");
        this.C1 = frameLayout;
    }

    /* renamed from: setAnchorCriticalLayoutView */
    public final void m174033x27581405(android.widget.FrameLayout frameLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameLayout, "<set-?>");
        this.B1 = frameLayout;
    }

    /* renamed from: setAudioPkLayout */
    public final void m174034xf30639b9(p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1073x7e08a787, "<set-?>");
        this.V = c1073x7e08a787;
    }

    /* renamed from: setBattleBarSpace */
    public final void m174035xa9ceca8d(android.widget.Space space) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(space, "<set-?>");
        this.f528276z1 = space;
    }

    /* renamed from: setBubbleLayout */
    public final void m174036x15269058(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.A1 = viewGroup;
    }

    /* renamed from: setBubbleLayoutScale */
    public final void m174037x875dffd2(float f17) {
        m174020xdedd954c().setScaleX(f17);
        m174020xdedd954c().setScaleY(f17);
    }

    /* renamed from: setPkExtraView */
    public final void m174038x17561158(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.D1 = textView;
    }

    /* renamed from: setPkHearLayout */
    public final void m174039xd64a8495(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.W = viewGroup;
    }

    /* renamed from: setSingleHeartLayout */
    public final void m174040x45e0c566(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.f528270p0 = viewGroup;
    }

    /* renamed from: setSingleHeartText */
    public final void m174041x66616e69(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.f528274y0 = textView;
    }

    /* renamed from: setSingleRangeText */
    public final void m174042x2da163e0(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.f528272x0 = textView;
    }

    /* renamed from: setSoloGiftIcon */
    public final void m174043x2a4f994a(android.widget.ImageView imageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "<set-?>");
        this.f528271p1 = imageView;
    }

    /* renamed from: setTeamGiftIcon */
    public final void m174044xb96188c8(android.widget.ImageView imageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "<set-?>");
        this.f528269l1 = imageView;
    }

    /* renamed from: setTeamHeartLayout */
    public final void m174045xc680afb1(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.f528273x1 = viewGroup;
    }

    /* renamed from: setTeamHeartText */
    public final void m174046x5dfd6f74(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.f528275y1 = textView;
    }
}
