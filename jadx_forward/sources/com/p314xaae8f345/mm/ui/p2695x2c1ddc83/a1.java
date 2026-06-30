package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b1 f288963d;

    public a1(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b1 b1Var) {
        this.f288963d = b1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvDelLogic", "deleteConv onClick() convBox threadpool execute");
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 m4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r();
        m4Var.getClass();
        java.util.LinkedList<com.p314xaae8f345.mm.p2621x8fb0427b.l4> linkedList = new java.util.LinkedList();
        android.database.Cursor s17 = m4Var.s(1, null, "conversationboxservice", -1);
        if (s17 != null && s17.getCount() > 0) {
            while (s17.moveToNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
                l4Var.mo9015xbf5d97fd(s17);
                linkedList.add(l4Var);
            }
            s17.close();
        }
        for (com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 : linkedList) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 r66 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).r6(l4Var2.h1());
            ((e21.z0) c01.d9.b().w()).c(new e21.m(l4Var2.h1(), r66.I0()));
            boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(l4Var2.h1());
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b1 b1Var = this.f288963d;
            if (R4) {
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t1.b(b1Var.f288987e, l4Var2.h1(), new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a(), null, false);
            } else {
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t1.d(b1Var.f288987e, l4Var2.h1(), l4Var2, new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a(), null, false);
            }
        }
    }
}
