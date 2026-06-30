package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.StatementAnalyze */
/* loaded from: classes12.dex */
public class C27026x48b364fd extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f {
    public C27026x48b364fd() {
        this.f57826xaf4e2c54 = m108542x40030c70();
    }

    /* renamed from: configIndex */
    private static native void m108538xffd26eb0(long j17, java.lang.String str);

    /* renamed from: configSchema */
    private static native void m108539xaf2ab83(long j17, int i17, long j18, java.lang.String str);

    /* renamed from: configTable */
    private static native void m108540x6781ac(long j17, java.lang.String str);

    /* renamed from: configToAnalyze */
    private static native void m108541x783ddd2f(long j17);

    /* renamed from: createCppObj */
    private static native long m108542x40030c70();

    /* renamed from: analyze */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27026x48b364fd m108543xcc7b5d4c() {
        m108541x783ddd2f(this.f57826xaf4e2c54);
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 32;
    }

    /* renamed from: index */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27026x48b364fd m108544x5fb28d2(java.lang.String str) {
        m108538xffd26eb0(this.f57826xaf4e2c54, str);
        return this;
    }

    /* renamed from: schema */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27026x48b364fd m108546xc9e135a1(java.lang.String str) {
        m108539xaf2ab83(this.f57826xaf4e2c54, 6, 0L, str);
        return this;
    }

    /* renamed from: table */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27026x48b364fd m108547x6903bce(java.lang.String str) {
        m108540x6781ac(this.f57826xaf4e2c54, str);
        return this;
    }

    /* renamed from: schema */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27026x48b364fd m108545xc9e135a1(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27023x934621c1 c27023x934621c1) {
        m108539xaf2ab83(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108431x78473747((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9) c27023x934621c1), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27023x934621c1), null);
        return this;
    }
}
