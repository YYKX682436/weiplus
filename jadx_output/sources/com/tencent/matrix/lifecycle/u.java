package com.tencent.matrix.lifecycle;

/* loaded from: classes12.dex */
public final class u implements com.tencent.matrix.lifecycle.j {
    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        oj.j.c(com.tencent.matrix.lifecycle.f0.f52695c.a(), "ForegroundServiceLifecycleOwner: OFF", new java.lang.Object[0]);
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        oj.j.c(com.tencent.matrix.lifecycle.f0.f52695c.a(), "ForegroundServiceLifecycleOwner: ON", new java.lang.Object[0]);
    }

    @Override // com.tencent.matrix.lifecycle.j
    public boolean serial() {
        return true;
    }
}
