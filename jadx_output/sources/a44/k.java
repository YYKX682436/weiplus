package a44;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: g, reason: collision with root package name */
    public static final a44.b f1285g = new a44.b(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f1286h = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewStub f1287a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f1288b;

    /* renamed from: c, reason: collision with root package name */
    public kotlinx.coroutines.y0 f1289c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView f1290d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f1291e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.r0 f1292f = new a44.j(kotlinx.coroutines.q0.f310567d);

    public k(android.view.ViewStub viewStub, android.view.View view) {
        this.f1287a = viewStub;
        this.f1288b = view;
    }

    public static final void a(a44.k kVar, android.view.View view, android.view.View view2, a44.a aVar, int i17, int i18) {
        java.lang.String str;
        java.lang.String str2;
        int i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$showComplianceManagementView", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        kVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showComplianceManagementView", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        if (view2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showComplianceManagementView", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            str = "access$showComplianceManagementView";
        } else {
            if (view == null) {
                str = "access$showComplianceManagementView";
                str2 = "showComplianceManagementView";
                i19 = 0;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/download/AdDownloadHelper", "showComplianceManagementView", "(Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/download/AdCheckDownloadAppInfo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(i19)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/download/AdDownloadHelper", "showComplianceManagementView", "(Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/download/AdCheckDownloadAppInfo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView complianceManagementView = kVar.f1290d;
            if (complianceManagementView != null) {
                complianceManagementView.setVisibility(i19);
            }
            com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView complianceManagementView2 = kVar.f1290d;
            if (complianceManagementView2 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
                if (!f1285g.c(aVar) || i17 <= 0) {
                    complianceManagementView2.setVisibility(8);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshUI, width is ");
                    sb6.append(i17);
                    sb6.append(", appVersion is ");
                    sb6.append(aVar != null ? aVar.e() : null);
                    sb6.append(", developer is ");
                    sb6.append(aVar != null ? aVar.h() : null);
                    sb6.append(", recordNumber is ");
                    sb6.append(aVar != null ? aVar.m() : null);
                    com.tencent.mars.xlog.Log.e(complianceManagementView2.f162636d, sb6.toString());
                } else {
                    complianceManagementView2.c(aVar);
                    android.view.View view3 = complianceManagementView2.contentView;
                    android.view.ViewGroup.LayoutParams layoutParams = view3 != null ? view3.getLayoutParams() : null;
                    if (layoutParams != null) {
                        layoutParams.height = -2;
                    }
                    android.view.View view4 = complianceManagementView2.contentView;
                    if (view4 != null) {
                        view4.setLayoutParams(layoutParams);
                    }
                    complianceManagementView2.setPadding(i18, i19, i18, i19);
                    complianceManagementView2.requestLayout();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
            }
            if (view != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetBackGround", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView complianceManagementView3 = kVar.f1290d;
                if (complianceManagementView3 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetBackGround", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
                    android.view.View view5 = complianceManagementView3.contentView;
                    if (view5 != null) {
                        view5.setBackground(null);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetBackGround", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetBackGround", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
    }

    public static final boolean b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canMatchDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        a44.b bVar = f1285g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canMatchDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canMatchDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        } else {
            if (bVar.c(i64.i.f289183d.i().a(str))) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canMatchDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canMatchDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                return z17;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canMatchDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        }
        z17 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canMatchDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        return z17;
    }

    public static final int e(int i17, com.tencent.mm.plugin.sns.ui.PhotosContent photosContent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPhotoTimelineItemMaterialWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPhotoTimelineItemMaterialWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        if (photosContent == null || photosContent.getLayoutParams() == null) {
            com.tencent.mars.xlog.Log.e("AdDownloadHelper", "getMaterialWidth, but photosContent or layoutParams is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhotoTimelineItemMaterialWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        } else if (i17 == 2) {
            r5 = photosContent.e(0).width;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhotoTimelineItemMaterialWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        } else if (i17 == 3 || i17 == 4 || i17 == 5) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImagesWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            int i18 = com.tencent.mm.plugin.sns.ui.tm.f170529d[i17];
            android.widget.FrameLayout.LayoutParams e17 = photosContent.e(1);
            if (e17 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImagesWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            } else {
                int i19 = e17.width;
                int i27 = e17.leftMargin - i19;
                int i28 = 0;
                for (int i29 = 0; i29 < i18; i29++) {
                    if (photosContent.g(i29).getVisibility() == 0) {
                        i28++;
                    }
                }
                if (i28 == 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImagesWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
                } else if (i28 == 1) {
                    r5 = photosContent.e(0).width;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImagesWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
                } else if (i28 == 2 || i28 == 4) {
                    r5 = (i19 * 2) + i27;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImagesWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
                } else {
                    r5 = (i28 == 3 || i28 >= 5) ? (i19 * 3) + (i27 * 2) : 0;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImagesWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhotoTimelineItemMaterialWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhotoTimelineItemMaterialWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhotoTimelineItemMaterialWidth", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        return r5;
    }

    public static final boolean f(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdDownloadType", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        boolean e17 = f1285g.e(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdDownloadType", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        return e17;
    }

    public final com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getComplianceManagementView", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView complianceManagementView = this.f1290d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplianceManagementView", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        return complianceManagementView;
    }

    public final android.view.View d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageKeeperLayout", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageKeeperLayout", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        return this.f1288b;
    }

    public final void g(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        h(context, snsInfo, i17, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
    }

    public final void h(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        i(context, snsInfo, null, null, i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
    }

    public final void i(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.view.View view, android.view.View view2, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        java.lang.String T = ca4.z0.T(snsInfo);
        kotlin.jvm.internal.o.f(T, "getSnsStringId(...)");
        android.view.View view3 = this.f1288b;
        if (view3 != null && view3 != null) {
            view3.setTag(com.tencent.mm.R.id.nug, T);
        }
        if (!f1285g.e(snsInfo)) {
            j();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            return;
        }
        if (!ca4.m0.V(this.f1291e, snsInfo)) {
            f1286h.remove(T);
            com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView complianceManagementView = this.f1290d;
            if (complianceManagementView != null && complianceManagementView != null) {
                complianceManagementView.setVisibility(8);
            }
        }
        this.f1291e = snsInfo;
        ((ku5.t0) ku5.t0.f312615d).a(new a44.i(snsInfo, context, this, T, view, i17, view2, i18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
    }

    public final void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComplianceViewUI", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView complianceManagementView = this.f1290d;
        if (complianceManagementView != null) {
            complianceManagementView.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComplianceViewUI", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
    }
}
