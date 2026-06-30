package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class o implements com.tencent.matrix.lifecycle.j {
    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        com.tencent.matrix.lifecycle.owners.s sVar;
        com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner processExplicitBackgroundOwner = com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE;
        sVar = com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.checkTask;
        sVar.f();
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        com.tencent.matrix.lifecycle.owners.s sVar;
        com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner processExplicitBackgroundOwner = com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE;
        sVar = com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.checkTask;
        sVar.g();
        processExplicitBackgroundOwner.turnOff();
    }

    @Override // com.tencent.matrix.lifecycle.j
    public boolean serial() {
        return true;
    }
}
