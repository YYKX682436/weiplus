package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.OrderingTerm */
/* loaded from: classes12.dex */
public class C27017x4f962880 extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9 {
    public C27017x4f962880(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad) {
        this.f57826xaf4e2c54 = m108497x40030c70(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad));
    }

    /* renamed from: ascendingRowid */
    public static com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 m108495x5ee0907d() {
        return com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.m108062x67ab495().m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Asc);
    }

    /* renamed from: collate */
    private static native void m108496x38975426(long j17, java.lang.String str);

    /* renamed from: createCppObj */
    private static native long m108497x40030c70(int i17, long j17);

    /* renamed from: descendingRowid */
    public static com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 m108498xd385d() {
        return com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.m108062x67ab495().m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc);
    }

    /* renamed from: order */
    private static native void m108499x651874e(long j17, int i17);

    /* renamed from: collate */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 m108500x38975426(java.lang.String str) {
        m108496x38975426(this.f57826xaf4e2c54, str);
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 22;
    }

    /* renamed from: order */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 m108501x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e enumC27016x48e972e) {
        m108499x651874e(this.f57826xaf4e2c54, enumC27016x48e972e.ordinal() + 1);
        return this;
    }
}
