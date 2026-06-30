package com.tencent.matrix.lifecycle;

/* loaded from: classes12.dex */
public final class b1 implements com.tencent.matrix.lifecycle.k, com.tencent.matrix.lifecycle.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.StatefulOwnerKt$shadow$1 f52688d;

    public b1(com.tencent.matrix.lifecycle.StatefulOwnerKt$shadow$1 statefulOwnerKt$shadow$1) {
        this.f52688d = statefulOwnerKt$shadow$1;
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        this.f52688d.turnOff();
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        this.f52688d.turnOn();
    }

    @Override // com.tencent.matrix.lifecycle.j
    public boolean serial() {
        return this.f52688d.$serial;
    }
}
