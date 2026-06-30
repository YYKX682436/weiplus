package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes9.dex */
public class x implements com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.g {

    /* renamed from: a, reason: collision with root package name */
    public int f227458a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f227459b = 0;

    /* renamed from: c, reason: collision with root package name */
    public float f227460c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c f227461d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c) {
        this.f227461d = c16344xea85a40c;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e
    public void a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c, int i17) {
        int i18;
        in5.s0 s0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16348x20daaab9 c16348x20daaab9;
        android.widget.TextView textView;
        android.widget.LinearLayout linearLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16348x20daaab9 c16348x20daaab92;
        android.view.View view;
        int i19;
        int abs = java.lang.Math.abs(i17);
        int m19973xa8f0dc02 = c2678xa407981c.m19973xa8f0dc02();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c = this.f227461d;
        int i27 = (m19973xa8f0dc02 - c16344xea85a40c.f227329z1) - abs;
        int m19973xa8f0dc022 = c2678xa407981c.m19973xa8f0dc02();
        int i28 = c16344xea85a40c.f227329z1;
        float f17 = i27 / ((m19973xa8f0dc022 - i28) * 1.0f);
        float f18 = 1.0f - f17;
        boolean z17 = c16344xea85a40c.L1;
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        if (!z17) {
            float f19 = 1.0f - f18;
            c16344xea85a40c.f227328z.setAlpha(f19);
            if (abs <= c16344xea85a40c.f227315p1 || c16344xea85a40c.f227323x0 || c16344xea85a40c.K1 == 2) {
                c16344xea85a40c.f227317s.setAlpha(0.0f);
                c16344xea85a40c.f227318t.setAlpha(0.0f);
            } else {
                int m19973xa8f0dc023 = c2678xa407981c.m19973xa8f0dc02() - i28;
                int i29 = c16344xea85a40c.f227315p1;
                float f27 = (abs - i29) / ((m19973xa8f0dc023 - i29) * 1.0f);
                c16344xea85a40c.f227317s.setAlpha(f27);
                c16344xea85a40c.f227318t.setAlpha(f27);
            }
            c16344xea85a40c.N.setAlpha(f19);
        }
        if (c16344xea85a40c.f227323x0 && i27 >= 0 && i27 != (i19 = this.f227459b)) {
            java.lang.Math.max(0, i19);
            c16344xea85a40c.f227321w.setTranslationY((-i17) / 2.0f);
            c16344xea85a40c.f227321w.getTranslationY();
        }
        if (c16344xea85a40c.f227325y != null) {
            int i37 = c16344xea85a40c.K1;
            if (i37 == 2) {
                if (c2678xa407981c.m19973xa8f0dc02() - abs == 0 && this.f227458a != abs) {
                    c16344xea85a40c.f227325y.setAlpha(0.0f);
                    if (c16344xea85a40c.i()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = c16344xea85a40c.U;
                        android.view.View view2 = activityC16371xf216ae6d.mToplinkArea;
                        if (view2 != null && activityC16371xf216ae6d.f227773z2 != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(valueOf);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            c16344xea85a40c.U.f227773z2.setVisibility(8);
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = c16344xea85a40c.V;
                        if (activityC16363x8a0a619d != null && (view = activityC16363x8a0a619d.f227644y2) != null && activityC16363x8a0a619d.f227647z2 != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                            arrayList2.add(valueOf);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            c16344xea85a40c.V.f227647z2.setVisibility(8);
                        }
                    }
                } else if (this.f227460c != f18) {
                    c16344xea85a40c.f227325y.setAlpha(f18);
                    if (c16344xea85a40c.i()) {
                        android.widget.LinearLayout linearLayout2 = c16344xea85a40c.U.X;
                        if (linearLayout2 != null) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                            arrayList3.add(java.lang.Float.valueOf(f18));
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(linearLayout2, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            linearLayout2.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                            yj0.a.f(linearLayout2, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        }
                        android.view.View view3 = c16344xea85a40c.U.mToplinkArea;
                        if (view3 != null) {
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                            arrayList4.add(java.lang.Float.valueOf(f18));
                            java.util.Collections.reverse(arrayList4);
                            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view3.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        }
                        android.widget.LinearLayout linearLayout3 = c16344xea85a40c.U.f227744p0;
                        if (linearLayout3 != null) {
                            linearLayout3.setAlpha(1.0f - f18);
                            if (f18 == 0.0f && (c16348x20daaab92 = c16344xea85a40c.f227321w) != null && c16348x20daaab92.h1(c16344xea85a40c.A1)) {
                                android.widget.LinearLayout linearLayout4 = c16344xea85a40c.U.f227744p0;
                                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) linearLayout4.getLayoutParams();
                                marginLayoutParams.rightMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 40);
                                linearLayout4.setLayoutParams(marginLayoutParams);
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d2 = c16344xea85a40c.U;
                        if (activityC16371xf216ae6d2 != null && (linearLayout = activityC16371xf216ae6d2.f227731l1) != null) {
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                            arrayList5.add(java.lang.Float.valueOf(f18));
                            java.util.Collections.reverse(arrayList5);
                            yj0.a.d(linearLayout, arrayList5.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            linearLayout.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
                            yj0.a.f(linearLayout, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d3 = c16344xea85a40c.U;
                        if (activityC16371xf216ae6d3 != null && (textView = activityC16371xf216ae6d3.f227773z2) != null) {
                            if (f18 == 0.0f) {
                                textView.setVisibility(8);
                            } else {
                                textView.setVisibility(0);
                            }
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d2 = c16344xea85a40c.V;
                        if (activityC16363x8a0a619d2 != null) {
                            android.widget.LinearLayout linearLayout5 = activityC16363x8a0a619d2.X;
                            if (linearLayout5 != null) {
                                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                                arrayList6.add(java.lang.Float.valueOf(f18));
                                java.util.Collections.reverse(arrayList6);
                                yj0.a.d(linearLayout5, arrayList6.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                linearLayout5.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
                                yj0.a.f(linearLayout5, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            }
                            android.view.View view4 = c16344xea85a40c.V.f227644y2;
                            if (view4 != null) {
                                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                                arrayList7.add(java.lang.Float.valueOf(f18));
                                java.util.Collections.reverse(arrayList7);
                                yj0.a.d(view4, arrayList7.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                view4.setAlpha(((java.lang.Float) arrayList7.get(0)).floatValue());
                                yj0.a.f(view4, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            }
                            android.widget.LinearLayout linearLayout6 = c16344xea85a40c.V.f227620p0;
                            if (linearLayout6 != null) {
                                linearLayout6.setAlpha(1.0f - f18);
                                if (f18 == 0.0f && (c16348x20daaab9 = c16344xea85a40c.f227321w) != null && c16348x20daaab9.h1(c16344xea85a40c.A1)) {
                                    android.widget.LinearLayout linearLayout7 = c16344xea85a40c.V.f227620p0;
                                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) linearLayout7.getLayoutParams();
                                    marginLayoutParams2.rightMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 40);
                                    linearLayout7.setLayoutParams(marginLayoutParams2);
                                }
                            }
                            android.widget.LinearLayout linearLayout8 = c16344xea85a40c.V.f227607l1;
                            if (linearLayout8 != null) {
                                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
                                arrayList8.add(java.lang.Float.valueOf(f18));
                                java.util.Collections.reverse(arrayList8);
                                yj0.a.d(linearLayout8, arrayList8.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                linearLayout8.setAlpha(((java.lang.Float) arrayList8.get(0)).floatValue());
                                yj0.a.f(linearLayout8, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            }
                            android.widget.TextView textView2 = c16344xea85a40c.V.f227647z2;
                            if (textView2 != null) {
                                if (f18 == 0.0f) {
                                    textView2.setVisibility(8);
                                } else {
                                    textView2.setVisibility(0);
                                }
                            }
                        }
                    }
                }
                this.f227460c = f18;
            } else if (i37 == 1) {
                int m19973xa8f0dc024 = c2678xa407981c.m19973xa8f0dc02() - abs;
                if (m19973xa8f0dc024 <= i28) {
                    c16344xea85a40c.f227325y.setAlpha(m19973xa8f0dc024 / (i28 * 1.0f));
                } else {
                    c16344xea85a40c.f227325y.setAlpha(1.0f);
                }
            }
        }
        if (c2678xa407981c.m19973xa8f0dc02() - abs == 0 && this.f227458a != abs) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeAppBarLayout", "story view collapse");
            c16344xea85a40c.P.setClickable(false);
            if (c16344xea85a40c.O1 || c16344xea85a40c.N1) {
                c16344xea85a40c.N1 = false;
                c16344xea85a40c.O1 = false;
                c16344xea85a40c.D1.f227338g = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16348x20daaab9 c16348x20daaab93 = c16344xea85a40c.f227321w;
                c16348x20daaab93.needLoopPlay = false;
                c16348x20daaab93.f227349o2.mo50303x856b99f0(1);
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237 c16346x4deb5237 = c16348x20daaab93.storyVideoManager;
                if (c16346x4deb5237 != null) {
                    c16346x4deb5237.f227342n = null;
                }
                c16344xea85a40c.j(true);
                if (c16344xea85a40c.i()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.j7) c16344xea85a40c.U.m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.j7.class)).O6(false);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d3 = c16344xea85a40c.V;
                    if (activityC16363x8a0a619d3 != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.o3) activityC16363x8a0a619d3.m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.o3.class)).O6(false);
                    }
                }
                if (c16344xea85a40c.K1 == 2) {
                    if (c16344xea85a40c.i()) {
                        c16344xea85a40c.U.o7(true);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d4 = c16344xea85a40c.V;
                        if (activityC16363x8a0a619d4 != null) {
                            activityC16363x8a0a619d4.j7(true);
                        }
                    }
                    c16344xea85a40c.D1.d(c16344xea85a40c.A1);
                }
                c16344xea85a40c.m();
                if (c16344xea85a40c.V1) {
                    c16344xea85a40c.V1 = false;
                    int i38 = c16344xea85a40c.K1;
                    if (i38 == 1 || i38 == 2) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.g1.a(2);
                    }
                    gb3.n.a(10);
                } else {
                    int i39 = c16344xea85a40c.K1;
                    if (i39 == 1 || i39 == 2) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.g1.a(1);
                    }
                    gb3.n.a(9);
                }
            }
        } else if (abs == 0 && this.f227458a != abs) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeAppBarLayout", "story view expand");
            c16344xea85a40c.P.setClickable(true);
            if (!c16344xea85a40c.N1) {
                c16344xea85a40c.N1 = true;
                c16344xea85a40c.O1 = false;
                c16344xea85a40c.D1.f227338g = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16348x20daaab9 c16348x20daaab94 = c16344xea85a40c.f227321w;
                c16348x20daaab94.needLoopPlay = false;
                c16348x20daaab94.f227349o2.mo50303x856b99f0(1);
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237 c16346x4deb52372 = c16348x20daaab94.storyVideoManager;
                if (c16346x4deb52372 != null) {
                    c16346x4deb52372.f227342n = null;
                }
                if (c16344xea85a40c.i()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.j7) c16344xea85a40c.U.m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.j7.class)).O6(true);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d5 = c16344xea85a40c.V;
                    if (activityC16363x8a0a619d5 != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.o3) activityC16363x8a0a619d5.m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.o3.class)).O6(true);
                    }
                }
                if (c16344xea85a40c.f227321w.h1(c16344xea85a40c.A1) && (s0Var = (in5.s0) c16344xea85a40c.f227321w.p0(c16344xea85a40c.A1)) != null) {
                    c16344xea85a40c.p(s0Var, c16344xea85a40c.A1, false);
                }
                gb3.n.f351567d = true;
                if (c16344xea85a40c.U1) {
                    c16344xea85a40c.U1 = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.g1.f227403k = 1;
                    i18 = 2;
                } else {
                    gb3.n.a(4);
                    gb3.m.a(7, c16344xea85a40c.G1);
                    i18 = 2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.g1.f227403k = 2;
                }
                int i47 = c16344xea85a40c.K1;
                if (i47 == i18 || i47 == 1) {
                    java.lang.String str = gb3.m.f351553a;
                    java.lang.String str2 = c16344xea85a40c.F1;
                    int i48 = c16344xea85a40c.W1;
                    int i49 = c16344xea85a40c.X1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.g1.f227401i = str;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.g1.f227393a = str2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.g1.f227398f = i48;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.g1.f227399g = i49;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.g1.f227400h = java.util.UUID.randomUUID().toString();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.g1.f227402j = android.os.SystemClock.elapsedRealtime() / 1000;
                    if (c16344xea85a40c.K1 == 2) {
                        if (c16344xea85a40c.i()) {
                            c16344xea85a40c.U.o7(false);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d6 = c16344xea85a40c.V;
                            if (activityC16363x8a0a619d6 != null) {
                                activityC16363x8a0a619d6.j7(false);
                            }
                        }
                        c16344xea85a40c.D1.d(c16344xea85a40c.A1);
                        gb3.m.a(5, c16344xea85a40c.G1);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.f1.a(2);
                    }
                }
                c16344xea85a40c.f227325y.setOnClickListener(null);
                c16344xea85a40c.f227325y.setClickable(false);
                c16344xea85a40c.f227317s.setOnClickListener(null);
                c16344xea85a40c.f227317s.setClickable(false);
                c16344xea85a40c.f227318t.setOnClickListener(null);
                c16344xea85a40c.f227318t.setClickable(false);
                r45.nm5 nm5Var = c16344xea85a40c.E1;
                if (nm5Var != null && nm5Var.f463037m == 4 && !c16344xea85a40c.Y1) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("red_cover_id", c16344xea85a40c.E1.f463041q);
                        jSONObject.put("finderusername", c16344xea85a40c.E1.f463039o);
                        jSONObject.put("red_cover_type", 1);
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnvelopeAppBarLayout", "jump finder error, ", th6);
                    }
                    ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).bj("red_cover_link_unfold", 0, jSONObject, null);
                    c16344xea85a40c.Y1 = true;
                }
                r45.nm5 nm5Var2 = c16344xea85a40c.E1;
                if (nm5Var2 != null) {
                    if (nm5Var2.f463037m == 1) {
                        gb3.m.a(95, c16344xea85a40c.G1);
                    }
                    if (c16344xea85a40c.E1.f463037m == 2) {
                        gb3.m.a(87, c16344xea85a40c.G1);
                    }
                    if (c16344xea85a40c.E1.f463037m == 3) {
                        gb3.m.a(89, c16344xea85a40c.G1);
                    }
                    if (c16344xea85a40c.E1.f463037m == 4) {
                        gb3.m.a(83, c16344xea85a40c.G1);
                    }
                    if (c16344xea85a40c.E1.f463037m == 5) {
                        gb3.m.a(93, c16344xea85a40c.G1);
                    }
                    if (c16344xea85a40c.E1.f463037m == 6) {
                        gb3.m.a(91, c16344xea85a40c.G1);
                    }
                    if (c16344xea85a40c.E1.f463037m == 7) {
                        gb3.m.a(97, c16344xea85a40c.G1);
                    }
                }
                if (c16344xea85a40c.Z1) {
                    if (c16344xea85a40c.f227308a2) {
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_STORY_PREVIEW_GUIDE_TIME_INT_SYNC, 3);
                    } else {
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_STORY_GUIDE_TIME_INT_SYNC, 3);
                    }
                }
            }
        } else if (c2678xa407981c.m19973xa8f0dc02() - abs == i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 300) && this.f227458a != abs) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c.e(c16344xea85a40c);
        }
        if (c16344xea85a40c.K != null) {
            if (f17 > 1.0f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeAppBarLayout", "mOffsetChangedListener warning！need reset currentPer：%s", java.lang.Float.valueOf(f17));
                f17 = 0.0f;
            }
            android.view.View view5 = c16344xea85a40c.K;
            float f28 = (float) (f17 * 0.7d);
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
            arrayList9.add(java.lang.Float.valueOf(f28));
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view5, arrayList9.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((java.lang.Float) arrayList9.get(0)).floatValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        this.f227458a = abs;
        this.f227459b = i27;
    }
}
