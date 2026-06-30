package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class u implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e f155766d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e abstractActivityC11397xe10f852e) {
        this.f155766d = abstractActivityC11397xe10f852e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e abstractActivityC11397xe10f852e = this.f155766d;
        int i19 = abstractActivityC11397xe10f852e.F;
        if (i19 == 0) {
            i18 = !u11.c.i() ? 7 : 6;
        } else {
            int i27 = ((i19 & 2) == 0 && (i19 & 4) == 0) ? 0 : 2;
            if ((i19 & 4) != 0) {
                i27 |= 4;
            }
            i18 = (i19 & 1) != 0 ? i27 | 1 : i27;
        }
        android.view.LayoutInflater.from(abstractActivityC11397xe10f852e);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) abstractActivityC11397xe10f852e, 1, false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.n1 n1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.n1(i18 | 8, abstractActivityC11397xe10f852e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.o1 o1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.o1(abstractActivityC11397xe10f852e, null, null, null);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
            h4Var.f309914y = null;
            h4Var.f309915z = null;
        }
        arrayList.clear();
        db5.g4 g4Var = new db5.g4(abstractActivityC11397xe10f852e);
        n1Var.mo887xc459429a(g4Var);
        if (g4Var.z()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            return;
        }
        k0Var.f293405n = n1Var;
        k0Var.f293414s = o1Var;
        k0Var.f293387d = null;
        k0Var.G = null;
        k0Var.v();
    }
}
