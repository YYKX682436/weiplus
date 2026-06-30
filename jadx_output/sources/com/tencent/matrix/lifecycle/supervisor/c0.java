package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.supervisor.c0 f52824d = new com.tencent.matrix.lifecycle.supervisor.c0();

    public c0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Matrix.ProcessSupervisor_");
        com.tencent.matrix.lifecycle.supervisor.d0.f52834k.getClass();
        if (oj.m.c(com.tencent.matrix.lifecycle.supervisor.d0.f52826c)) {
            str = "Main";
        } else {
            java.lang.String b17 = oj.m.b(com.tencent.matrix.lifecycle.supervisor.d0.f52826c);
            kotlin.jvm.internal.o.f(b17, "MatrixUtil.getProcessName(application)");
            java.lang.Object[] array = r26.n0.f0(b17, new java.lang.String[]{":"}, false, 0, 6, null).toArray(new java.lang.String[0]);
            if (array == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            java.lang.String[] strArr = (java.lang.String[]) array;
            str = strArr.length > 1 ? strArr[1] : com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
        sb6.append(str);
        return sb6.toString();
    }
}
