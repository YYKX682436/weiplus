package com.p314xaae8f345.p3121x37984a.orm;

/* renamed from: com.tencent.wcdb.orm.Binding */
/* loaded from: classes12.dex */
public class C26980x5cc54665 extends com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2 {

    /* renamed from: baseBinding */
    private long f58371x82ba2274 = 0;

    public C26980x5cc54665() {
        this.f57826xaf4e2c54 = m107887x40030c70();
    }

    /* renamed from: addColumnDef */
    private static native void m107881x77dc3d2e(long j17, long j18);

    /* renamed from: addIndex */
    private static native void m107882xb51dfcb1(long j17, java.lang.String str, boolean z17, long j18);

    /* renamed from: addTableConstraint */
    private static native void m107883xe2720d6a(long j17, long j18);

    /* renamed from: configVirtualModule */
    private static native void m107884x49e58535(long j17, java.lang.String str);

    /* renamed from: configVirtualModuleArgument */
    private static native void m107885x79d54312(long j17, java.lang.String str);

    /* renamed from: configWithoutRowId */
    private static native void m107886xf1a1050f(long j17);

    /* renamed from: createCppObj */
    private static native long m107887x40030c70();

    /* renamed from: createTable */
    private static native boolean m107888xe1f0e832(long j17, java.lang.String str, long j18);

    /* renamed from: createVirtualTable */
    private static native boolean m107889x4e60369f(long j17, java.lang.String str, long j18);

    /* renamed from: enableAutoIncrementForExistingTable */
    private static native void m107890x8ad18a97(long j17);

    /* renamed from: getBaseBinding */
    private static native long m107891x5c90693e(long j17);

    /* renamed from: addColumnDef */
    public void m107892x77dc3d2e(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26999xf78690af c26999xf78690af) {
        m107881x77dc3d2e(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c26999xf78690af));
    }

    /* renamed from: addIndex */
    public void m107893xb51dfcb1(java.lang.String str, boolean z17, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27030xedf69c67 c27030xedf69c67) {
        m107882xb51dfcb1(this.f57826xaf4e2c54, str, z17, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27030xedf69c67));
    }

    /* renamed from: addTableConstraint */
    public void m107894xe2720d6a(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27050xc7d5fc2b c27050xc7d5fc2b) {
        m107883xe2720d6a(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27050xc7d5fc2b));
    }

    /* renamed from: configVirtualModule */
    public com.p314xaae8f345.p3121x37984a.orm.C26980x5cc54665 m107895x49e58535(java.lang.String str) {
        m107884x49e58535(this.f57826xaf4e2c54, str);
        return this;
    }

    /* renamed from: configVirtualModuleArgument */
    public void m107896x79d54312(java.lang.String str) {
        m107885x79d54312(this.f57826xaf4e2c54, str);
    }

    /* renamed from: configWithoutRowId */
    public void m107897xf1a1050f() {
        m107886xf1a1050f(this.f57826xaf4e2c54);
    }

    /* renamed from: createTable */
    public boolean m107898xe1f0e832(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 c26919x80675a48) {
        return m107888xe1f0e832(this.f57826xaf4e2c54, str, c26919x80675a48.m106772x6d8946f5());
    }

    /* renamed from: createVirtualTable */
    public boolean m107899x4e60369f(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 c26919x80675a48) {
        return m107889x4e60369f(this.f57826xaf4e2c54, str, c26919x80675a48.m106772x6d8946f5());
    }

    /* renamed from: enableAutoIncrementForExistingTable */
    public void m107900x8ad18a97() {
        m107890x8ad18a97(this.f57826xaf4e2c54);
    }

    /* renamed from: getBaseBinding */
    public long m107901x5c90693e() {
        if (this.f58371x82ba2274 == 0) {
            this.f58371x82ba2274 = m107891x5c90693e(this.f57826xaf4e2c54);
        }
        return this.f58371x82ba2274;
    }
}
