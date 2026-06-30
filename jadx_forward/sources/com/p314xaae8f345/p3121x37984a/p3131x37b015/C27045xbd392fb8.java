package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.StatementRelease */
/* loaded from: classes12.dex */
public class C27045xbd392fb8 extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f {
    public C27045xbd392fb8() {
        this.f57826xaf4e2c54 = m108766x40030c70();
    }

    /* renamed from: configSavepoint */
    private static native void m108765x1acc2111(long j17, java.lang.String str);

    /* renamed from: createCppObj */
    private static native long m108766x40030c70();

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 38;
    }

    /* renamed from: release */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27045xbd392fb8 m108767x41012807(java.lang.String str) {
        m108765x1acc2111(this.f57826xaf4e2c54, str);
        return this;
    }
}
