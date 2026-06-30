package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class m6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f135052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f135053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f135054f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.n6 f135055g;

    public m6(com.p314xaae8f345.mm.app.n6 n6Var, boolean z17, long j17, long j18) {
        this.f135055g = n6Var;
        this.f135052d = z17;
        this.f135053e = j17;
        this.f135054f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.app.n6 n6Var;
        com.p314xaae8f345.mm.app.u6 u6Var;
        long j17;
        long j18;
        synchronized (this.f135055g.f135076g.f135379z) {
            n6Var = this.f135055g;
            u6Var = n6Var.f135076g;
            u6Var.f135379z[0] = this.f135052d;
        }
        if (n6Var.f135074e) {
            synchronized (u6Var.f135375v) {
                com.p314xaae8f345.mm.app.n6 n6Var2 = this.f135055g;
                com.p314xaae8f345.mm.app.u6 u6Var2 = n6Var2.f135076g;
                u6Var2.f135376w = n6Var2.f135075f;
                j18 = this.f135053e;
                u6Var2.f135377x = j18;
                u6Var2.f135378y = this.f135054f;
            }
            com.p314xaae8f345.mm.app.p5.e("MicroMsg.StartupCostReporter", "[tomys] cold startup, tinkerLoadCost:%s, startupCost:%s", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(this.f135054f));
        } else {
            synchronized (u6Var.A) {
                com.p314xaae8f345.mm.app.n6 n6Var3 = this.f135055g;
                com.p314xaae8f345.mm.app.u6 u6Var3 = n6Var3.f135076g;
                u6Var3.B = n6Var3.f135075f;
                j17 = this.f135054f;
                u6Var3.C = j17;
            }
            com.p314xaae8f345.mm.app.p5.e("MicroMsg.StartupCostReporter", "[tomys] hot startup, startupCost:%s", java.lang.Long.valueOf(j17));
        }
        this.f135055g.f135076g.f135360d.post(new com.p314xaae8f345.mm.app.l6(this));
    }
}
