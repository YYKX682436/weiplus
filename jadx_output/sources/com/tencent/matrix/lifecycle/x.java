package com.tencent.matrix.lifecycle;

/* loaded from: classes12.dex */
public final class x implements com.tencent.matrix.lifecycle.j {
    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        java.lang.String a17 = com.tencent.matrix.lifecycle.f0.f52695c.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ON_PROCESS_UI_STOPPED scene: ");
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        sb6.append(com.tencent.matrix.lifecycle.owners.f0.f52735q);
        oj.j.c(a17, sb6.toString(), new java.lang.Object[0]);
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        java.lang.String a17 = com.tencent.matrix.lifecycle.f0.f52695c.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ON_PROCESS_UI_STARTED scene: ");
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        sb6.append(com.tencent.matrix.lifecycle.owners.f0.f52735q);
        oj.j.c(a17, sb6.toString(), new java.lang.Object[0]);
    }

    @Override // com.tencent.matrix.lifecycle.j
    public boolean serial() {
        return true;
    }
}
