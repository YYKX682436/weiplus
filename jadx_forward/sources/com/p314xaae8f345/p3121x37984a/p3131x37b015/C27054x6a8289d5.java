package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.WindowDef */
/* loaded from: classes12.dex */
public class C27054x6a8289d5 extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9 {
    public C27054x6a8289d5() {
        this.f57826xaf4e2c54 = m108908x40030c70();
    }

    /* renamed from: configFrameSpec */
    private static native void m108905x2f62bda6(long j17, long j18);

    /* renamed from: configOrders */
    private static native void m108906x4f0d8c7(long j17, long[] jArr);

    /* renamed from: configPartitions */
    private static native void m108907xd028ffab(long j17, int[] iArr, long[] jArr, double[] dArr, java.lang.String[] strArr);

    /* renamed from: createCppObj */
    private static native long m108908x40030c70();

    /* renamed from: frameSpec */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27054x6a8289d5 m108909x207d96c8(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27007x97efb6a8 c27007x97efb6a8) {
        m108905x2f62bda6(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27007x97efb6a8));
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 16;
    }

    /* renamed from: orderBy */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27054x6a8289d5 m108910xb80cf445(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880... c27017x4f962880Arr) {
        if (c27017x4f962880Arr != null && c27017x4f962880Arr.length != 0) {
            long[] jArr = new long[c27017x4f962880Arr.length];
            for (int i17 = 0; i17 < c27017x4f962880Arr.length; i17++) {
                jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27017x4f962880Arr[i17]);
            }
            m108906x4f0d8c7(this.f57826xaf4e2c54, jArr);
        }
        return this;
    }

    /* renamed from: partitionBy */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27054x6a8289d5 m108912x4ac008e1(java.lang.String... strArr) {
        if (strArr != null && strArr.length != 0) {
            int[] iArr = new int[strArr.length];
            java.util.Arrays.fill(iArr, 6);
            m108907xd028ffab(this.f57826xaf4e2c54, iArr, null, null, strArr);
        }
        return this;
    }

    /* renamed from: partitionBy */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27054x6a8289d5 m108911x4ac008e1(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad... interfaceC27004x81a79aadArr) {
        if (interfaceC27004x81a79aadArr != null && interfaceC27004x81a79aadArr.length != 0) {
            int[] iArr = new int[interfaceC27004x81a79aadArr.length];
            long[] jArr = new long[interfaceC27004x81a79aadArr.length];
            for (int i17 = 0; i17 < interfaceC27004x81a79aadArr.length; i17++) {
                iArr[i17] = com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aadArr[i17]);
                jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aadArr[i17]);
            }
            m108907xd028ffab(this.f57826xaf4e2c54, iArr, jArr, null, null);
        }
        return this;
    }
}
