package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI f100811d;

    public x(com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI) {
        this.f100811d = favoriteFileDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI = this.f100811d;
        if (!com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.i7(favoriteFileDetailUI.F) || favoriteFileDetailUI.E.P0() || com.tencent.mm.sdk.platformtools.t8.K0(favoriteFileDetailUI.F.f375434s)) {
            com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.a7(favoriteFileDetailUI);
        } else {
            com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(favoriteFileDetailUI.getContext(), 1, 2, false);
            z2Var.m(favoriteFileDetailUI.getResources().getString(com.tencent.mm.R.string.f490347sg), favoriteFileDetailUI.getResources().getString(com.tencent.mm.R.string.dsz));
            z2Var.o(0);
            com.tencent.mm.ui.bk.r0(z2Var.C.getPaint(), 0.8f);
            z2Var.v(favoriteFileDetailUI.getResources().getColor(com.tencent.mm.R.color.a0c));
            com.tencent.mm.plugin.fav.ui.detail.v vVar = new com.tencent.mm.plugin.fav.ui.detail.v(this, z2Var);
            com.tencent.mm.plugin.fav.ui.detail.w wVar = new com.tencent.mm.plugin.fav.ui.detail.w(this, z2Var);
            z2Var.D = vVar;
            z2Var.E = wVar;
            z2Var.q(favoriteFileDetailUI.getString(com.tencent.mm.R.string.f491188dt2));
            android.widget.TextView textView = new android.widget.TextView(favoriteFileDetailUI.getContext());
            textView.setText(com.tencent.mm.R.string.f491187dt1);
            textView.setTextColor(favoriteFileDetailUI.getColor(com.tencent.mm.R.color.f478719fa));
            textView.setTextSize(14.0f);
            z2Var.j(textView);
            z2Var.C();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
