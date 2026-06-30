package wj2;

/* loaded from: classes10.dex */
public class d extends oj2.m {
    public android.view.ViewGroup W;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.ViewGroup f528190l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.Space f528191p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.view.ViewGroup f528192p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.FrameLayout f528193x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.widget.TextView f528194x1;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f528195y0;

    /* renamed from: y1, reason: collision with root package name */
    public wj2.j0 f528196y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.widget.ImageView f528197z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    /* renamed from: getAudioWaveIconSize */
    private final int m173991x1c780073() {
        return (m145851x309290b1() == pm2.a.f438387g || this.f528195y0) ? getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) : getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561224cq);
    }

    /* renamed from: getAvatarSize */
    private final int m173992xd63878f0() {
        return (m145851x309290b1() == pm2.a.f438387g || this.f528195y0) ? getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df) : getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r3.size() < 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        return getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009e, code lost:
    
        if (r1.size() >= 2) goto L42;
     */
    /* renamed from: getGiftMargin */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int m173993xecdaeef4() {
        /*
            r8 = this;
            pm2.a r0 = r8.m145851x309290b1()
            pm2.a r1 = pm2.a.f438384d
            if (r0 != r1) goto Lb3
            km2.q r0 = r8.m145849x949ba2a5()
            r1 = 0
            if (r0 == 0) goto L18
            java.lang.Boolean r0 = r0.f390722t
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r2)
            goto L19
        L18:
            r0 = r1
        L19:
            r2 = 2
            if (r0 == 0) goto L58
            lj2.v0 r0 = r8.m174009x3a33aac1()
            lj2.t0 r0 = r0.a0()
            java.util.List r0 = r0.l()
            monitor-enter(r0)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L55
            r3.<init>()     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> L55
        L32:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L4d
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L55
            r6 = r5
            km2.q r6 = (km2.q) r6     // Catch: java.lang.Throwable -> L55
            java.lang.Boolean r6 = r6.f390722t     // Catch: java.lang.Throwable -> L55
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L55
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6, r7)     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L32
            r3.add(r5)     // Catch: java.lang.Throwable -> L55
            goto L32
        L4d:
            monitor-exit(r0)
            int r0 = r3.size()
            if (r0 >= r2) goto La0
            goto L58
        L55:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L58:
            km2.q r0 = r8.m145849x949ba2a5()
            if (r0 == 0) goto L66
            java.lang.Boolean r0 = r0.f390722t
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r1)
        L66:
            if (r1 == 0) goto Lb3
            lj2.v0 r0 = r8.m174009x3a33aac1()
            lj2.t0 r0 = r0.a0()
            java.util.List r0 = r0.l()
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb0
            r1.<init>()     // Catch: java.lang.Throwable -> Lb0
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> Lb0
        L7e:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lb0
            if (r4 == 0) goto L99
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lb0
            r5 = r4
            km2.q r5 = (km2.q) r5     // Catch: java.lang.Throwable -> Lb0
            java.lang.Boolean r5 = r5.f390722t     // Catch: java.lang.Throwable -> Lb0
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lb0
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5, r6)     // Catch: java.lang.Throwable -> Lb0
            if (r5 == 0) goto L7e
            r1.add(r4)     // Catch: java.lang.Throwable -> Lb0
            goto L7e
        L99:
            monitor-exit(r0)
            int r0 = r1.size()
            if (r0 < r2) goto Lb3
        La0:
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165386(0x7f0700ca, float:1.7944988E38)
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
        Lb0:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        Lb3:
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165533(0x7f07015d, float:1.7945286E38)
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wj2.d.m173993xecdaeef4():int");
    }

    /* renamed from: getMuteIconCircleSize */
    private final int m173994x76961eb9() {
        return (m145851x309290b1() == pm2.a.f438387g || this.f528195y0) ? getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9) : getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561206ca);
    }

    /* renamed from: getMuteIconSize */
    private final int m173995xbc40cbc9() {
        return (m145851x309290b1() == pm2.a.f438387g || this.f528195y0) ? getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) : getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
    }

    /* renamed from: getTextSize */
    private final float m173996x40077844() {
        return 14.0f;
    }

    @Override // oj2.m, wj2.w
    public void R() {
        super.R();
        android.widget.Space space = this.f528191p0;
        if (space != null) {
            space.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("anchorCriticalLayoutSpace");
            throw null;
        }
    }

    @Override // oj2.m
    public void Z() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.avb, (android.view.ViewGroup) this, false);
        int i17 = com.p314xaae8f345.mm.R.id.ejo;
        android.widget.Space space = (android.widget.Space) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.ejo);
        if (space != null) {
            i17 = com.p314xaae8f345.mm.R.id.thz;
            if (((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.thz)) != null) {
                i17 = com.p314xaae8f345.mm.R.id.ewh;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.ewh);
                if (frameLayout != null) {
                    i17 = com.p314xaae8f345.mm.R.id.tka;
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14330xf9b5e578) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.tka)) != null) {
                        i17 = com.p314xaae8f345.mm.R.id.f8o;
                        android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f8o);
                        if (a17 != null) {
                            fg2.z.a(a17);
                            i17 = com.p314xaae8f345.mm.R.id.f8p;
                            android.view.View a18 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f8p);
                            if (a18 != null) {
                                fg2.a0.a(a18);
                                i17 = com.p314xaae8f345.mm.R.id.f8q;
                                android.view.View a19 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f8q);
                                if (a19 != null) {
                                    fg2.y a27 = fg2.y.a(a19);
                                    int i18 = com.p314xaae8f345.mm.R.id.fa_;
                                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fa_);
                                    if (textView != null) {
                                        i18 = com.p314xaae8f345.mm.R.id.fag;
                                        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fag);
                                        if (frameLayout2 != null) {
                                            i18 = com.p314xaae8f345.mm.R.id.fah;
                                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fah);
                                            if (c22699x3dcdb352 != null) {
                                                i18 = com.p314xaae8f345.mm.R.id.fak;
                                                android.view.View a28 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fak);
                                                if (a28 != null) {
                                                    fg2.r0 a29 = fg2.r0.a(a28);
                                                    android.view.View a37 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.rmf);
                                                    if (a37 != null) {
                                                        fg2.t0 a38 = fg2.t0.a(a37);
                                                        android.view.View a39 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fal);
                                                        if (a39 != null) {
                                                            fg2.x0 a47 = fg2.x0.a(a39);
                                                            int i19 = com.p314xaae8f345.mm.R.id.faq;
                                                            android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.faq);
                                                            if (imageView != null) {
                                                                i19 = com.p314xaae8f345.mm.R.id.far;
                                                                android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.far);
                                                                if (imageView2 != null) {
                                                                    i19 = com.p314xaae8f345.mm.R.id.fay;
                                                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a60 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fay);
                                                                    if (c14296xe95b9a60 != null) {
                                                                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate;
                                                                        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566263fb0);
                                                                        if (c22789xd23e9a9b != null) {
                                                                            m151573xbb341eca(c22789xd23e9a9b);
                                                                            m151567x23cb40c5(frameLayout2);
                                                                            m151568x5dfe2e73(c22699x3dcdb352);
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a787, "getRoot(...)");
                                                                            m151575x764fb064(c1073x7e08a787);
                                                                            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = a29.f343815a;
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a7872, "getRoot(...)");
                                                                            m151569x96ee7780(c1073x7e08a7872);
                                                                            m151570x83dd4f11(imageView);
                                                                            m151572xc6161643(c14296xe95b9a60);
                                                                            m151571x5ec635fd(imageView2);
                                                                            android.widget.RelativeLayout relativeLayout = a47.f343924a;
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "getRoot(...)");
                                                                            this.f528190l1 = relativeLayout;
                                                                            android.widget.LinearLayout finderLiveMicHeartTeamLayout = a47.f343925b;
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicHeartTeamLayout, "finderLiveMicHeartTeamLayout");
                                                                            this.f528192p1 = finderLiveMicHeartTeamLayout;
                                                                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 finderLiveMicTeamHeartText = a47.f343926c;
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicTeamHeartText, "finderLiveMicTeamHeartText");
                                                                            this.f528194x1 = finderLiveMicTeamHeartText;
                                                                            m151566x1da37660(textView);
                                                                            android.widget.ImageView teamGiftIcon = a47.f343927d;
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(teamGiftIcon, "teamGiftIcon");
                                                                            this.f528197z1 = teamGiftIcon;
                                                                            android.widget.RelativeLayout relativeLayout2 = a27.f343929a;
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout2, "getRoot(...)");
                                                                            m151565x91c3b56e(relativeLayout2);
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout2, "getRoot(...)");
                                                                            this.W = relativeLayout2;
                                                                            this.f528191p0 = space;
                                                                            this.f528193x0 = frameLayout;
                                                                            android.widget.LinearLayout linearLayout = a38.f343848a;
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linearLayout, "getRoot(...)");
                                                                            this.f528196y1 = new wj2.j0(linearLayout, m174009x3a33aac1(), m174010xb411027f());
                                                                            return;
                                                                        }
                                                                        i17 = com.p314xaae8f345.mm.R.id.f566263fb0;
                                                                    }
                                                                }
                                                            }
                                                            i17 = i19;
                                                        } else {
                                                            i17 = com.p314xaae8f345.mm.R.id.fal;
                                                        }
                                                    } else {
                                                        i17 = com.p314xaae8f345.mm.R.id.rmf;
                                                    }
                                                }
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
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // oj2.m, lj2.u0
    public void e() {
        jz5.f0 f0Var;
        java.lang.Throwable th6;
        java.lang.String str;
        dk2.u4 K = m174009x3a33aac1().a0().K();
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (K != null) {
            android.view.ViewGroup viewGroup = this.f528192p1;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartLayout");
                throw null;
            }
            viewGroup.setOnClickListener(this);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.view.ViewGroup viewGroup2 = this.f528192p1;
            if (viewGroup2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartLayout");
                throw null;
            }
            viewGroup2.setOnClickListener(null);
        }
        boolean x17 = m174009x3a33aac1().a0().x();
        dk2.u4 K2 = m174009x3a33aac1().a0().K();
        if (K2 == null) {
            th6 = null;
            f0Var2 = null;
        } else if (K2.h() || K2.i()) {
            android.view.ViewGroup viewGroup3 = this.f528190l1;
            if (viewGroup3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(viewGroup3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverAudioWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(viewGroup3, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverAudioWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView m151551xeb5fda54 = m151551xeb5fda54();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m151551xeb5fda54, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverAudioWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m151551xeb5fda54.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m151551xeb5fda54, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverAudioWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.List g17 = m174009x3a33aac1().a0().g();
            if (x17 && g17.size() == 1 && (!m174009x3a33aac1().a0().l().isEmpty())) {
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
                android.view.ViewGroup m151564xfb84e958 = m151564xfb84e958();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m151564xfb84e958, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                cVar.d((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) m151564xfb84e958);
                if (m()) {
                    android.view.ViewGroup viewGroup4 = this.f528190l1;
                    if (viewGroup4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
                        throw null;
                    }
                    cVar.c(viewGroup4.getId(), 1);
                    android.view.ViewGroup viewGroup5 = this.f528190l1;
                    if (viewGroup5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
                        throw null;
                    }
                    cVar.c(viewGroup5.getId(), 2);
                    android.view.ViewGroup viewGroup6 = this.f528190l1;
                    if (viewGroup6 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
                        throw null;
                    }
                    cVar.f(viewGroup6.getId(), 1, 0, 1, i65.a.b(m151564xfb84e958().getContext(), 8));
                } else {
                    android.view.ViewGroup viewGroup7 = this.f528190l1;
                    if (viewGroup7 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
                        throw null;
                    }
                    cVar.c(viewGroup7.getId(), 1);
                    android.view.ViewGroup viewGroup8 = this.f528190l1;
                    if (viewGroup8 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
                        throw null;
                    }
                    cVar.c(viewGroup8.getId(), 2);
                    android.view.ViewGroup viewGroup9 = this.f528190l1;
                    if (viewGroup9 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
                        throw null;
                    }
                    cVar.f(viewGroup9.getId(), 2, 0, 2, i65.a.b(m151564xfb84e958().getContext(), 8));
                }
                android.view.ViewGroup m151564xfb84e9582 = m151564xfb84e958();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m151564xfb84e9582, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) m151564xfb84e9582;
                cVar.b(c1073x7e08a787);
                c1073x7e08a787.m7179xd020a803(null);
                android.view.ViewGroup viewGroup10 = this.f528192p1;
                if (viewGroup10 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartLayout");
                    throw null;
                }
                viewGroup10.setVisibility(0);
                android.widget.ImageView imageView = this.f528197z1;
                if (imageView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamGiftIcon");
                    throw null;
                }
                imageView.setVisibility(8);
                android.widget.TextView textView = this.f528194x1;
                if (textView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartText");
                    throw null;
                }
                textView.setTypeface(android.graphics.Typeface.defaultFromStyle(0));
                android.widget.TextView textView2 = this.f528194x1;
                if (textView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartText");
                    throw null;
                }
                textView2.setVisibility(8);
                if (K2.f315694h == 1) {
                    android.widget.TextView textView3 = this.f528194x1;
                    if (textView3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartText");
                        throw null;
                    }
                    android.widget.ImageView imageView2 = this.f528197z1;
                    if (imageView2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamGiftIcon");
                        throw null;
                    }
                    V(textView3, imageView2);
                } else {
                    android.widget.TextView textView4 = this.f528194x1;
                    if (textView4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartText");
                        throw null;
                    }
                    W(textView4);
                }
                lj2.t0 a07 = m174009x3a33aac1().a0();
                km2.q m145849x949ba2a5 = m145849x949ba2a5();
                if (m145849x949ba2a5 == null || (str = m145849x949ba2a5.f390703a) == null) {
                    str = "";
                }
                fj2.k m17 = a07.m(str);
                if ((m17 == null ? -1 : wj2.c.f528181b[m17.ordinal()]) == 1) {
                    android.view.ViewGroup viewGroup11 = this.f528192p1;
                    if (viewGroup11 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartLayout");
                        throw null;
                    }
                    viewGroup11.setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563331a93));
                } else {
                    android.view.ViewGroup viewGroup12 = this.f528192p1;
                    if (viewGroup12 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartLayout");
                        throw null;
                    }
                    viewGroup12.setBackgroundDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563330a92));
                }
            }
            th6 = null;
        } else {
            super.e();
            android.view.ViewGroup viewGroup13 = this.f528190l1;
            if (viewGroup13 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
                throw null;
            }
            viewGroup13.setVisibility(8);
            th6 = null;
        }
        if (f0Var2 == null) {
            super.e();
            android.view.ViewGroup viewGroup14 = this.f528190l1;
            if (viewGroup14 != null) {
                viewGroup14.setVisibility(8);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkHearLayout");
                throw th6;
            }
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
    public /* bridge */ /* synthetic */ ai2.a mo124427x4f7d778f() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getBattleTipsWidget */
    public /* bridge */ /* synthetic */ qi2.s1 mo124428x3f645dea() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public android.widget.FrameLayout mo124429x4ed4a76f() {
        android.widget.FrameLayout frameLayout = this.f528193x0;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("anchorCriticalGiftLayout");
        throw null;
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
    /* renamed from: getLuckyMoneyRootView */
    public android.view.ViewGroup mo124447xe76ca375() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "getLuckyMoneyRootView");
        if (wj2.c.f528180a[m145851x309290b1().ordinal()] != 1) {
            return m151550xbf9ab862();
        }
        android.view.ViewGroup viewGroup = this.W;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveLuckyMoneyBubbleSmallUiRoot");
        throw null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "CoverAudioWidget";
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    @Override // oj2.m, sj2.m
    public void h() {
        super.h();
        android.widget.FrameLayout mo124429x4ed4a76f = mo124429x4ed4a76f();
        if (mo124429x4ed4a76f == null) {
            return;
        }
        mo124429x4ed4a76f.setVisibility(8);
    }

    @Override // lj2.u0
    public void j(boolean z17) {
        int i17 = z17 ? 0 : 8;
        android.widget.Space space = this.f528191p0;
        if (space == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("anchorCriticalLayoutSpace");
            throw null;
        }
        if (i17 != space.getVisibility()) {
            u4.g1.a(m151564xfb84e958(), null);
            android.widget.Space space2 = this.f528191p0;
            if (space2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("anchorCriticalLayoutSpace");
                throw null;
            }
            space2.setVisibility(i17);
            m151564xfb84e958().requestLayout();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onNotifyCriticalLayoutShowChange: " + i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        if (r1.size() >= 2) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // wj2.w, lj2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(pm2.a r9, xh2.a r10) {
        /*
            r8 = this;
            java.lang.String r0 = "widgetMode"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            java.lang.String r0 = "data"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            lj2.v0 r0 = r8.m174009x3a33aac1()
            lj2.t0 r0 = r0.a0()
            java.util.List r1 = r0.g()
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L87
            java.util.List r1 = r0.l()
            monitor-enter(r1)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L84
            r3.<init>()     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r4 = r1.iterator()     // Catch: java.lang.Throwable -> L84
        L2c:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r5 == 0) goto L48
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L84
            r6 = r5
            km2.q r6 = (km2.q) r6     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r6 = r6.f390722t     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L84
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6, r7)     // Catch: java.lang.Throwable -> L84
            r6 = r6 ^ r2
            if (r6 == 0) goto L2c
            r3.add(r5)     // Catch: java.lang.Throwable -> L84
            goto L2c
        L48:
            monitor-exit(r1)
            int r1 = r3.size()
            r3 = 2
            if (r1 >= r3) goto L88
            java.util.List r0 = r0.l()
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L81
            r1.<init>()     // Catch: java.lang.Throwable -> L81
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> L81
        L5e:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L81
            if (r5 == 0) goto L79
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L81
            r6 = r5
            km2.q r6 = (km2.q) r6     // Catch: java.lang.Throwable -> L81
            java.lang.Boolean r6 = r6.f390722t     // Catch: java.lang.Throwable -> L81
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L81
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6, r7)     // Catch: java.lang.Throwable -> L81
            if (r6 == 0) goto L5e
            r1.add(r5)     // Catch: java.lang.Throwable -> L81
            goto L5e
        L79:
            monitor-exit(r0)
            int r0 = r1.size()
            if (r0 < r3) goto L87
            goto L88
        L81:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        L84:
            r9 = move-exception
            monitor-exit(r1)
            throw r9
        L87:
            r2 = 0
        L88:
            r8.f528195y0 = r2
            super.l(r9, r10)
            wj2.j0 r9 = r8.f528196y1
            if (r9 == 0) goto L9d
            lj2.e0 r0 = new lj2.e0
            android.view.View r1 = r9.f528222a
            lj2.f0 r2 = lj2.f0.f400388d
            r0.<init>(r1, r2)
            r9.b(r10, r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wj2.d.l(pm2.a, xh2.a):void");
    }

    @Override // oj2.m, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        super.onClick(view);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.view.ViewGroup viewGroup = this.f528192p1;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("teamHeartLayout");
            throw null;
        }
        int id6 = viewGroup.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            H();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // oj2.m, wj2.w, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wj2.j0 j0Var = this.f528196y1;
        if (j0Var != null) {
            j0Var.c();
        }
    }

    @Override // wj2.w
    public void x() {
        m151557xbdfe0acf().setTextSize(1, m173996x40077844());
        android.view.ViewGroup.LayoutParams layoutParams = m151554x3e2ffa0c().getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = m173993xecdaeef4();
            marginLayoutParams.rightMargin = m173993xecdaeef4();
            marginLayoutParams.bottomMargin = m173993xecdaeef4();
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = m151555x219a509d().getLayoutParams();
        if (layoutParams2 != null) {
            int m173992xd63878f0 = m173992xd63878f0();
            layoutParams2.width = m173992xd63878f0;
            layoutParams2.height = m173992xd63878f0;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = m151558xddb6ed56().getLayoutParams();
        if (layoutParams3 != null) {
            int m173991x1c780073 = m173991x1c780073();
            layoutParams3.width = m173991x1c780073;
            layoutParams3.height = m173991x1c780073;
        }
        android.view.ViewGroup.LayoutParams layoutParams4 = m151552x53b88e51().getLayoutParams();
        if (layoutParams4 != null) {
            int m173995xbc40cbc9 = m173995xbc40cbc9();
            layoutParams4.width = m173995xbc40cbc9;
            layoutParams4.height = m173995xbc40cbc9;
        }
        android.view.ViewGroup.LayoutParams layoutParams5 = m151553x47ce48ff().getLayoutParams();
        if (layoutParams5 != null) {
            int m173994x76961eb9 = m173994x76961eb9();
            layoutParams5.width = m173994x76961eb9;
            layoutParams5.height = m173994x76961eb9;
        }
    }
}
