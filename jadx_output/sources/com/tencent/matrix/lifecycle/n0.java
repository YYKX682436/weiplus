package com.tencent.matrix.lifecycle;

/* loaded from: classes12.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {
    public n0(com.tencent.matrix.lifecycle.q0 q0Var) {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.concurrent.Executor executor = com.tencent.matrix.lifecycle.q0.f52780a.f52769a;
        if (executor != null) {
            return executor;
        }
        com.tencent.matrix.lifecycle.h0 h0Var = new com.tencent.matrix.lifecycle.h0();
        return new com.tencent.matrix.lifecycle.j0(this, h0Var, 0, 5, 30L, java.util.concurrent.TimeUnit.SECONDS, h0Var, com.tencent.matrix.lifecycle.l0.f52702d, new com.tencent.matrix.lifecycle.m0(h0Var));
    }
}
