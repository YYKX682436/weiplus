package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class za implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.ab f101676d;

    public za(com.tencent.mm.plugin.fav.ui.ab abVar) {
        this.f101676d = abVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI;
        com.tencent.mm.plugin.fav.ui.ab abVar = this.f101676d;
        java.util.List k17 = abVar.f100470a.T.k(true);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = k17.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            favoriteIndexUI = abVar.f100470a;
            int i18 = 3;
            if (!hasNext) {
                break;
            }
            o72.r2 r2Var = (o72.r2) it.next();
            o72.t2 t2Var = new o72.t2(r2Var);
            t2Var.f343466d = 2;
            t2Var.f343469g = favoriteIndexUI.T.o() ? 1 : 0;
            int i19 = -1;
            if (favoriteIndexUI.T.o()) {
                com.tencent.mm.plugin.fav.ui.adapter.c cVar = favoriteIndexUI.T;
                int i27 = r2Var.field_id;
                int i28 = 0;
                while (true) {
                    if (i28 >= cVar.f100480m.size()) {
                        break;
                    }
                    if (((o72.r2) cVar.f100480m.get(i28)).field_id == i27) {
                        i19 = i28;
                        break;
                    }
                    i28++;
                }
            }
            t2Var.f343470h = i19;
            t2Var.f343471i = o72.x1.u().indexOf(java.lang.Long.valueOf(r2Var.field_localId)) + 1;
            int i29 = r2Var.field_type;
            r45.bq0 bq0Var = r2Var.field_favProto;
            if (i29 != 5) {
                i18 = i29 != 8 ? 0 : 1;
            } else if (bq0Var != null && bq0Var.K != null) {
                i18 = 2;
            }
            t2Var.f343467e = i18;
            hashMap.put(java.lang.Long.valueOf(r2Var.field_localId), t2Var);
        }
        com.tencent.mm.plugin.fav.ui.ec.a(favoriteIndexUI.getContext(), k17, null, 28, hashMap);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11125, java.lang.Integer.valueOf(((java.util.LinkedList) k17).size()), 3);
        if (favoriteIndexUI.T.f100484q) {
            favoriteIndexUI.t7();
        }
    }
}
