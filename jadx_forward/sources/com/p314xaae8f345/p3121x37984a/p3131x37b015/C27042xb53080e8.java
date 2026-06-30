package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.StatementInsert */
/* loaded from: classes12.dex */
public class C27042xb53080e8 extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f {
    public C27042xb53080e8() {
        this.f57826xaf4e2c54 = m108719x40030c70();
    }

    /* renamed from: configAlias */
    private static native void m108707xff60dc2e(long j17, java.lang.String str);

    /* renamed from: configColumns */
    private static native void m108708x19b8de3b(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    /* renamed from: configConflictAction */
    private static native void m108709xa848648a(long j17, int i17);

    /* renamed from: configDefaultValues */
    private static native void m108710x763572a1(long j17);

    /* renamed from: configRecursive */
    private static native void m108711x54618b10(long j17);

    /* renamed from: configSchema */
    private static native void m108712xaf2ab83(long j17, int i17, long j18, java.lang.String str);

    /* renamed from: configTableName */
    private static native void m108713x985bba57(long j17, java.lang.String str);

    /* renamed from: configUpsert */
    private static native void m108714xf188f11(long j17, long j18);

    /* renamed from: configValues */
    private static native void m108715xff71304(long j17, long j18);

    /* renamed from: configValues */
    private static native void m108716xff71304(long j17, int[] iArr, long[] jArr, double[] dArr, java.lang.String[] strArr);

    /* renamed from: configValuesWithBindParameters */
    private static native void m108717x2f5d9a91(long j17, int i17);

    /* renamed from: configWith */
    private static native void m108718x31913728(long j17, long[] jArr);

    /* renamed from: createCppObj */
    private static native long m108719x40030c70();

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8 as(java.lang.String str) {
        m108707xff60dc2e(this.f57826xaf4e2c54, str);
        return this;
    }

    /* renamed from: columns */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8 m108720x389b97dd(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76... c26997x78a3bf76Arr) {
        if (c26997x78a3bf76Arr.length == 0) {
            return this;
        }
        long[] jArr = new long[c26997x78a3bf76Arr.length];
        for (int i17 = 0; i17 < c26997x78a3bf76Arr.length; i17++) {
            jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c26997x78a3bf76Arr[i17]);
        }
        m108708x19b8de3b(this.f57826xaf4e2c54, 7, jArr, null);
        return this;
    }

    /* renamed from: defaultValues */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8 m108722x3e1aeac3() {
        m108710x763572a1(this.f57826xaf4e2c54);
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 43;
    }

    /* renamed from: insertInto */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8 m108723x399198b9(java.lang.String str) {
        m108713x985bba57(this.f57826xaf4e2c54, str);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8 of(java.lang.String str) {
        m108712xaf2ab83(this.f57826xaf4e2c54, 6, 0L, str);
        return this;
    }

    /* renamed from: orAbort */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8 m108724xb61e5b0d() {
        m108709xa848648a(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27002xa158bcc8.Abort.ordinal());
        return this;
    }

    /* renamed from: orFail */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8 m108725xc3d1afa1() {
        m108709xa848648a(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27002xa158bcc8.Fail.ordinal());
        return this;
    }

    /* renamed from: orIgnore */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8 m108726x1b99c195() {
        m108709xa848648a(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27002xa158bcc8.Ignore.ordinal());
        return this;
    }

    /* renamed from: orReplace */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8 m108727x30676751() {
        m108709xa848648a(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27002xa158bcc8.Replace.ordinal());
        return this;
    }

    /* renamed from: orRollback */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8 m108728xe6b0dde7() {
        m108709xa848648a(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27002xa158bcc8.Rollback.ordinal());
        return this;
    }

    /* renamed from: upsert */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8 m108729xce07192f(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27053x976c054f c27053x976c054f) {
        m108714xf188f11(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27053x976c054f));
        return this;
    }

    /* renamed from: values */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8 m108731xcee59d22(java.lang.Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27014x6f094e26 c27014x6f094e26 = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27014x6f094e26(objArr);
            m108716xff71304(this.f57826xaf4e2c54, c27014x6f094e26.f58553x69b5879, c27014x6f094e26.f58551xdc5582be, c27014x6f094e26.f58550x42702453, c27014x6f094e26.f58552x8e1d893);
        }
        return this;
    }

    /* renamed from: valuesWithBindParameters */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8 m108732x4175192f(int i17) {
        m108717x2f5d9a91(this.f57826xaf4e2c54, i17);
        return this;
    }

    /* renamed from: with */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8 m108733x37b0c6(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27001x4d5c2b7b... c27001x4d5c2b7bArr) {
        if (c27001x4d5c2b7bArr != null && c27001x4d5c2b7bArr.length != 0) {
            long[] jArr = new long[c27001x4d5c2b7bArr.length];
            for (int i17 = 0; i17 < c27001x4d5c2b7bArr.length; i17++) {
                jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27001x4d5c2b7bArr[i17]);
            }
            m108718x31913728(this.f57826xaf4e2c54, jArr);
        }
        return this;
    }

    /* renamed from: withRecursive */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8 m108734x792a520c(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27001x4d5c2b7b... c27001x4d5c2b7bArr) {
        if (c27001x4d5c2b7bArr != null && c27001x4d5c2b7bArr.length != 0) {
            long[] jArr = new long[c27001x4d5c2b7bArr.length];
            for (int i17 = 0; i17 < c27001x4d5c2b7bArr.length; i17++) {
                jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27001x4d5c2b7bArr[i17]);
            }
            m108718x31913728(this.f57826xaf4e2c54, jArr);
            m108711x54618b10(this.f57826xaf4e2c54);
        }
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8 of(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27023x934621c1 c27023x934621c1) {
        m108712xaf2ab83(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108431x78473747((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9) c27023x934621c1), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27023x934621c1), null);
        return this;
    }

    /* renamed from: values */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8 m108730xcee59d22(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b c27047xc5bef32b) {
        m108715xff71304(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27047xc5bef32b));
        return this;
    }

    /* renamed from: columns */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8 m108721x389b97dd(java.lang.String... strArr) {
        if (strArr.length == 0) {
            return this;
        }
        m108708x19b8de3b(this.f57826xaf4e2c54, 6, null, strArr);
        return this;
    }
}
