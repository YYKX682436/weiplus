package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class ab implements w82.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavoriteIndexUI f100470a;

    public ab(com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI) {
        this.f100470a = favoriteIndexUI;
    }

    @Override // w82.j
    public void a() {
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = this.f100470a;
        if (com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.r7(favoriteIndexUI.T.k(false), favoriteIndexUI, new com.tencent.mm.plugin.fav.ui.ya(this), true, true)) {
            com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.o7(favoriteIndexUI, favoriteIndexUI.getContext(), 4105, favoriteIndexUI.T, favoriteIndexUI.f100439p1);
        }
    }

    @Override // w82.j
    public void b() {
    }

    @Override // w82.j
    public void c() {
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = this.f100470a;
        db5.e1.u(favoriteIndexUI.getContext(), favoriteIndexUI.getString(com.tencent.mm.R.string.c_i), "", new com.tencent.mm.plugin.fav.ui.za(this), null);
    }

    @Override // w82.j
    public void d() {
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = this.f100470a;
        if (favoriteIndexUI.T.l() <= 0) {
            return;
        }
        if (favoriteIndexUI.T.l() <= 1) {
            o72.r2 r2Var = (o72.r2) ((java.util.LinkedList) favoriteIndexUI.T.k(false)).get(0);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_fav_scene", 3);
            intent.putExtra("key_fav_item_id", r2Var.field_localId);
            o72.x1.M0(favoriteIndexUI.getContext(), ".ui.FavTagEditUI", intent, 4104, null);
            o72.z2.a("FavTagEditUI");
            if (favoriteIndexUI.T.f100484q) {
                favoriteIndexUI.t7();
                return;
            }
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_fav_scene", 3);
        intent2.putExtra("key_fav_is_add_tag", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List k17 = favoriteIndexUI.T.k(false);
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = (java.util.LinkedList) k17;
            if (i17 >= linkedList.size()) {
                break;
            }
            arrayList.add(java.lang.Integer.valueOf(((o72.r2) linkedList.get(i17)).field_id));
            i17++;
        }
        intent2.putExtra("key_fav_item_ids", arrayList);
        o72.x1.M0(favoriteIndexUI.getContext(), ".ui.FavTagEditUI", intent2, 4104, null);
        o72.z2.a("FavTagEditUI");
        for (o72.r2 r2Var2 : favoriteIndexUI.T.k(false)) {
            if (r2Var2 != null) {
                ((a82.y1) ((o72.s4) i95.n0.c(o72.s4.class))).Di(java.lang.Long.valueOf(r2Var2.field_localId));
            }
        }
        if (favoriteIndexUI.T.f100484q) {
            favoriteIndexUI.t7();
        }
    }
}
