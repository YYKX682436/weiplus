package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.Column */
/* loaded from: classes12.dex */
public class C26997x78a3bf76 extends com.p314xaae8f345.p3121x37984a.p3131x37b015.AbstractC27005xcdb37f80 implements com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27011xd000c27e, com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27022x3ee6b492 {
    public C26997x78a3bf76(java.lang.String str) {
        this.f57826xaf4e2c54 = m108061x40030c70(str, 0L);
    }

    public static com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76 all() {
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76 c26997x78a3bf76 = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76();
        c26997x78a3bf76.f57826xaf4e2c54 = m108059xcab1bc57();
        return c26997x78a3bf76;
    }

    /* renamed from: allColumn */
    private static native long m108059xcab1bc57();

    /* renamed from: configAlias */
    private static native long m108060xff60dc2e(long j17, java.lang.String str);

    /* renamed from: createCppObj */
    private static native long m108061x40030c70(java.lang.String str, long j17);

    /* renamed from: rowId */
    public static com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76 m108062x67ab495() {
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76 c26997x78a3bf76 = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76();
        c26997x78a3bf76.f57826xaf4e2c54 = m108063xe36d8c2b();
        return c26997x78a3bf76;
    }

    /* renamed from: rowidColumn */
    private static native long m108063xe36d8c2b();

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27021xf95b91f3 as(java.lang.String str) {
        return new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27021xf95b91f3(m108060xff60dc2e(this.f57826xaf4e2c54, str));
    }

    /* renamed from: asDef */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26999xf78690af m108064x58c3a73(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0 enumC27000xf95317d0) {
        return new com.p314xaae8f345.p3121x37984a.p3131x37b015.C26999xf78690af(this, enumC27000xf95317d0);
    }

    /* renamed from: copy */
    public native long m108065x2eaf75(long j17);

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 7;
    }

    /* renamed from: inTable */
    public native void m108066x72f0ada9(long j17, java.lang.String str);

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76 of(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27023x934621c1 c27023x934621c1) {
        m108067xb1a43258(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108431x78473747((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9) c27023x934621c1), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27023x934621c1), null);
        return this;
    }

    /* renamed from: ofSchema */
    public native void m108067xb1a43258(long j17, int i17, long j18, java.lang.String str);

    /* renamed from: ofSchema */
    public void m108068xb1a43258(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27023x934621c1 c27023x934621c1) {
        m108067xb1a43258(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108431x78473747((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9) c27023x934621c1), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27023x934621c1), null);
    }

    /* renamed from: order */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e enumC27016x48e972e) {
        return new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880(this).m108501x651874e(enumC27016x48e972e);
    }

    /* renamed from: table */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76 mo107911x6903bce(java.lang.String str) {
        m108066x72f0ada9(this.f57826xaf4e2c54, str);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76 of(java.lang.String str) {
        m108067xb1a43258(this.f57826xaf4e2c54, 6, 0L, str);
        return this;
    }

    /* renamed from: ofSchema */
    public void m108069xb1a43258(java.lang.String str) {
        m108067xb1a43258(this.f57826xaf4e2c54, 6, 0L, str);
    }

    public C26997x78a3bf76(java.lang.String str, long j17) {
        this.f57826xaf4e2c54 = m108061x40030c70(str, j17);
    }

    public C26997x78a3bf76() {
    }
}
