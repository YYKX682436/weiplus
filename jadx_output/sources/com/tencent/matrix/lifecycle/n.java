package com.tencent.matrix.lifecycle;

/* loaded from: classes7.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.n f52704d = new com.tencent.matrix.lifecycle.n();

    public n() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String task = (java.lang.String) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        kotlin.jvm.internal.o.g(task, "task");
        oj.j.b("Matrix.Lifecycle.Thread", "heavy task(cost " + longValue + "ms):" + task, new java.lang.Object[0]);
        return jz5.f0.f302826a;
    }
}
