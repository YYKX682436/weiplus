package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class q2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.r2 f100783d;

    public q2(com.tencent.mm.plugin.fav.ui.detail.r2 r2Var) {
        this.f100783d = r2Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.fav.ui.detail.r2 r2Var = this.f100783d;
        if (itemId == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_fav_scene", 2);
            intent.putExtra("key_fav_item_id", r2Var.f100789d.f100677m.field_localId);
            o72.x1.L0(r2Var.f100789d.getContext(), ".ui.FavTagEditUI", intent, null);
            com.tencent.mm.plugin.fav.ui.detail.FavoriteVoiceDetailUI favoriteVoiceDetailUI = r2Var.f100789d;
            favoriteVoiceDetailUI.f100600g.f343490o++;
            favoriteVoiceDetailUI.U6(7);
            return;
        }
        if (itemId == 1) {
            db5.e1.u(r2Var.f100789d.getContext(), r2Var.f100789d.getString(com.tencent.mm.R.string.f490369t2), "", new com.tencent.mm.plugin.fav.ui.detail.p2(this), null);
            r2Var.f100789d.U6(6);
        } else {
            if (itemId != 2) {
                return;
            }
            com.tencent.mm.plugin.fav.ui.detail.FavoriteVoiceDetailUI favoriteVoiceDetailUI2 = r2Var.f100789d;
            com.tencent.mm.plugin.fav.ui.b4.b(favoriteVoiceDetailUI2, favoriteVoiceDetailUI2.f100678n, favoriteVoiceDetailUI2.f100600g);
            r2Var.f100789d.U6(5);
        }
    }
}
