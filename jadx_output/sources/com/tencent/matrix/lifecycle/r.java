package com.tencent.matrix.lifecycle;

/* loaded from: classes12.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.r f52786d = new com.tencent.matrix.lifecycle.r();

    public r() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String F0;
        java.lang.Object[] objArr = new java.lang.Object[1];
        android.app.Application application = com.tencent.matrix.lifecycle.f0.f52693a;
        kotlin.jvm.internal.o.d(application);
        if (oj.m.c(application)) {
            F0 = "Main";
        } else {
            android.app.Application application2 = com.tencent.matrix.lifecycle.f0.f52693a;
            kotlin.jvm.internal.o.d(application2);
            java.lang.String b17 = oj.m.b(application2);
            kotlin.jvm.internal.o.f(b17, "MatrixUtil.getProcessName(application!!)");
            java.lang.Object[] array = r26.n0.f0(b17, new java.lang.String[]{":"}, false, 0, 6, null).toArray(new java.lang.String[0]);
            if (array == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            java.lang.String[] strArr = (java.lang.String[]) array;
            F0 = strArr.length > 1 ? r26.p0.F0(strArr[1], 10) : com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
        objArr[0] = F0;
        java.lang.String format = java.lang.String.format("%-10.10s", java.util.Arrays.copyOf(objArr, 1));
        kotlin.jvm.internal.o.f(format, "java.lang.String.format(format, *args)");
        return "Matrix.lifecycle.Logger_".concat(format);
    }
}
