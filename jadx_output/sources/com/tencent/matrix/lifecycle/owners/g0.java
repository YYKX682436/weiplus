package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Long[] f52744a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Long[] f52745b;

    /* renamed from: c, reason: collision with root package name */
    public final long f52746c;

    public g0(long j17) {
        this.f52746c = j17;
        java.lang.Long[] lArr = {13L, 21L};
        this.f52744a = lArr;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(lArr, lArr.length);
        kotlin.jvm.internal.o.f(copyOf, "java.util.Arrays.copyOf(this, size)");
        this.f52745b = (java.lang.Long[]) copyOf;
    }

    public final long a() {
        long longValue = this.f52745b[0].longValue() + this.f52745b[1].longValue();
        java.lang.Long[] lArr = this.f52745b;
        lArr[0] = lArr[1];
        lArr[1] = java.lang.Long.valueOf(longValue);
        return java.lang.Math.min(longValue, this.f52746c);
    }
}
