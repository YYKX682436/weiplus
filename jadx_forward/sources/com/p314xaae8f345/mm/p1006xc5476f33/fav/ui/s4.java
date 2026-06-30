package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class s4 implements w82.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 f182967a;

    public s4(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257) {
        this.f182967a = activityC13570xd6b9f257;
    }

    @Override // w82.j
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257 = this.f182967a;
        if (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.r7(activityC13570xd6b9f257.f181933n.k(false), activityC13570xd6b9f257, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.o4(this), true, true)) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.g(activityC13570xd6b9f257.mo55332x76847179(), 4105, activityC13570xd6b9f257.f181933n, activityC13570xd6b9f257.K);
        }
    }

    @Override // w82.j
    public void b() {
    }

    @Override // w82.j
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257 = this.f182967a;
        java.util.List<o72.r2> k17 = activityC13570xd6b9f257.f181933n.k(true);
        java.util.LinkedList linkedList = (java.util.LinkedList) k17;
        if (linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSearchUI", "FavEditFooter onDelRequest list == null");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        boolean z17 = false;
        for (o72.r2 r2Var : k17) {
            if (r2Var.B1) {
                hashSet.add(java.lang.Long.valueOf(r2Var.f67645x88be67a1));
                z17 = true;
            } else {
                arrayList.add(r2Var);
            }
        }
        if (arrayList.size() != 0) {
            db5.e1.u(activityC13570xd6b9f257.mo55332x76847179(), activityC13570xd6b9f257.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_i), "", new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.r4(this, arrayList, z17), null);
        } else if (hashSet.size() >= 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.e7(activityC13570xd6b9f257.mo55332x76847179());
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.X6(activityC13570xd6b9f257, null, 0, (o72.r2) linkedList.get(0));
        }
    }

    @Override // w82.j
    public void d() {
    }
}
