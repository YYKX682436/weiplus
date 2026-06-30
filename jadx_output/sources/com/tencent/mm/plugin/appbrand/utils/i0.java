package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class i0 implements d85.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f90469a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90470b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f90471c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ si1.m0 f90472d;

    public i0(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, int i17, si1.m0 m0Var) {
        this.f90469a = lVar;
        this.f90470b = str;
        this.f90471c = i17;
        this.f90472d = m0Var;
    }

    @Override // d85.l0
    public final void a(d85.h0 h0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPermissionDelegateLogic", "requestPermission appid:" + this.f90469a.getAppId() + " permission:" + this.f90470b + " business:" + this.f90471c + " grantResult:" + h0Var);
        int i17 = (h0Var == null ? -1 : com.tencent.mm.plugin.appbrand.utils.h0.f90455a[h0Var.ordinal()]) == 1 ? 0 : -1;
        si1.m0 m0Var = this.f90472d;
        if (m0Var != null) {
            m0Var.a(i17);
        }
    }
}
