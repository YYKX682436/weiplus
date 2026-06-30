package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class za implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ab f183209d;

    public za(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ab abVar) {
        this.f183209d = abVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ab abVar = this.f183209d;
        java.util.List k17 = abVar.f182003a.T.k(true);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = k17.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            activityC13579xef51058a = abVar.f182003a;
            int i18 = 3;
            if (!hasNext) {
                break;
            }
            o72.r2 r2Var = (o72.r2) it.next();
            o72.t2 t2Var = new o72.t2(r2Var);
            t2Var.f424999d = 2;
            t2Var.f425002g = activityC13579xef51058a.T.o() ? 1 : 0;
            int i19 = -1;
            if (activityC13579xef51058a.T.o()) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = activityC13579xef51058a.T;
                int i27 = r2Var.f67643xc8a07680;
                int i28 = 0;
                while (true) {
                    if (i28 >= cVar.f182013m.size()) {
                        break;
                    }
                    if (((o72.r2) cVar.f182013m.get(i28)).f67643xc8a07680 == i27) {
                        i19 = i28;
                        break;
                    }
                    i28++;
                }
            }
            t2Var.f425003h = i19;
            t2Var.f425004i = o72.x1.u().indexOf(java.lang.Long.valueOf(r2Var.f67645x88be67a1)) + 1;
            int i29 = r2Var.f67657x2262335f;
            r45.bq0 bq0Var = r2Var.f67640x5ab01132;
            if (i29 != 5) {
                i18 = i29 != 8 ? 0 : 1;
            } else if (bq0Var != null && bq0Var.K != null) {
                i18 = 2;
            }
            t2Var.f425000e = i18;
            hashMap.put(java.lang.Long.valueOf(r2Var.f67645x88be67a1), t2Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.a(activityC13579xef51058a.mo55332x76847179(), k17, null, 28, hashMap);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11125, java.lang.Integer.valueOf(((java.util.LinkedList) k17).size()), 3);
        if (activityC13579xef51058a.T.f182017q) {
            activityC13579xef51058a.t7();
        }
    }
}
