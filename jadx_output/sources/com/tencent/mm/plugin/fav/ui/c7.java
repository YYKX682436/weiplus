package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.z7 f100545d;

    public c7(com.tencent.mm.plugin.fav.ui.z7 z7Var) {
        this.f100545d = z7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.fav.ui.z7 z7Var = this.f100545d;
        if (z7Var.f101665k.getVisibility() == 0) {
            com.tencent.mm.plugin.fav.ui.MaxHeightFrameLayout maxHeightFrameLayout = z7Var.f101667m;
            if (maxHeightFrameLayout == null) {
                kotlin.jvm.internal.o.o("mFlRvContains");
                throw null;
            }
            maxHeightFrameLayout.startAnimation(com.tencent.mm.plugin.fav.ui.z7.b(z7Var));
            z7Var.f101661g.f();
            return;
        }
        com.tencent.mm.plugin.fav.ui.MaxHeightFrameLayout maxHeightFrameLayout2 = z7Var.f101667m;
        if (maxHeightFrameLayout2 == null) {
            kotlin.jvm.internal.o.o("mFlRvContains");
            throw null;
        }
        z7Var.getClass();
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
        translateAnimation.setDuration(300L);
        maxHeightFrameLayout2.setAnimation(translateAnimation);
        android.view.View view = z7Var.f101665k;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopFilter$handleDownMenu$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavTopFilter$handleDownMenu$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = z7Var.f101658d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopFilter$handleDownMenu$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavTopFilter$handleDownMenu$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        z7Var.e();
        z7Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.ui.MMActivity mMActivity = z7Var.f101655a;
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = mMActivity instanceof com.tencent.mm.plugin.fav.ui.FavoriteIndexUI ? (com.tencent.mm.plugin.fav.ui.FavoriteIndexUI) mMActivity : null;
        java.lang.String str = favoriteIndexUI != null ? favoriteIndexUI.Y : null;
        if (str == null) {
            str = "";
        }
        hashMap.put("fav_homepage_sessionid", str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_total_filter", "view_exp", hashMap, 32903);
    }
}
