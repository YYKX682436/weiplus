package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.Upsert */
/* loaded from: classes12.dex */
public class C27053x976c054f extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9 {
    public C27053x976c054f() {
        this.f57826xaf4e2c54 = m108898x40030c70();
    }

    /* renamed from: configDoNothing */
    private static native void m108892xe66677a0(long j17);

    /* renamed from: configDoUpdate */
    private static native void m108893x5db9e296(long j17);

    /* renamed from: configIndexedColumn */
    private static native void m108894x82fa5785(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    /* renamed from: configSetColumns */
    private static native void m108895xb799d5fd(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    /* renamed from: configToValue */
    private static native void m108896x9bc3ae14(long j17, int i17, long j18, double d17, java.lang.String str);

    /* renamed from: configWhere */
    private static native void m108897x9502c5(long j17, long j18);

    /* renamed from: createCppObj */
    private static native long m108898x40030c70();

    /* renamed from: doNoThing */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27053x976c054f m108899xd5be60a2() {
        m108892xe66677a0(this.f57826xaf4e2c54);
        return this;
    }

    /* renamed from: doUpdate */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27053x976c054f m108900x1b2e5d34() {
        m108893x5db9e296(this.f57826xaf4e2c54);
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 23;
    }

    /* renamed from: indexedBy */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27053x976c054f m108902xcfe5d928(java.lang.String... strArr) {
        m108894x82fa5785(this.f57826xaf4e2c54, 6, null, strArr);
        return this;
    }

    /* renamed from: onConflict */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27053x976c054f m108903x82874ed1() {
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27053x976c054f set(java.lang.String... strArr) {
        m108895xb799d5fd(this.f57826xaf4e2c54, 6, null, strArr);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27053x976c054f to(boolean z17) {
        m108896x9bc3ae14(this.f57826xaf4e2c54, 2, z17 ? 1L : 0L, 0.0d, null);
        return this;
    }

    /* renamed from: where */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27053x976c054f m108904x6bdbce7(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        m108897x9502c5(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27003xbcd6eb8));
        return this;
    }

    /* renamed from: indexedBy */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27053x976c054f m108901xcfe5d928(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27011xd000c27e... interfaceC27011xd000c27eArr) {
        if (interfaceC27011xd000c27eArr.length == 0) {
            return this;
        }
        long[] jArr = new long[interfaceC27011xd000c27eArr.length];
        for (int i17 = 0; i17 < interfaceC27011xd000c27eArr.length; i17++) {
            jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27011xd000c27eArr[i17]);
        }
        m108894x82fa5785(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27011xd000c27eArr[0]), jArr, null);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27053x976c054f set(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76... c26997x78a3bf76Arr) {
        if (c26997x78a3bf76Arr.length == 0) {
            return this;
        }
        long[] jArr = new long[c26997x78a3bf76Arr.length];
        for (int i17 = 0; i17 < c26997x78a3bf76Arr.length; i17++) {
            jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c26997x78a3bf76Arr[i17]);
        }
        m108895xb799d5fd(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108431x78473747((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9) c26997x78a3bf76Arr[0]), jArr, null);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27053x976c054f to(byte b17) {
        m108896x9bc3ae14(this.f57826xaf4e2c54, 3, b17, 0.0d, null);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27053x976c054f to(short s17) {
        m108896x9bc3ae14(this.f57826xaf4e2c54, 3, s17, 0.0d, null);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27053x976c054f to(int i17) {
        m108896x9bc3ae14(this.f57826xaf4e2c54, 3, i17, 0.0d, null);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27053x976c054f to(long j17) {
        m108896x9bc3ae14(this.f57826xaf4e2c54, 3, j17, 0.0d, null);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27053x976c054f to(float f17) {
        m108896x9bc3ae14(this.f57826xaf4e2c54, 5, 0L, f17, null);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27053x976c054f to(double d17) {
        m108896x9bc3ae14(this.f57826xaf4e2c54, 5, 0L, d17, null);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27053x976c054f to(java.lang.String str) {
        if (str != null) {
            m108896x9bc3ae14(this.f57826xaf4e2c54, 6, 0L, 0.0d, str);
        } else {
            m108896x9bc3ae14(this.f57826xaf4e2c54, 1, 0L, 0.0d, null);
        }
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27053x976c054f to(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad) {
        m108896x9bc3ae14(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad), 0.0d, null);
        return this;
    }
}
