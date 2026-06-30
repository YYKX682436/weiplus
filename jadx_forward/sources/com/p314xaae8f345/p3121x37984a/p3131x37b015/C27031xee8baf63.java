package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.StatementCreateTable */
/* loaded from: classes12.dex */
public class C27031xee8baf63 extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f {
    public C27031xee8baf63() {
        this.f57826xaf4e2c54 = m108582x40030c70();
    }

    /* renamed from: configAs */
    private static native void m108573xdd6bc314(long j17, long j18);

    /* renamed from: configColumn */
    private static native void m108574xf0504938(long j17, long j18);

    /* renamed from: configColumns */
    private static native void m108575x19b8de3b(long j17, long[] jArr);

    /* renamed from: configConstraints */
    private static native void m108576x8a728d94(long j17, long[] jArr);

    /* renamed from: configIfNotExist */
    private static native void m108577x73895503(long j17);

    /* renamed from: configSchema */
    private static native void m108578xaf2ab83(long j17, int i17, long j18, java.lang.String str);

    /* renamed from: configTableName */
    private static native void m108579x985bba57(long j17, java.lang.String str);

    /* renamed from: configTemp */
    private static native void m108580x318fca36(long j17);

    /* renamed from: configWithoutRowid */
    private static native void m108581xf1a108ef(long j17);

    /* renamed from: createCppObj */
    private static native long m108582x40030c70();

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27031xee8baf63 as(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b c27047xc5bef32b) {
        m108573xdd6bc314(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27047xc5bef32b));
        return this;
    }

    /* renamed from: constraint */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27031xee8baf63 m108584xf4a715dd(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27050xc7d5fc2b... c27050xc7d5fc2bArr) {
        if (c27050xc7d5fc2bArr != null && c27050xc7d5fc2bArr.length != 0) {
            long[] jArr = new long[c27050xc7d5fc2bArr.length];
            for (int i17 = 0; i17 < c27050xc7d5fc2bArr.length; i17++) {
                jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27050xc7d5fc2bArr[i17]);
            }
            m108576x8a728d94(this.f57826xaf4e2c54, jArr);
        }
        return this;
    }

    /* renamed from: createTable */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27031xee8baf63 m108585xe1f0e832(java.lang.String str) {
        m108579x985bba57(this.f57826xaf4e2c54, str);
        return this;
    }

    /* renamed from: createTempTable */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27031xee8baf63 m108586x1d7826be(java.lang.String str) {
        m108579x985bba57(this.f57826xaf4e2c54, str);
        m108580x318fca36(this.f57826xaf4e2c54);
        return this;
    }

    /* renamed from: define */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27031xee8baf63 m108587xb063d9bb(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26999xf78690af c26999xf78690af) {
        m108574xf0504938(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c26999xf78690af));
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 40;
    }

    /* renamed from: ifNotExist */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27031xee8baf63 m108589xa5c9a021() {
        m108577x73895503(this.f57826xaf4e2c54);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27031xee8baf63 of(java.lang.String str) {
        m108578xaf2ab83(this.f57826xaf4e2c54, 6, 0L, str);
        return this;
    }

    /* renamed from: withoutRowid */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27031xee8baf63 m108590x94fb048d() {
        m108581xf1a108ef(this.f57826xaf4e2c54);
        return this;
    }

    /* renamed from: define */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27031xee8baf63 m108588xb063d9bb(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26999xf78690af... c26999xf78690afArr) {
        if (c26999xf78690afArr.length == 0) {
            return this;
        }
        long[] jArr = new long[c26999xf78690afArr.length];
        for (int i17 = 0; i17 < c26999xf78690afArr.length; i17++) {
            jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c26999xf78690afArr[i17]);
        }
        m108575x19b8de3b(this.f57826xaf4e2c54, jArr);
        return this;
    }

    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27031xee8baf63 of(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27023x934621c1 c27023x934621c1) {
        m108578xaf2ab83(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108431x78473747((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9) c27023x934621c1), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27023x934621c1), null);
        return this;
    }

    /* renamed from: constraint */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27031xee8baf63 m108583xf4a715dd(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27050xc7d5fc2b c27050xc7d5fc2b) {
        m108576x8a728d94(this.f57826xaf4e2c54, new long[]{com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27050xc7d5fc2b)});
        return this;
    }
}
