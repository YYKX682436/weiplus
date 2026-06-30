package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a;

/* loaded from: classes12.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.r f134319d = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.r();

    public r() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String F0;
        java.lang.Object[] objArr = new java.lang.Object[1];
        android.app.Application application = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.f0.f134226a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(application);
        if (oj.m.c(application)) {
            F0 = "Main";
        } else {
            android.app.Application application2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.f0.f134226a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(application2);
            java.lang.String b17 = oj.m.b(application2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "MatrixUtil.getProcessName(application!!)");
            java.lang.Object[] array = r26.n0.f0(b17, new java.lang.String[]{":"}, false, 0, 6, null).toArray(new java.lang.String[0]);
            if (array == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            java.lang.String[] strArr = (java.lang.String[]) array;
            F0 = strArr.length > 1 ? r26.p0.F0(strArr[1], 10) : com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
        objArr[0] = F0;
        java.lang.String format = java.lang.String.format("%-10.10s", java.util.Arrays.copyOf(objArr, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "java.lang.String.format(format, *args)");
        return "Matrix.lifecycle.Logger_".concat(format);
    }
}
