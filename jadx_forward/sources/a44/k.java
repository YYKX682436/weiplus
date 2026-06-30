package a44;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: g, reason: collision with root package name */
    public static final a44.b f82818g = new a44.b(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f82819h = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewStub f82820a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f82821b;

    /* renamed from: c, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f82822c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3 f82823d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f82824e;

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.r0 f82825f = new a44.j(p3325xe03a0797.p3326xc267989b.q0.f392100d);

    public k(android.view.ViewStub viewStub, android.view.View view) {
        this.f82820a = viewStub;
        this.f82821b = view;
    }

    public static final void a(a44.k kVar, android.view.View view, android.view.View view2, a44.a aVar, int i17, int i18) {
        java.lang.String str;
        java.lang.String str2;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$showComplianceManagementView", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        kVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showComplianceManagementView", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        if (view2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showComplianceManagementView", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            str = "access$showComplianceManagementView";
        } else {
            if (view == null) {
                str = "access$showComplianceManagementView";
                str2 = "showComplianceManagementView";
                i19 = 0;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                str = "access$showComplianceManagementView";
                str2 = "showComplianceManagementView";
                i19 = 0;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/download/AdDownloadHelper", "showComplianceManagementView", "(Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/download/AdCheckDownloadAppInfo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/download/AdDownloadHelper", "showComplianceManagementView", "(Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/download/AdCheckDownloadAppInfo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/download/AdDownloadHelper", "showComplianceManagementView", "(Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/download/AdCheckDownloadAppInfo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(i19)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/download/AdDownloadHelper", "showComplianceManagementView", "(Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/download/AdCheckDownloadAppInfo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3 c17705x7d0622a3 = kVar.f82823d;
            if (c17705x7d0622a3 != null) {
                c17705x7d0622a3.setVisibility(i19);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3 c17705x7d0622a32 = kVar.f82823d;
            if (c17705x7d0622a32 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshUI", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
                if (!f82818g.c(aVar) || i17 <= 0) {
                    c17705x7d0622a32.setVisibility(8);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshUI, width is ");
                    sb6.append(i17);
                    sb6.append(", appVersion is ");
                    sb6.append(aVar != null ? aVar.e() : null);
                    sb6.append(", developer is ");
                    sb6.append(aVar != null ? aVar.h() : null);
                    sb6.append(", recordNumber is ");
                    sb6.append(aVar != null ? aVar.m() : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c17705x7d0622a32.f244169d, sb6.toString());
                } else {
                    c17705x7d0622a32.c(aVar);
                    android.view.View view3 = c17705x7d0622a32.contentView;
                    android.view.ViewGroup.LayoutParams layoutParams = view3 != null ? view3.getLayoutParams() : null;
                    if (layoutParams != null) {
                        layoutParams.height = -2;
                    }
                    android.view.View view4 = c17705x7d0622a32.contentView;
                    if (view4 != null) {
                        view4.setLayoutParams(layoutParams);
                    }
                    c17705x7d0622a32.setPadding(i18, i19, i18, i19);
                    c17705x7d0622a32.requestLayout();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshUI", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
            }
            if (view != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetBackGround", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3 c17705x7d0622a33 = kVar.f82823d;
                if (c17705x7d0622a33 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetBackGround", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
                    android.view.View view5 = c17705x7d0622a33.contentView;
                    if (view5 != null) {
                        view5.setBackground(null);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetBackGround", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetBackGround", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
    }

    public static final boolean b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canMatchDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        a44.b bVar = f82818g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canMatchDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canMatchDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        } else {
            if (bVar.c(i64.i.f370716d.i().a(str))) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canMatchDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canMatchDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                return z17;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canMatchDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        }
        z17 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canMatchDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        return z17;
    }

    public static final int e(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17989x79511098 c17989x79511098) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPhotoTimelineItemMaterialWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPhotoTimelineItemMaterialWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        if (c17989x79511098 == null || c17989x79511098.getLayoutParams() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDownloadHelper", "getMaterialWidth, but photosContent or layoutParams is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPhotoTimelineItemMaterialWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        } else if (i17 == 2) {
            r5 = c17989x79511098.e(0).width;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPhotoTimelineItemMaterialWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        } else if (i17 == 3 || i17 == 4 || i17 == 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImagesWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.tm.f252062d[i17];
            android.widget.FrameLayout.LayoutParams e17 = c17989x79511098.e(1);
            if (e17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImagesWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            } else {
                int i19 = e17.width;
                int i27 = e17.leftMargin - i19;
                int i28 = 0;
                for (int i29 = 0; i29 < i18; i29++) {
                    if (c17989x79511098.g(i29).getVisibility() == 0) {
                        i28++;
                    }
                }
                if (i28 == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImagesWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
                } else if (i28 == 1) {
                    r5 = c17989x79511098.e(0).width;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImagesWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
                } else if (i28 == 2 || i28 == 4) {
                    r5 = (i19 * 2) + i27;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImagesWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
                } else {
                    r5 = (i28 == 3 || i28 >= 5) ? (i19 * 3) + (i27 * 2) : 0;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImagesWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPhotoTimelineItemMaterialWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPhotoTimelineItemMaterialWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPhotoTimelineItemMaterialWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        return r5;
    }

    public static final boolean f(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdDownloadType", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        boolean e17 = f82818g.e(c17933xe8d1b226);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdDownloadType", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        return e17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3 c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getComplianceManagementView", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3 c17705x7d0622a3 = this.f82823d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplianceManagementView", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        return c17705x7d0622a3;
    }

    public final android.view.View d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImageKeeperLayout", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageKeeperLayout", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        return this.f82821b;
    }

    public final void g(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshUI", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        h(context, c17933xe8d1b226, i17, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshUI", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
    }

    public final void h(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshUI", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        i(context, c17933xe8d1b226, null, null, i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshUI", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
    }

    public final void i(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, android.view.View view, android.view.View view2, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshUI", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        java.lang.String T = ca4.z0.T(c17933xe8d1b226);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T, "getSnsStringId(...)");
        android.view.View view3 = this.f82821b;
        if (view3 != null && view3 != null) {
            view3.setTag(com.p314xaae8f345.mm.R.id.nug, T);
        }
        if (!f82818g.e(c17933xe8d1b226)) {
            j();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshUI", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            return;
        }
        if (!ca4.m0.V(this.f82824e, c17933xe8d1b226)) {
            f82819h.remove(T);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3 c17705x7d0622a3 = this.f82823d;
            if (c17705x7d0622a3 != null && c17705x7d0622a3 != null) {
                c17705x7d0622a3.setVisibility(8);
            }
        }
        this.f82824e = c17933xe8d1b226;
        ((ku5.t0) ku5.t0.f394148d).a(new a44.i(c17933xe8d1b226, context, this, T, view, i17, view2, i18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshUI", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
    }

    public final void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComplianceViewUI", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3 c17705x7d0622a3 = this.f82823d;
        if (c17705x7d0622a3 != null) {
            c17705x7d0622a3.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComplianceViewUI", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
    }
}
