package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI f100698d;

    public b1(com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI favoriteSightDetailUI) {
        this.f100698d = favoriteSightDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (iq.b.C(view.getContext()) || iq.b.v(view.getContext()) || iq.b.e(view.getContext())) {
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI favoriteSightDetailUI = this.f100698d;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteSightDetailUI", "click item favid %d, localid %d, itemstatus %d", java.lang.Integer.valueOf(favoriteSightDetailUI.f100641r.field_id), java.lang.Long.valueOf(favoriteSightDetailUI.f100641r.field_localId), java.lang.Integer.valueOf(favoriteSightDetailUI.f100641r.field_itemStatus));
        if (!favoriteSightDetailUI.f100641r.I0()) {
            o72.r2 r2Var = favoriteSightDetailUI.f100641r;
            if (r2Var.field_itemStatus == 8) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(favoriteSightDetailUI.f100642s.f375434s)) {
                    com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI.Z6(favoriteSightDetailUI, false, view.getContext());
                    yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            } else if (r2Var.J0() || favoriteSightDetailUI.f100641r.Q0()) {
                if (favoriteSightDetailUI.f100638o.getVisibility() == 8) {
                    favoriteSightDetailUI.b7(false);
                }
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        } else if (o72.x1.i0(favoriteSightDetailUI.f100642s)) {
            o72.o3.b(o72.k3.EnterFullScreen, favoriteSightDetailUI.f100641r);
            com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI.Z6(favoriteSightDetailUI, true, view.getContext());
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(favoriteSightDetailUI.f100642s.f375434s)) {
                com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI.Z6(favoriteSightDetailUI, false, view.getContext());
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteSightDetailUI", "? info is done, source file not exist, cdn data url is not null");
        }
        if (favoriteSightDetailUI.f100641r.P0()) {
            o72.x1.D0(favoriteSightDetailUI.f100641r, true);
        } else {
            o72.x1.C0(favoriteSightDetailUI.f100641r, true);
        }
        favoriteSightDetailUI.b7(false);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
