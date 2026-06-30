package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class l0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.m0 f82624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f82625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f82626f;

    public l0(com.tencent.mm.plugin.appbrand.jsapi.pay.m0 m0Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f82624d = m0Var;
        this.f82625e = c0Var;
        this.f82626f = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        int i17 = this.f82626f;
        com.tencent.mm.plugin.appbrand.jsapi.pay.m0.C(this.f82624d, (android.os.Bundle) obj, this.f82625e, i17);
    }
}
