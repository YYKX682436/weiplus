package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class e8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f168100d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 f168101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f168102f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f168103g;

    public e8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079, java.lang.Runnable runnable) {
        this.f168103g = n7Var;
        this.f168101e = enumC28568xbdfb1079;
        this.f168102f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        gf.o1 a17;
        df.a0 a0Var;
        if (this.f168100d.getAndSet(true)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f168103g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba2 = n7Var.mo32091x9a3f0ba2();
        gf.m1 m1Var = gf.o1.f352688b;
        synchronized (gf.o1.class) {
            a17 = gf.o1.f352688b.a(mo32091x9a3f0ba2);
        }
        int b27 = n7Var.b2();
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 renderMode = this.f168101e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderMode, "renderMode");
        df.w1 w1Var = (df.w1) a17.f352690a.get(b27);
        if (w1Var != null && (a0Var = w1Var.f311118i) != null) {
            a0Var.k(renderMode, this);
        }
        if (n7Var.mo51310xc2a54588() == null) {
            return;
        }
        this.f168102f.run();
    }
}
