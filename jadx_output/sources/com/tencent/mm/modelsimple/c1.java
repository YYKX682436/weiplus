package com.tencent.mm.modelsimple;

/* loaded from: classes5.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f71298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f71299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.d1 f71300f;

    public c1(com.tencent.mm.modelsimple.d1 d1Var, com.tencent.mm.storage.f9 f9Var, t21.v2 v2Var) {
        this.f71300f = d1Var;
        this.f71298d = f9Var;
        this.f71299e = v2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f71299e.f415004c;
        com.tencent.mm.storage.f9 f9Var = this.f71298d;
        f9Var.o1(j17);
        f9Var.setType(43);
        com.tencent.mm.modelsimple.d1 d1Var = this.f71300f;
        c01.d9.e().g(new com.tencent.mm.modelsimple.d1(f9Var, d1Var.f71310g, d1Var.f71312i));
    }
}
