package com.tencent.mm.modelsimple;

/* loaded from: classes5.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f71290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.d1 f71291e;

    public b1(com.tencent.mm.modelsimple.d1 d1Var, com.tencent.mm.storage.f9 f9Var) {
        this.f71291e = d1Var;
        this.f71290d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 f9Var = this.f71290d;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRevokeMsg", "delete invoke message! msg:%s", java.lang.Long.valueOf(f9Var.getMsgId()));
        f9Var.setType(10002);
        com.tencent.mm.modelsimple.d1.J(this.f71291e.f71310g, "", f9Var, "");
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).bb(f9Var.getMsgId(), f9Var);
    }
}
