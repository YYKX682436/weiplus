package wj2;

/* loaded from: classes10.dex */
public class c0 extends oj2.o {
    public android.widget.ImageView A1;
    public android.widget.ImageView B1;
    public android.widget.Space C1;
    public android.widget.ImageView T;
    public android.view.ViewGroup U;
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b V;
    public lj2.c0 W;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.TextView f528182l1;

    /* renamed from: p0, reason: collision with root package name */
    public lj2.p f528183p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.TextView f528184p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.ViewGroup f528185x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.widget.ImageView f528186x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.ViewGroup f528187y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.view.ViewGroup f528188y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.widget.TextView f528189z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    /* renamed from: getAvatarSize */
    private final int m173958xd63878f0() {
        return wj2.z.f528277a[m145851x309290b1().ordinal()] == 1 ? getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs) : getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
    }

    /* renamed from: getMuteIconCircleSize */
    private final int m173959x76961eb9() {
        return wj2.z.f528277a[m145851x309290b1().ordinal()] == 1 ? getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9) : getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561206ca);
    }

    /* renamed from: getMuteIconSize */
    private final int m173960xbc40cbc9() {
        return wj2.z.f528277a[m145851x309290b1().ordinal()] == 1 ? getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) : getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r0.f390710h == true) goto L8;
     */
    @Override // wj2.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P() {
        /*
            r5 = this;
            super.P()
            km2.q r0 = r5.m145849x949ba2a5()
            r1 = 0
            if (r0 == 0) goto L10
            r2 = 1
            boolean r0 = r0.f390710h
            if (r0 != r2) goto L10
            goto L11
        L10:
            r2 = r1
        L11:
            if (r2 == 0) goto L45
            zl2.r4 r0 = zl2.r4.f555483a
            boolean r0 = r0.x1()
            if (r0 == 0) goto L45
            lj2.v0 r0 = r5.m174009x3a33aac1()
            qo0.c r0 = r0.q()
            if (r0 == 0) goto L45
            qo0.b r2 = qo0.b.f446870c5
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "PARAM_FINDER_LIVE_PK_ANCHOR_IS_MUTE"
            r3.putBoolean(r4, r1)
            km2.q r1 = r5.m145849x949ba2a5()
            if (r1 == 0) goto L3b
            java.lang.String r1 = r1.f390705c
            if (r1 != 0) goto L3d
        L3b:
            java.lang.String r1 = ""
        L3d:
            java.lang.String r4 = "PARAM_FINDER_LIVE_MIC_USER_NAME"
            r3.putString(r4, r1)
            r0.mo46557x60d69242(r2, r3)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wj2.c0.P():void");
    }

    @Override // oj2.o, wj2.w
    public void R() {
        java.lang.String str;
        java.lang.String str2;
        super.R();
        xh2.a m145850xf6df7a5e = m145850xf6df7a5e();
        if (m145850xf6df7a5e != null) {
            t(m173965x8edc5bd4());
            lj2.p m173961x60bec2a4 = m173961x60bec2a4();
            km2.q qVar = m145850xf6df7a5e.f536053a;
            java.lang.String str3 = "";
            if (qVar == null || (str = qVar.f390705c) == null) {
                str = "";
            }
            if (qVar != null && (str2 = qVar.f390703a) != null) {
                str3 = str2;
            }
            m173961x60bec2a4.a(str, str3);
            m173962xabd26bbc().f(m145850xf6df7a5e.f536054b.f364142a < 0.5f);
        }
        pm0.v.X(new wj2.b0(this));
        e();
    }

    @Override // oj2.o, sj2.m
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onGiftAnimationStart");
    }

    @Override // oj2.o
    public void a0() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.av6, (android.view.ViewGroup) this, false);
        int i17 = com.p314xaae8f345.mm.R.id.afh;
        if (((android.widget.Space) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.afh)) != null) {
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
                                                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate;
                                                        int i18 = com.p314xaae8f345.mm.R.id.f566371fo3;
                                                        if (((android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566371fo3)) != null) {
                                                            i18 = com.p314xaae8f345.mm.R.id.f566372fo4;
                                                            if (((android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566372fo4)) != null) {
                                                                i18 = com.p314xaae8f345.mm.R.id.f568213m42;
                                                                if (((android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f568213m42)) != null) {
                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a787, "getRoot(...)");
                                                                    f0(c1073x7e08a787);
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
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    public void c0() {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
        android.view.ViewGroup m151586xfb84e958 = m151586xfb84e958();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m151586xfb84e958, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        cVar.d((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) m151586xfb84e958);
        if (m()) {
            cVar.c(m173968xa0018989().getId(), 1);
            cVar.c(m173968xa0018989().getId(), 2);
            cVar.c(m173964xd1741f00().getId(), 1);
            cVar.c(m173964xd1741f00().getId(), 2);
            cVar.e(m173968xa0018989().getId(), 3, m173963xe1d86281().getId(), 4);
            cVar.f(m173968xa0018989().getId(), 1, 0, 1, i65.a.b(m151586xfb84e958().getContext(), 8));
            cVar.e(m173968xa0018989().getId(), 2, m173964xd1741f00().getId(), 1);
            cVar.e(m173964xd1741f00().getId(), 1, m173968xa0018989().getId(), 2);
            cVar.e(m173964xd1741f00().getId(), 3, m173963xe1d86281().getId(), 4);
        } else {
            cVar.c(m173968xa0018989().getId(), 1);
            cVar.c(m173968xa0018989().getId(), 2);
            cVar.c(m173964xd1741f00().getId(), 1);
            cVar.c(m173964xd1741f00().getId(), 2);
            cVar.f(m173968xa0018989().getId(), 2, 0, 2, i65.a.b(m151586xfb84e958().getContext(), 8));
            cVar.e(m173968xa0018989().getId(), 3, m173963xe1d86281().getId(), 4);
            cVar.e(m173964xd1741f00().getId(), 3, m173963xe1d86281().getId(), 4);
            cVar.e(m173964xd1741f00().getId(), 1, 0, 1);
        }
        android.view.ViewGroup m151586xfb84e9582 = m151586xfb84e958();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m151586xfb84e9582, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) m151586xfb84e9582;
        cVar.b(c1073x7e08a787);
        c1073x7e08a787.m7179xd020a803(null);
    }

    @Override // oj2.o, sj2.m
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onGiftAnimationEnd");
    }

    public final void d0(boolean z17) {
        if (z17) {
            m173967x338eee41().setVisibility(4);
            m173967x338eee41().n();
        } else {
            m173967x338eee41().setVisibility(0);
            m173967x338eee41().g();
        }
    }

    @Override // oj2.o, lj2.u0
    public void e() {
        jz5.f0 f0Var;
        e0();
        dk2.u4 K = m174009x3a33aac1().a0().K();
        if (K != null) {
            if (K.h() || K.i()) {
                android.view.ViewGroup m173968xa0018989 = m173968xa0018989();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m173968xa0018989, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m173968xa0018989.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(m173968xa0018989, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView m151580xeb5fda54 = m151580xeb5fda54();
                if (m151580xeb5fda54 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(m151580xeb5fda54, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    m151580xeb5fda54.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(m151580xeb5fda54, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                java.util.List g17 = m174009x3a33aac1().a0().g();
                if (g17.size() > 1) {
                    if (K.f315693g == 2) {
                        h0(K);
                    } else {
                        g0(K);
                    }
                } else if (g17.size() == 1 && (!m174009x3a33aac1().a0().l().isEmpty())) {
                    h0(K);
                } else {
                    super.e();
                    android.view.ViewGroup m173968xa00189892 = m173968xa0018989();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(m173968xa00189892, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    m173968xa00189892.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(m173968xa00189892, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                super.e();
                m173968xa0018989().setVisibility(8);
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.e();
            m173968xa0018989().setVisibility(8);
        }
    }

    public final void e0() {
        jz5.f0 f0Var;
        if (m174009x3a33aac1().a0().K() != null) {
            m173969x6a4ab8f2().setOnClickListener(this);
            m173974x8faa163d().setOnClickListener(this);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            m173969x6a4ab8f2().setOnClickListener(null);
            m173974x8faa163d().setOnClickListener(null);
        }
    }

    public final void f0(android.view.ViewGroup rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        m151595x764fb064(rootView);
        android.view.View findViewById = m151586xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.fag);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        m151590x23cb40c5((android.widget.FrameLayout) findViewById);
        android.view.View findViewById2 = m151586xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.fah);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        m151591x5dfe2e73((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2);
        android.view.View findViewById3 = m151586xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.fak);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        m151592x96ee7780((android.view.ViewGroup) findViewById3);
        android.view.View findViewById4 = m151586xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.fnz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        m173980x7aba45e0((android.widget.ImageView) findViewById4);
        android.view.View findViewById5 = m151586xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.f566369fo0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        m151594xd21074d2((android.widget.TextView) findViewById5);
        android.view.View findViewById6 = m151586xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.f566371fo3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        m173981x32ad29db((android.widget.ImageView) findViewById6);
        android.view.View findViewById7 = m151586xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.evg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        m173979x446ac374((android.view.ViewGroup) findViewById7);
        android.view.View findViewById8 = m151586xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.fal);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        m173983xd64a8495((android.view.ViewGroup) findViewById8);
        android.view.View findViewById9 = m151586xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.fa7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        m173984x45e0c566((android.view.ViewGroup) findViewById9);
        android.view.View findViewById10 = m151586xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.fa8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        m173986x2da163e0((android.widget.TextView) findViewById10);
        android.view.View findViewById11 = m151586xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.fap);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        m173985x66616e69((android.widget.TextView) findViewById11);
        m151589x1da37660((android.widget.TextView) m151586xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.fa_));
        android.view.View findViewById12 = m151586xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.qag);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        m173987x2a4f994a((android.widget.ImageView) findViewById12);
        android.view.View findViewById13 = m151586xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.qam);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        m173988xb96188c8((android.widget.ImageView) findViewById13);
        android.view.View findViewById14 = m151586xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.fa9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        m173989xc680afb1((android.view.ViewGroup) findViewById14);
        android.view.View findViewById15 = m151586xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.qrm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById15, "findViewById(...)");
        m173990x5dfd6f74((android.widget.TextView) findViewById15);
        android.view.View findViewById16 = m151586xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.afh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById16, "findViewById(...)");
        m173978xa9ceca8d((android.widget.Space) findViewById16);
        android.view.View findViewById17 = m173964xd1741f00().findViewById(com.p314xaae8f345.mm.R.id.evh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById17, "findViewById(...)");
        m173982x6a6587b5((com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById17);
        ym5.l2 l2Var = ym5.l2.f544957a;
        m173967x338eee41();
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        m173967x338eee41().o(ae2.in.f85221a.a(ym5.f6.W));
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b m173967x338eee41 = m173967x338eee41();
        android.content.res.AssetManager assets = m151586xfb84e958().getContext().getAssets();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
        m173967x338eee41.k(assets, "finder_live_link_mic_wave.pag");
        m173967x338eee41().m82583xcde73672(-1);
        android.view.View findViewById18 = m151586xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.f566099ep0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById18, "findViewById(...)");
        m173977x7be51e30(new lj2.c0(findViewById18, m174009x3a33aac1()));
        android.view.View findViewById19 = m151586xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.eop);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById19, "findViewById(...)");
        m173976x108b8bb0(new lj2.p((android.view.ViewGroup) findViewById19));
        zl2.r4.f555483a.b3(m173971xf6caca6c());
        m173965x8edc5bd4().setOnClickListener(this);
    }

    public final void g0(dk2.u4 battleData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(battleData, "battleData");
        c0();
        m173974x8faa163d().setVisibility(8);
        m173975xcb270900().setText("0");
        m173969x6a4ab8f2().setVisibility(0);
        m173972xf4069e3e().setVisibility(8);
        m173970x2f8ad4f5().setTypeface(android.graphics.Typeface.defaultFromStyle(0));
        m173970x2f8ad4f5().setVisibility(8);
        m173971xf6caca6c().setVisibility(8);
        int h17 = m174009x3a33aac1().a0().h(m145849x949ba2a5());
        m173971xf6caca6c().setText(java.lang.String.valueOf(h17));
        if (h17 == 1) {
            m173971xf6caca6c().setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560611pg));
            m173971xf6caca6c().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ck_));
            m173969x6a4ab8f2().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a8v));
        } else if (h17 == 2) {
            m173971xf6caca6c().setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560639q5));
            m173971xf6caca6c().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cnp));
            m173969x6a4ab8f2().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a8u));
        } else if (h17 != 3) {
            m173971xf6caca6c().setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560638q4));
            m173971xf6caca6c().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cl6));
            m173969x6a4ab8f2().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a8u));
        } else {
            m173971xf6caca6c().setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560638q4));
            m173971xf6caca6c().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cnq));
            m173969x6a4ab8f2().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a8u));
        }
        if (battleData.f315694h != 1) {
            m173971xf6caca6c().setVisibility(0);
            W(m173970x2f8ad4f5());
        } else {
            if (battleData.j()) {
                m173971xf6caca6c().setVisibility(0);
            }
            V(m173970x2f8ad4f5(), m173972xf4069e3e());
        }
    }

    @Override // oj2.o, wj2.w, lj2.u0
    /* renamed from: getAnchorAudioModeLayout */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124425xd504a5f8() {
        return null;
    }

    /* renamed from: getAnchorBattleResultWidget */
    public final lj2.p m173961x60bec2a4() {
        lj2.p pVar = this.f528183p0;
        if (pVar != null) {
            return pVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("anchorBattleResultWidget");
        throw null;
    }

    /* renamed from: getAnchorBattleTipWidget */
    public final lj2.c0 m173962xabd26bbc() {
        lj2.c0 c0Var = this.W;
        if (c0Var != null) {
            return c0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("anchorBattleTipWidget");
        throw null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    /* renamed from: getAnchorCriticalLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124426x1ce0d634() {
        return null;
    }

    /* renamed from: getBattleBarSpace */
    public final android.widget.Space m173963xe1d86281() {
        android.widget.Space space = this.C1;
        if (space != null) {
            return space;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("battleBarSpace");
        throw null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    /* renamed from: getBattleResultWidget */
    public ai2.a mo124427x4f7d778f() {
        return m173961x60bec2a4();
    }

    @Override // oj2.o, wj2.w, lj2.u0
    /* renamed from: getBattleTipsWidget */
    public qi2.s1 mo124428x3f645dea() {
        return m173962xabd26bbc();
    }

    @Override // oj2.o, wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124429x4ed4a76f() {
        return null;
    }

    /* renamed from: getFinderLivePkAnchorAudioTipsLayout */
    public final android.view.ViewGroup m173964xd1741f00() {
        android.view.ViewGroup viewGroup = this.U;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLivePkAnchorAudioTipsLayout");
        throw null;
    }

    /* renamed from: getFinderLiveVideoLinkBottomBarAvatar */
    public final android.widget.ImageView m173965x8edc5bd4() {
        android.widget.ImageView imageView = this.f528186x1;
        if (imageView != null) {
            return imageView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveVideoLinkBottomBarAvatar");
        throw null;
    }

    /* renamed from: getFinderLiveVideoLinkCoverBg */
    public final android.widget.ImageView m173966x42ee73cf() {
        android.widget.ImageView imageView = this.T;
        if (imageView != null) {
            return imageView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveVideoLinkCoverBg");
        throw null;
    }

    @Override // oj2.o, wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
    }

    @Override // oj2.o, wj2.w, sj2.m
    /* renamed from: getGiftRootView */
    public android.view.ViewGroup mo124433x9681e6d() {
        return m151583x3e2ffa0c();
    }

    @Override // oj2.o, wj2.w, lj2.u0
    /* renamed from: getLotteryBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124434x83df3d46() {
        return null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    /* renamed from: getLuckyMoneyRootView */
    public android.view.ViewGroup mo124447xe76ca375() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "getLuckyMoneyRootView");
        return new android.widget.RelativeLayout(m151586xfb84e958().getContext());
    }

    @Override // oj2.o, wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    /* renamed from: getPkAudioModeIcon */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b m173967x338eee41() {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.V;
        if (c22789xd23e9a9b != null) {
            return c22789xd23e9a9b;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkAudioModeIcon");
        throw null;
    }

    /* renamed from: getPkHearLayout */
    public final android.view.ViewGroup m173968xa0018989() {
        android.view.ViewGroup viewGroup = this.f528185x0;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
        throw null;
    }

    /* renamed from: getSingleHeartLayout */
    public final android.view.ViewGroup m173969x6a4ab8f2() {
        android.view.ViewGroup viewGroup = this.f528187y0;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleHeartLayout");
        throw null;
    }

    /* renamed from: getSingleHeartText */
    public final android.widget.TextView m173970x2f8ad4f5() {
        android.widget.TextView textView = this.f528184p1;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleHeartText");
        throw null;
    }

    /* renamed from: getSingleRangeText */
    public final android.widget.TextView m173971xf6caca6c() {
        android.widget.TextView textView = this.f528182l1;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleRangeText");
        throw null;
    }

    /* renamed from: getSoloGiftIcon */
    public final android.widget.ImageView m173972xf4069e3e() {
        android.widget.ImageView imageView = this.B1;
        if (imageView != null) {
            return imageView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("soloGiftIcon");
        throw null;
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "PkAnchorWidget";
    }

    /* renamed from: getTeamGiftIcon */
    public final android.widget.ImageView m173973x83188dbc() {
        android.widget.ImageView imageView = this.A1;
        if (imageView != null) {
            return imageView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamGiftIcon");
        throw null;
    }

    /* renamed from: getTeamHeartLayout */
    public final android.view.ViewGroup m173974x8faa163d() {
        android.view.ViewGroup viewGroup = this.f528188y1;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartLayout");
        throw null;
    }

    /* renamed from: getTeamHeartText */
    public final android.widget.TextView m173975xcb270900() {
        android.widget.TextView textView = this.f528189z1;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartText");
        throw null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    @Override // oj2.o, sj2.m
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onGiftAnimationEnd");
        android.view.ViewGroup mo124433x9681e6d = mo124433x9681e6d();
        if (mo124433x9681e6d == null) {
            return;
        }
        mo124433x9681e6d.setVisibility(8);
    }

    public final void h0(dk2.u4 battleData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(battleData, "battleData");
        c0();
        m173969x6a4ab8f2().setVisibility(8);
        m173971xf6caca6c().setText("0");
        m173970x2f8ad4f5().setText("0");
        m173974x8faa163d().setVisibility(0);
        m173973x83188dbc().setVisibility(8);
        m173975xcb270900().setTypeface(android.graphics.Typeface.defaultFromStyle(0));
        m173975xcb270900().setVisibility(8);
        if (battleData.f315694h == 1) {
            V(m173975xcb270900(), m173973x83188dbc());
        } else {
            W(m173975xcb270900());
        }
        if (n()) {
            m173974x8faa163d().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563331a93));
        } else {
            m173974x8faa163d().setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563330a92));
        }
    }

    @Override // lj2.u0
    public void i(boolean z17) {
        xh2.i iVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onBattleBarVisibilityChange " + z17);
        xh2.a aVar = this.f400409g;
        if (!(((aVar == null || (iVar = aVar.f536054b) == null) ? 0.0f : iVar.f364143b) <= 0.1f)) {
            android.widget.Space m173963xe1d86281 = m173963xe1d86281();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m173963xe1d86281, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBattleBarVisibilityChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m173963xe1d86281.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m173963xe1d86281, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBattleBarVisibilityChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (z17 != (m173963xe1d86281().getVisibility() == 0)) {
            u4.g1.a(m151586xfb84e958(), null);
            android.widget.Space m173963xe1d862812 = m173963xe1d86281();
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m173963xe1d862812, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBattleBarVisibilityChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m173963xe1d862812.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m173963xe1d862812, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBattleBarVisibilityChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewGroup.LayoutParams layoutParams = m173964xd1741f00().getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = z17 ? i65.a.b(getContext(), 24) : i65.a.b(getContext(), 8);
            }
        }
    }

    public final void i0() {
        java.lang.String m145853xb5886c64 = m145853xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateCoverBg isPk:");
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        sb6.append(m145849x949ba2a5 != null ? java.lang.Boolean.valueOf(m145849x949ba2a5.f390710h) : null);
        sb6.append(" audioMode:");
        km2.q m145849x949ba2a52 = m145849x949ba2a5();
        sb6.append(m145849x949ba2a52 != null ? java.lang.Boolean.valueOf(m145849x949ba2a52.f390718p) : null);
        sb6.append(" bgUrl:");
        km2.q m145849x949ba2a53 = m145849x949ba2a5();
        sb6.append(m145849x949ba2a53 != null ? m145849x949ba2a53.f390717o : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64, sb6.toString());
        km2.q m145849x949ba2a54 = m145849x949ba2a5();
        if (m145849x949ba2a54 != null) {
            if (m145849x949ba2a54.f390718p) {
                m173964xd1741f00().setVisibility(0);
                km2.q m145849x949ba2a55 = m145849x949ba2a5();
                if (m145849x949ba2a55 != null) {
                    d0(m145849x949ba2a55.f390716n);
                }
            } else {
                m173967x338eee41().n();
                m173964xd1741f00().setVisibility(4);
            }
            if (!m145849x949ba2a54.f390718p) {
                m173966x42ee73cf().setVisibility(8);
                return;
            }
            java.lang.String m145853xb5886c642 = m145853xb5886c64();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[loadMicUserBg] liveRoomImg = ");
            r45.ba4 ba4Var = m145849x949ba2a54.f390723u;
            sb7.append(ba4Var != null ? pm0.b0.g(ba4Var) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c642, sb7.toString());
            m151586xfb84e958().post(new wj2.a0(m145849x949ba2a54, this));
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

    @Override // oj2.o, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        super.onClick(view);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = m173965x8edc5bd4().getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            b0();
        } else {
            int id7 = m173969x6a4ab8f2().getId();
            boolean z17 = true;
            if (valueOf == null || valueOf.intValue() != id7) {
                int id8 = m173974x8faa163d().getId();
                if (valueOf == null || valueOf.intValue() != id8) {
                    z17 = false;
                }
            }
            if (z17) {
                H();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: setAnchorBattleResultWidget */
    public final void m173976x108b8bb0(lj2.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pVar, "<set-?>");
        this.f528183p0 = pVar;
    }

    /* renamed from: setAnchorBattleTipWidget */
    public final void m173977x7be51e30(lj2.c0 c0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c0Var, "<set-?>");
        this.W = c0Var;
    }

    /* renamed from: setBattleBarSpace */
    public final void m173978xa9ceca8d(android.widget.Space space) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(space, "<set-?>");
        this.C1 = space;
    }

    /* renamed from: setFinderLivePkAnchorAudioTipsLayout */
    public final void m173979x446ac374(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.U = viewGroup;
    }

    /* renamed from: setFinderLiveVideoLinkBottomBarAvatar */
    public final void m173980x7aba45e0(android.widget.ImageView imageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "<set-?>");
        this.f528186x1 = imageView;
    }

    /* renamed from: setFinderLiveVideoLinkCoverBg */
    public final void m173981x32ad29db(android.widget.ImageView imageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "<set-?>");
        this.T = imageView;
    }

    /* renamed from: setPkAudioModeIcon */
    public final void m173982x6a6587b5(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c22789xd23e9a9b, "<set-?>");
        this.V = c22789xd23e9a9b;
    }

    /* renamed from: setPkHearLayout */
    public final void m173983xd64a8495(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.f528185x0 = viewGroup;
    }

    /* renamed from: setSingleHeartLayout */
    public final void m173984x45e0c566(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.f528187y0 = viewGroup;
    }

    /* renamed from: setSingleHeartText */
    public final void m173985x66616e69(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.f528184p1 = textView;
    }

    /* renamed from: setSingleRangeText */
    public final void m173986x2da163e0(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.f528182l1 = textView;
    }

    /* renamed from: setSoloGiftIcon */
    public final void m173987x2a4f994a(android.widget.ImageView imageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "<set-?>");
        this.B1 = imageView;
    }

    /* renamed from: setTeamGiftIcon */
    public final void m173988xb96188c8(android.widget.ImageView imageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "<set-?>");
        this.A1 = imageView;
    }

    /* renamed from: setTeamHeartLayout */
    public final void m173989xc680afb1(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.f528188y1 = viewGroup;
    }

    /* renamed from: setTeamHeartText */
    public final void m173990x5dfd6f74(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.f528189z1 = textView;
    }

    @Override // wj2.w
    public void x() {
        android.view.ViewGroup.LayoutParams layoutParams = m173965x8edc5bd4().getLayoutParams();
        if (layoutParams != null) {
            int m173958xd63878f0 = m173958xd63878f0();
            layoutParams.width = m173958xd63878f0;
            layoutParams.height = m173958xd63878f0;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = m151581x53b88e51().getLayoutParams();
        if (layoutParams2 != null) {
            int m173960xbc40cbc9 = m173960xbc40cbc9();
            layoutParams2.width = m173960xbc40cbc9;
            layoutParams2.height = m173960xbc40cbc9;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = m151582x47ce48ff().getLayoutParams();
        if (layoutParams3 != null) {
            int m173959x76961eb9 = m173959x76961eb9();
            layoutParams3.width = m173959x76961eb9;
            layoutParams3.height = m173959x76961eb9;
        }
    }
}
