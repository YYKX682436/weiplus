package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f64680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.z3 f64681e;

    public y3(com.tencent.mm.chatroom.ui.z3 z3Var, k91.v5 v5Var) {
        this.f64681e = z3Var;
        this.f64680d = v5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.chatroom.ui.z3 z3Var = this.f64681e;
        z3Var.f64708b.x(z3Var.f64707a, this.f64680d);
    }
}
