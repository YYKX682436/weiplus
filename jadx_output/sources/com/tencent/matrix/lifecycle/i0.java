package com.tencent.matrix.lifecycle;

/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f52699a;

    /* renamed from: b, reason: collision with root package name */
    public final long f52700b;

    public i0(java.lang.String task, long j17) {
        kotlin.jvm.internal.o.g(task, "task");
        this.f52699a = task;
        this.f52700b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.matrix.lifecycle.i0)) {
            return false;
        }
        com.tencent.matrix.lifecycle.i0 i0Var = (com.tencent.matrix.lifecycle.i0) obj;
        return kotlin.jvm.internal.o.b(this.f52699a, i0Var.f52699a) && this.f52700b == i0Var.f52700b;
    }

    public int hashCode() {
        java.lang.String str = this.f52699a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j17 = this.f52700b;
        return (hashCode * 31) + ((int) (j17 ^ (j17 >>> 32)));
    }

    public java.lang.String toString() {
        return "TaskInfo(task=" + this.f52699a + ", time=" + this.f52700b + ")";
    }
}
