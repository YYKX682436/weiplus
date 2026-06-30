package com.tencent.matrix.lifecycle;

/* loaded from: classes12.dex */
public final class z implements com.tencent.matrix.lifecycle.j {
    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        oj.j.c(com.tencent.matrix.lifecycle.f0.f52695c.a(), "ON_PROCESS_EXIT_STAGED_BACKGROUND", new java.lang.Object[0]);
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        oj.j.c(com.tencent.matrix.lifecycle.f0.f52695c.a(), "ON_PROCESS_ENTER_STAGED_BACKGROUND", new java.lang.Object[0]);
    }

    @Override // com.tencent.matrix.lifecycle.j
    public boolean serial() {
        return true;
    }
}
