package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class xb implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.zb f183141d;

    public xb(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.zb zbVar) {
        this.f183141d = zbVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.zb zbVar = this.f183141d;
        int i18 = zbVar.f183211e;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a = zbVar.f183213g;
        if (i18 < activityC13579xef51058a.f181803h.getHeaderViewsCount()) {
            return;
        }
        int i19 = zbVar.f183211e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "do delete, long click info is %s", java.lang.Integer.valueOf(i19));
        o72.r2 item = activityC13579xef51058a.T.getItem(i19 - activityC13579xef51058a.f181803h.getHeaderViewsCount());
        o72.t2 t2Var = new o72.t2(item);
        int i27 = 3;
        t2Var.f424999d = 3;
        t2Var.f425002g = activityC13579xef51058a.T.o() ? 1 : 0;
        t2Var.f425003h = activityC13579xef51058a.T.o() ? activityC13579xef51058a.T.f182013m.indexOf(item) + 1 : -1;
        t2Var.f425004i = o72.x1.u().indexOf(java.lang.Long.valueOf(item.f67645x88be67a1)) + 1;
        int i28 = item.f67657x2262335f;
        r45.bq0 bq0Var = item.f67640x5ab01132;
        if (i28 != 5) {
            i27 = i28 != 8 ? 0 : 1;
        } else if (bq0Var != null && bq0Var.K != null) {
            i27 = 2;
        }
        t2Var.f425000e = i27;
        o72.x1.l(item, true, null, 1, t2Var);
    }
}
