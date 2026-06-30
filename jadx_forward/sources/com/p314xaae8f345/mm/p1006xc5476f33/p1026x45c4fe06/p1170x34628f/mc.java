package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public abstract class mc implements ni1.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f168418a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p8 f168419b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f168420c;

    public mc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mPageView, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p8 mPullDownWrapper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mPageView, "mPageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mPullDownWrapper, "mPullDownWrapper");
        this.f168418a = mPageView;
        this.f168419b = mPullDownWrapper;
        this.f168420c = "Luggage.MPPageViewPullDownExtensionImpl";
    }

    @Override // ni1.h
    public void a(java.lang.String style) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168418a;
        if (v5Var.mo50262x39e05d35()) {
            v5Var.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ic(this, this, style));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f168420c, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    @Override // ni1.h
    public void c(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168418a;
        if (v5Var.mo50262x39e05d35()) {
            v5Var.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fc(this, this, z17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f168420c, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    @Override // ni1.h
    public void d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AppBrandPullDown invoke entered startPullDownRefresh appId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168418a;
        sb6.append(v5Var.mo48798x74292566());
        sb6.append(" url:");
        sb6.append(v5Var.X1());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f168420c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (v5Var.mo50262x39e05d35()) {
            v5Var.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.kc(this, this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    @Override // ni1.h
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168418a;
        if (v5Var.mo50262x39e05d35()) {
            v5Var.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.lc(this, this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f168420c, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    @Override // ni1.h
    public void f(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168418a;
        if (v5Var.mo50262x39e05d35()) {
            v5Var.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ec(this, this, z17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f168420c, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    @Override // ni1.h
    public void g(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168418a;
        if (v5Var.mo50262x39e05d35()) {
            v5Var.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.jc(this, this, text));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f168420c, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    @Override // ni1.h
    public void h(ni1.g style, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168418a;
        if (v5Var.mo50262x39e05d35()) {
            v5Var.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.hc(this, this, style, i17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f168420c, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    @Override // ni1.h
    /* renamed from: requestDisallowInterceptTouchEvent */
    public void mo52194x8f093973(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168418a;
        if (v5Var.mo50262x39e05d35()) {
            v5Var.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.gc(this, this, z17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f168420c, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }
}
