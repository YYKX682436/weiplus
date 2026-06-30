package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class q8 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f82866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.r8 f82868c;

    public q8(com.tencent.mm.plugin.appbrand.jsapi.r8 r8Var, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        this.f82868c = r8Var;
        this.f82866a = d0Var;
        this.f82867b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        java.util.Map a17;
        com.tencent.mm.plugin.appbrand.jsapi.r8 r8Var = this.f82868c;
        if (i17 != (r8Var.hashCode() & 65535)) {
            return false;
        }
        int i19 = this.f82867b;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f82866a;
        if (i18 == -1 && intent != null && (a17 = com.tencent.mm.plugin.appbrand.jsapi.e.a(intent)) != null) {
            d0Var.a(i19, r8Var.p("ok", a17));
            return true;
        }
        if (i18 == 0) {
            d0Var.a(i19, r8Var.o("cancel"));
            return true;
        }
        d0Var.a(i19, r8Var.o("fail"));
        return true;
    }
}
