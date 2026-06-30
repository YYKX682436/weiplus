package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.StatementRollback */
/* loaded from: classes12.dex */
public class C27046xfb4ded53 extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f {
    public C27046xfb4ded53() {
        this.f57826xaf4e2c54 = m108769x40030c70();
    }

    /* renamed from: configSavepoint */
    private static native void m108768x1acc2111(long j17, java.lang.String str);

    /* renamed from: createCppObj */
    private static native long m108769x40030c70();

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 36;
    }

    /* renamed from: rollbackTo */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27046xfb4ded53 m108770xe340e07f(java.lang.String str) {
        m108768x1acc2111(this.f57826xaf4e2c54, str);
        return this;
    }
}
