package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.q2 f152258d;

    public o2(com.p314xaae8f345.mm.p944x882e457a.q2 q2Var) {
        this.f152258d = q2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.p314xaae8f345.mm.p944x882e457a.q2 q2Var = this.f152258d;
        boolean z18 = q2Var.f152284g;
        if (z18 || (z17 = q2Var.f152288n)) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = q2Var.f152285h;
            objArr[0] = java.lang.Integer.valueOf(m1Var == null ? 0 : m1Var.hashCode());
            com.p314xaae8f345.mm.p944x882e457a.m1 m1Var2 = q2Var.f152285h;
            objArr[1] = java.lang.Integer.valueOf(m1Var2 != null ? m1Var2.mo808xfb85f7b0() : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteOnGYNetEnd", "time exceed But removeCallbacks failed hash:%d type:%d", objArr);
            return;
        }
        q01.a1.f440792a.d(q2Var.f152285h);
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var3 = q2Var.f152285h;
        objArr2[0] = java.lang.Integer.valueOf(m1Var3 == null ? 0 : m1Var3.hashCode());
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var4 = q2Var.f152285h;
        objArr2[1] = java.lang.Integer.valueOf(m1Var4 != null ? m1Var4.mo808xfb85f7b0() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteOnGYNetEnd", "time exceed, force to callback hash:%d type:%d", objArr2);
        q2Var.f152284g = true;
        s75.d.b(new com.p314xaae8f345.mm.p944x882e457a.n2(this, z18, z17), "RemoteOnGYNetEnd_killPush");
        if (com.p314xaae8f345.mm.p944x882e457a.q2.d(q2Var, null)) {
            return;
        }
        q2Var.f152282e.mo804x5f9cdc6f(-1, 3, -1, "time exceed, force to callback", q2Var.f152281d, null);
    }
}
