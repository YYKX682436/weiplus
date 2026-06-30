package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.ResultColumn */
/* loaded from: classes12.dex */
public class C27021xf95b91f3 extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9 implements com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27022x3ee6b492 {
    public C27021xf95b91f3(long j17) {
        this.f57826xaf4e2c54 = j17;
    }

    /* renamed from: configAlias */
    private static native void m108517xff60dc2e(long j17, java.lang.String str);

    /* renamed from: createCppObj */
    private static native long m108518x40030c70(int i17, long j17, java.lang.String str);

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27021xf95b91f3 as(java.lang.String str) {
        m108517xff60dc2e(this.f57826xaf4e2c54, str);
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 29;
    }

    public C27021xf95b91f3(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27022x3ee6b492 interfaceC27022x3ee6b492) {
        this.f57826xaf4e2c54 = m108518x40030c70(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27022x3ee6b492), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27022x3ee6b492), null);
    }

    public C27021xf95b91f3(java.lang.String str) {
        this.f57826xaf4e2c54 = m108518x40030c70(6, 0L, str);
    }
}
