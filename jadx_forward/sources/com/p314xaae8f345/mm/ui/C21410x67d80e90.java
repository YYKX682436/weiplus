package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.MainTabUI */
/* loaded from: classes11.dex */
public class C21410x67d80e90 {

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.HashMap f278453p;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f278454a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.he f278455b = new com.p314xaae8f345.mm.ui.he();

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p8 f278456c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f278457d;

    /* renamed from: e, reason: collision with root package name */
    public int f278458e;

    /* renamed from: f, reason: collision with root package name */
    public int f278459f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.fe f278460g;

    /* renamed from: h, reason: collision with root package name */
    public hh4.a f278461h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Boolean f278462i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f278463j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f278464k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f278465l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f278466m;

    /* renamed from: mTabsAdapter */
    private com.p314xaae8f345.mm.ui.C21410x67d80e90.TabsAdapter f39379x3c80cf44;

    /* renamed from: mViewPager */
    private com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d f39380x1c18ee31;

    /* renamed from: n, reason: collision with root package name */
    public boolean f278467n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f278468o;

    /* renamed from: com.tencent.mm.ui.MainTabUI$TabsAdapter */
    /* loaded from: classes11.dex */
    public class TabsAdapter extends p012xc85e97e9.p087x9da2e250.app.e2 implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener, com.p314xaae8f345.mm.ui.s1 {

        /* renamed from: _hellAccFlag_ */
        private byte f39381x7f11beae;

        /* renamed from: addressFragment */
        private com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.AbstractC22341xb20d9d07 f39382x9683ae64;

        /* renamed from: clickCount */
        private int f39383xd024d067;

        /* renamed from: isTabClicked */
        private boolean f39384xbb56a39c;

        /* renamed from: isUserSwiping */
        private boolean f39385x2e6ff3a2;

        /* renamed from: mFragmentResumedFlags */
        boolean[] f39386x5604c96d;

        /* renamed from: mViewPager */
        private final com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d f39387x1c18ee31;

        public TabsAdapter(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d c22458x34f98a1d) {
            super(activityC1102x9ee2d9f.mo7595x9cdc264(), 0);
            this.f39384xbb56a39c = false;
            this.f39383xd024d067 = 0;
            this.f39385x2e6ff3a2 = false;
            this.f39386x5604c96d = new boolean[]{true, false, false, false};
            this.f39387x1c18ee31 = c22458x34f98a1d;
            c22458x34f98a1d.mo79164x6cab2c8d(this);
            c22458x34f98a1d.mo79170x2d3430b4(this);
        }

        /* renamed from: fixAndroidOProgressBarOutScreenFlashProblem */
        private void m78778xa76d1318(int i17, float f17, int i18) {
            if (i18 != 0) {
                for (java.lang.Integer num : com.p314xaae8f345.mm.ui.C21410x67d80e90.f278453p.values()) {
                    if (num.intValue() != i17 && !this.f39386x5604c96d[num.intValue()]) {
                        m78780x326cb315(num.intValue(), 0);
                    }
                }
                return;
            }
            for (java.lang.Integer num2 : com.p314xaae8f345.mm.ui.C21410x67d80e90.f278453p.values()) {
                if (num2.intValue() != i17) {
                    m78780x326cb315(num2.intValue(), 8);
                } else if (!this.f39386x5604c96d[num2.intValue()]) {
                    m78780x326cb315(num2.intValue(), 0);
                }
            }
        }

