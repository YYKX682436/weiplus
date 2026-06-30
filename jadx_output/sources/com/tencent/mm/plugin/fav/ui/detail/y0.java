package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class y0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.a1 f100817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI f100818e;

    public y0(com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI, com.tencent.mm.plugin.fav.ui.detail.a1 a1Var) {
        this.f100818e = favoriteImgDetailUI;
        this.f100817d = a1Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.fav.ui.detail.a1 a1Var = this.f100817d;
        java.lang.String x17 = o72.x1.x(a1Var.f100683a);
        if (!com.tencent.mm.vfs.w6.j(x17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteImgDetailUI", "file not exists");
            return;
        }
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI = this.f100818e;
        if (itemId == 1) {
            o72.x1.K0(x17, favoriteImgDetailUI.getContext());
            favoriteImgDetailUI.X6(favoriteImgDetailUI.f100627o.field_localId, 0, 0);
            return;
        }
        if (itemId == 2) {
            if (com.tencent.mm.sdk.platformtools.y1.c(x17)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Select_Conv_Type", 3);
                intent.putExtra("select_is_ret", true);
                j45.l.v(favoriteImgDetailUI, ".ui.transmit.SelectConversationUI", intent, 1);
            } else {
                o72.x1.J0(x17, favoriteImgDetailUI.getContext(), a1Var.f100683a.f375431q2);
            }
            favoriteImgDetailUI.X6(favoriteImgDetailUI.f100627o.field_localId, 1, 0);
            return;
        }
        if (itemId != 3) {
            return;
        }
        java.lang.String string = favoriteImgDetailUI.getString(com.tencent.mm.R.string.ccq);
        androidx.appcompat.app.AppCompatActivity context = favoriteImgDetailUI.getContext();
        java.lang.String str = a1Var.f100683a.f375431q2;
        int i18 = com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.f100624w;
        if (com.tencent.mm.sdk.platformtools.t8.K0(x17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteImgDetailUI", "save image fail, path is null");
            return;
        }
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(context, x17, new com.tencent.mm.plugin.fav.ui.detail.i0(context, str, string));
    }
}
