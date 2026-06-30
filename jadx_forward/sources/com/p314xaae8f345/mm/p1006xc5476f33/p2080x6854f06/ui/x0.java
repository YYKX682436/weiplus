package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class x0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.z0 f243884d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.z0 z0Var) {
        this.f243884d = z0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = 2;
        h34.i0 Ui = c34.h0.Ui();
        Ui.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor B = Ui.f360076d.B("SELECT * FROM shaketvhistory ORDER BY createtime DESC", null);
        if (B != null) {
            while (B.moveToNext()) {
                h34.h0 h0Var = new h34.h0();
                h0Var.mo9015xbf5d97fd(B);
                arrayList.add(h0Var);
            }
            B.close();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb6.append(((h34.h0) it.next()).f4178xdec927b);
            sb6.append("|");
        }
        objArr[1] = sb6.toString();
        g0Var.d(12662, objArr);
        c34.h0.Ui().f360076d.mo70514xb06685ab("shaketvhistory", null, null);
        c01.d9.e().g(new h34.h(2, null));
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.z0 z0Var = this.f243884d;
        z0Var.f243893d.f243752d.q();
        z0Var.f243893d.m78501x43e00957(false);
    }
}
