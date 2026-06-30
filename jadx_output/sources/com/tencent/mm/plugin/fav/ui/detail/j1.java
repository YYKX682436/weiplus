package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class j1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.k1 f100746d;

    public j1(com.tencent.mm.plugin.fav.ui.detail.k1 k1Var) {
        this.f100746d = k1Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.fav.ui.detail.k1 k1Var = this.f100746d;
        if (itemId == 0) {
            com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI favoriteSightDetailUI = k1Var.f100750d;
            favoriteSightDetailUI.X6(favoriteSightDetailUI.f100641r.field_localId, 1, 0);
            android.content.Intent intent = new android.content.Intent();
            o72.r3.b(intent, k1Var.f100750d.f100641r);
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("scene_from", 1);
            intent.putExtra("mutil_select_is_ret", true);
            intent.putExtra("select_fav_local_id", k1Var.f100750d.f100641r.field_localId);
            j45.l.v(k1Var.f100750d.getContext(), ".ui.transmit.SelectConversationUI", intent, 1);
            com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI favoriteSightDetailUI2 = k1Var.f100750d;
            favoriteSightDetailUI2.f100600g.f343487l++;
            favoriteSightDetailUI2.U6(3);
            return;
        }
        if (itemId == 2) {
            db5.e1.u(k1Var.f100750d.getContext(), k1Var.f100750d.getString(com.tencent.mm.R.string.f490369t2), "", new com.tencent.mm.plugin.fav.ui.detail.i1(this), null);
            k1Var.f100750d.U6(6);
            return;
        }
        if (itemId != 3) {
            if (itemId != 4) {
                return;
            }
            com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI favoriteSightDetailUI3 = k1Var.f100750d;
            com.tencent.mm.plugin.fav.ui.b4.b(favoriteSightDetailUI3, favoriteSightDetailUI3.f100643t, favoriteSightDetailUI3.f100600g);
            k1Var.f100750d.U6(5);
            return;
        }
        k1Var.f100750d.f100600g.f343490o++;
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_fav_scene", 2);
        intent2.putExtra("key_fav_item_id", k1Var.f100750d.f100641r.field_localId);
        o72.x1.L0(k1Var.f100750d.getContext(), ".ui.FavTagEditUI", intent2, null);
        k1Var.f100750d.U6(7);
    }
}
