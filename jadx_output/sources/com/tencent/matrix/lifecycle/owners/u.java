package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class u extends com.tencent.matrix.lifecycle.owners.l0 {
    public u(com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner processStagedBackgroundOwner, java.lang.String str, long j17, int i17) {
        super(str, j17, i17);
    }

    @Override // com.tencent.matrix.lifecycle.owners.l0
    public boolean a() {
        if (com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.active()) {
            boolean d17 = com.tencent.matrix.lifecycle.owners.f0.d();
            oj.j.c("Matrix.background.Staged", "hasRunningAppTask? " + d17, new java.lang.Object[0]);
            if (d17 || com.tencent.matrix.lifecycle.owners.ProcessUICreatedStateOwner.INSTANCE.active()) {
                oj.j.c("Matrix.background.Staged", "turn ON", new java.lang.Object[0]);
                com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner.INSTANCE.turnOn();
                return true;
            }
        }
        oj.j.c("Matrix.background.Staged", "turn off", new java.lang.Object[0]);
        com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner.INSTANCE.turnOff();
        return false;
    }
}
