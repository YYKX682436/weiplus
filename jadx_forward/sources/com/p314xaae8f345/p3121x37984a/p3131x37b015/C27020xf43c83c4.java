package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.RaiseFunction */
/* loaded from: classes12.dex */
public class C27020xf43c83c4 extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9 implements com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad, com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27022x3ee6b492 {
    public C27020xf43c83c4() {
        this.f57826xaf4e2c54 = m108511x40030c70();
    }

    /* renamed from: createCppObj */
    private static native long m108511x40030c70();

    /* renamed from: setAction */
    private static native void m108512x37bd538(long j17, int i17, java.lang.String str);

    /* renamed from: abort */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27020xf43c83c4 m108513x5852330(java.lang.String str) {
        m108512x37bd538(this.f57826xaf4e2c54, 2, str);
        return this;
    }

    /* renamed from: fail */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27020xf43c83c4 m108514x2fd71e(java.lang.String str) {
        m108512x37bd538(this.f57826xaf4e2c54, 3, str);
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 15;
    }

    /* renamed from: ignore */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27020xf43c83c4 m108515xb90bfdd2() {
        m108512x37bd538(this.f57826xaf4e2c54, 0, null);
        return this;
    }

    /* renamed from: rollback */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27020xf43c83c4 m108516xf084fee4(java.lang.String str) {
        m108512x37bd538(this.f57826xaf4e2c54, 1, str);
        return this;
    }
}
