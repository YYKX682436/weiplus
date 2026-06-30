package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.TableConstraint */
/* loaded from: classes12.dex */
public class C27050xc7d5fc2b extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9 {
    public C27050xc7d5fc2b() {
        this.f57826xaf4e2c54 = m108862x40030c70(null);
    }

    /* renamed from: configCheckExpression */
    private static native void m108856x7854b21e(long j17, long j18);

    /* renamed from: configConfliction */
    private static native void m108857x8d96ea54(long j17, int i17);

    /* renamed from: configForeignKey */
    private static native void m108858x46d5b9cd(long j17, int i17, long[] jArr, java.lang.String[] strArr, long j18);

    /* renamed from: configIndexedColumn */
    private static native void m108859x82fa5785(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    /* renamed from: configPrimaryKey */
    private static native void m108860x81c1f5df(long j17);

    /* renamed from: configUnique */
    private static native void m108861xef801b3(long j17);

    /* renamed from: createCppObj */
    private static native long m108862x40030c70(java.lang.String str);

    /* renamed from: check */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27050xc7d5fc2b m108863x5a3e508(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        m108856x7854b21e(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27003xbcd6eb8));
        return this;
    }

    /* renamed from: foreignKey */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27050xc7d5fc2b m108865x791604eb(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27006xefe7e10b c27006xefe7e10b, java.lang.String... strArr) {
        m108858x46d5b9cd(this.f57826xaf4e2c54, 6, null, strArr, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27006xefe7e10b));
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 19;
    }

    /* renamed from: indexedBy */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27050xc7d5fc2b m108866xcfe5d928(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27011xd000c27e... interfaceC27011xd000c27eArr) {
        if (interfaceC27011xd000c27eArr.length == 0) {
            return this;
        }
        long[] jArr = new long[interfaceC27011xd000c27eArr.length];
        for (int i17 = 0; i17 < interfaceC27011xd000c27eArr.length; i17++) {
            jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27011xd000c27eArr[i17]);
        }
        m108859x82fa5785(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27011xd000c27eArr[0]), jArr, null);
        return this;
    }

    /* renamed from: onConflict */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27050xc7d5fc2b m108868x82874ed1(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27002xa158bcc8 enumC27002xa158bcc8) {
        m108857x8d96ea54(this.f57826xaf4e2c54, enumC27002xa158bcc8.ordinal());
        return this;
    }

    /* renamed from: primaryKey */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27050xc7d5fc2b m108869xb40240fd() {
        m108860x81c1f5df(this.f57826xaf4e2c54);
        return this;
    }

    /* renamed from: unique */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27050xc7d5fc2b m108870xcde68bd1() {
        m108861xef801b3(this.f57826xaf4e2c54);
        return this;
    }

    public C27050xc7d5fc2b(java.lang.String str) {
        this.f57826xaf4e2c54 = m108862x40030c70(str);
    }

    /* renamed from: foreignKey */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27050xc7d5fc2b m108864x791604eb(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27006xefe7e10b c27006xefe7e10b, com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76... c26997x78a3bf76Arr) {
        long[] jArr = new long[c26997x78a3bf76Arr.length];
        for (int i17 = 0; i17 < c26997x78a3bf76Arr.length; i17++) {
            jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c26997x78a3bf76Arr[i17]);
        }
        m108858x46d5b9cd(this.f57826xaf4e2c54, 7, jArr, null, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27006xefe7e10b));
        return this;
    }

    /* renamed from: indexedBy */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27050xc7d5fc2b m108867xcfe5d928(java.lang.String... strArr) {
        m108859x82fa5785(this.f57826xaf4e2c54, 6, null, strArr);
        return this;
    }
}
