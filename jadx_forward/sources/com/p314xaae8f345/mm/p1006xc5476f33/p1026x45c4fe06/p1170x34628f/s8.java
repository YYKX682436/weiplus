package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class s8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 W;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f168616p0;

    /* renamed from: x0, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f168617x0;

    public s8(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var) {
        super(context, i3Var);
        this.f168617x0 = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void C(long j17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        iz5.a.g(null, android.text.TextUtils.isEmpty(this.f168616p0) || u46.l.c(this.f168616p0, str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSinglePage", "AppBrandPageProfile| loadUrl, appId:%s, url:%s", m52222x74292566(), str);
        this.f168616p0 = str;
        if (this.f168617x0.getAndSet(true)) {
            return;
        }
        this.W.r2(j17, str, wdVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void D() {
        this.W.getClass();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void E() {
        mo14683xad58292c();
        this.W.v2();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void F() {
        mo14683xad58292c();
        this.W.A2();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void G() {
        mo14683xad58292c();
        L();
        setVisibility(0);
        this.W.C2();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 J(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSinglePage", "recycleAppBrandPageView webviewId:%d mPageView:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.W.mo50260x9f1221c2()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.W;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.b7 b7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.b7.f167962a;
        this.W = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.b7.f167965d;
        v5Var.S2();
        return v5Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void M(long j17, java.lang.String str) {
        this.f168616p0 = str;
        this.f168617x0.set(true);
        this.W.r2(j17, str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.REWRITE_ROUTE);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    /* renamed from: getCurrentPageView */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37() {
        return this.W;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    /* renamed from: getCurrentUrl */
    public java.lang.String mo14683xad58292c() {
        return this.f168616p0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    /* renamed from: getCurrentWindowId */
    public int mo52213x2838138e() {
        return this.W.b2();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void k() {
        this.W.h();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public android.view.View p() {
        if (this.W == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 o17 = m52223xe6eebdcb().o(nf.z.a(this.f168616p0));
            this.W = o17;
            o17.W = this;
            java.lang.String mo14683xad58292c = mo14683xad58292c();
            o17.D = nf.z.a(mo14683xad58292c);
            o17.E = mo14683xad58292c;
        }
        return this.W.mo51310xc2a54588();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public void r(java.lang.String str, java.lang.String str2, int[] iArr) {
        if (z(iArr, this.W.mo50260x9f1221c2())) {
            this.W.g(str, str2);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    /* renamed from: setInitialUrl */
    public void mo14685x5050858d(java.lang.String str) {
        this.f168616p0 = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 u(int i17) {
        if (this.W.mo50260x9f1221c2() == i17) {
            return this.W;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2
    public boolean x(java.lang.String str) {
        return nf.z.a(this.f168616p0).equals(nf.z.a(str));
    }
}
