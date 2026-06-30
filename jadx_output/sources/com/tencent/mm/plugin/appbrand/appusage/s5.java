package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public final class s5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.u5 f76561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76562b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f76563c;

    public s5(com.tencent.mm.plugin.appbrand.appusage.u5 u5Var, int i17, long j17) {
        this.f76561a = u5Var;
        this.f76562b = i17;
        this.f76563c = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (this.f76561a != null && !th1.a.b(fVar) && (w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class)) != null) {
            w2Var.doNotify("batch", 3, null);
        }
        if (fVar == null) {
            return null;
        }
        int i17 = this.f76562b;
        int i18 = fVar.f70615a;
        int i19 = fVar.f70616b;
        java.lang.String str = fVar.f70617c;
        com.tencent.mm.modelbase.m1 m1Var = fVar.f70619e;
        java.lang.Object reqResp = m1Var != null ? m1Var.getReqResp() : null;
        com.tencent.mm.plugin.appbrand.appusage.x2.i(i17, i18, i19, str, reqResp instanceof com.tencent.mm.modelbase.o ? (com.tencent.mm.modelbase.o) reqResp : null, java.lang.Long.valueOf(this.f76563c));
        return fVar;
    }
}
