package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.ForeignKey */
/* loaded from: classes12.dex */
public class C27006xefe7e10b extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9 {

    /* renamed from: com.tencent.wcdb.winq.ForeignKey$Action */
    /* loaded from: classes3.dex */
    public enum Action {
        SetNull,
        SetDefault,
        Cascade,
        Restrict,
        NoAction
    }

    /* renamed from: com.tencent.wcdb.winq.ForeignKey$Initially */
    /* loaded from: classes3.dex */
    public enum Initially {
        Default,
        Deferred,
        Immediate
    }

    /* renamed from: com.tencent.wcdb.winq.ForeignKey$Match */
    /* loaded from: classes3.dex */
    public enum Match {
        Simple,
        Full,
        Partial
    }

    public C27006xefe7e10b() {
        this.f57826xaf4e2c54 = m108376x3e319070();
    }

    /* renamed from: configColumns */
    private static native void m108369x19b8de3b(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    /* renamed from: configDeferrable */
    private static native void m108370xc4f9757c(long j17, int i17);

    /* renamed from: configMatch */
    private static native void m108371x51fa3(long j17, int i17);

    /* renamed from: configNotDeferrable */
    private static native void m108372xf01aa3ab(long j17, int i17);

    /* renamed from: configOnDeleteAction */
    private static native void m108373xf385c322(long j17, int i17);

    /* renamed from: configOnUpdateAction */
    private static native void m108374xe8c827c0(long j17, int i17);

    /* renamed from: configReference */
    private static native void m108375xd7c06629(long j17, java.lang.String str);

    /* renamed from: createCPPObj */
    private static native long m108376x3e319070();

    /* renamed from: column */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27006xefe7e10b m108377xaf3ed356(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76 c26997x78a3bf76) {
        m108369x19b8de3b(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108431x78473747((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9) c26997x78a3bf76), new long[]{com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c26997x78a3bf76)}, null);
        return this;
    }

    /* renamed from: columns */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27006xefe7e10b m108379x389b97dd(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76... c26997x78a3bf76Arr) {
        if (c26997x78a3bf76Arr != null && c26997x78a3bf76Arr.length != 0) {
            long[] jArr = new long[c26997x78a3bf76Arr.length];
            for (int i17 = 0; i17 < c26997x78a3bf76Arr.length; i17++) {
                jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c26997x78a3bf76Arr[i17]);
            }
            m108369x19b8de3b(this.f57826xaf4e2c54, 7, jArr, null);
        }
        return this;
    }

    /* renamed from: deferrable */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27006xefe7e10b m108381xf739c09a(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27006xefe7e10b.Initially initially) {
        m108370xc4f9757c(this.f57826xaf4e2c54, initially.ordinal());
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 13;
    }

    /* renamed from: match */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27006xefe7e10b m108382x62dd9c5(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27006xefe7e10b.Match match) {
        m108371x51fa3(this.f57826xaf4e2c54, match.ordinal() + 1);
        return this;
    }

    /* renamed from: notDeferrable */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27006xefe7e10b m108383xb8001bcd(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27006xefe7e10b.Initially initially) {
        m108372xf01aa3ab(this.f57826xaf4e2c54, initially.ordinal());
        return this;
    }

    /* renamed from: onDelete */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27006xefe7e10b m108384x3f5b5c6a(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27006xefe7e10b.Action action) {
        m108373xf385c322(this.f57826xaf4e2c54, action.ordinal());
        return this;
    }

    /* renamed from: onUpdate */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27006xefe7e10b m108385x5cf50f88(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27006xefe7e10b.Action action) {
        m108374xe8c827c0(this.f57826xaf4e2c54, action.ordinal());
        return this;
    }

    /* renamed from: references */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27006xefe7e10b m108386x528caa88(java.lang.String str) {
        m108375xd7c06629(this.f57826xaf4e2c54, str);
        return this;
    }

    /* renamed from: column */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27006xefe7e10b m108378xaf3ed356(java.lang.String str) {
        m108369x19b8de3b(this.f57826xaf4e2c54, 6, null, new java.lang.String[]{str});
        return this;
    }

    /* renamed from: columns */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27006xefe7e10b m108380x389b97dd(java.lang.String... strArr) {
        if (strArr != null && strArr.length != 0) {
            m108369x19b8de3b(this.f57826xaf4e2c54, 6, null, strArr);
        }
        return this;
    }
}
