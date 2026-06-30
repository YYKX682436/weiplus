package n34;

/* loaded from: classes4.dex */
public final class v3 {

    /* renamed from: l, reason: collision with root package name */
    public static final n34.n3 f416281l = new n34.n3(null);

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 f416282a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f416283b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f416284c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f416285d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f416286e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d f416287f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f416288g;

    /* renamed from: h, reason: collision with root package name */
    public r45.jj4 f416289h;

    /* renamed from: i, reason: collision with root package name */
    public int f416290i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f416291j = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    public final n34.o3 f416292k = new n34.o3(this);

    public static final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 a(n34.v3 v3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSeekBarView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46 = v3Var.f416282a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSeekBarView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        return c19718xcf23ab46;
    }

    public final void b(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfigurationChanged", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        if (configuration != null && configuration.orientation == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("layoutLandScape", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d = this.f416287f;
            android.view.View m70637xe8faff3c = c17983xb14a9c8d != null ? c17983xb14a9c8d.m70637xe8faff3c() : null;
            if (m70637xe8faff3c == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutLandScape", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            } else {
                com.p314xaae8f345.mm.ui.kk.d(m70637xe8faff3c, 0);
                com.p314xaae8f345.mm.ui.kk.f(m70637xe8faff3c, 0);
                m70637xe8faff3c.requestLayout();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46 = this.f416282a;
                if (c19718xcf23ab46 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutLandScape", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                } else {
                    int h17 = i65.a.h(this.f416286e, com.p314xaae8f345.mm.R.C30860x5b28f31.ajf);
                    c19718xcf23ab46.setPadding(h17, c19718xcf23ab46.getPaddingTop(), h17, i65.a.h(this.f416286e, com.p314xaae8f345.mm.R.C30860x5b28f31.ajw));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutLandScape", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                }
            }
        } else {
            if (configuration != null && configuration.orientation == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                r45.jj4 jj4Var = this.f416289h;
                if (jj4Var == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                } else {
                    r45.lj4 lj4Var = jj4Var.f459398p;
                    if (lj4Var == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                    } else if (lj4Var.f461053d <= 0.0f || lj4Var.f461054e <= 0.0f) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                    } else {
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab462 = this.f416282a;
                        if (c19718xcf23ab462 == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                        } else {
                            android.app.Activity activity = this.f416286e;
                            android.view.WindowManager windowManager = (android.view.WindowManager) (activity != null ? activity.getSystemService("window") : null);
                            if (windowManager == null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                            } else {
                                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                                int i17 = displayMetrics.widthPixels;
                                int i18 = displayMetrics.heightPixels;
                                if (i18 <= 0) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                } else {
                                    int i19 = this.f416290i;
                                    int h18 = i65.a.h(this.f416286e, com.p314xaae8f345.mm.R.C30860x5b28f31.aii);
                                    c19718xcf23ab462.setPadding(h18, c19718xcf23ab462.getPaddingTop(), h18, c19718xcf23ab462.getPaddingBottom());
                                    android.widget.ImageView imageView = this.f416283b;
                                    if (imageView != null) {
                                        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                                        layoutParams.height = i65.a.b(this.f416286e, 170) + i19;
                                        imageView.setLayoutParams(layoutParams);
                                    }
                                    int p17 = com.p314xaae8f345.mm.ui.bk.p(this.f416286e);
                                    r45.lj4 lj4Var2 = jj4Var.f459398p;
                                    float f17 = lj4Var2.f461053d;
                                    float f18 = lj4Var2.f461054e;
                                    int i27 = f17 / f18 > ((float) (i17 / i18)) ? (int) ((f18 * i17) / f17) : i18;
                                    int i28 = i18 - i27;
                                    int i29 = i28 / 2;
                                    n34.n3 n3Var = f416281l;
                                    int a17 = n3Var.a(this.f416286e, this.f416285d, true);
                                    int i37 = a17 + i19;
                                    if (i29 > i37) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                    } else if (((i28 - a17) - p17) - i19 >= 0) {
                                        int i38 = i37 - i29;
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d2 = this.f416287f;
                                        android.view.View m70637xe8faff3c2 = c17983xb14a9c8d2 != null ? c17983xb14a9c8d2.m70637xe8faff3c() : null;
                                        if (m70637xe8faff3c2 == null) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                        } else {
                                            c(m70637xe8faff3c2, i38);
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                        }
                                    } else {
                                        int a18 = n3Var.a(this.f416286e, false, false);
                                        if (!this.f416285d || ((i28 - i19) - p17) - a18 < 0) {
                                            int h19 = i65.a.h(this.f416286e, com.p314xaae8f345.mm.R.C30860x5b28f31.ajw);
                                            int i39 = (i18 - p17) - i27;
                                            if ((i39 - h19) - i19 > 0) {
                                                int i47 = (i19 + h19) - i29;
                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d3 = this.f416287f;
                                                android.view.View m70637xe8faff3c3 = c17983xb14a9c8d3 != null ? c17983xb14a9c8d3.m70637xe8faff3c() : null;
                                                if (m70637xe8faff3c3 == null) {
                                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                                } else {
                                                    c(m70637xe8faff3c3, i47);
                                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                                }
                                            } else if (i39 > 0) {
                                                int i48 = i39 - i29;
                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d4 = this.f416287f;
                                                android.view.View m70637xe8faff3c4 = c17983xb14a9c8d4 != null ? c17983xb14a9c8d4.m70637xe8faff3c() : null;
                                                if (m70637xe8faff3c4 == null) {
                                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                                } else {
                                                    c(m70637xe8faff3c4, i48);
                                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                                }
                                            } else {
                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d5 = this.f416287f;
                                                android.view.View m70640x4ee17f0a = c17983xb14a9c8d5 != null ? c17983xb14a9c8d5.m70640x4ee17f0a() : null;
                                                if (m70640x4ee17f0a == null) {
                                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                                } else {
                                                    android.view.ViewGroup.LayoutParams layoutParams2 = m70640x4ee17f0a.getLayoutParams();
                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                                    android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) layoutParams2;
                                                    layoutParams3.addRule(12);
                                                    m70640x4ee17f0a.setLayoutParams(layoutParams3);
                                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                                }
                                            }
                                        } else {
                                            int i49 = (a18 + i19) - i29;
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d6 = this.f416287f;
                                            android.view.View m70637xe8faff3c5 = c17983xb14a9c8d6 != null ? c17983xb14a9c8d6.m70637xe8faff3c() : null;
                                            if (m70637xe8faff3c5 == null) {
                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                            } else {
                                                c(m70637xe8faff3c5, i49);
                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
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
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
    }

    public final void c(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setViewMargin", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        if (i17 > 0) {
            com.p314xaae8f345.mm.ui.kk.d(view, i17 * 2);
            view.requestLayout();
        } else {
            com.p314xaae8f345.mm.ui.kk.f(view, (-i17) * 2);
            view.requestLayout();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setViewMargin", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
    }
}
