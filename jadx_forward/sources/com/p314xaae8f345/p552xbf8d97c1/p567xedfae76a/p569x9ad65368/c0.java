package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.c0 f134357d = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.c0();

    public c0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Matrix.ProcessSupervisor_");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.getClass();
        if (oj.m.c(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134359c)) {
            str = "Main";
        } else {
            java.lang.String b17 = oj.m.b(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134359c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "MatrixUtil.getProcessName(application)");
            java.lang.Object[] array = r26.n0.f0(b17, new java.lang.String[]{":"}, false, 0, 6, null).toArray(new java.lang.String[0]);
            if (array == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            java.lang.String[] strArr = (java.lang.String[]) array;
            str = strArr.length > 1 ? strArr[1] : com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
        sb6.append(str);
        return sb6.toString();
    }
}
