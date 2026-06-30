package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.q2 f70725d;

    public o2(com.tencent.mm.modelbase.q2 q2Var) {
        this.f70725d = q2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mm.modelbase.q2 q2Var = this.f70725d;
        boolean z18 = q2Var.f70751g;
        if (z18 || (z17 = q2Var.f70755n)) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            com.tencent.mm.modelbase.m1 m1Var = q2Var.f70752h;
            objArr[0] = java.lang.Integer.valueOf(m1Var == null ? 0 : m1Var.hashCode());
            com.tencent.mm.modelbase.m1 m1Var2 = q2Var.f70752h;
            objArr[1] = java.lang.Integer.valueOf(m1Var2 != null ? m1Var2.getType() : 0);
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteOnGYNetEnd", "time exceed But removeCallbacks failed hash:%d type:%d", objArr);
            return;
        }
        q01.a1.f359259a.d(q2Var.f70752h);
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        com.tencent.mm.modelbase.m1 m1Var3 = q2Var.f70752h;
        objArr2[0] = java.lang.Integer.valueOf(m1Var3 == null ? 0 : m1Var3.hashCode());
        com.tencent.mm.modelbase.m1 m1Var4 = q2Var.f70752h;
        objArr2[1] = java.lang.Integer.valueOf(m1Var4 != null ? m1Var4.getType() : 0);
        com.tencent.mars.xlog.Log.w("MicroMsg.RemoteOnGYNetEnd", "time exceed, force to callback hash:%d type:%d", objArr2);
        q2Var.f70751g = true;
        s75.d.b(new com.tencent.mm.modelbase.n2(this, z18, z17), "RemoteOnGYNetEnd_killPush");
        if (com.tencent.mm.modelbase.q2.d(q2Var, null)) {
            return;
        }
        q2Var.f70749e.onGYNetEnd(-1, 3, -1, "time exceed, force to callback", q2Var.f70748d, null);
    }
}
