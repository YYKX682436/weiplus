package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class s extends com.tencent.matrix.lifecycle.owners.l0 {
    public s(com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner processExplicitBackgroundOwner, java.lang.String str, long j17) {
        super(str, j17, -1);
    }

    @Override // com.tencent.matrix.lifecycle.owners.l0
    public boolean a() {
        jz5.g b17 = jz5.h.b(com.tencent.matrix.lifecycle.owners.q.f52766d);
        jz5.g b18 = jz5.h.b(com.tencent.matrix.lifecycle.owners.p.f52765d);
        jz5.g b19 = jz5.h.b(com.tencent.matrix.lifecycle.owners.r.f52767d);
        if (((java.lang.Boolean) ((jz5.n) b17).getValue()).booleanValue()) {
            oj.j.c("Matrix.background.Explicit", "turn OFF for UI foreground", new java.lang.Object[0]);
            com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.turnOff();
            return false;
        }
        jz5.n nVar = (jz5.n) b18;
        if (!((java.lang.Boolean) nVar.getValue()).booleanValue() && !((java.lang.Boolean) ((jz5.n) b19).getValue()).booleanValue()) {
            oj.j.c("Matrix.background.Explicit", "turn ON", new java.lang.Object[0]);
            com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.turnOn();
            return false;
        }
        oj.j.c("Matrix.background.Explicit", "turn OFF: fgService=" + ((java.lang.Boolean) nVar.getValue()).booleanValue() + ", visibleView=" + ((java.lang.Boolean) ((jz5.n) b19).getValue()).booleanValue() + ", overlay=" + com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.INSTANCE.hasOverlayWindow(), new java.lang.Object[0]);
        com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.turnOff();
        return true;
    }
}
