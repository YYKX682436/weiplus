package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.StatementReindex */
/* loaded from: classes12.dex */
public class C27044xbd130a30 extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f {
    public C27044xbd130a30() {
        this.f57826xaf4e2c54 = m108761x40030c70();
    }

    /* renamed from: configCollation */
    private static native void m108757x7ef82667(long j17, java.lang.String str);

    /* renamed from: configIndex */
    private static native void m108758xffd26eb0(long j17, java.lang.String str);

    /* renamed from: configSchema */
    private static native void m108759xaf2ab83(long j17, int i17, long j18, java.lang.String str);

    /* renamed from: configTable */
    private static native void m108760x6781ac(long j17, java.lang.String str);

    /* renamed from: createCppObj */
    private static native long m108761x40030c70();

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 54;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27044xbd130a30 of(java.lang.String str) {
        m108759xaf2ab83(this.f57826xaf4e2c54, 6, 0L, str);
        return this;
    }

    /* renamed from: reindex */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27044xbd130a30 m108762x40db027f(java.lang.String str) {
        m108758xffd26eb0(this.f57826xaf4e2c54, str);
        return this;
    }

    /* renamed from: reindexCollation */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27044xbd130a30 m108763x305b7bca(java.lang.String str) {
        m108757x7ef82667(this.f57826xaf4e2c54, str);
        return this;
    }

    /* renamed from: reindexTable */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27044xbd130a30 m108764x573b008f(java.lang.String str) {
        m108760x6781ac(this.f57826xaf4e2c54, str);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27044xbd130a30 of(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27023x934621c1 c27023x934621c1) {
        m108759xaf2ab83(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108431x78473747((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9) c27023x934621c1), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27023x934621c1), null);
        return this;
    }
}
