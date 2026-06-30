package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.j1 f87850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f87851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f87852f;

    public g1(com.tencent.mm.plugin.appbrand.report.j1 j1Var, int i17, int i18) {
        this.f87850d = j1Var;
        this.f87851e = i17;
        this.f87852f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.tencent.mm.autogen.mmdata.rpt.WeAppVideoCastStruct wi6 = com.tencent.mm.plugin.appbrand.report.j1.wi(this.f87850d, this.f87851e);
            wi6.f62883j = this.f87852f;
            wi6.k();
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
    }
}
