package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI f100752d;

    public l(com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI) {
        this.f100752d = favoriteFileDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.f100607y0;
        com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI = this.f100752d;
        if (favoriteFileDetailUI.d7() == 8 && favoriteFileDetailUI.j7() && com.tencent.mm.sdk.platformtools.y1.c(o72.x1.x(favoriteFileDetailUI.F))) {
            o72.u2 u2Var = favoriteFileDetailUI.f100600g;
            u2Var.f343486k++;
            o72.l4 l4Var = (o72.l4) i95.n0.c(o72.l4.class);
            com.tencent.mm.ui.MMActivity context = favoriteFileDetailUI.getContext();
            o72.r2 r2Var = favoriteFileDetailUI.E;
            r45.dq0 dq0Var = new r45.dq0();
            dq0Var.f372653d = u2Var.f343476a;
            dq0Var.f372654e = u2Var.f343493r;
            dq0Var.f372655f = u2Var.f343477b;
            ((x82.i) l4Var).wi(context, r2Var, dq0Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
