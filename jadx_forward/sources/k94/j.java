package k94;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f387494a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f387495b;

    /* renamed from: c, reason: collision with root package name */
    public long f387496c;

    public j(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f387494a = new java.util.HashMap();
        this.f387495b = new java.util.ArrayList();
    }

    public static /* synthetic */ void f(k94.j jVar, k94.h hVar, k94.i iVar, double d17, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyListeners$default", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        if ((i17 & 4) != 0) {
            d17 = 0.0d;
        }
        jVar.e(hVar, iVar, d17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyListeners$default", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
    }

    public final void a(k94.g listener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addListener", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.List list = this.f387495b;
        if (!((java.util.ArrayList) list).contains(listener)) {
            ((java.util.ArrayList) list).add(listener);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldAdViewVisibilityManager", "add viewVisibilityListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addListener", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
    }

    public final double b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calculateExposureRatio", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        if (view.getVisibility() != 0 || view.getMeasuredHeight() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateExposureRatio", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
            return 0.0d;
        }
        view.getGlobalVisibleRect(new android.graphics.Rect());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldAdViewVisibilityManager", java.lang.String.valueOf(r2.height() / view.getMeasuredHeight()));
        double height = r2.height() / view.getMeasuredHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateExposureRatio", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        return height;
    }

    public final void c(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkAllViewsVisibility", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        if (z17) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f387496c < 50) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAllViewsVisibility", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
                return;
            }
            this.f387496c = currentTimeMillis;
        }
        java.util.Collection<k94.h> values = this.f387494a.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (k94.h hVar : values) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar);
            d(hVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAllViewsVisibility", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
    }

    public final void d(k94.h hVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSingleViewVisibility", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        hVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
        android.view.View view = hVar.f387482b;
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSingleViewVisibility", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMaterialContainer", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMaterialContainer", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
        android.view.ViewGroup viewGroup = hVar.f387483c;
        if (viewGroup == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSingleViewVisibility", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
            return;
        }
        if (view.getParent() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isVisible", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            boolean z17 = hVar.f387487g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVisible", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVisible", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            hVar.f387487g = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVisible", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            if (z17) {
                f(this, hVar, k94.i.f387489e, 0.0d, 4, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSingleViewVisibility", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
            return;
        }
        double b17 = b(view);
        double b18 = b(viewGroup);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isVisible", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
        boolean z18 = hVar.f387487g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVisible", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
        boolean z19 = b17 > 0.0d;
        if (z19 != z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVisible", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            hVar.f387487g = z19;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVisible", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            e(hVar, z19 ? k94.i.f387488d : k94.i.f387489e, b17);
        } else if (z19) {
            e(hVar, k94.i.f387490f, b17);
        }
        if (b18 > 0.0d) {
            e(hVar, k94.i.f387491g, b18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSingleViewVisibility", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
    }

    public final void e(k94.h hVar, k94.i iVar, double d17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyListeners", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        for (k94.g gVar : this.f387495b) {
            hVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewId", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewId", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            java.lang.String str = hVar.f387481a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTag", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTag", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            gVar.a(str, iVar, d17, hVar.f387484d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyListeners", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
    }
}
