package com.tencent.matrix.lifecycle;

/* loaded from: classes12.dex */
public final class a1 implements com.tencent.matrix.lifecycle.k, com.tencent.matrix.lifecycle.j {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.matrix.lifecycle.k f52687d;

    public a1(com.tencent.matrix.lifecycle.StatefulOwnerKt$reverse$1 statefulOwnerKt$reverse$1, com.tencent.matrix.lifecycle.k origin) {
        kotlin.jvm.internal.o.g(origin, "origin");
        this.f52687d = origin;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.matrix.lifecycle.a1)) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f52687d, ((com.tencent.matrix.lifecycle.a1) obj).f52687d);
    }

    public int hashCode() {
        return this.f52687d.hashCode();
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        this.f52687d.on();
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        this.f52687d.off();
    }

    @Override // com.tencent.matrix.lifecycle.j
    public boolean serial() {
        com.tencent.matrix.lifecycle.k kVar = this.f52687d;
        if (kVar instanceof com.tencent.matrix.lifecycle.j) {
            return ((com.tencent.matrix.lifecycle.j) kVar).serial();
        }
        return false;
    }

    public java.lang.String toString() {
        return this.f52687d.toString();
    }
}
