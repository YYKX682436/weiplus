package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d f182285d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d) {
        this.f182285d = activityC13590x9555381d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d.f182140y0;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d = this.f182285d;
        if (activityC13590x9555381d.d7() == 8 && activityC13590x9555381d.j7() && com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(o72.x1.x(activityC13590x9555381d.F))) {
            o72.u2 u2Var = activityC13590x9555381d.f182133g;
            u2Var.f425019k++;
            o72.l4 l4Var = (o72.l4) i95.n0.c(o72.l4.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf mo55332x76847179 = activityC13590x9555381d.mo55332x76847179();
            o72.r2 r2Var = activityC13590x9555381d.E;
            r45.dq0 dq0Var = new r45.dq0();
            dq0Var.f454186d = u2Var.f425009a;
            dq0Var.f454187e = u2Var.f425026r;
            dq0Var.f454188f = u2Var.f425010b;
            ((x82.i) l4Var).wi(mo55332x76847179, r2Var, dq0Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
