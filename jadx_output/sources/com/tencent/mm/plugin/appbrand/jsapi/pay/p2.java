package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public class p2 implements com.tencent.mm.plugin.appbrand.jsapi.pay.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f82650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.q2 f82652c;

    public p2(com.tencent.mm.plugin.appbrand.jsapi.pay.q2 q2Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f82652c = q2Var;
        this.f82650a = c0Var;
        this.f82651b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.pay.j
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.jsapi.pay.q2 q2Var = this.f82652c;
        int i17 = this.f82651b;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f82650a;
        if (!z17) {
            c0Var.a(i17, q2Var.o("fail"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("token", str);
        c0Var.a(i17, q2Var.p("ok", hashMap));
    }
}
