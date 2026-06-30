package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public class f0 implements com.tencent.mm.plugin.appbrand.jsapi.pay.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f82598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82599b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.g0 f82600c;

    public f0(com.tencent.mm.plugin.appbrand.jsapi.pay.g0 g0Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f82600c = g0Var;
        this.f82598a = c0Var;
        this.f82599b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.pay.g
    public void a(java.lang.String str, java.util.Map map) {
        this.f82598a.a(this.f82599b, this.f82600c.p(str, map));
    }
}
