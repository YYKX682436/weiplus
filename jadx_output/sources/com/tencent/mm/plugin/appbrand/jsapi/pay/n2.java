package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public class n2 implements com.tencent.mm.plugin.appbrand.jsapi.pay.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f82639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.o2 f82641c;

    public n2(com.tencent.mm.plugin.appbrand.jsapi.pay.o2 o2Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f82641c = o2Var;
        this.f82639a = c0Var;
        this.f82640b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.pay.h
    public void a(int i17, int i18, java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.appbrand.jsapi.pay.o2 o2Var = this.f82641c;
        int i19 = this.f82640b;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f82639a;
        if (i17 == 1) {
            c0Var.a(i19, o2Var.o("ok"));
            return;
        }
        if (i17 != 2) {
            c0Var.a(i19, o2Var.o("cancel"));
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            c0Var.a(i19, o2Var.o("fail"));
        } else {
            c0Var.a(i19, o2Var.o(java.lang.String.format("fail %s", str)));
        }
    }
}
