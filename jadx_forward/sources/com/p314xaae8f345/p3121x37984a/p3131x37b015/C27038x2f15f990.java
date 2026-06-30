package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.StatementDropTable */
/* loaded from: classes12.dex */
public class C27038x2f15f990 extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f {
    public C27038x2f15f990() {
        this.f57826xaf4e2c54 = m108688x40030c70();
    }

    /* renamed from: configIfExist */
    private static native void m108685x459e5e38(long j17);

    /* renamed from: configSchema */
    private static native void m108686xaf2ab83(long j17, int i17, long j18, java.lang.String str);

    /* renamed from: configTableName */
    private static native void m108687x985bba57(long j17, java.lang.String str);

    /* renamed from: createCppObj */
    private static native long m108688x40030c70();

    /* renamed from: dropTable */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27038x2f15f990 m108689xe0c11a1f(java.lang.String str) {
        m108687x985bba57(this.f57826xaf4e2c54, str);
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 50;
    }

    /* renamed from: ifExist */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27038x2f15f990 m108690x648117da() {
        m108685x459e5e38(this.f57826xaf4e2c54);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27038x2f15f990 of(java.lang.String str) {
        m108686xaf2ab83(this.f57826xaf4e2c54, 6, 0L, str);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27038x2f15f990 of(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27023x934621c1 c27023x934621c1) {
        m108686xaf2ab83(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108431x78473747((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9) c27023x934621c1), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27023x934621c1), null);
        return this;
    }
}
