package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.StatementUpdate */
/* loaded from: classes12.dex */
public class C27048xc9bff6f8 extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f {
    public C27048xc9bff6f8() {
        this.f57826xaf4e2c54 = m108828x40030c70();
    }

    /* renamed from: configColumns */
    private static native void m108815x19b8de3b(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    /* renamed from: configColumnsToBindParameters */
    private static native void m108816xa2230dbd(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    /* renamed from: configColumnsToValues */
    private static native void m108817x3c166d8(long j17, int i17, long[] jArr, java.lang.String[] strArr, int[] iArr, long[] jArr2, double[] dArr, java.lang.String[] strArr2);

    /* renamed from: configCondition */
    private static native void m108818xdb8e93f9(long j17, long j18);

    /* renamed from: configConflictAction */
    private static native void m108819xa848648a(long j17, int i17);

    /* renamed from: configLimitCount */
    private static native void m108820x63f1e6f6(long j17, int i17, long j18);

    /* renamed from: configLimitRange */
    private static native void m108821x64becf24(long j17, int i17, long j18, int i18, long j19);

    /* renamed from: configOffset */
    private static native void m108822x448da75(long j17, int i17, long j18);

    /* renamed from: configOrders */
    private static native void m108823x4f0d8c7(long j17, long[] jArr);

    /* renamed from: configRecursive */
    private static native void m108824x54618b10(long j17);

    /* renamed from: configTable */
    private static native void m108825x6781ac(long j17, int i17, long j18, java.lang.String str);

    /* renamed from: configToValue */
    private static native void m108826x9bc3ae14(long j17, int i17, long j18, double d17, java.lang.String str);

    /* renamed from: configWith */
    private static native void m108827x31913728(long j17, long[] jArr);

    /* renamed from: createCppObj */
    private static native long m108828x40030c70();

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 45;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108830x6234bbb(long j17, long j18) {
        m108821x64becf24(this.f57826xaf4e2c54, 3, j17, 3, j18);
        return this;
    }

    /* renamed from: offset */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108835xc3376493(long j17) {
        m108822x448da75(this.f57826xaf4e2c54, 3, j17);
        return this;
    }

    /* renamed from: orAbort */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108837xb61e5b0d() {
        m108819xa848648a(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27002xa158bcc8.Abort.ordinal());
        return this;
    }

    /* renamed from: orFail */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108838xc3d1afa1() {
        m108819xa848648a(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27002xa158bcc8.Fail.ordinal());
        return this;
    }

    /* renamed from: orIgnore */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108839x1b99c195() {
        m108819xa848648a(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27002xa158bcc8.Ignore.ordinal());
        return this;
    }

    /* renamed from: orReplace */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108840x30676751() {
        m108819xa848648a(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27002xa158bcc8.Replace.ordinal());
        return this;
    }

    /* renamed from: orRollback */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108841xe6b0dde7() {
        m108819xa848648a(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27002xa158bcc8.Rollback.ordinal());
        return this;
    }

    /* renamed from: orderBy */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108842xb80cf445(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880... c27017x4f962880Arr) {
        if (c27017x4f962880Arr != null && c27017x4f962880Arr.length != 0) {
            long[] jArr = new long[c27017x4f962880Arr.length];
            for (int i17 = 0; i17 < c27017x4f962880Arr.length; i17++) {
                jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27017x4f962880Arr[i17]);
            }
            m108823x4f0d8c7(this.f57826xaf4e2c54, jArr);
        }
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 set(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76... c26997x78a3bf76Arr) {
        if (c26997x78a3bf76Arr.length == 0) {
            return this;
        }
        long[] jArr = new long[c26997x78a3bf76Arr.length];
        for (int i17 = 0; i17 < c26997x78a3bf76Arr.length; i17++) {
            jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c26997x78a3bf76Arr[i17]);
        }
        m108815x19b8de3b(this.f57826xaf4e2c54, 7, jArr, null);
        return this;
    }

    /* renamed from: setColumnsToBindParameters */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108843x7022909d(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76... c26997x78a3bf76Arr) {
        if (c26997x78a3bf76Arr.length == 0) {
            return this;
        }
        long[] jArr = new long[c26997x78a3bf76Arr.length];
        for (int i17 = 0; i17 < c26997x78a3bf76Arr.length; i17++) {
            jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c26997x78a3bf76Arr[i17]);
        }
        m108816xa2230dbd(this.f57826xaf4e2c54, 7, jArr, null);
        return this;
    }

    /* renamed from: setColumnsToValues */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108845x8361c9b8(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76[] c26997x78a3bf76Arr, java.lang.Object[] objArr) {
        if (c26997x78a3bf76Arr.length != 0 && objArr.length != 0) {
            long[] jArr = new long[c26997x78a3bf76Arr.length];
            for (int i17 = 0; i17 < c26997x78a3bf76Arr.length; i17++) {
                jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c26997x78a3bf76Arr[i17]);
            }
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27014x6f094e26 c27014x6f094e26 = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27014x6f094e26(objArr);
            m108817x3c166d8(this.f57826xaf4e2c54, 7, jArr, null, c27014x6f094e26.f58553x69b5879, c27014x6f094e26.f58551xdc5582be, c27014x6f094e26.f58550x42702453, c27014x6f094e26.f58552x8e1d893);
        }
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 to(boolean z17) {
        m108826x9bc3ae14(this.f57826xaf4e2c54, 2, z17 ? 1L : 0L, 0.0d, null);
        return this;
    }

