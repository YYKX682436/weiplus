package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class t implements com.tencent.matrix.lifecycle.j {
    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        com.tencent.matrix.lifecycle.owners.u uVar;
        com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner processStagedBackgroundOwner = com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner.INSTANCE;
        uVar = com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner.checkTask;
        uVar.g();
        processStagedBackgroundOwner.turnOff();
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        com.tencent.matrix.lifecycle.owners.u uVar;
        com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner processStagedBackgroundOwner = com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner.INSTANCE;
        uVar = com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner.checkTask;
        uVar.f();
    }

    @Override // com.tencent.matrix.lifecycle.j
    public boolean serial() {
        return true;
    }
}
