package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public class z1 implements com.tencent.mm.plugin.appbrand.jsapi.pay.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f82700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82701b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.a2 f82702c;

    public z1(com.tencent.mm.plugin.appbrand.jsapi.pay.a2 a2Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f82702c = a2Var;
        this.f82700a = c0Var;
        this.f82701b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.pay.h
    public void a(int i17, int i18, java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.appbrand.jsapi.pay.a2 a2Var = this.f82702c;
        int i19 = this.f82701b;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f82700a;
        if (i17 == 1) {
            c0Var.a(i19, a2Var.p("ok", map));
            return;
        }
        c0Var.a(i19, a2Var.p("fail:" + str, map));
    }
}
