package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class m6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f53519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f53520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f53521f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.n6 f53522g;

    public m6(com.tencent.mm.app.n6 n6Var, boolean z17, long j17, long j18) {
        this.f53522g = n6Var;
        this.f53519d = z17;
        this.f53520e = j17;
        this.f53521f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.app.n6 n6Var;
        com.tencent.mm.app.u6 u6Var;
        long j17;
        long j18;
        synchronized (this.f53522g.f53543g.f53846z) {
            n6Var = this.f53522g;
            u6Var = n6Var.f53543g;
            u6Var.f53846z[0] = this.f53519d;
        }
        if (n6Var.f53541e) {
            synchronized (u6Var.f53842v) {
                com.tencent.mm.app.n6 n6Var2 = this.f53522g;
                com.tencent.mm.app.u6 u6Var2 = n6Var2.f53543g;
                u6Var2.f53843w = n6Var2.f53542f;
                j18 = this.f53520e;
                u6Var2.f53844x = j18;
                u6Var2.f53845y = this.f53521f;
            }
            com.tencent.mm.app.p5.e("MicroMsg.StartupCostReporter", "[tomys] cold startup, tinkerLoadCost:%s, startupCost:%s", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(this.f53521f));
        } else {
            synchronized (u6Var.A) {
                com.tencent.mm.app.n6 n6Var3 = this.f53522g;
                com.tencent.mm.app.u6 u6Var3 = n6Var3.f53543g;
                u6Var3.B = n6Var3.f53542f;
                j17 = this.f53521f;
                u6Var3.C = j17;
            }
            com.tencent.mm.app.p5.e("MicroMsg.StartupCostReporter", "[tomys] hot startup, startupCost:%s", java.lang.Long.valueOf(j17));
        }
        this.f53522g.f53543g.f53827d.post(new com.tencent.mm.app.l6(this));
    }
}
