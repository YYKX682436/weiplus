package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class x implements com.tencent.matrix.lifecycle.j {
    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        if (com.tencent.matrix.lifecycle.owners.f0.f52739u) {
            oj.j.c("Matrix.ProcessLifecycle", "onBackground... visibleScene[" + com.tencent.matrix.lifecycle.owners.f0.f52740v + '@' + com.tencent.matrix.lifecycle.owners.f0.f52719a + ']', new java.lang.Object[0]);
            com.tencent.matrix.lifecycle.p pVar = com.tencent.matrix.lifecycle.q0.f52780a;
            ((java.util.concurrent.Executor) com.tencent.matrix.lifecycle.q0.f52783d.getValue()).execute(new com.tencent.matrix.lifecycle.owners.v());
        }
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        if (com.tencent.matrix.lifecycle.owners.f0.f52739u) {
            return;
        }
        oj.j.c("Matrix.ProcessLifecycle", "onForeground... visibleScene[" + com.tencent.matrix.lifecycle.owners.f0.f52740v + '@' + com.tencent.matrix.lifecycle.owners.f0.f52719a + ']', new java.lang.Object[0]);
        com.tencent.matrix.lifecycle.p pVar = com.tencent.matrix.lifecycle.q0.f52780a;
        ((java.util.concurrent.Executor) com.tencent.matrix.lifecycle.q0.f52783d.getValue()).execute(new com.tencent.matrix.lifecycle.owners.w());
    }

    @Override // com.tencent.matrix.lifecycle.j
    public boolean serial() {
        return true;
    }
}
