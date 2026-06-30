package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo f90036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f90037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90038f;

    public b1(com.tencent.mm.plugin.appbrand.ui.recents.c1 c1Var, com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo appBrandRecentTaskInfo, int i17, java.lang.String str) {
        this.f90036d = appBrandRecentTaskInfo;
        this.f90037e = i17;
        this.f90038f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class);
        com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo appBrandRecentTaskInfo = this.f90036d;
        w2Var.D0(appBrandRecentTaskInfo.f76355w, appBrandRecentTaskInfo.A, true);
        com.tencent.mm.plugin.appbrand.report.y0.b(appBrandRecentTaskInfo, 7, this.f90037e, this.f90038f);
    }
}
