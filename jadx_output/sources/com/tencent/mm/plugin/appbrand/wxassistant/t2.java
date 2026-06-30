package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes7.dex */
public final class t2 implements com.tencent.mm.plugin.appbrand.wxassistant.r2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.k0 f92310a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.wxassistant.z2 f92311b;

    public t2(com.tencent.mm.ui.widget.dialog.k0 bottomSheet) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        this.f92310a = bottomSheet;
        android.view.View view = bottomSheet.S;
        kotlin.jvm.internal.o.d(view);
        this.f92311b = new com.tencent.mm.plugin.appbrand.wxassistant.z2(view);
    }

    @Override // com.tencent.mm.plugin.appbrand.wxassistant.r2
    public java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<action-sheet>");
        com.tencent.mm.plugin.appbrand.wxassistant.z2 z2Var = this.f92311b;
        sb6.append(z2Var != null ? z2Var.b() : "");
        sb6.append("</action-sheet>");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    @Override // com.tencent.mm.plugin.appbrand.wxassistant.r2
    public java.lang.String c() {
        com.tencent.mm.plugin.appbrand.wxassistant.z2 z2Var = this.f92311b;
        return z2Var != null ? z2Var.c() : "";
    }

    @Override // com.tencent.mm.plugin.appbrand.wxassistant.r2
    public void destroy() {
        com.tencent.mm.plugin.appbrand.wxassistant.z2 z2Var = this.f92311b;
        if (z2Var != null) {
            z2Var.destroy();
        }
        this.f92311b = null;
    }

    @Override // com.tencent.mm.plugin.appbrand.wxassistant.r2
    public int id() {
        return this.f92310a.hashCode();
    }
}
