package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class t1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.u1 f100797d;

    public t1(com.tencent.mm.plugin.fav.ui.detail.u1 u1Var) {
        this.f100797d = u1Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.bq0 bq0Var;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.fav.ui.detail.u1 u1Var = this.f100797d;
        if (itemId == 0) {
            o72.r2 r2Var = u1Var.f100803d.f100652n;
            if (r2Var == null || r2Var.field_favProto == null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI favoriteTextDetailUI = u1Var.f100803d;
            intent.putExtra("key_value", favoriteTextDetailUI.f100652n.field_favProto.f370974s);
            intent.putExtra("key_max_count", com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI.f100650r);
            intent.putExtra("key_show_confirm", true);
            intent.putExtra("key_fav_item_id", favoriteTextDetailUI.f100652n.field_id);
            o72.x1.M0(favoriteTextDetailUI, ".ui.FavTextEditUI", intent, 1, null);
            favoriteTextDetailUI.f100600g.f343489n++;
            return;
        }
        if (itemId == 1) {
            com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI favoriteTextDetailUI2 = u1Var.f100803d;
            com.tencent.mm.plugin.fav.ui.b4.b(favoriteTextDetailUI2, favoriteTextDetailUI2.f100654p, favoriteTextDetailUI2.f100600g);
            u1Var.f100803d.U6(5);
            return;
        }
        if (itemId != 2) {
            if (itemId != 3) {
                if (itemId != 4) {
                    return;
                }
                androidx.appcompat.app.AppCompatActivity context = u1Var.f100803d.getContext();
                com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI favoriteTextDetailUI3 = u1Var.f100803d;
                db5.e1.u(context, favoriteTextDetailUI3.getString(com.tencent.mm.R.string.f490369t2), "", new com.tencent.mm.plugin.fav.ui.detail.s1(this), null);
                favoriteTextDetailUI3.U6(6);
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_fav_scene", 2);
            intent2.putExtra("key_fav_item_id", u1Var.f100803d.f100652n.field_localId);
            com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI favoriteTextDetailUI4 = u1Var.f100803d;
            o72.x1.L0(favoriteTextDetailUI4.getContext(), ".ui.FavTagEditUI", intent2, null);
            favoriteTextDetailUI4.f100600g.f343490o++;
            favoriteTextDetailUI4.U6(7);
            return;
        }
        com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI favoriteTextDetailUI5 = u1Var.f100803d;
        o72.r2 r2Var2 = favoriteTextDetailUI5.f100652n;
        com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI favoriteTextDetailUI6 = u1Var.f100803d;
        if (r2Var2 != null && (bq0Var = r2Var2.field_favProto) != null) {
            favoriteTextDetailUI5.f100600g.f343487l++;
            java.lang.String str = bq0Var.f370974s;
            com.tencent.mm.sdk.platformtools.o4 o4Var = o72.x1.f343515a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavApiLogic", "shareTextToFriend content null");
            } else {
                android.content.Intent intent3 = new android.content.Intent();
                if (str != null) {
                    com.tencent.mm.sendtowework.TextData textData = new com.tencent.mm.sendtowework.TextData(str);
                    intent3.putExtra("content_type_forward_to_wework", 1);
                    intent3.putExtra("Select_Data_Send_To_WeWork", textData);
                }
                intent3.putExtra("Retr_Msg_content", str);
                intent3.putExtra("Retr_Msg_Type", 4);
                intent3.putExtra("mutil_select_is_ret", true);
                j45.l.u(favoriteTextDetailUI5, ".ui.transmit.MsgRetransmitUI", intent3, null);
            }
            favoriteTextDetailUI6.X6(favoriteTextDetailUI6.f100652n.field_localId, 1, 0);
        }
        favoriteTextDetailUI6.U6(3);
    }
}
