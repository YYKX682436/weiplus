package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.IndexedColumn */
/* loaded from: classes12.dex */
public class C27010x7a7eff87 extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9 implements com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27011xd000c27e {
    public C27010x7a7eff87(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27011xd000c27e interfaceC27011xd000c27e) {
        this.f57826xaf4e2c54 = m108438x40030c70(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27011xd000c27e), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27011xd000c27e), null);
    }

    /* renamed from: collate */
    private static native void m108437x38975426(long j17, java.lang.String str);

    /* renamed from: createCppObj */
    private static native long m108438x40030c70(int i17, long j17, java.lang.String str);

    /* renamed from: order */
    private static native void m108439x651874e(long j17, int i17);

    /* renamed from: collate */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27010x7a7eff87 m108440x38975426(java.lang.String str) {
        m108437x38975426(this.f57826xaf4e2c54, str);
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 18;
    }

    /* renamed from: order */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27010x7a7eff87 m108441x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e enumC27016x48e972e) {
        m108439x651874e(this.f57826xaf4e2c54, enumC27016x48e972e.ordinal() + 1);
        return this;
    }

    public C27010x7a7eff87(java.lang.String str) {
        this.f57826xaf4e2c54 = m108438x40030c70(6, 0L, str);
    }
}
