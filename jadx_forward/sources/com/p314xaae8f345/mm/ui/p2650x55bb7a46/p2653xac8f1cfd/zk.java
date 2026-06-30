package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class zk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bl f281922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f281923e;

    public zk(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bl blVar, java.util.List list) {
        this.f281922d = blVar;
        this.f281923e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        android.widget.HorizontalScrollView horizontalScrollView;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bl blVar = this.f281922d;
        android.widget.LinearLayout linearLayout = blVar.f280368f;
        if (linearLayout == null || (horizontalScrollView = blVar.f280367e) == null) {
            i17 = 0;
        } else {
            int width = horizontalScrollView.getWidth();
            if (width <= 0) {
                i17 = linearLayout.getChildCount();
            } else {
                int childCount = linearLayout.getChildCount();
                int i18 = 0;
                for (int i19 = 0; i19 < childCount; i19++) {
                    android.view.View childAt = linearLayout.getChildAt(i19);
                    if (childAt != null) {
                        if (childAt.getLeft() >= width) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                }
                i17 = i18;
            }
        }
        blVar.f280371i = i17;
        int size = this.f281923e.size();
        android.widget.HorizontalScrollView horizontalScrollView2 = blVar.f280367e;
        if (horizontalScrollView2 == null || blVar.f280372m || horizontalScrollView2.getVisibility() != 0) {
            return;
        }
        blVar.f280372m = true;
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(horizontalScrollView2, "shortcut_name_btn");
        aVar.gk(horizontalScrollView2, kz5.c1.k(new jz5.l("weclawbot_username", blVar.f280113d.x()), new jz5.l("clawbot_shortcut_count", java.lang.Integer.valueOf(size)), new jz5.l("clawbot_visible_shortcut_count", java.lang.Integer.valueOf(blVar.f280371i))));
        aVar.ik(horizontalScrollView2, 1, 37790);
        try {
            aVar.Ej("view_exp", kz5.c1.k(new jz5.l("view_id", "shortcut_name_btn"), new jz5.l("weclawbot_username", blVar.f280113d.x()), new jz5.l("clawbot_shortcut_count", java.lang.Integer.valueOf(size)), new jz5.l("clawbot_visible_shortcut_count", java.lang.Integer.valueOf(blVar.f280371i))), 37790);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShortcutCommandTagComponent", e17, "reportExp failed", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutCommandTagComponent", "setupScrollViewReport: totalCount=%d, visibleCount=%d, exposure reported", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(blVar.f280371i));
    }
}
