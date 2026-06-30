package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes7.dex */
public abstract class e2 implements com.tencent.mm.plugin.appbrand.wxassistant.r2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f92197a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.wxassistant.z2 f92198b;

    public e2(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f92197a = view;
        this.f92198b = new com.tencent.mm.plugin.appbrand.wxassistant.z2(view);
    }

    @Override // com.tencent.mm.plugin.appbrand.wxassistant.r2
    public java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<cover-view>");
        com.tencent.mm.plugin.appbrand.wxassistant.z2 z2Var = this.f92198b;
        sb6.append(z2Var != null ? z2Var.b() : "");
        sb6.append("</cover-view>");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    @Override // com.tencent.mm.plugin.appbrand.wxassistant.r2
    public java.lang.String c() {
        com.tencent.mm.plugin.appbrand.wxassistant.z2 z2Var = this.f92198b;
        return z2Var != null ? z2Var.c() : "";
    }

    @Override // com.tencent.mm.plugin.appbrand.wxassistant.r2
    public void destroy() {
        com.tencent.mm.plugin.appbrand.wxassistant.z2 z2Var = this.f92198b;
        if (z2Var != null) {
            z2Var.destroy();
        }
        this.f92198b = null;
    }

    @Override // com.tencent.mm.plugin.appbrand.wxassistant.r2
    public int id() {
        return this.f92197a.hashCode();
    }
}
