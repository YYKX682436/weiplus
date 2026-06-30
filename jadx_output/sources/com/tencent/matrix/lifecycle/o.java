package com.tencent.matrix.lifecycle;

/* loaded from: classes7.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.o f52705d = new com.tencent.matrix.lifecycle.o();

    public o() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String thread = (java.lang.String) obj;
        java.lang.String stacktrace = (java.lang.String) obj2;
        long longValue = ((java.lang.Number) obj3).longValue();
        kotlin.jvm.internal.o.g(thread, "thread");
        kotlin.jvm.internal.o.g(stacktrace, "stacktrace");
        oj.j.b("Matrix.Lifecycle.Thread", "thread: " + thread + ", cost: " + longValue + ", " + stacktrace, new java.lang.Object[0]);
        return jz5.f0.f302826a;
    }
}
