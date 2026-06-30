package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.StatementCreateIndex */
/* loaded from: classes12.dex */
public class C27030xedf69c67 extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f {
    public C27030xedf69c67() {
        this.f57826xaf4e2c54 = m108565x40030c70();
    }

    /* renamed from: configCondition */
    private static native void m108559xdb8e93f9(long j17, long j18);

    /* renamed from: configIfNotExist */
    private static native void m108560x73895503(long j17);

    /* renamed from: configIndexedColumns */
    private static native void m108561xdc50998e(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    /* renamed from: configSchema */
    private static native void m108562xaf2ab83(long j17, int i17, long j18, java.lang.String str);

    /* renamed from: configTableName */
    private static native void m108563x985bba57(long j17, java.lang.String str);

    /* renamed from: configUnique */
    private static native void m108564xef801b3(long j17);

    /* renamed from: createCppObj */
    private static native long m108565x40030c70();

    /* renamed from: createIndex */
    private static native void m108566xe15bd536(long j17, java.lang.String str);

    /* renamed from: createIndex */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27030xedf69c67 m108567xe15bd536(java.lang.String str) {
        m108566xe15bd536(this.f57826xaf4e2c54, str);
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 39;
    }

    /* renamed from: ifNotExist */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27030xedf69c67 m108568xa5c9a021() {
        m108560x73895503(this.f57826xaf4e2c54);
        return this;
    }

    /* renamed from: indexedBy */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27030xedf69c67 m108569xcfe5d928(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27011xd000c27e... interfaceC27011xd000c27eArr) {
        if (interfaceC27011xd000c27eArr.length == 0) {
            return this;
        }
        long[] jArr = new long[interfaceC27011xd000c27eArr.length];
        for (int i17 = 0; i17 < interfaceC27011xd000c27eArr.length; i17++) {
            jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27011xd000c27eArr[i17]);
        }
        m108561xdc50998e(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27011xd000c27eArr[0]), jArr, null);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27030xedf69c67 of(java.lang.String str) {
        m108562xaf2ab83(this.f57826xaf4e2c54, 6, 0L, str);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27030xedf69c67 on(java.lang.String str) {
        m108563x985bba57(this.f57826xaf4e2c54, str);
        return this;
    }

    /* renamed from: unique */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27030xedf69c67 m108571xcde68bd1() {
        m108564xef801b3(this.f57826xaf4e2c54);
        return this;
    }

    /* renamed from: where */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27030xedf69c67 m108572x6bdbce7(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        m108559xdb8e93f9(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27003xbcd6eb8));
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27030xedf69c67 of(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27023x934621c1 c27023x934621c1) {
        m108562xaf2ab83(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108431x78473747((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9) c27023x934621c1), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27023x934621c1), null);
        return this;
    }

    /* renamed from: indexedBy */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27030xedf69c67 m108570xcfe5d928(java.lang.String... strArr) {
        m108561xdc50998e(this.f57826xaf4e2c54, 6, null, strArr);
        return this;
    }
}
