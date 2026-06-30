package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class k5 implements com.tencent.mm.plugin.appbrand.ca {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.d5 f86830b;

    public k5(com.tencent.mm.plugin.appbrand.page.d5 d5Var, java.lang.String str) {
        this.f86830b = d5Var;
        this.f86829a = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.ca
    public void b() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ca
    public void d() {
        com.tencent.mm.plugin.appbrand.page.d5 d5Var = this.f86830b;
        if (d5Var.getRuntime() != null) {
            d5Var.O(this.f86829a);
        }
    }
}
