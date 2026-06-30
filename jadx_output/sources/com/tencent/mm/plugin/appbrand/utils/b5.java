package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class b5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f90391a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.locks.Condition f90392b;

    public b5(java.util.concurrent.locks.ReentrantLock lock, java.util.concurrent.locks.Condition condition) {
        kotlin.jvm.internal.o.g(lock, "lock");
        kotlin.jvm.internal.o.g(condition, "condition");
        this.f90391a = lock;
        this.f90392b = condition;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.utils.b5)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.utils.b5 b5Var = (com.tencent.mm.plugin.appbrand.utils.b5) obj;
        return kotlin.jvm.internal.o.b(this.f90391a, b5Var.f90391a) && kotlin.jvm.internal.o.b(this.f90392b, b5Var.f90392b);
    }

    public int hashCode() {
        return (this.f90391a.hashCode() * 31) + this.f90392b.hashCode();
    }

    public java.lang.String toString() {
        return "LockAndCondition(lock=" + this.f90391a + ", condition=" + this.f90392b + ')';
    }
}
