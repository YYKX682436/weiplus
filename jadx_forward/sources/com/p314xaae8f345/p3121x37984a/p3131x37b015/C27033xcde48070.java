package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.StatementCreateView */
/* loaded from: classes12.dex */
public class C27033xcde48070 extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f {
    public C27033xcde48070() {
        this.f57826xaf4e2c54 = m108636x40030c70();
    }

    /* renamed from: configAs */
    private static native void m108630xdd6bc314(long j17, long j18);

    /* renamed from: configColumns */
    private static native void m108631x19b8de3b(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    /* renamed from: configIfNotExist */
    private static native void m108632x73895503(long j17);

    /* renamed from: configSchema */
    private static native void m108633xaf2ab83(long j17, int i17, long j18, java.lang.String str);

    /* renamed from: configTemp */
    private static native void m108634x318fca36(long j17);

    /* renamed from: configView */
    private static native void m108635x3190c107(long j17, java.lang.String str);

    /* renamed from: createCppObj */
    private static native long m108636x40030c70();

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27033xcde48070 as(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b c27047xc5bef32b) {
        m108630xdd6bc314(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27047xc5bef32b));
        return this;
    }

    /* renamed from: createTempView */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27033xcde48070 m108637xe82e31b5(java.lang.String str) {
        m108635x3190c107(this.f57826xaf4e2c54, str);
        m108634x318fca36(this.f57826xaf4e2c54);
        return this;
    }

    /* renamed from: createView */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27033xcde48070 m108638x519d71c1(java.lang.String str) {
        m108635x3190c107(this.f57826xaf4e2c54, str);
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 46;
    }

    /* renamed from: ifNotExist */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27033xcde48070 m108639xa5c9a021() {
        m108632x73895503(this.f57826xaf4e2c54);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27033xcde48070 of(java.lang.String str) {
        m108633xaf2ab83(this.f57826xaf4e2c54, 6, 0L, str);
        return this;
    }

    /* renamed from: withColumns */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27033xcde48070 m108640x66bf3437(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76... c26997x78a3bf76Arr) {
        if (c26997x78a3bf76Arr.length == 0) {
            return this;
        }
        long[] jArr = new long[c26997x78a3bf76Arr.length];
        for (int i17 = 0; i17 < c26997x78a3bf76Arr.length; i17++) {
            jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c26997x78a3bf76Arr[i17]);
        }
        m108631x19b8de3b(this.f57826xaf4e2c54, 7, jArr, null);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27033xcde48070 of(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27023x934621c1 c27023x934621c1) {
        m108633xaf2ab83(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108431x78473747((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9) c27023x934621c1), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27023x934621c1), null);
        return this;
    }

    /* renamed from: withColumns */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27033xcde48070 m108641x66bf3437(java.lang.String... strArr) {
        if (strArr.length == 0) {
            return this;
        }
        m108631x19b8de3b(this.f57826xaf4e2c54, 6, null, strArr);
        return this;
    }
}
