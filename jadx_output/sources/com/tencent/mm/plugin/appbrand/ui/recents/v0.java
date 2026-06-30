package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public final class v0 extends com.tencent.mm.plugin.appbrand.ui.recents.f2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f90162a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90163b;

    public v0(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList, com.tencent.mm.plugin.appbrand.ui.recents.b0 b0Var) {
        this.f90163b = appBrandLauncherRecentsList;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.f2
    public void a(androidx.recyclerview.widget.k3 k3Var, java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.ui.recents.c1 c1Var = (com.tencent.mm.plugin.appbrand.ui.recents.c1) k3Var;
        com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo appBrandRecentTaskInfo = (com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) obj;
        c1Var.f90047f.setVisibility(8);
        android.view.View view = c1Var.f90045d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentProvider", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem;Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandRecentTaskInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentProvider", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem;Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandRecentTaskInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c1Var.f90046e.setText(com.tencent.mm.sdk.platformtools.t8.K0(appBrandRecentTaskInfo.f76356x) ? appBrandRecentTaskInfo.f76355w.replaceFirst("@app", "") : appBrandRecentTaskInfo.f76356x);
        d(c1Var, appBrandRecentTaskInfo.A, appBrandRecentTaskInfo.f76370p, appBrandRecentTaskInfo.f76372r ? appBrandRecentTaskInfo.f76373s : "");
        b(c1Var, appBrandRecentTaskInfo.f76357y);
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.appcache.p.a(appBrandRecentTaskInfo.A);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(a17);
        android.widget.TextView textView = c1Var.f90048g;
        if (K0) {
            textView.setVisibility(8);
        } else {
            textView.setText(a17);
            textView.setVisibility(0);
        }
        c(c1Var);
        boolean b17 = ne.s.b(appBrandRecentTaskInfo.D, 6);
        android.widget.ImageView imageView = c1Var.f90052n;
        if (b17) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.relievedbuy, 0) == 1) {
                imageView.setVisibility(0);
                com.tencent.mm.plugin.appbrand.ui.ae.a(imageView);
                return;
            }
        }
        if (!ne.s.a(appBrandRecentTaskInfo.F, 6)) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            com.tencent.mm.plugin.appbrand.ui.vd.a(imageView);
        }
    }

    public final void b(com.tencent.mm.plugin.appbrand.ui.recents.c1 c1Var, java.lang.String str) {
        boolean z17 = this.f90163b.L;
        ((java.util.HashMap) this.f90162a).put(str, l01.d0.f314761a.b(c1Var.f90050i, str, l01.a.h(), l01.q0.f314787d));
    }

    public final void c(com.tencent.mm.plugin.appbrand.ui.recents.c1 c1Var) {
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90163b;
        if (appBrandLauncherRecentsList.f90013w.u0(c1Var.itemView) == appBrandLauncherRecentsList.f90016y.getItemCount() - 1) {
            android.view.View view = c1Var.f90045d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentProvider", "applyCommonInconsistent", "(Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentProvider", "applyCommonInconsistent", "(Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = c1Var.f90045d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentProvider", "applyCommonInconsistent", "(Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentProvider", "applyCommonInconsistent", "(Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean z17 = appBrandLauncherRecentsList.f90003n;
        android.widget.TextView textView = c1Var.f90049h;
        if (!z17) {
            textView.setVisibility(8);
        } else {
            textView.setText(java.lang.String.valueOf(appBrandLauncherRecentsList.f90013w.u0(c1Var.itemView)));
            textView.setVisibility(0);
        }
    }

    public final void d(com.tencent.mm.plugin.appbrand.ui.recents.c1 c1Var, int i17, long j17, java.lang.String str) {
        c1Var.f90047f.setVisibility(8);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = c1Var.f90053o;
        weImageView.setVisibility(8);
        c1Var.f90050i.setColorFilter((android.graphics.ColorFilter) null);
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        android.widget.TextView textView = c1Var.f90047f;
        textView.setVisibility(0);
        weImageView.setVisibility(0);
        weImageView.setImageResource(com.tencent.mm.R.raw.app_brand_third_party_running_flag);
        weImageView.setIconColor(this.f90163b.getResources().getColor(com.tencent.mm.R.color.f478873jj));
        textView.setText(str);
    }
}
