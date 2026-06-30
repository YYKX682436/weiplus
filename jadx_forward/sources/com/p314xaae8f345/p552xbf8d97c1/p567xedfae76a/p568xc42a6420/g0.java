package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420;

/* loaded from: classes12.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Long[] f134277a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Long[] f134278b;

    /* renamed from: c, reason: collision with root package name */
    public final long f134279c;

    public g0(long j17) {
        this.f134279c = j17;
        java.lang.Long[] lArr = {13L, 21L};
        this.f134277a = lArr;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(lArr, lArr.length);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "java.util.Arrays.copyOf(this, size)");
        this.f134278b = (java.lang.Long[]) copyOf;
    }

    public final long a() {
        long longValue = this.f134278b[0].longValue() + this.f134278b[1].longValue();
        java.lang.Long[] lArr = this.f134278b;
        lArr[0] = lArr[1];
        lArr[1] = java.lang.Long.valueOf(longValue);
        return java.lang.Math.min(longValue, this.f134279c);
    }
}
