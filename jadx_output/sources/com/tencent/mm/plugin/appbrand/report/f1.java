package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.j1 f87842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f87843e;

    public f1(com.tencent.mm.plugin.appbrand.report.j1 j1Var, int i17) {
        this.f87842d = j1Var;
        this.f87843e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.tencent.mm.plugin.appbrand.report.j1.wi(this.f87842d, this.f87843e).k();
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
    }
}