    /* renamed from: update */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108848xce0038c9(java.lang.String str) {
        m108825x6781ac(this.f57826xaf4e2c54, 6, 0L, str);
        return this;
    }

    /* renamed from: where */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108849x6bdbce7(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        m108818xdb8e93f9(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27003xbcd6eb8));
        return this;
    }

    /* renamed from: with */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108850x37b0c6(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27001x4d5c2b7b... c27001x4d5c2b7bArr) {
        if (c27001x4d5c2b7bArr != null && c27001x4d5c2b7bArr.length != 0) {
            long[] jArr = new long[c27001x4d5c2b7bArr.length];
            for (int i17 = 0; i17 < c27001x4d5c2b7bArr.length; i17++) {
                jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27001x4d5c2b7bArr[i17]);
            }
            m108827x31913728(this.f57826xaf4e2c54, jArr);
        }
        return this;
    }

    /* renamed from: withRecursive */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108851x792a520c(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27001x4d5c2b7b... c27001x4d5c2b7bArr) {
        if (c27001x4d5c2b7bArr != null && c27001x4d5c2b7bArr.length != 0) {
            long[] jArr = new long[c27001x4d5c2b7bArr.length];
            for (int i17 = 0; i17 < c27001x4d5c2b7bArr.length; i17++) {
                jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27001x4d5c2b7bArr[i17]);
            }
            m108827x31913728(this.f57826xaf4e2c54, jArr);
            m108824x54618b10(this.f57826xaf4e2c54);
        }
        return this;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108831x6234bbb(long j17, com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad) {
        m108821x64becf24(this.f57826xaf4e2c54, 3, j17, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad));
        return this;
    }

    /* renamed from: offset */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108836xc3376493(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad) {
        m108822x448da75(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad));
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 to(byte b17) {
        m108826x9bc3ae14(this.f57826xaf4e2c54, 3, b17, 0.0d, null);
        return this;
    }

    /* renamed from: update */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108847xce0038c9(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27019xa2e028b2 c27019xa2e028b2) {
        m108825x6781ac(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108431x78473747((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9) c27019xa2e028b2), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27019xa2e028b2), null);
        return this;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108834x6234bbb(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad, com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad2) {
        m108821x64becf24(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad2), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad2));
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 to(short s17) {
        m108826x9bc3ae14(this.f57826xaf4e2c54, 3, s17, 0.0d, null);
        return this;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108833x6234bbb(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad, long j17) {
        m108821x64becf24(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad), 3, j17);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 to(int i17) {
        m108826x9bc3ae14(this.f57826xaf4e2c54, 3, i17, 0.0d, null);
        return this;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108829x6234bbb(long j17) {
        m108820x63f1e6f6(this.f57826xaf4e2c54, 3, j17);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 to(long j17) {
        m108826x9bc3ae14(this.f57826xaf4e2c54, 3, j17, 0.0d, null);
        return this;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108832x6234bbb(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad) {
        m108820x63f1e6f6(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad));
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 set(java.lang.String... strArr) {
        if (strArr.length == 0) {
            return this;
        }
        m108815x19b8de3b(this.f57826xaf4e2c54, 6, null, strArr);
        return this;
    }

    /* renamed from: setColumnsToBindParameters */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108844x7022909d(java.lang.String... strArr) {
        if (strArr.length == 0) {
            return this;
        }
        m108816xa2230dbd(this.f57826xaf4e2c54, 6, null, strArr);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 to(float f17) {
        m108826x9bc3ae14(this.f57826xaf4e2c54, 5, 0L, f17, null);
        return this;
    }

    /* renamed from: setColumnsToValues */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108846x8361c9b8(java.lang.String[] strArr, java.lang.Object[] objArr) {
        if (strArr.length != 0 && objArr.length != 0) {
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27014x6f094e26 c27014x6f094e26 = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27014x6f094e26(objArr);
            m108817x3c166d8(this.f57826xaf4e2c54, 6, null, strArr, c27014x6f094e26.f58553x69b5879, c27014x6f094e26.f58551xdc5582be, c27014x6f094e26.f58550x42702453, c27014x6f094e26.f58552x8e1d893);
        }
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 to(double d17) {
        m108826x9bc3ae14(this.f57826xaf4e2c54, 5, 0L, d17, null);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 to(java.lang.String str) {
        if (str != null) {
            m108826x9bc3ae14(this.f57826xaf4e2c54, 6, 0L, 0.0d, str);
        } else {
            m108826x9bc3ae14(this.f57826xaf4e2c54, 1, 0L, 0.0d, null);
        }
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 to(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad) {
        m108826x9bc3ae14(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad), 0.0d, null);
        return this;
    }
}
