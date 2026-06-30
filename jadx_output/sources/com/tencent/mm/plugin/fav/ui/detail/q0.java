package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class q0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.r0 f100781d;

    public q0(com.tencent.mm.plugin.fav.ui.detail.r0 r0Var) {
        this.f100781d = r0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.jq0 jq0Var;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.fav.ui.detail.r0 r0Var = this.f100781d;
        if (itemId == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_fav_scene", 2);
            intent.putExtra("key_fav_item_id", r0Var.f100786e.f100627o.field_localId);
            o72.x1.L0(r0Var.f100786e.getContext(), ".ui.FavTagEditUI", intent, null);
            com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI = r0Var.f100786e;
            favoriteImgDetailUI.f100600g.f343490o++;
            favoriteImgDetailUI.U6(7);
            return;
        }
        java.lang.String str = "";
        if (itemId == 1) {
            db5.e1.u(r0Var.f100786e.getContext(), r0Var.f100786e.getString(com.tencent.mm.R.string.f490369t2), "", new com.tencent.mm.plugin.fav.ui.detail.p0(this), null);
            r0Var.f100786e.U6(6);
            return;
        }
        if (itemId != 2) {
            if (itemId != 3) {
                return;
            }
            com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI2 = r0Var.f100786e;
            com.tencent.mm.plugin.fav.ui.b4.b(favoriteImgDetailUI2, r0Var.f100785d, favoriteImgDetailUI2.f100600g);
            r0Var.f100786e.U6(5);
            return;
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        jd5.a aVar = new jd5.a();
        o72.r2 r2Var = r0Var.f100786e.f100627o;
        if (r2Var != null) {
            r45.bq0 bq0Var = r2Var.field_favProto;
            if (bq0Var != null && (jq0Var = bq0Var.f370962d) != null) {
                java.lang.String str2 = jq0Var.f378036f;
                java.lang.String str3 = jq0Var.f378038h;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(str3) && !com.tencent.mm.sdk.platformtools.t8.K0(jq0Var.f378046s)) {
                    long V = com.tencent.mm.sdk.platformtools.t8.V(jq0Var.f378046s, 0L);
                    int i18 = aVar.f43702d;
                    aVar.set(i18 + 2, java.lang.Long.valueOf(V));
                    if (c01.z1.r().equals(str2)) {
                        aVar.set(i18 + 1, str3);
                    } else {
                        aVar.set(i18 + 1, str2);
                    }
                }
            }
            r45.gp0 J2 = o72.x1.J(r0Var.f100786e.f100627o);
            if (J2 != null) {
                str = o72.x1.x(J2);
            }
        }
        if (com.tencent.mm.vfs.w6.j(str)) {
            aVar.p(str);
            n13.r rVar = new n13.r();
            rVar.f334117a = true;
            rVar.f334120d.f334139a = 6;
            ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(r0Var.f100786e, aVar, rVar);
        }
        com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI3 = r0Var.f100786e;
        favoriteImgDetailUI3.X6(favoriteImgDetailUI3.f100627o.field_localId, 1, 0);
        com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI4 = r0Var.f100786e;
        favoriteImgDetailUI4.f100600g.f343487l++;
        favoriteImgDetailUI4.U6(3);
    }
}
