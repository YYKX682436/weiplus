package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class k0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.m0 f82619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f82620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f82621f;

    public k0(com.tencent.mm.plugin.appbrand.jsapi.pay.m0 m0Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f82619d = m0Var;
        this.f82620e = c0Var;
        this.f82621f = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        int i17 = this.f82621f;
        com.tencent.mm.plugin.appbrand.jsapi.pay.m0.C(this.f82619d, (android.os.Bundle) obj, this.f82620e, i17);
    }
}
