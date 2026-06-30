package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.QualifiedTable */
/* loaded from: classes12.dex */
public class C27019xa2e028b2 extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9 {
    public C27019xa2e028b2(java.lang.String str) {
        this.f57826xaf4e2c54 = m108505x40030c70(str);
    }

    /* renamed from: alias */
    private static native void m108504x5899650(long j17, java.lang.String str);

    /* renamed from: createCppObj */
    private static native long m108505x40030c70(java.lang.String str);

    /* renamed from: indexed */
    private static native void m108506x73d448f1(long j17, java.lang.String str);

    /* renamed from: notIndexed */
    private static native void m108507x2a4ff29e(long j17);

    /* renamed from: schema */
    private static native void m108508xc9e135a1(long j17, int i17, long j18, java.lang.String str);

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27019xa2e028b2 as(java.lang.String str) {
        m108504x5899650(this.f57826xaf4e2c54, str);
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 21;
    }

    /* renamed from: indexed */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27019xa2e028b2 m108509x73d448f1(java.lang.String str) {
        m108506x73d448f1(this.f57826xaf4e2c54, str);
        return this;
    }

    /* renamed from: notIndexed */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27019xa2e028b2 m108510x2a4ff29e() {
        m108507x2a4ff29e(this.f57826xaf4e2c54);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27019xa2e028b2 of(java.lang.String str) {
        m108508xc9e135a1(this.f57826xaf4e2c54, 6, 0L, str);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27019xa2e028b2 of(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27023x934621c1 c27023x934621c1) {
        m108508xc9e135a1(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108431x78473747((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9) c27023x934621c1), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27023x934621c1), null);
        return this;
    }
}
