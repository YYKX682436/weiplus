package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public class g2 implements com.tencent.mm.plugin.appbrand.jsapi.pay.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f82604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.h2 f82606c;

    public g2(com.tencent.mm.plugin.appbrand.jsapi.pay.h2 h2Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f82606c = h2Var;
        this.f82604a = c0Var;
        this.f82605b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.pay.g
    public void a(java.lang.String str, java.util.Map map) {
        this.f82604a.a(this.f82605b, this.f82606c.p(str, map));
    }
}
