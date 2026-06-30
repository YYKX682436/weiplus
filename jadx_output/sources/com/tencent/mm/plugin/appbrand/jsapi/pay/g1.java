package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public class g1 implements com.tencent.mm.plugin.appbrand.jsapi.pay.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f82601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.h1 f82603c;

    public g1(com.tencent.mm.plugin.appbrand.jsapi.pay.h1 h1Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f82603c = h1Var;
        this.f82601a = c0Var;
        this.f82602b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.pay.g
    public void a(java.lang.String str, java.util.Map map) {
        this.f82601a.a(this.f82602b, this.f82603c.p(str, map));
    }
}
