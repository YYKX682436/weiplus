package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.ColumnConstraint */
/* loaded from: classes12.dex */
public class C26998xf72455f3 extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9 {
    public C26998xf72455f3() {
        this.f57826xaf4e2c54 = m108081x22c5e526(null);
    }

    /* renamed from: configAutoIncrement */
    private static native void m108071xa7024a5e(long j17);

    /* renamed from: configCheck */
    private static native void m108072xff7b2ae6(long j17, long j18);

    /* renamed from: configCollate */
    private static native void m108073x19b49a84(long j17, java.lang.String str);

    /* renamed from: configConflictAction */
    private static native void m108074xa848648a(long j17, int i17);

    /* renamed from: configForeignKey */
    private static native void m108075x46d5b9cd(long j17, long j18);

    /* renamed from: configNotNull */
    private static native void m108076x5ffc8958(long j17);

    /* renamed from: configOrder */
    private static native void m108077x28cd2c(long j17, int i17);

    /* renamed from: configPrimaryKey */
    private static native void m108078x81c1f5df(long j17);

    /* renamed from: configUnIndex */
    private static native void m108079xce43a817(long j17);

    /* renamed from: configUnique */
    private static native void m108080xef801b3(long j17);

    /* renamed from: createCppObject */
    private static native long m108081x22c5e526(java.lang.String str);

    /* renamed from: defaultTo */
    private static native void m108082xa677549c(long j17, int i17, long j18, double d17, java.lang.String str);

    /* renamed from: autoIncrement */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3 m108083x6ee7c280() {
        m108071xa7024a5e(this.f57826xaf4e2c54);
        return this;
    }

    /* renamed from: check */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3 m108084x5a3e508(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        m108072xff7b2ae6(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27003xbcd6eb8));
        return this;
    }

    /* renamed from: collate */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3 m108085x38975426(java.lang.String str) {
        m108073x19b49a84(this.f57826xaf4e2c54, str);
        return this;
    }

    /* renamed from: conflict */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3 m108086xdd6d2bd2(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27002xa158bcc8 enumC27002xa158bcc8) {
        m108074xa848648a(this.f57826xaf4e2c54, enumC27002xa158bcc8.ordinal());
        return this;
    }

    /* renamed from: defaultTo */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3 m108095xa677549c(boolean z17) {
        m108082xa677549c(this.f57826xaf4e2c54, 2, z17 ? 1L : 0L, 0.0d, null);
        return this;
    }

    /* renamed from: foreignKey */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3 m108096x791604eb(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27006xefe7e10b c27006xefe7e10b) {
        m108075x46d5b9cd(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27006xefe7e10b));
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 10;
    }

    /* renamed from: notNull */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3 m108097x7edf42fa() {
        m108076x5ffc8958(this.f57826xaf4e2c54);
        return this;
    }

    /* renamed from: order */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3 m108098x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e enumC27016x48e972e) {
        m108077x28cd2c(this.f57826xaf4e2c54, enumC27016x48e972e.ordinal() + 1);
        return this;
    }

    /* renamed from: primaryKey */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3 m108099xb40240fd() {
        m108078x81c1f5df(this.f57826xaf4e2c54);
        return this;
    }

    /* renamed from: unIndex */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3 m108100xed2661b9() {
        m108079xce43a817(this.f57826xaf4e2c54);
        return this;
    }

    /* renamed from: unique */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3 m108101xcde68bd1() {
        m108080xef801b3(this.f57826xaf4e2c54);
        return this;
    }

    /* renamed from: defaultTo */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3 m108087xa677549c(byte b17) {
        m108082xa677549c(this.f57826xaf4e2c54, 3, b17, 0.0d, null);
        return this;
    }

    public C26998xf72455f3(java.lang.String str) {
        this.f57826xaf4e2c54 = m108081x22c5e526(str);
    }

    /* renamed from: defaultTo */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3 m108094xa677549c(short s17) {
        m108082xa677549c(this.f57826xaf4e2c54, 3, s17, 0.0d, null);
        return this;
    }

    /* renamed from: defaultTo */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3 m108090xa677549c(int i17) {
        m108082xa677549c(this.f57826xaf4e2c54, 3, i17, 0.0d, null);
        return this;
    }

    /* renamed from: defaultTo */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3 m108091xa677549c(long j17) {
        m108082xa677549c(this.f57826xaf4e2c54, 3, j17, 0.0d, null);
        return this;
    }

    /* renamed from: defaultTo */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3 m108089xa677549c(float f17) {
        m108082xa677549c(this.f57826xaf4e2c54, 5, 0L, f17, null);
        return this;
    }

    /* renamed from: defaultTo */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3 m108088xa677549c(double d17) {
        m108082xa677549c(this.f57826xaf4e2c54, 5, 0L, d17, null);
        return this;
    }

    /* renamed from: defaultTo */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3 m108093xa677549c(java.lang.String str) {
        if (str != null) {
            m108082xa677549c(this.f57826xaf4e2c54, 6, 0L, 0.0d, str);
        } else {
            m108082xa677549c(this.f57826xaf4e2c54, 1, 0L, 0.0d, null);
        }
        return this;
    }

    /* renamed from: defaultTo */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3 m108092xa677549c(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad) {
        m108082xa677549c(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad), 0.0d, null);
        return this;
    }
}
