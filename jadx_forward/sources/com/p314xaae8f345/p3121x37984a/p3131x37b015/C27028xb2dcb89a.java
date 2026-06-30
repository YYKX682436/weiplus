package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.StatementBegin */
/* loaded from: classes12.dex */
public class C27028xb2dcb89a extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f {

    /* renamed from: com.tencent.wcdb.winq.StatementBegin$TransactionType */
    /* loaded from: classes3.dex */
    public static class TransactionType {

        /* renamed from: Deferred */
        static final int f58653x2a786bff = 0;

        /* renamed from: Exclusive */
        static final int f58654xdbf9de7e = 2;

        /* renamed from: Immediate */
        static final int f58655xba76d791 = 1;
    }

    public C27028xb2dcb89a() {
        this.f57826xaf4e2c54 = m108557x40030c70(0);
    }

    /* renamed from: beginDeferred */
    public static com.p314xaae8f345.p3121x37984a.p3131x37b015.C27028xb2dcb89a m108554x51422ba8() {
        return new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27028xb2dcb89a(0);
    }

    /* renamed from: beginExclusive */
    public static com.p314xaae8f345.p3121x37984a.p3131x37b015.C27028xb2dcb89a m108555x8e6813f5() {
        return new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27028xb2dcb89a(2);
    }

    /* renamed from: beginImmediate */
    public static com.p314xaae8f345.p3121x37984a.p3131x37b015.C27028xb2dcb89a m108556x6ce50d08() {
        return new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27028xb2dcb89a(1);
    }

    /* renamed from: createCppObj */
    private static native long m108557x40030c70(int i17);

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 35;
    }

    public C27028xb2dcb89a(int i17) {
        this.f57826xaf4e2c54 = m108557x40030c70(i17);
    }
}
