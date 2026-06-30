package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes5.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f152823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p957x53236a1b.d1 f152824e;

    public b1(com.p314xaae8f345.mm.p957x53236a1b.d1 d1Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f152824e = d1Var;
        this.f152823d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f152823d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRevokeMsg", "delete invoke message! msg:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        f9Var.m124850x7650bebc(10002);
        com.p314xaae8f345.mm.p957x53236a1b.d1.J(this.f152824e.f152843g, "", f9Var, "");
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).bb(f9Var.m124847x74d37ac6(), f9Var);
    }
}