        /* renamed from: reportSwitch */
        private void m78779x241d4188(int i17) {
            int i18 = this.f39383xd024d067;
            if (i18 > 0) {
                this.f39383xd024d067 = i18 - 1;
                if (i17 == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10957, "1");
                } else if (i17 == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10957, "2");
                } else if (i17 == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10957, "3");
                } else if (i17 == 3) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10957, "4");
                }
            } else if (!this.f39385x2e6ff3a2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.MainTabUI", "reportSwitch skip, not click or swipe, pos:%d", java.lang.Integer.valueOf(i17));
            } else if (i17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10957, "5");
            } else if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10957, "6");
            } else if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10957, "7");
            } else if (i17 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10957, "8");
            }
            this.f39384xbb56a39c = false;
            this.f39385x2e6ff3a2 = false;
        }

        /* renamed from: setFragmentLoadingIconVisibility */
        private void m78780x326cb315(int i17, int i18) {
            android.view.View mo26077x4ff8c0f0;
            if (com.p314xaae8f345.mm.ui.C21410x67d80e90.this.h(i17) == null || com.p314xaae8f345.mm.ui.C21410x67d80e90.this.h(i17).mo7430x19263085() == null || (mo26077x4ff8c0f0 = com.p314xaae8f345.mm.ui.C21410x67d80e90.this.h(i17).mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.imd)) == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo26077x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/ui/MainTabUI$TabsAdapter", "setFragmentLoadingIconVisibility", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo26077x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo26077x4ff8c0f0, "com/tencent/mm/ui/MainTabUI$TabsAdapter", "setFragmentLoadingIconVisibility", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
        /* renamed from: getCount */
        public int mo8338x7444f759() {
            return 4;
        }

        @Override // p012xc85e97e9.p087x9da2e250.app.e2
        /* renamed from: getItem */
        public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7743xfb80e389(int i17) {
            return com.p314xaae8f345.mm.ui.C21410x67d80e90.this.h(i17);
        }

        @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
        /* renamed from: onPageScrollStateChanged */
        public void mo8331xcb2941fe(int i17) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.AbstractC22341xb20d9d07 abstractC22341xb20d9d07;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object[] array = arrayList.toArray();
            arrayList.clear();
            yj0.a.b("com/tencent/mm/ui/MainTabUI$TabsAdapter", "com/tencent/mm/ui/MainTabUI$TabsAdapterandroidx/viewpager/widget/ViewPager$OnPageChangeListener", "onPageScrollStateChanged", "(I)V", this, array);
            if (i17 == 1) {
                this.f39385x2e6ff3a2 = true;
            }
            if (i17 == 0 && (abstractC22341xb20d9d07 = this.f39382x9683ae64) != null) {
                abstractC22341xb20d9d07.w0(true);
                this.f39382x9683ae64 = null;
            }
            com.p314xaae8f345.mm.ui.fe feVar = com.p314xaae8f345.mm.ui.C21410x67d80e90.this.f278460g;
            if (feVar != null) {
                com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                int i18 = c21374x812c2fd3.f278289o;
                com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e90 = c21374x812c2fd3.f278294t;
                if (i18 == 0 && i17 == 1) {
                    c21374x812c2fd3.f278287m = c21410x67d80e90.f278458e;
                } else if (i17 == 2) {
                    c21374x812c2fd3.f278288n = c21410x67d80e90.f278458e;
                } else if (i17 == 0) {
                    c21374x812c2fd3.f278287m = 0;
                    c21374x812c2fd3.f278288n = 0;
                }
                c21374x812c2fd3.f278289o = i17;
            }
            yj0.a.h(this, "com/tencent/mm/ui/MainTabUI$TabsAdapter", "com/tencent/mm/ui/MainTabUI$TabsAdapterandroidx/viewpager/widget/ViewPager$OnPageChangeListener", "onPageScrollStateChanged", "(I)V");
        }

        @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
        /* renamed from: onPageScrolled */
        public void mo8332xf210c75a(int i17, float f17, int i18) {
            com.p314xaae8f345.mm.ui.t1 t1Var = com.p314xaae8f345.mm.ui.C21410x67d80e90.this.f278455b.f290399g;
            if (t1Var != null) {
                com.p314xaae8f345.mm.ui.C21389xb8f36d3b c21389xb8f36d3b = (com.p314xaae8f345.mm.ui.C21389xb8f36d3b) t1Var;
                int i19 = (int) (255.0f * f17);
                int i27 = 255 - i19;
                float f18 = c21389xb8f36d3b.f278391u;
                float f19 = c21389xb8f36d3b.f278388r;
                float f27 = c21389xb8f36d3b.f278392v;
                float f28 = c21389xb8f36d3b.f278389s;
                float f29 = c21389xb8f36d3b.f278393w;
                float f37 = c21389xb8f36d3b.f278390t;
                int i28 = c21389xb8f36d3b.f278387q & (-16777216);
                int i29 = (((int) ((f18 * f17) + f19)) << 16) + (((int) ((f27 * f17) + f28)) << 8) + ((int) ((f29 * f17) + f37)) + i28;
                float f38 = 1.0f - f17;
                int i37 = (((int) ((f18 * f38) + f19)) << 16) + (((int) ((f27 * f38) + f28)) << 8) + ((int) ((f29 * f38) + f37)) + i28;
                if (i17 == 0) {
                    c21389xb8f36d3b.f278379f.f291418e.m78822xdca5b968(i27);
                    c21389xb8f36d3b.f278381h.f291418e.m78822xdca5b968(i19);
                    c21389xb8f36d3b.f278379f.f291419f.setTextColor(i37);
                    c21389xb8f36d3b.f278381h.f291419f.setTextColor(i29);
                } else if (i17 == 1) {
                    c21389xb8f36d3b.f278381h.f291418e.m78822xdca5b968(i27);
                    c21389xb8f36d3b.f278380g.f291418e.m78822xdca5b968(i19);
                    c21389xb8f36d3b.f278381h.f291419f.setTextColor(i37);
                    c21389xb8f36d3b.f278380g.f291419f.setTextColor(i29);
                } else if (i17 == 2) {
                    c21389xb8f36d3b.f278380g.f291418e.m78822xdca5b968(i27);
                    c21389xb8f36d3b.f278382i.f291418e.m78822xdca5b968(i19);
                    c21389xb8f36d3b.f278380g.f291419f.setTextColor(i37);
                    c21389xb8f36d3b.f278382i.f291419f.setTextColor(i29);
                }
                if (f17 == 0.0f) {
                    c21389xb8f36d3b.mo78461x684367d(i17);
                }
            }
            com.p314xaae8f345.mm.ui.fe feVar = com.p314xaae8f345.mm.ui.C21410x67d80e90.this.f278460g;
            if (feVar != null) {
                com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                if ((!r7.q()) & (c21374x812c2fd3.f278277c != null)) {
                    c21374x812c2fd3.f278277c.L();
                }
                c21374x812c2fd3.f278286l = false;
                int i38 = c21374x812c2fd3.f278294t.f278458e;
                if (!(i38 == 3 && i17 == 2)) {
                    if (i38 == 2 && i17 == 2 && f17 > 0.0f) {
                        c21374x812c2fd3.q(c21374x812c2fd3.f278291q.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
                        android.view.MenuItem menuItem = c21374x812c2fd3.F;
                        if (menuItem != null) {
                            menuItem.setVisible(false);
                        }
                        android.view.MenuItem menuItem2 = c21374x812c2fd3.G;
                        if (menuItem2 != null) {
                            menuItem2.setVisible(false);
                        }
                        android.widget.TextView textView = c21374x812c2fd3.f278279e;
                        if (textView != null) {
                            textView.setVisibility(8);
                        }
                    } else {
                        if (i38 == 3 && i17 == 3 && f17 == 0.0f) {
                            c21374x812c2fd3.f278286l = true;
                            c21374x812c2fd3.w(true);
                        } else {
                            if (i38 == 2 && i17 == 2 && f17 == 0.0f) {
                                c21374x812c2fd3.f278286l = true;
                                c21374x812c2fd3.w(true);
                            } else {
                                c21374x812c2fd3.f278286l = true;
                            }
                        }
                    }
                }
            }
            if (0.0f != f17) {
                if (this.f39382x9683ae64 == null) {
                    this.f39382x9683ae64 = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.AbstractC22341xb20d9d07) com.p314xaae8f345.mm.ui.C21410x67d80e90.this.h(1);
                }
                this.f39382x9683ae64.w0(false);
            } else {
                int i39 = com.p314xaae8f345.mm.ui.C21410x67d80e90.this.f278459f;
                com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e90 = com.p314xaae8f345.mm.ui.C21410x67d80e90.this;
                int i47 = c21410x67d80e90.f278459f;
                if (-1 == i47) {
                    c21410x67d80e90.b(i47, c21410x67d80e90.f278458e);
                    com.p314xaae8f345.mm.ui.C21410x67d80e90.this.c(i17);
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.ge(this, i17));
                }
            }
            m78778xa76d1318(i17, f17, i18);
        }

        @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
        /* renamed from: onPageSelected */
        public void mo8333x510f45c9(int i17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object[] array = arrayList.toArray();
            arrayList.clear();
            yj0.a.b("com/tencent/mm/ui/MainTabUI$TabsAdapter", "com/tencent/mm/ui/MainTabUI$TabsAdapterandroidx/viewpager/widget/ViewPager$OnPageChangeListener", "onPageSelected", "(I)V", this, array);
            if (!gm0.j1.b().m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.MainTabUI", "on page position %d selected, but account not initialized.", java.lang.Integer.valueOf(i17));
                yj0.a.h(this, "com/tencent/mm/ui/MainTabUI$TabsAdapter", "com/tencent/mm/ui/MainTabUI$TabsAdapterandroidx/viewpager/widget/ViewPager$OnPageChangeListener", "onPageSelected", "(I)V");
                return;
            }
            kc2.g1 b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk()).b1();
            if (b17 != null) {
                b17.k().mo50293x3498a0(new kc2.w0(b17, i17));
            }
            if (i17 == 2) {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.b3.f186946d;
                c61.l7 l7Var = (c61.l7) b6Var;
                l7Var.getClass();
                l7Var.nk().r(b3Var, null);
            } else {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).yj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.b3.f186946d);
            }
            zy2.e9 e9Var = (zy2.e9) i95.n0.c(zy2.e9.class);
            boolean z17 = true;
            int i18 = i17 == 2 ? 1 : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w1 w1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w1) e9Var;
            w1Var.f187481i = i18;
            if (i18 != 0) {
                boolean z18 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a.K() ? ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a, "是否允许撤回发现页底部tab红点", e42.c0.clicfg_enable_revoke_finder_discovery_reddot, 0, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yh0.f209923d, 8, null)).intValue() : ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207994o).mo141623x754a37bb()).r()).intValue()) == 1;
                if (z18 != w1Var.f187484o) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NewDiscoveryRedDotHandler", "modify enableRevokeReddot from " + w1Var.f187484o + " to " + z18);
                }
                w1Var.f187484o = z18;
                w1Var.Di(false);
            } else {
                r45.gl0 bj6 = w1Var.bj();
                if (bj6.m75933x41a8a7f2(26)) {
                    w1Var.f187477e = 105;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = w1Var.f187478f;
                    n3Var.mo50302x6b17ad39(null);
                    n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l1(w1Var, false, "4Tab", bj6, 0));
                }
            }
            i95.n0.c(m33.q1.class);
            sg0.a2 a2Var = (sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class));
            a2Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "onPageSelected, " + i17);
            if (i17 == 0) {
                a2Var.Vi("chats");
                a2Var.cj(3, 0);
            } else if (i17 == 1) {
                a2Var.Vi("contacts");
                a2Var.cj(3, 0);
            } else if (i17 == 2) {
                a2Var.Vi("discover");
            } else if (i17 == 3) {
                a2Var.Vi("me");
            }
            if (i17 == 2) {
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().a(2);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("Discovery");
            } else if (i17 == 3) {
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().a(1);
            }
            m78779x241d4188(i17);
            com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e90 = com.p314xaae8f345.mm.ui.C21410x67d80e90.this;
            c21410x67d80e90.f278459f = c21410x67d80e90.f278458e;
            c21410x67d80e90.f278458e = i17;
            c21410x67d80e90.f278455b.a(i17);
            com.p314xaae8f345.mm.ui.C21410x67d80e90.this.f278454a.mo2548x55429c53();
            com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e902 = com.p314xaae8f345.mm.ui.C21410x67d80e90.this;
            com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 h17 = c21410x67d80e902.h(c21410x67d80e902.f278458e);
            com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e903 = com.p314xaae8f345.mm.ui.C21410x67d80e90.this;
            if (c21410x67d80e903.f278459f == 1 && c21410x67d80e903.f278458e != 1) {
                c01.d9.b().p().w(340226, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
            if (com.p314xaae8f345.mm.ui.C21410x67d80e90.this.f278458e == 1 && java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) c01.d9.b().p().l(340226, null), 0L) >= 180000) {
                ((com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.AbstractC22341xb20d9d07) h17).u0();
            }
            if (com.p314xaae8f345.mm.ui.C21410x67d80e90.this.f278458e == 0) {
                ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).k(true);
            } else {
                ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).k(false);
            }
            if (h17 != null) {
                java.lang.String name = com.p314xaae8f345.mm.ui.C21410x67d80e90.this.f278454a.getClass().getName();
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134275x.g(name + "#" + h17.getClass().getSimpleName());
            }
            com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e904 = com.p314xaae8f345.mm.ui.C21410x67d80e90.this;
            com.p314xaae8f345.mm.ui.fe feVar = c21410x67d80e904.f278460g;
            if (feVar != null) {
                int i19 = c21410x67d80e904.f278458e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "tabChange %s", java.lang.Integer.valueOf(i19));
                com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                if (i19 == 3) {
                    c21374x812c2fd3.f278286l = true;
                }
                if (i19 != 0) {
                    c21374x812c2fd3.getClass();
                    int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07);
                    if (c21374x812c2fd3.K != null) {
                        c21374x812c2fd3.K.setBackgroundColor(color);
                    }
                } else if (c21374x812c2fd3.K != null) {
                    c21374x812c2fd3.K.setBackground(null);
                }
                java.lang.Boolean bool = com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278271a0;
                c21374x812c2fd3.w(true);
                int color2 = c21374x812c2fd3.f278291q.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07);
                int color3 = c21374x812c2fd3.f278291q.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560132bx);
                int color4 = c21374x812c2fd3.f278291q.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
                c21374x812c2fd3.a(1.0f, color2, 0);
                c21374x812c2fd3.c(1.0f, color3, color4);
                com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 h18 = c21374x812c2fd3.f278294t.h(0);
                if (h18 instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) {
                    boolean z19 = i19 == 0;
                    com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) h18).f288905o;
                    if (viewOnTouchListenerC22366xcd5c2226 != null) {
                        viewOnTouchListenerC22366xcd5c2226.m80529x16e1331a(z19);
                    }
                    if (z19) {
                        o25.q qVar = o25.q.f424107a;
                        if (qVar.f()) {
                            if (!qVar.g() ? false : qVar.e().getBoolean("biz_time_preload_at_chat_list", false)) {
                                qVar.i();
                            }
                        }
                    }
                }
                c21374x812c2fd3.g();
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8 c5643xca5254a8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8();
            c5643xca5254a8.f135971g.f88958a = com.p314xaae8f345.mm.ui.C21410x67d80e90.this.f278458e;
            c5643xca5254a8.e();
            boolean z27 = com.p314xaae8f345.mm.ui.bk.v0() && com.p314xaae8f345.mm.ui.bk.N(com.p314xaae8f345.mm.ui.C21410x67d80e90.this.f278454a.getTaskId());
            if (com.p314xaae8f345.mm.ui.bk.w0() && com.p314xaae8f345.mm.ui.bk.O(com.p314xaae8f345.mm.ui.C21410x67d80e90.this.f278454a.getContentResolver()) && com.p314xaae8f345.mm.ui.bk.A()) {
                int i27 = com.p314xaae8f345.mm.ui.C21410x67d80e90.this.f278454a.getResources().getConfiguration().orientation;
            }
            if (z27) {
                com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = com.p314xaae8f345.mm.ui.C21410x67d80e90.this.f278454a;
                if (com.p314xaae8f345.mm.ui.fl.a(com.p314xaae8f345.mm.ui.fl.f290138a, activityC21401x6ce6f73f.getTaskId()) != 1 && com.p314xaae8f345.mm.ui.v7.a(com.p314xaae8f345.mm.ui.v7.f292641a, activityC21401x6ce6f73f.getTaskId()) != 1 && com.p314xaae8f345.mm.ui.w9.a(com.p314xaae8f345.mm.ui.w9.f292747a, activityC21401x6ce6f73f.getTaskId()) != 1 && com.p314xaae8f345.mm.ui.rk.a(activityC21401x6ce6f73f.getTaskId()) != 1 && com.p314xaae8f345.mm.ui.eg.a(activityC21401x6ce6f73f.getTaskId()) != 1) {
                    z17 = false;
                }
                if (!z17) {
                    com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e905 = com.p314xaae8f345.mm.ui.C21410x67d80e90.this;
                    if (c21410x67d80e905.f278458e == 0 && c21410x67d80e905.f278462i.booleanValue()) {
                        yj0.a.h(this, "com/tencent/mm/ui/MainTabUI$TabsAdapter", "com/tencent/mm/ui/MainTabUI$TabsAdapterandroidx/viewpager/widget/ViewPager$OnPageChangeListener", "onPageSelected", "(I)V");
                        return;
                    }
                    android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.ui.C21410x67d80e90.this.f278454a, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21355x1ac86f5c.class);
                    intent.addFlags(67108864);
                    com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f2 = com.p314xaae8f345.mm.ui.C21410x67d80e90.this.f278454a;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(activityC21401x6ce6f73f2, arrayList2.toArray(), "com/tencent/mm/ui/MainTabUI$TabsAdapter", "onPageSelected", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC21401x6ce6f73f2.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(activityC21401x6ce6f73f2, "com/tencent/mm/ui/MainTabUI$TabsAdapter", "onPageSelected", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.MainTabUI", "start empty activity");
                }
            }
            yj0.a.h(this, "com/tencent/mm/ui/MainTabUI$TabsAdapter", "com/tencent/mm/ui/MainTabUI$TabsAdapterandroidx/viewpager/widget/ViewPager$OnPageChangeListener", "onPageSelected", "(I)V");
        }

        @Override // com.p314xaae8f345.mm.ui.s1
        /* renamed from: onTabClick */
        public void mo78781x6d7cadf2(int i17) {
            com.p314xaae8f345.mm.ui.he heVar;
            zy2.ka kaVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g gVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var;
            com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e90 = com.p314xaae8f345.mm.ui.C21410x67d80e90.this;
            if (!c21410x67d80e90.f278464k) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.MainTabUI", "now cannot change tab");
                return;
            }
            if (i17 == c21410x67d80e90.f278458e) {
                com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 h17 = c21410x67d80e90.h(i17);
                if (h17 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment) {
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment) h17).r0();
                    return;
                }
                return;
            }
            this.f39384xbb56a39c = true;
            this.f39383xd024d067++;
            this.f39387x1c18ee31.m80845x940d026a(i17, false);
            if (i17 != 3) {
                if (i17 != 2 || (heVar = com.p314xaae8f345.mm.ui.C21410x67d80e90.this.f278455b) == null || (kaVar = heVar.f290398f) == null || (z9Var = (gVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g) kaVar).f187062c) == null) {
                    return;
                }
                gVar.e(2, z9Var.f186862c, z9Var.f186861b);
                return;
            }
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262145, 266241);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262156, 266241);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262147, 266241);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262149, 266241);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262152, 266241);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().i(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, 266241);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_STRING_SYNC, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEW_BANDAGE_WATCHER_ME_TAB_STRING_SYNC);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            boolean l17 = bk0.a.g().l(352280);
            if (l17) {
                ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                bk0.a.g().p(352280, false);
            }
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14872, 6, java.lang.Integer.valueOf(bk0.a.g().b(262156, 266241) ? 1 : 0), "", "", 0);
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_MY_ENTRY_TAB_REDDOT_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).fj(l17 ? 7L : 8L, "");
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g gVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g.f242585a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g.f242587c = false;
        }
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f278453p = hashMap;
        hashMap.put("tab_main", 0);
        hashMap.put("tab_address", 1);
        hashMap.put("tab_find_friend", 2);
        hashMap.put("tab_settings", 3);
    }

    public C21410x67d80e90() {
        new java.util.HashSet();
        this.f278458e = -1;
        this.f278459f = -1;
        this.f278462i = java.lang.Boolean.FALSE;
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f278463j = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5233xadd2a4b1>(a0Var) { // from class: com.tencent.mm.ui.MainTabUI.1
            {
                this.f39173x3fe91575 = 277569697;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5233xadd2a4b1 c5233xadd2a4b1) {
                int i17 = c5233xadd2a4b1.f135567g.f89953a;
                if (i17 < 0 || i17 > 3) {
                    return false;
                }
                com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e90 = com.p314xaae8f345.mm.ui.C21410x67d80e90.this;
                if (i17 == 0) {
                    c21410x67d80e90.o("tab_main");
                    return false;
                }
                if (i17 == 1) {
                    c21410x67d80e90.o("tab_address");
                    return false;
                }
                if (i17 == 2) {
                    c21410x67d80e90.o("tab_find_friend");
                    return false;
                }
                if (i17 != 3) {
                    return false;
                }
                c21410x67d80e90.o("tab_settings");
                return false;
            }
        };
        this.f278464k = true;
        this.f278465l = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5328x715b1418>(a0Var) { // from class: com.tencent.mm.ui.MainTabUI.2
            {
                this.f39173x3fe91575 = -1510309336;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5328x715b1418 c5328x715b1418) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5328x715b1418 c5328x715b14182 = c5328x715b1418;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.MainTabUI", "EnableMainBottomTabSwitchEvent enable: %b", java.lang.Boolean.valueOf(c5328x715b14182.f135641g.f89585a));
                boolean z17 = c5328x715b14182.f135641g.f89585a;
                com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e90 = com.p314xaae8f345.mm.ui.C21410x67d80e90.this;
                c21410x67d80e90.f278464k = z17;
                c21410x67d80e90.m(z17);
                return true;
            }
        };
        this.f278466m = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5611xeee5db20>(a0Var) { // from class: com.tencent.mm.ui.MainTabUI.3
            {
                this.f39173x3fe91575 = 1812910384;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5611xeee5db20 c5611xeee5db20) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5611xeee5db20 c5611xeee5db202 = c5611xeee5db20;
                c5611xeee5db202.f135937g.f88207a = com.p314xaae8f345.mm.ui.C21410x67d80e90.this.i();
                int i17 = c5611xeee5db202.f135937g.f88207a;
                return true;
            }
        };
        this.f278467n = false;
        this.f278468o = new java.util.HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r7) {
        /*
            r6 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 0
            r0[r2] = r1
            int r1 = r6.f278458e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 1
            r0[r3] = r1
            com.tencent.mm.ui.base.CustomViewPager r1 = r6.f39380x1c18ee31
            if (r1 == 0) goto L19
            r1 = r3
            goto L1a
        L19:
            r1 = r2
        L1a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4 = 2
            r0[r4] = r1
            java.util.HashMap r1 = r6.f278468o
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 3
            r0[r4] = r1
            java.lang.String r1 = "MicroMsg.LauncherUI.MainTabUI"
            java.lang.String r4 = "change tab to %d, cur tab %d, has init tab %B, tab cache size %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r4, r0)
            com.tencent.mm.ui.base.CustomViewPager r0 = r6.f39380x1c18ee31
            if (r0 == 0) goto Lbe
            if (r7 < 0) goto Lbe
            com.tencent.mm.ui.MainTabUI$TabsAdapter r0 = r6.f39379x3c80cf44
            if (r0 == 0) goto L48
            int r0 = r0.mo8338x7444f759()
            int r0 = r0 - r3
            if (r7 <= r0) goto L48
            goto Lbe
        L48:
            int r0 = r6.f278458e
            if (r0 != r7) goto L55
            java.util.HashMap r0 = r6.f278468o
            int r0 = r0.size()
            if (r0 == 0) goto L55
            return
        L55:
            int r0 = r6.f278458e
            r6.f278458e = r7
            com.tencent.mm.ui.he r1 = r6.f278455b
            r1.a(r7)
            com.tencent.mm.ui.base.CustomViewPager r7 = r6.f39380x1c18ee31
            if (r7 == 0) goto L75
            r1 = -1
            if (r0 != r1) goto L6b
            int r0 = r6.f278458e
            r7.m80850xd5848e53(r0, r2)
            goto L70
        L6b:
            int r0 = r6.f278458e
            r7.m80845x940d026a(r0, r2)
        L70:
            int r7 = r6.f278458e
            r6.c(r7)
        L75:
            int r7 = r6.f278458e
            if (r7 != 0) goto L89
            java.lang.String r7 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a
            boolean r7 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134272u
            if (r7 == 0) goto L89
            c01.m8 r7 = c01.d9.f()
            com.tencent.mm.booter.notification.x r7 = (com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) r7
            r7.k(r3)
            goto L92
        L89:
            c01.m8 r7 = c01.d9.f()
            com.tencent.mm.booter.notification.x r7 = (com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) r7
            r7.k(r2)
        L92:
            int r7 = r6.f278458e
            if (r7 == 0) goto Lbe
            com.tencent.mm.ui.MMFragment r7 = r6.h(r2)
            boolean r0 = r7 instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d
            if (r0 == 0) goto Lbe
            com.tencent.mm.ui.conversation.MainUI r7 = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) r7
            com.tencent.mm.ui.conversation.ConversationListView r0 = r7.f288905o
            if (r0 == 0) goto Lbe
            boolean r0 = r0.r()
            if (r0 == 0) goto Lbe
            com.tencent.mm.ui.conversation.ConversationListView r7 = r7.f288905o
            boolean r0 = r7.f288848g
            if (r0 == 0) goto Lbb
            com.tencent.mm.plugin.taskbar.ui.r r0 = r7.f288851m
            if (r0 == 0) goto Lbb
            com.tencent.mm.plugin.taskbar.ui.z r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) r0
            r4 = 0
            r0.b(r4, r2, r3)
        Lbb:
            r7.u()
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.C21410x67d80e90.a(int):void");
    }

    public void b(int i17, int i18) {
        if (i17 == i18) {
            return;
        }
        p012xc85e97e9.p093xedfae76a.m1 h17 = h(i17);
        if (h17 != null && (h17 instanceof com.p314xaae8f345.mm.ui.y7)) {
            ((com.p314xaae8f345.mm.ui.y7) h17).B();
        }
        p012xc85e97e9.p093xedfae76a.m1 h18 = h(i18);
        if (h18 != null && (h18 instanceof com.p314xaae8f345.mm.ui.y7)) {
            ((com.p314xaae8f345.mm.ui.y7) h18).r();
        }
        kn4.i0 i0Var = (kn4.i0) ((pf0.u) i95.n0.c(pf0.u.class));
        i0Var.getClass();
        java.lang.String str = null;
        java.lang.String str2 = i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? null : "MoreTabUI" : "FindMoreFriendUI" : "AddressUI" : "MainUI";
        if (str2 != null) {
            i0Var.Ai(str2, 4);
        }
        if (i18 == 0) {
            str = "MainUI";
        } else if (i18 == 1) {
            str = "AddressUI";
        } else if (i18 == 2) {
            str = "FindMoreFriendUI";
        } else if (i18 == 3) {
            str = "MoreTabUI";
        }
        if (str == null) {
            return;
        }
        i0Var.Ai(str, 3);
    }

    public void c(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.MainTabUI", "deliverOnTabResume %s", java.lang.Integer.valueOf(i17));
        p012xc85e97e9.p093xedfae76a.m1 h17 = h(i17);
        if (h17 == null) {
            return;
        }
        if (h17 instanceof com.p314xaae8f345.mm.ui.y7) {
            ((com.p314xaae8f345.mm.ui.y7) h17).v();
            this.f278456c.getClass();
        }
        this.f39379x3c80cf44.f39386x5604c96d[i17] = true;
    }

    public void d() {
        android.view.View m78457x39c39ebc;
        c00.b4 b4Var;
        com.p314xaae8f345.mm.ui.t1 t1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.MainTabUI", "doOnCreate");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d c21470xb673f8d = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d) this.f278454a.findViewById(com.p314xaae8f345.mm.R.id.kod);
        this.f39380x1c18ee31 = c21470xb673f8d;
        c21470xb673f8d.m80853x40341e13(4);
        m(true);
        this.f39380x1c18ee31.m78874xccbc1671(false);
        this.f39379x3c80cf44 = new com.p314xaae8f345.mm.ui.C21410x67d80e90.TabsAdapter(this.f278454a, this.f39380x1c18ee31);
        com.p314xaae8f345.mm.ui.he heVar = this.f278455b;
        com.p314xaae8f345.mm.ui.t1 t1Var2 = heVar.f290399g;
        if (t1Var2 != null) {
            ((com.p314xaae8f345.mm.ui.C21389xb8f36d3b) t1Var2).f278379f.f291419f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gqz);
        }
        if (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b() != null) {
            a(com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b().f278373w);
        } else {
            a(0);
        }
        android.view.ViewGroup contentView = (android.view.ViewGroup) this.f39380x1c18ee31.getParent();
        com.p314xaae8f345.mm.ui.C21410x67d80e90.TabsAdapter tabsAdapter = this.f39379x3c80cf44;
        com.p314xaae8f345.mm.ui.t1 t1Var3 = heVar.f290399g;
        if (t1Var3 != null) {
            t1Var3.mo78460x97cfa8c8(null);
            android.view.View view = (android.view.View) heVar.f290399g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MainTabUnreadMgr", "resetNavBarPos", "(Landroid/view/ViewGroup;Lcom/tencent/mm/ui/BaseLauncherUITabView$IOnTabClick;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/MainTabUnreadMgr", "resetNavBarPos", "(Landroid/view/ViewGroup;Lcom/tencent/mm/ui/BaseLauncherUITabView$IOnTabClick;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (contentView != null) {
                contentView.removeView((android.view.View) heVar.f290399g);
            }
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        com.p314xaae8f345.mm.ui.C21389xb8f36d3b c21389xb8f36d3b = new com.p314xaae8f345.mm.ui.C21389xb8f36d3b(heVar.f290396d);
        if (com.p314xaae8f345.mm.ui.b4.c(heVar.f290396d)) {
            c21389xb8f36d3b.setClickable(true);
        }
        c21389xb8f36d3b.setId(com.p314xaae8f345.mm.R.id.huj);
        if (contentView != null) {
            layoutParams.gravity = 80;
            contentView.addView(c21389xb8f36d3b, layoutParams);
        }
        heVar.f290399g = c21389xb8f36d3b;
        com.p314xaae8f345.mm.ui.a4 a4Var = com.p314xaae8f345.mm.ui.a4.f278650a;
        if (a4Var.h(heVar.f290396d)) {
            com.p314xaae8f345.mm.ui.C21389xb8f36d3b c21389xb8f36d3b2 = (com.p314xaae8f345.mm.ui.C21389xb8f36d3b) heVar.f290399g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c21389xb8f36d3b2, "<this>");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
            a4Var.l(c21389xb8f36d3b2, new com.p314xaae8f345.mm.ui.s3(true, contentView, c21389xb8f36d3b2, false), null);
        }
        android.view.View view2 = (android.view.View) heVar.f290399g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/MainTabUnreadMgr", "resetNavBarPos", "(Landroid/view/ViewGroup;Lcom/tencent/mm/ui/BaseLauncherUITabView$IOnTabClick;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/MainTabUnreadMgr", "resetNavBarPos", "(Landroid/view/ViewGroup;Lcom/tencent/mm/ui/BaseLauncherUITabView$IOnTabClick;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        heVar.f290399g.mo78460x97cfa8c8(tabsAdapter);
        if (t1Var3 != null && t1Var3 != (t1Var = heVar.f290399g)) {
            ((com.p314xaae8f345.mm.ui.C21389xb8f36d3b) t1Var).f(t1Var3.mo78459xb7c31c1f());
            ((com.p314xaae8f345.mm.ui.C21389xb8f36d3b) heVar.f290399g).h(t1Var3.mo78456x98878377());
            ((com.p314xaae8f345.mm.ui.C21389xb8f36d3b) heVar.f290399g).k(t1Var3.mo78455x190d9235());
            ((com.p314xaae8f345.mm.ui.C21389xb8f36d3b) heVar.f290399g).i(t1Var3.mo78451x45062da());
            ((com.p314xaae8f345.mm.ui.C21389xb8f36d3b) heVar.f290399g).j(t1Var3.mo78453x64935470());
            ((com.p314xaae8f345.mm.ui.C21389xb8f36d3b) heVar.f290399g).l(t1Var3.mo78458x3f483e0b());
            heVar.f290399g.mo78461x684367d(t1Var3.mo78452x14ac9753());
        }
        zy2.ka kaVar = heVar.f290398f;
        if (kaVar != null) {
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity = heVar.f290396d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g gVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g) kaVar;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DiscoveryFinderRedDotMgr", "registerDiscoveryObserver...");
            p012xc85e97e9.p093xedfae76a.j0 j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186888b;
            p012xc85e97e9.p093xedfae76a.k0 k0Var = gVar.f187064e;
            pm0.v.y(j0Var, activity, k0Var);
            pm0.v.y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186892d, activity, gVar.f187065f);
            pm0.v.y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.U, activity, k0Var);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g) heVar.f290398f).f187060a = heVar.f290410u;
            com.p314xaae8f345.mm.ui.t1 t1Var4 = heVar.f290399g;
            if (t1Var4 instanceof com.p314xaae8f345.mm.ui.C21389xb8f36d3b) {
                android.widget.TextView m78454xa70a7131 = ((com.p314xaae8f345.mm.ui.C21389xb8f36d3b) t1Var4).m78454xa70a7131();
                if (m78454xa70a7131 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g gVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g) heVar.f290398f;
                    gVar2.getClass();
                    ym5.a1.h(m78454xa70a7131, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.e(gVar2));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI.MainTabUnreadMgr", "registerFinderRedDotObserve unReadView is null!");
                }
                android.widget.ImageView imageView = ((com.p314xaae8f345.mm.ui.C21389xb8f36d3b) heVar.f290399g).f278380g.f291421h;
                if (imageView != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g gVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g) heVar.f290398f;
                    gVar3.getClass();
                    ym5.a1.h(imageView, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.d(gVar3));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI.MainTabUnreadMgr", "registerFinderRedDotObserve unReadView is null!");
                }
            }
        }
        zy2.ca caVar = (zy2.ca) i95.n0.c(zy2.ca.class);
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f owner = heVar.f290396d;
        com.p314xaae8f345.mm.ui.qe qeVar = new com.p314xaae8f345.mm.ui.qe(heVar);
        ((c61.t8) caVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        pm0.v.X(new c61.q8(owner, qeVar));
        com.p314xaae8f345.mm.ui.t1 t1Var5 = heVar.f290399g;
        if ((t1Var5 instanceof com.p314xaae8f345.mm.ui.C21389xb8f36d3b) && (m78457x39c39ebc = ((com.p314xaae8f345.mm.ui.C21389xb8f36d3b) t1Var5).m78457x39c39ebc()) != null && (b4Var = (c00.b4) i95.n0.c(c00.b4.class)) != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Vj(m78457x39c39ebc, 32, new b00.o2((b00.q2) b4Var));
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.id.b(new com.p314xaae8f345.mm.ui.p2740x696c9db.hd() { // from class: com.tencent.mm.ui.MainTabUI$$c
            @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.hd
            public final void a() {
                ((com.p314xaae8f345.mm.ui.C21389xb8f36d3b) com.p314xaae8f345.mm.ui.C21410x67d80e90.this.f278455b.f290399g).f278379f.f291419f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gqz);
            }
        }, this.f278454a);
    }

    public void e() {
        this.f278463j.mo48814x2efc64();
        this.f278465l.mo48814x2efc64();
        this.f278466m.mo48814x2efc64();
        this.f278468o.clear();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d c21470xb673f8d = this.f39380x1c18ee31;
        if (c21470xb673f8d != null) {
            c21470xb673f8d.m78873x6e5cce43(false);
            this.f39380x1c18ee31.m78874xccbc1671(false);
        }
        com.p314xaae8f345.mm.ui.he heVar = this.f278455b;
        zy2.ka kaVar = heVar.f290398f;
        if (kaVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI.MainTabUnreadMgr", "[unRegisterFinderRedDotObserve] iFinderTabRedDotManager is null!");
            return;
        }
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity = heVar.f290396d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        boolean e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DiscoveryFinderRedDotMgr", "unregisterDiscoveryObserver... isMainThread=" + e17);
        if (e17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186888b.m7809x1ff8439(activity);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186892d.m7809x1ff8439(activity);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.U.m7809x1ff8439(activity);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g) kaVar).f187060a = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(boolean z17) {
        zy2.c9 c9Var;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.MainTabUI", "onResume start :%d, chattingShow:%s", java.lang.Integer.valueOf(this.f278458e), java.lang.Boolean.valueOf(z17));
        java.util.HashMap hashMap = this.f278468o;
        if (hashMap.size() != 0) {
            com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 h17 = h(this.f278458e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.MainTabUI", "notifyCurrentTabResumeUI, mCurIndex:%s", java.lang.Integer.valueOf(this.f278458e));
            if (h17 != 0) {
                ((com.p314xaae8f345.mm.ui.y7) h17).T();
            }
            if (h17 != 0 && ih.d.c() && h17.mo7430x19263085() != null) {
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134275x.g(h17.mo7430x19263085().getClass().getName() + "#" + h17.getClass().getSimpleName());
            }
        }
        if (this.f278457d && this.f278454a.getIntent().hasExtra("isScrollFirst") && this.f278454a.getIntent().hasExtra("isShowHeader") && (c22376x88ed722d = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) hashMap.get(0)) != null) {
            c22376x88ed722d.u0(this.f278454a.getIntent().getBooleanExtra("isShowHeader", false), this.f278454a.getIntent().getBooleanExtra("isShowHeaderWithAnim", false), this.f278454a.getIntent().getBooleanExtra("isScrollFirst", true));
        }
        if (this.f278457d) {
            this.f278457d = false;
            o("tab_main");
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d2 = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) hashMap.get(0);
        if (c22376x88ed722d2 != null) {
            c22376x88ed722d2.s0();
        }
        if (this.f278458e != 0 || z17) {
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).k(false);
        } else {
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).k(true);
        }
        com.p314xaae8f345.mm.ui.y7 y7Var = (com.p314xaae8f345.mm.ui.y7) h(this.f278458e);
        if (y7Var != null) {
            y7Var.U();
        }
        this.f278457d = false;
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(this.f278454a.getIntent(), "preferred_tab", 0);
        if (g17 != 0) {
            a(g17);
            this.f278454a.getIntent().putExtra("preferred_tab", 0);
        }
        this.f278463j.mo48813x58998cd();
        this.f278465l.mo48813x58998cd();
        this.f278466m.mo48813x58998cd();
        final com.p314xaae8f345.mm.ui.he heVar = this.f278455b;
        com.p314xaae8f345.mm.ui.t1 t1Var = heVar.f290399g;
        if (gm0.j1.a()) {
            c01.d9.b().p().a(heVar.f290407r);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().a(heVar.f290406q);
            ((l75.a1) c01.d9.b().r()).a(heVar);
            heVar.f290403n.mo48813x58998cd();
            heVar.f290409t.mo48813x58998cd();
            heVar.f290404o.mo48813x58998cd();
        }
        zy2.ka kaVar = heVar.f290398f;
        if (kaVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g) kaVar).f187066g.mo48813x58998cd();
            zy2.ia.n0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "Discovery", null, 2, null);
        }
        nm.j.f419976g.a(new com.p314xaae8f345.mm.ui.ue(heVar, new java.lang.Runnable() { // from class: com.tencent.mm.ui.he$$b
            @Override // java.lang.Runnable
            public final void run() {
                ((oh3.i) ((p90.k) i95.n0.c(p90.k.class))).wi(1, com.p314xaae8f345.mm.ui.he.this.f290399g.mo78456x98878377());
            }
        }));
        ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).aj(false);
        ((nv.v1) ((mv.a0) i95.n0.c(mv.a0.class))).Ni(heVar.f290408s);
        if (!this.f278467n && (c9Var = (zy2.c9) i95.n0.c(zy2.c9.class)) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) c9Var).Bi(this.f278454a, 1);
        }
        this.f278467n = false;
    }

    public com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 g() {
        return (com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) this.f278468o.get(java.lang.Integer.valueOf(this.f278458e));
    }

    public com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 h(int i17) {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = null;
        if (i17 < 0) {
            return null;
        }
        java.util.HashMap hashMap = this.f278468o;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return (com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) hashMap.get(java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.MainTabUI", "create tab %d", java.lang.Integer.valueOf(i17));
        android.os.Bundle bundle = new android.os.Bundle();
        if (i17 == 0) {
            bundle.putInt(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d.class.getName(), 0);
            abstractViewOnAttachStateChangeListenerC21400xb429b010 = (com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.m7421x83a782ea(this.f278454a, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d.class.getName(), bundle);
            if (abstractViewOnAttachStateChangeListenerC21400xb429b010 instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) {
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) abstractViewOnAttachStateChangeListenerC21400xb429b010;
                com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f278454a;
                c22376x88ed722d.f288904n = activityC21401x6ce6f73f;
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = c22376x88ed722d.f288905o;
                if (viewOnTouchListenerC22366xcd5c2226 != null) {
                    viewOnTouchListenerC22366xcd5c2226.m80525x13de9191(activityC21401x6ce6f73f);
                }
                hh4.a aVar = this.f278461h;
                c22376x88ed722d.C = aVar;
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c22262 = c22376x88ed722d.f288905o;
                if (viewOnTouchListenerC22366xcd5c22262 != null) {
                    viewOnTouchListenerC22366xcd5c22262.m80524x989890c9(aVar);
                }
            }
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).k(true);
            cy1.a aVar2 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(abstractViewOnAttachStateChangeListenerC21400xb429b010, iy1.c.MainUI);
            aVar2.Rj(abstractViewOnAttachStateChangeListenerC21400xb429b010, iy1.a.Main);
            aVar2.Tj(abstractViewOnAttachStateChangeListenerC21400xb429b010, 4, 16, false);
        } else if (i17 == 1) {
            abstractViewOnAttachStateChangeListenerC21400xb429b010 = (com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.m7421x83a782ea(this.f278454a, com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598.class.getName(), bundle);
            cy1.a aVar3 = (cy1.a) ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(abstractViewOnAttachStateChangeListenerC21400xb429b010, iy1.c.MvvmAddressUIFragment)).ik(abstractViewOnAttachStateChangeListenerC21400xb429b010, 4, 33926);
            aVar3.Ai(abstractViewOnAttachStateChangeListenerC21400xb429b010, new ly1.a() { // from class: com.tencent.mm.ui.MainTabUI$$a
                @Override // ly1.a
                public final java.util.Map b(java.lang.String str) {
                    java.util.HashMap hashMap2 = com.p314xaae8f345.mm.ui.C21410x67d80e90.f278453p;
                    com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e90 = com.p314xaae8f345.mm.ui.C21410x67d80e90.this;
                    c21410x67d80e90.getClass();
                    java.util.HashMap hashMap3 = new java.util.HashMap();
                    if (android.text.TextUtils.equals("page_in", str)) {
                        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f2 = c21410x67d80e90.f278454a;
                        tf5.m mVar = activityC21401x6ce6f73f2 == null ? null : (tf5.m) pf5.z.f435481a.a(activityC21401x6ce6f73f2).e(tf5.m.class);
                        if (mVar != null) {
                            hashMap3.put("page_sessionid", java.lang.Long.valueOf(mVar.f500536d));
                        }
                    }
                    return hashMap3;
                }
            });
            aVar3.Rj(abstractViewOnAttachStateChangeListenerC21400xb429b010, iy1.a.Contacts);
        } else if (i17 == 2) {
            bundle.putInt(com.p314xaae8f345.mm.ui.C21357x5e7365bb.class.getName(), 2);
            abstractViewOnAttachStateChangeListenerC21400xb429b010 = (com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.m7421x83a782ea(this.f278454a, com.p314xaae8f345.mm.ui.C21357x5e7365bb.class.getName(), bundle);
            cy1.a aVar4 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(abstractViewOnAttachStateChangeListenerC21400xb429b010, iy1.c.FindMoreFriendsUI);
            aVar4.Rj(abstractViewOnAttachStateChangeListenerC21400xb429b010, iy1.a.Discover);
            aVar4.Tj(abstractViewOnAttachStateChangeListenerC21400xb429b010, 4, 16, false);
            aVar4.Vj(abstractViewOnAttachStateChangeListenerC21400xb429b010, 4, new com.p314xaae8f345.mm.ui.C21412x6fc73352());
        } else if (i17 == 3) {
            bundle.putInt(com.p314xaae8f345.mm.ui.C21417xe2e4fa74.class.getName(), 3);
            abstractViewOnAttachStateChangeListenerC21400xb429b010 = (com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.m7421x83a782ea(this.f278454a, com.p314xaae8f345.mm.ui.C21417xe2e4fa74.class.getName(), bundle);
            ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(abstractViewOnAttachStateChangeListenerC21400xb429b010, iy1.c.MoreTabUI)).Rj(abstractViewOnAttachStateChangeListenerC21400xb429b010, iy1.a.More);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.MainTabUI", "createFragment index:%d", java.lang.Integer.valueOf(i17));
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 != null) {
            abstractViewOnAttachStateChangeListenerC21400xb429b010.m78698x1cf75fac(this.f278454a);
        }
        hashMap.put(java.lang.Integer.valueOf(i17), abstractViewOnAttachStateChangeListenerC21400xb429b010);
        return abstractViewOnAttachStateChangeListenerC21400xb429b010;
    }

    public int i() {
        com.p314xaae8f345.mm.ui.he heVar = this.f278455b;
        com.p314xaae8f345.mm.ui.t1 t1Var = heVar.f290399g;
        if (t1Var == null || t1Var.mo78455x190d9235() <= 0) {
            return 0;
        }
        return heVar.f290399g.mo78455x190d9235();
    }

    public boolean j() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) this.f278468o.get(0);
        if (c22376x88ed722d == null || (viewOnTouchListenerC22366xcd5c2226 = c22376x88ed722d.f288905o) == null) {
            return false;
        }
        return viewOnTouchListenerC22366xcd5c2226.r();
    }

    public void k(int i17, int i18) {
        com.p314xaae8f345.mm.ui.fe feVar = this.f278460g;
        if (feVar != null) {
            com.p314xaae8f345.mm.ui.C21374x812c2fd3.AnonymousClass1 anonymousClass1 = (com.p314xaae8f345.mm.ui.C21374x812c2fd3.AnonymousClass1) feVar;
            if (i17 != 1) {
                anonymousClass1.getClass();
                return;
            }
            com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
            if (i18 == 0) {
                c21374x812c2fd3.v(c21374x812c2fd3.f278291q.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            } else if (c21374x812c2fd3.f278294t.f278458e == 0) {
                c21374x812c2fd3.v(c21374x812c2fd3.f278291q.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            }
        }
    }

    public void l(int i17) {
        com.p314xaae8f345.mm.ui.fe feVar = this.f278460g;
        if (feVar != null) {
            com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
            if (i17 == 0) {
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                int hashCode = c21374x812c2fd3.hashCode();
                iy1.c cVar = iy1.c.MainUI;
                ((cy1.a) rVar).uj("MainUI_LeftScreen", hashCode, 1006, 0);
                dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
                com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e90 = c21374x812c2fd3.f278294t;
                ((cy1.a) rVar2).bk(c21410x67d80e90.h(c21410x67d80e90.f278458e), true);
                c21374x812c2fd3.f278295u = true;
                c21374x812c2fd3.v(c21374x812c2fd3.f278291q.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            } else {
                dy1.r rVar3 = (dy1.r) i95.n0.c(dy1.r.class);
                com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e902 = c21374x812c2fd3.f278294t;
                ((cy1.a) rVar3).bk(c21410x67d80e902.h(c21410x67d80e902.f278458e), false);
                dy1.r rVar4 = (dy1.r) i95.n0.c(dy1.r.class);
                int hashCode2 = c21374x812c2fd3.hashCode();
                iy1.c cVar2 = iy1.c.MainUI;
                ((cy1.a) rVar4).vj("MainUI_LeftScreen", hashCode2, 1006, 0);
                c21374x812c2fd3.f278295u = false;
                if (c21374x812c2fd3.f278294t.f278458e == 3) {
                    c21374x812c2fd3.v(c21374x812c2fd3.f278291q.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
                } else {
                    c21374x812c2fd3.v(c21374x812c2fd3.f278291q.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
                }
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5718x259ce65d c5718x259ce65d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5718x259ce65d();
            c5718x259ce65d.f136040g.f88095a = i17;
            c5718x259ce65d.e();
        }
    }

    public final void m(boolean z17) {
        this.f39380x1c18ee31.m78873x6e5cce43(z17);
    }

    public void n() {
        com.p314xaae8f345.mm.ui.he heVar = this.f278455b;
        heVar.getClass();
        ((ku5.t0) ku5.t0.f394148d).r(new com.p314xaae8f345.mm.ui.ne(heVar), "setConversationTagUnread");
    }

    public void o(java.lang.String str) {
        if (str == null || str.equals("")) {
            return;
        }
        a(((java.lang.Integer) f278453p.get(str)).intValue());
    }
}
