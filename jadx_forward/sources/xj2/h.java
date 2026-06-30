package xj2;

/* loaded from: classes10.dex */
public class h extends oj2.o {
    public android.view.ViewGroup T;
    public android.view.ViewGroup U;
    public android.widget.TextView V;
    public android.widget.ImageView W;

    /* renamed from: p0, reason: collision with root package name */
    public lj2.s0 f536374p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // oj2.o, wj2.w
    public void R() {
        java.lang.String str;
        java.lang.String str2;
        super.R();
        e();
        xh2.a m145850xf6df7a5e = m145850xf6df7a5e();
        if (m145850xf6df7a5e != null) {
            lj2.s0 s0Var = this.f536374p0;
            if (s0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("battleResultWidget");
                throw null;
            }
            km2.q qVar = m145850xf6df7a5e.f536053a;
            java.lang.String str3 = "";
            if (qVar == null || (str = qVar.f390705c) == null) {
                str = "";
            }
            if (qVar != null && (str2 = qVar.f390703a) != null) {
                str3 = str2;
            }
            s0Var.a(str, str3);
        }
    }

    @Override // wj2.w
    public void S(android.widget.TextView textView) {
        super.S(textView);
        c0();
    }

    @Override // oj2.o
    public void a0() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dky, (android.view.ViewGroup) this, false);
        int i17 = com.p314xaae8f345.mm.R.id.che;
        if (((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.che)) != null) {
            i17 = com.p314xaae8f345.mm.R.id.eop;
            android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.eop);
            if (a17 != null) {
                fg2.r1 a18 = fg2.r1.a(a17);
                android.view.View a19 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f8q);
                if (a19 != null) {
                    fg2.a0 a27 = fg2.a0.a(a19);
                    int i18 = com.p314xaae8f345.mm.R.id.fa_;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fa_);
                    if (textView != null) {
                        i18 = com.p314xaae8f345.mm.R.id.fag;
                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fag);
                        if (frameLayout != null) {
                            i18 = com.p314xaae8f345.mm.R.id.fah;
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fah);
                            if (c22699x3dcdb352 != null) {
                                i18 = com.p314xaae8f345.mm.R.id.fak;
                                android.view.View a28 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fak);
                                if (a28 != null) {
                                    fg2.r0 a29 = fg2.r0.a(a28);
                                    android.view.View a37 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fal);
                                    if (a37 != null) {
                                        fg2.c1 a38 = fg2.c1.a(a37);
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a60 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566369fo0);
                                        if (c14296xe95b9a60 != null) {
                                            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate;
                                            m151590x23cb40c5(frameLayout);
                                            m151591x5dfe2e73(c22699x3dcdb352);
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a787, "getRoot(...)");
                                            m151595x764fb064(c1073x7e08a787);
                                            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = a29.f343815a;
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a7872, "getRoot(...)");
                                            m151592x96ee7780(c1073x7e08a7872);
                                            m151594xd21074d2(c14296xe95b9a60);
                                            m151589x1da37660(textView);
                                            android.widget.RelativeLayout relativeLayout = a27.f343469a;
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "getRoot(...)");
                                            m151588x91c3b56e(relativeLayout);
                                            android.widget.LinearLayout finderLiveMicHeartTeamLayout = a38.f343494d;
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicHeartTeamLayout, "finderLiveMicHeartTeamLayout");
                                            this.U = finderLiveMicHeartTeamLayout;
                                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 finderLiveMicTeamHeartText = a38.f343496f;
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicTeamHeartText, "finderLiveMicTeamHeartText");
                                            this.V = finderLiveMicTeamHeartText;
                                            android.widget.ImageView teamGiftIcon = a38.f343498h;
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(teamGiftIcon, "teamGiftIcon");
                                            this.W = teamGiftIcon;
                                            android.widget.RelativeLayout relativeLayout2 = a38.f343491a;
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout2, "getRoot(...)");
                                            this.T = relativeLayout2;
                                            a38.f343492b.setVisibility(8);
                                            android.widget.RelativeLayout relativeLayout3 = a18.f343817a;
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout3, "getRoot(...)");
                                            this.f536374p0 = new lj2.s0(relativeLayout3);
                                            return;
                                        }
                                        i17 = com.p314xaae8f345.mm.R.id.f566369fo0;
                                    } else {
                                        i17 = com.p314xaae8f345.mm.R.id.fal;
                                    }
                                }
                            }
                        }
                    }
                    i17 = i18;
                } else {
                    i17 = com.p314xaae8f345.mm.R.id.f8q;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    public final void c0() {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
        android.view.ViewGroup m151586xfb84e958 = m151586xfb84e958();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m151586xfb84e958, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        cVar.d((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) m151586xfb84e958);
        if (n()) {
            android.view.ViewGroup viewGroup = this.T;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
                throw null;
            }
            cVar.c(viewGroup.getId(), 2);
            android.view.ViewGroup viewGroup2 = this.T;
            if (viewGroup2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
                throw null;
            }
            cVar.f(viewGroup2.getId(), 1, 0, 1, i65.a.b(m151586xfb84e958().getContext(), 4));
            android.widget.TextView m151580xeb5fda54 = m151580xeb5fda54();
            if (m151580xeb5fda54 != null) {
                cVar.c(m151580xeb5fda54.getId(), 2);
                cVar.f(m151580xeb5fda54.getId(), 1, 0, 1, i65.a.b(m151586xfb84e958().getContext(), 4));
            }
        } else {
            android.view.ViewGroup viewGroup3 = this.T;
            if (viewGroup3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
                throw null;
            }
            cVar.c(viewGroup3.getId(), 1);
            android.view.ViewGroup viewGroup4 = this.T;
            if (viewGroup4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
                throw null;
            }
            cVar.f(viewGroup4.getId(), 2, 0, 2, i65.a.b(m151586xfb84e958().getContext(), 4));
            android.widget.TextView m151580xeb5fda542 = m151580xeb5fda54();
            if (m151580xeb5fda542 != null) {
                cVar.c(m151580xeb5fda542.getId(), 1);
                cVar.f(m151580xeb5fda542.getId(), 2, 0, 2, i65.a.b(m151586xfb84e958().getContext(), 4));
            }
        }
        android.view.ViewGroup m151586xfb84e9582 = m151586xfb84e958();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m151586xfb84e9582, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) m151586xfb84e9582;
        cVar.b(c1073x7e08a787);
        c1073x7e08a787.m7179xd020a803(null);
    }

    @Override // oj2.o, lj2.u0
    public void e() {
        jz5.f0 f0Var;
        dk2.u4 K;
        lj2.t0 a07 = m174009x3a33aac1().a0();
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (a07 == null || a07.K() == null) {
            f0Var = null;
        } else {
            android.view.ViewGroup viewGroup = this.U;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartLayout");
                throw null;
            }
            viewGroup.setOnClickListener(this);
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            android.view.ViewGroup viewGroup2 = this.U;
            if (viewGroup2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartLayout");
                throw null;
            }
            viewGroup2.setOnClickListener(null);
        }
        lj2.t0 a08 = m174009x3a33aac1().a0();
        if (a08 == null || (K = a08.K()) == null) {
            f0Var2 = null;
        } else if (K.h() || K.i()) {
            android.view.ViewGroup viewGroup3 = this.T;
            if (viewGroup3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
                throw null;
            }
            viewGroup3.setVisibility(0);
            android.widget.TextView m151580xeb5fda54 = m151580xeb5fda54();
            if (m151580xeb5fda54 != null) {
                m151580xeb5fda54.setVisibility(8);
            }
            c0();
            android.view.ViewGroup viewGroup4 = this.U;
            if (viewGroup4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartLayout");
                throw null;
            }
            viewGroup4.setVisibility(0);
            android.widget.ImageView imageView = this.W;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamGiftIcon");
                throw null;
            }
            imageView.setVisibility(8);
            android.widget.TextView textView = this.V;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartText");
                throw null;
            }
            textView.setTypeface(android.graphics.Typeface.defaultFromStyle(0));
            android.widget.TextView textView2 = this.V;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartText");
                throw null;
            }
            textView2.setVisibility(8);
            if (K.f315694h == 1) {
                android.widget.TextView textView3 = this.V;
                if (textView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartText");
                    throw null;
                }
                android.widget.ImageView imageView2 = this.W;
                if (imageView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamGiftIcon");
                    throw null;
                }
                V(textView3, imageView2);
            } else {
                android.widget.TextView textView4 = this.V;
                if (textView4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartText");
                    throw null;
                }
                W(textView4);
            }
            if (n()) {
                android.view.ViewGroup viewGroup5 = this.U;
                if (viewGroup5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartLayout");
                    throw null;
                }
                viewGroup5.setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563331a93));
            } else {
                android.view.ViewGroup viewGroup6 = this.U;
                if (viewGroup6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartLayout");
                    throw null;
                }
                viewGroup6.setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563330a92));
            }
        } else {
            super.e();
            android.view.ViewGroup viewGroup7 = this.T;
            if (viewGroup7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
                throw null;
            }
            viewGroup7.setVisibility(8);
        }
        if (f0Var2 == null) {
            super.e();
            android.view.ViewGroup viewGroup8 = this.T;
            if (viewGroup8 != null) {
                viewGroup8.setVisibility(8);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
                throw null;
            }
        }
    }

    @Override // oj2.o, wj2.w, lj2.u0
    /* renamed from: getAnchorAudioModeLayout */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124425xd504a5f8() {
        return null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    /* renamed from: getAnchorCriticalLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124426x1ce0d634() {
        return null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    /* renamed from: getBattleResultWidget */
    public ai2.a mo124427x4f7d778f() {
        lj2.s0 s0Var = this.f536374p0;
        if (s0Var != null) {
            return s0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("battleResultWidget");
        throw null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    /* renamed from: getBattleTipsWidget */
    public /* bridge */ /* synthetic */ qi2.s1 mo124428x3f645dea() {
        return null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124429x4ed4a76f() {
        return null;
    }

    @Override // oj2.o, wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    /* renamed from: getLotteryBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124434x83df3d46() {
        return null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "VisitorTeamPkCoverVideoWidget";
    }

    @Override // oj2.o, wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    @Override // oj2.o, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorTeamPkCoverVideoWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        super.onClick(view);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.view.ViewGroup viewGroup = this.U;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartLayout");
            throw null;
        }
        int id6 = viewGroup.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            H();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorTeamPkCoverVideoWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
