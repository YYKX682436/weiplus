package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.StatementDropView */
/* loaded from: classes12.dex */
public class C27040xf101bca3 extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f {
    public C27040xf101bca3() {
        this.f57826xaf4e2c54 = m108700x40030c70();
    }

    /* renamed from: configIfExist */
    private static native void m108697x459e5e38(long j17);

    /* renamed from: configSchema */
    private static native void m108698xaf2ab83(long j17, int i17, long j18, java.lang.String str);

    /* renamed from: configView */
    private static native void m108699x3190c107(long j17, java.lang.String str);

    /* renamed from: createCppObj */
    private static native long m108700x40030c70();

    /* renamed from: dropView */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27040xf101bca3 m108701xe638ce34(java.lang.String str) {
        m108699x3190c107(this.f57826xaf4e2c54, str);
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 52;
    }

    /* renamed from: ifExist */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27040xf101bca3 m108702x648117da() {
        m108697x459e5e38(this.f57826xaf4e2c54);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27040xf101bca3 of(java.lang.String str) {
        m108698xaf2ab83(this.f57826xaf4e2c54, 6, 0L, str);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27040xf101bca3 of(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27023x934621c1 c27023x934621c1) {
        m108698xaf2ab83(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108431x78473747((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9) c27023x934621c1), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27023x934621c1), null);
        return this;
    }
}
