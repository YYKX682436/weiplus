package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class xb implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.zb f101608d;

    public xb(com.tencent.mm.plugin.fav.ui.zb zbVar) {
        this.f101608d = zbVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.zb zbVar = this.f101608d;
        int i18 = zbVar.f101678e;
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = zbVar.f101680g;
        if (i18 < favoriteIndexUI.f100270h.getHeaderViewsCount()) {
            return;
        }
        int i19 = zbVar.f101678e;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "do delete, long click info is %s", java.lang.Integer.valueOf(i19));
        o72.r2 item = favoriteIndexUI.T.getItem(i19 - favoriteIndexUI.f100270h.getHeaderViewsCount());
        o72.t2 t2Var = new o72.t2(item);
        int i27 = 3;
        t2Var.f343466d = 3;
        t2Var.f343469g = favoriteIndexUI.T.o() ? 1 : 0;
        t2Var.f343470h = favoriteIndexUI.T.o() ? favoriteIndexUI.T.f100480m.indexOf(item) + 1 : -1;
        t2Var.f343471i = o72.x1.u().indexOf(java.lang.Long.valueOf(item.field_localId)) + 1;
        int i28 = item.field_type;
        r45.bq0 bq0Var = item.field_favProto;
        if (i28 != 5) {
            i27 = i28 != 8 ? 0 : 1;
        } else if (bq0Var != null && bq0Var.K != null) {
            i27 = 2;
        }
        t2Var.f343467e = i27;
        o72.x1.l(item, true, null, 1, t2Var);
    }
}
