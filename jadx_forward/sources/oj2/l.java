package oj2;

/* loaded from: classes10.dex */
public abstract class l extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public android.view.ViewGroup f427309J;
    public android.view.ViewGroup K;
    public android.view.ViewGroup L;
    public android.view.ViewGroup M;
    public android.view.ViewGroup N;
    public android.widget.TextView P;
    public android.view.ViewGroup Q;
    public android.widget.TextView R;
    public android.widget.ImageView S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        a0();
        if (pluginAbility.f() == lj2.w0.f400491d) {
            mo151527x8a4de197().setOnClickListener(new oj2.g(this));
        }
        addView(m151537xfb84e958());
    }

    @Override // wj2.w
    public void R() {
        android.widget.TextView m151535xb52f4282;
        S(m151535xb52f4282());
        s(mo151536xf4907796());
        Z(this.f400410h);
        if (!A() || (m151535xb52f4282 = m151535xb52f4282()) == null) {
            return;
        }
        m174012xaf0594a2(m151535xb52f4282);
        m151535xb52f4282.setOnClickListener(this);
    }

    public final void Z(boolean z17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662;
        r45.uo1 m76959xd0530b13;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016664;
        r45.uo1 m76959xd0530b132;
        java.lang.String m145853xb5886c64 = m145853xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAudioMode isAudioMode:");
        sb6.append(z17);
        sb6.append(" business(LiveCommonSlice::class.java).audioModeHolderBm:");
        sb6.append(m174009x3a33aac1().a0().f());
        sb6.append(" liveDesc.cover:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 z18 = m174009x3a33aac1().a0().z();
        java.lang.String str2 = null;
        sb6.append((z18 == null || (m76802x2dd016664 = z18.m76802x2dd01666()) == null || (m76959xd0530b132 = m76802x2dd016664.m76959xd0530b13()) == null) ? null : m76959xd0530b132.m75945x2fec8307(0));
        sb6.append(" media.url:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 z19 = m174009x3a33aac1().a0().z();
        sb6.append((z19 == null || (m76802x2dd016663 = z19.m76802x2dd01666()) == null || (m76962x74cd162e2 = m76802x2dd016663.m76962x74cd162e()) == null || (c19788xd7cfd73e2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e2)) == null) ? null : c19788xd7cfd73e2.m76625xb5887639());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64, sb6.toString());
        if (D()) {
            android.widget.ImageView imageView = this.S;
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(4);
            return;
        }
        if (zl2.r4.f555483a.x1()) {
            if (!z17) {
                android.widget.ImageView imageView2 = this.S;
                if (imageView2 == null) {
                    return;
                }
                imageView2.setVisibility(4);
                return;
            }
            lj2.t0 a07 = m174009x3a33aac1().a0();
            mm2.g1 g1Var = (mm2.g1) dk2.ef.f314905a.i(mm2.g1.class);
            if (g1Var != null && (j2Var = g1Var.f410608p) != null) {
                str2 = (java.lang.String) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb();
            }
            pm0.v.X(new oj2.j(this, a07.C(str2)));
            return;
        }
        if (!z17) {
            android.widget.ImageView imageView3 = this.S;
            if (imageView3 == null) {
                return;
            }
            imageView3.setVisibility(4);
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 z27 = m174009x3a33aac1().a0().z();
        if (z27 != null && (m76802x2dd016662 = z27.m76802x2dd01666()) != null && (m76959xd0530b13 = m76802x2dd016662.m76959xd0530b13()) != null) {
            str2 = m76959xd0530b13.m75945x2fec8307(0);
        }
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 z28 = m174009x3a33aac1().a0().z();
            if (z28 == null || (m76802x2dd01666 = z28.m76802x2dd01666()) == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null || (str = c19788xd7cfd73e.m76625xb5887639()) == null) {
                str = "";
            }
            str2 = str;
        }
        pm0.v.X(new oj2.j(this, m174009x3a33aac1().a0().C(str2)));
    }

    @Override // sj2.m
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onGiftAnimationStart");
    }

    public abstract void a0();

    @Override // lj2.u0
    public void b(boolean z17, boolean z18) {
        if (this.f400410h != z17 || z18) {
            m145854x6c0372a2(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "notifyAnchorAudioModeChange " + z17 + " isForce: " + z18);
            pm0.v.X(new oj2.k(this, z17));
        }
    }

    @Override // sj2.m
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onGiftAnimationEnd");
    }

    @Override // lj2.u0
    public void e() {
        S(m151535xb52f4282());
    }

    @Override // lj2.u0
    public void g() {
        s(mo151536xf4907796());
    }

    /* renamed from: getAnchorAudioCoverView */
    public final android.widget.ImageView m151526xb464ae51() {
        return this.S;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getAnchorAudioModeLayout */
    public android.view.ViewGroup mo124425xd504a5f8() {
        return m151530xe347cf6c();
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getAnchorCriticalLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124426x1ce0d634() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getBattleResultWidget */
    public /* bridge */ /* synthetic */ ai2.a mo124427x4f7d778f() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getBattleTipsWidget */
    public /* bridge */ /* synthetic */ qi2.s1 mo124428x3f645dea() {
        return null;
    }

    /* renamed from: getClickView */
    public android.view.View mo151527x8a4de197() {
        return m151537xfb84e958();
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124429x4ed4a76f() {
        return null;
    }

    /* renamed from: getFinderLiveLotteryBubbleRoot */
    public final android.view.ViewGroup m151528xda6b726f() {
        android.view.ViewGroup viewGroup = this.N;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveLotteryBubbleRoot");
        throw null;
    }

    /* renamed from: getFinderLiveLuckyMoneyBubbleUiRoot */
    public final android.view.ViewGroup m151529xbf9ab862() {
        android.view.ViewGroup viewGroup = this.L;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveLuckyMoneyBubbleUiRoot");
        throw null;
    }

    /* renamed from: getFinderLiveMicAnchorAudioLayout */
    public final android.view.ViewGroup m151530xe347cf6c() {
        android.view.ViewGroup viewGroup = this.f427309J;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicAnchorAudioLayout");
        throw null;
    }

    /* renamed from: getFinderLiveMicHeartText */
    public final android.widget.TextView m151531xeb5fda54() {
        android.widget.TextView textView = this.P;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicHeartText");
        throw null;
    }

    /* renamed from: getFinderLiveMicNewNormalMicGiftItemLayout */
    public final android.view.ViewGroup m151532x3e2ffa0c() {
        android.view.ViewGroup viewGroup = this.K;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicNewNormalMicGiftItemLayout");
        throw null;
    }

    /* renamed from: getFinderLiveMicTagText */
    public final android.widget.TextView m151533xf748dbe8() {
        return this.R;
    }

    /* renamed from: getFinderLiveVoteBubbleRoot */
    public final android.view.ViewGroup m151534x9d534e60() {
        android.view.ViewGroup viewGroup = this.M;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveVoteBubbleRoot");
        throw null;
    }

    @Override // wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
    }

    @Override // wj2.w, sj2.m
    /* renamed from: getGiftRootView */
    public android.view.ViewGroup mo124433x9681e6d() {
        return m151532x3e2ffa0c();
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getLotteryBubbleRootView */
    public android.view.ViewGroup mo124434x83df3d46() {
        return m151528xda6b726f();
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getLuckyMoneyRootView */
    public android.view.ViewGroup mo124447xe76ca375() {
        return m151529xbf9ab862();
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    /* renamed from: getMicHeartText */
    public android.widget.TextView m151535xb52f4282() {
        return m151531xeb5fda54();
    }

    /* renamed from: getMicTagText */
    public android.widget.TextView mo151536xf4907796() {
        return this.R;
    }

    /* renamed from: getRoot */
    public final android.view.ViewGroup m151537xfb84e958() {
        android.view.ViewGroup viewGroup = this.Q;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
        throw null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public android.view.ViewGroup mo124442x86ddad3() {
        return m151534x9d534e60();
    }

    @Override // sj2.m
    public void h() {
        android.view.ViewGroup mo124433x9681e6d = mo124433x9681e6d();
        if (mo124433x9681e6d == null) {
            return;
        }
        mo124433x9681e6d.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveMicBaseCoverAnchorWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.widget.TextView m151535xb52f4282 = m151535xb52f4282();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, m151535xb52f4282 != null ? java.lang.Integer.valueOf(m151535xb52f4282.getId()) : null)) {
            android.widget.TextView m151535xb52f42822 = m151535xb52f4282();
            boolean z17 = false;
            if (m151535xb52f42822 != null) {
                if (m151535xb52f42822.getVisibility() == 0) {
                    z17 = true;
                }
            }
            if (z17) {
                H();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveMicBaseCoverAnchorWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: setAnchorAudioCoverView */
    public final void m151538x2eb7dd5d(android.widget.ImageView imageView) {
        this.S = imageView;
    }

    /* renamed from: setFinderLiveLotteryBubbleRoot */
    public final void m151539xe2837de3(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.N = viewGroup;
    }

    /* renamed from: setFinderLiveLuckyMoneyBubbleUiRoot */
    public final void m151540x91c3b56e(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.L = viewGroup;
    }

    /* renamed from: setFinderLiveMicAnchorAudioLayout */
    public final void m151541xc9649f78(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.f427309J = viewGroup;
    }

    /* renamed from: setFinderLiveMicHeartText */
    public final void m151542x1da37660(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.P = textView;
    }

    /* renamed from: setFinderLiveMicNewNormalMicGiftItemLayout */
    public final void m151543x96ee7780(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.K = viewGroup;
    }

    /* renamed from: setFinderLiveMicTagText */
    public final void m151544x719c0af4(android.widget.TextView textView) {
        this.R = textView;
    }

    /* renamed from: setFinderLiveVoteBubbleRoot */
    public final void m151545x4d20176c(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.M = viewGroup;
    }

    /* renamed from: setRoot */
    public final void m151546x764fb064(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.Q = viewGroup;
    }
}
