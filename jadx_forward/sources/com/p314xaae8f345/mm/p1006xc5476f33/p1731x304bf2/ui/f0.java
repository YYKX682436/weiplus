package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes5.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.u1 f222913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.g0 f222914e;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.g0 g0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.u1 u1Var) {
        this.f222914e = g0Var;
        this.f222913d = u1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.g0 g0Var = this.f222914e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15944xcd1fadc4 activityC15944xcd1fadc4 = g0Var.f222924e;
        boolean z17 = activityC15944xcd1fadc4.f222223i != 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.u1 u1Var = this.f222913d;
        activityC15944xcd1fadc4.f222224m = u1Var.f222017a.f405457e;
        java.util.LinkedList linkedList = u1Var.f222018b;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d4 d4Var = activityC15944xcd1fadc4.f222219e;
            d4Var.getClass();
            if (linkedList != null) {
                gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.q4(d4Var, linkedList));
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d4 d4Var2 = activityC15944xcd1fadc4.f222219e;
            d4Var2.getClass();
            if (linkedList != null) {
                s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.s4(d4Var2, linkedList), "game_get_download_info");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15944xcd1fadc4 activityC15944xcd1fadc42 = g0Var.f222924e;
        activityC15944xcd1fadc42.f222222h = false;
        android.view.View view = activityC15944xcd1fadc42.f222220f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameCategoryUI$5$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/ui/GameCategoryUI$5$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC15944xcd1fadc42.f222223i += 15;
        android.app.Dialog dialog = activityC15944xcd1fadc42.f222221g;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
