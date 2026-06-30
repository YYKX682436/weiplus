package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.j1 f87855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f87856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f87857f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87858g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87859h;

    public h1(com.tencent.mm.plugin.appbrand.report.j1 j1Var, int i17, boolean z17, java.lang.String str, java.lang.String str2) {
        this.f87855d = j1Var;
        this.f87856e = i17;
        this.f87857f = z17;
        this.f87858g = str;
        this.f87859h = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.tencent.mm.autogen.mmdata.rpt.WeAppVideoCastStruct wi6 = com.tencent.mm.plugin.appbrand.report.j1.wi(this.f87855d, this.f87856e);
            boolean z17 = this.f87857f;
            java.lang.String str = this.f87858g;
            java.lang.String str2 = this.f87859h;
            wi6.f62884k = z17 ? 1L : 0L;
            wi6.f62886m = wi6.b("ModelName", str, true);
            wi6.f62887n = wi6.b("ManuFacturer", str2, true);
            wi6.k();
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
    }
}
