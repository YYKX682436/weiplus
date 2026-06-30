package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.StatementCreateVirtualTable */
/* loaded from: classes12.dex */
public class C27034xac81264e extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f {
    public C27034xac81264e() {
        this.f57826xaf4e2c54 = m108647x40030c70();
    }

    /* renamed from: configArguments */
    private static native void m108642x9591a034(long j17, java.lang.String[] strArr);

    /* renamed from: configIfNotExist */
    private static native void m108643x73895503(long j17);

    /* renamed from: configModule */
    private static native void m108644x15d1c4e(long j17, java.lang.String str);

    /* renamed from: configSchema */
    private static native void m108645xaf2ab83(long j17, int i17, long j18, java.lang.String str);

    /* renamed from: configTable */
    private static native void m108646x6781ac(long j17, java.lang.String str);

    /* renamed from: createCppObj */
    private static native long m108647x40030c70();

    /* renamed from: arguments */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27034xac81264e m108648x86ac7956(java.lang.String... strArr) {
        m108642x9591a034(this.f57826xaf4e2c54, strArr);
        return this;
    }

    /* renamed from: createVirtualTable */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27034xac81264e m108649x4e60369f(java.lang.String str) {
        m108646x6781ac(this.f57826xaf4e2c54, str);
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 47;
    }

    /* renamed from: ifNotExist */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27034xac81264e m108650xa5c9a021() {
        m108643x73895503(this.f57826xaf4e2c54);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27034xac81264e of(java.lang.String str) {
        m108645xaf2ab83(this.f57826xaf4e2c54, 6, 0L, str);
        return this;
    }

    /* renamed from: usingModule */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27034xac81264e m108651xea8bc10(java.lang.String str) {
        m108644x15d1c4e(this.f57826xaf4e2c54, str);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27034xac81264e of(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27023x934621c1 c27023x934621c1) {
        m108645xaf2ab83(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108431x78473747((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9) c27023x934621c1), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27023x934621c1), null);
        return this;
    }
}
