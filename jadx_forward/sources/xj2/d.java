package xj2;

/* loaded from: classes10.dex */
public final class d extends oj2.m {
    public android.view.View W;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.ImageView f536363l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.ViewGroup f536364p0;

    /* renamed from: p1, reason: collision with root package name */
    public lj2.s0 f536365p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.TextView f536366x0;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.TextView f536367y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // oj2.m, wj2.w
    public void R() {
        java.lang.String str;
        java.lang.String str2;
        super.R();
        e();
        xh2.a m145850xf6df7a5e = m145850xf6df7a5e();
        if (m145850xf6df7a5e != null) {
            lj2.s0 s0Var = this.f536365p1;
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

    @Override // oj2.m
    public void Z() {
        fg2.r a17 = fg2.r.a(com.p314xaae8f345.mm.ui.id.b(getContext()), this, false);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b finderLiveMicStateAudioWaveIcon = a17.f343813l;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicStateAudioWaveIcon, "finderLiveMicStateAudioWaveIcon");
        m151573xbb341eca(finderLiveMicStateAudioWaveIcon);
        android.widget.FrameLayout finderLiveMicMuteIcon = a17.f343806e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicMuteIcon, "finderLiveMicMuteIcon");
        m151567x23cb40c5(finderLiveMicMuteIcon);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 finderLiveMicMuteIconWe = a17.f343807f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicMuteIconWe, "finderLiveMicMuteIconWe");
        m151568x5dfe2e73(finderLiveMicMuteIconWe);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = a17.f343802a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a787, "getRoot(...)");
        m151575x764fb064(c1073x7e08a787);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = a17.f343808g.f343815a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a7872, "getRoot(...)");
        m151569x96ee7780(c1073x7e08a7872);
        android.widget.ImageView finderLiveMicStateAudioAvatar = a17.f343810i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicStateAudioAvatar, "finderLiveMicStateAudioAvatar");
        m151570x83dd4f11(finderLiveMicStateAudioAvatar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 finderLiveMicStateAudioName = a17.f343812k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicStateAudioName, "finderLiveMicStateAudioName");
        m151572xc6161643(finderLiveMicStateAudioName);
        android.widget.ImageView finderLiveMicStateAudioBg = a17.f343811j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicStateAudioBg, "finderLiveMicStateAudioBg");
        m151571x5ec635fd(finderLiveMicStateAudioBg);
        android.widget.TextView finderLiveMicHeartText = a17.f343805d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicHeartText, "finderLiveMicHeartText");
        m151566x1da37660(finderLiveMicHeartText);
        android.widget.RelativeLayout relativeLayout = a17.f343804c.f343469a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "getRoot(...)");
        m151565x91c3b56e(relativeLayout);
        m151574x719c0af4(a17.f343814m.f343827b);
        fg2.c1 c1Var = a17.f343809h;
        android.widget.RelativeLayout relativeLayout2 = c1Var.f343491a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout2, "getRoot(...)");
        this.W = relativeLayout2;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 finderLiveMicHeartRangeLayout = c1Var.f343492b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicHeartRangeLayout, "finderLiveMicHeartRangeLayout");
        this.f536364p0 = finderLiveMicHeartRangeLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 finderLiveMicHeartRangeText = c1Var.f343493c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicHeartRangeText, "finderLiveMicHeartRangeText");
        this.f536366x0 = finderLiveMicHeartRangeText;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 finderLiveMicSingleHeartText = c1Var.f343495e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicSingleHeartText, "finderLiveMicSingleHeartText");
        this.f536367y0 = finderLiveMicSingleHeartText;
        android.widget.ImageView soloGiftIcon = c1Var.f343497g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(soloGiftIcon, "soloGiftIcon");
        this.f536363l1 = soloGiftIcon;
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.widget.TextView textView = this.f536366x0;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleRangeText");
            throw null;
        }
        r4Var.b3(textView);
        c1Var.f343494d.setVisibility(8);
        android.widget.RelativeLayout relativeLayout3 = a17.f343803b.f343817a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout3, "getRoot(...)");
        this.f536365p1 = new lj2.s0(relativeLayout3);
    }

    @Override // oj2.m, lj2.u0
    public void e() {
        jz5.f0 f0Var;
        dk2.u4 K;
        lj2.t0 a07 = m174009x3a33aac1().a0();
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (a07 == null || a07.K() == null) {
            f0Var = null;
        } else {
            android.view.ViewGroup viewGroup = this.f536364p0;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleHeartLayout");
                throw null;
            }
            viewGroup.setOnClickListener(this);
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            android.view.ViewGroup viewGroup2 = this.f536364p0;
            if (viewGroup2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleHeartLayout");
                throw null;
            }
            viewGroup2.setOnClickListener(null);
        }
        lj2.t0 a08 = m174009x3a33aac1().a0();
        if (a08 == null || (K = a08.K()) == null) {
            f0Var2 = null;
        } else if (K.h() || K.i()) {
            android.view.View view = this.W;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorSinglePkCoverAudioWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorSinglePkCoverAudioWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m151551xeb5fda54().setVisibility(8);
            android.view.ViewGroup viewGroup3 = this.f536364p0;
            if (viewGroup3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleHeartLayout");
                throw null;
            }
            viewGroup3.setVisibility(0);
            android.widget.ImageView imageView = this.f536363l1;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("soloGiftIcon");
                throw null;
            }
            imageView.setVisibility(8);
            android.widget.TextView textView = this.f536367y0;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleHeartText");
                throw null;
            }
            textView.setTypeface(android.graphics.Typeface.defaultFromStyle(0));
            android.widget.TextView textView2 = this.f536367y0;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleHeartText");
                throw null;
            }
            textView2.setVisibility(8);
            android.widget.TextView textView3 = this.f536366x0;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleRangeText");
                throw null;
            }
            textView3.setVisibility(8);
            int h17 = m174009x3a33aac1().a0().h(m145849x949ba2a5());
            android.widget.TextView textView4 = this.f536366x0;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleRangeText");
                throw null;
            }
            textView4.setText(java.lang.String.valueOf(h17));
            if (h17 == 1) {
                android.widget.TextView textView5 = this.f536366x0;
                if (textView5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleRangeText");
                    throw null;
                }
                textView5.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560611pg));
                android.widget.TextView textView6 = this.f536366x0;
                if (textView6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleRangeText");
                    throw null;
                }
                textView6.setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ck_));
                android.view.ViewGroup viewGroup4 = this.f536364p0;
                if (viewGroup4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleHeartLayout");
                    throw null;
                }
                viewGroup4.setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a8v));
            } else if (h17 == 2) {
                android.widget.TextView textView7 = this.f536366x0;
                if (textView7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleRangeText");
                    throw null;
                }
                textView7.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560639q5));
                android.widget.TextView textView8 = this.f536366x0;
                if (textView8 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleRangeText");
                    throw null;
                }
                textView8.setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cnp));
                android.view.ViewGroup viewGroup5 = this.f536364p0;
                if (viewGroup5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleHeartLayout");
                    throw null;
                }
                viewGroup5.setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a8u));
            } else if (h17 != 3) {
                android.widget.TextView textView9 = this.f536366x0;
                if (textView9 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleRangeText");
                    throw null;
                }
                textView9.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560638q4));
                android.widget.TextView textView10 = this.f536366x0;
                if (textView10 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleRangeText");
                    throw null;
                }
                textView10.setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cl6));
                android.view.ViewGroup viewGroup6 = this.f536364p0;
                if (viewGroup6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleHeartLayout");
                    throw null;
                }
                viewGroup6.setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a8u));
            } else {
                android.widget.TextView textView11 = this.f536366x0;
                if (textView11 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleRangeText");
                    throw null;
                }
                textView11.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560638q4));
                android.widget.TextView textView12 = this.f536366x0;
                if (textView12 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleRangeText");
                    throw null;
                }
                textView12.setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cnq));
                android.view.ViewGroup viewGroup7 = this.f536364p0;
                if (viewGroup7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleHeartLayout");
                    throw null;
                }
                viewGroup7.setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a8u));
            }
            if (K.f315694h == 1) {
                if (K.j()) {
                    android.widget.TextView textView13 = this.f536366x0;
                    if (textView13 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleRangeText");
                        throw null;
                    }
                    textView13.setVisibility(0);
                }
                android.widget.TextView textView14 = this.f536367y0;
                if (textView14 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleHeartText");
                    throw null;
                }
                android.widget.ImageView imageView2 = this.f536363l1;
                if (imageView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("soloGiftIcon");
                    throw null;
                }
                V(textView14, imageView2);
            } else {
                android.widget.TextView textView15 = this.f536366x0;
                if (textView15 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleRangeText");
                    throw null;
                }
                textView15.setVisibility(0);
                android.widget.TextView textView16 = this.f536367y0;
                if (textView16 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleHeartText");
                    throw null;
                }
                W(textView16);
            }
        } else {
            super.e();
            android.view.View view2 = this.W;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorSinglePkCoverAudioWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorSinglePkCoverAudioWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (f0Var2 == null) {
            super.e();
            android.view.View view3 = this.W;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorSinglePkCoverAudioWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorSinglePkCoverAudioWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getAnchorAudioModeLayout */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124425xd504a5f8() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getAnchorCriticalLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124426x1ce0d634() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getBattleResultWidget */
    public ai2.a mo124427x4f7d778f() {
        lj2.s0 s0Var = this.f536365p1;
        if (s0Var != null) {
            return s0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("battleResultWidget");
        throw null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getBattleTipsWidget */
    public /* bridge */ /* synthetic */ qi2.s1 mo124428x3f645dea() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124429x4ed4a76f() {
        return null;
    }

    @Override // oj2.m, wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getLotteryBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124434x83df3d46() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "VisitorSinglePkCoverAudioWidget";
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    @Override // oj2.m, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorSinglePkCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        super.onClick(view);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.view.ViewGroup viewGroup = this.f536364p0;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleHeartLayout");
            throw null;
        }
        int id6 = viewGroup.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            H();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorSinglePkCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
