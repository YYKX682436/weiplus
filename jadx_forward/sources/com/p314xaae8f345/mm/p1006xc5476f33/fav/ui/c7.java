package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public final class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 f182078d;

    public c7(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var) {
        this.f182078d = z7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var = this.f182078d;
        if (z7Var.f183198k.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13582xd706766c c13582xd706766c = z7Var.f183200m;
            if (c13582xd706766c == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFlRvContains");
                throw null;
            }
            c13582xd706766c.startAnimation(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7.b(z7Var));
            z7Var.f183194g.f();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13582xd706766c c13582xd706766c2 = z7Var.f183200m;
        if (c13582xd706766c2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFlRvContains");
            throw null;
        }
        z7Var.getClass();
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
        translateAnimation.setDuration(300L);
        c13582xd706766c2.setAnimation(translateAnimation);
        android.view.View view = z7Var.f183198k;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopFilter$handleDownMenu$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavTopFilter$handleDownMenu$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = z7Var.f183191d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopFilter$handleDownMenu$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavTopFilter$handleDownMenu$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        z7Var.e();
        z7Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = z7Var.f183188a;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a = abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a ? (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a) abstractActivityC21394xb3d2c0cf : null;
        java.lang.String str = activityC13579xef51058a != null ? activityC13579xef51058a.Y : null;
        if (str == null) {
            str = "";
        }
        hashMap.put("fav_homepage_sessionid", str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_total_filter", "view_exp", hashMap, 32903);
    }
}
