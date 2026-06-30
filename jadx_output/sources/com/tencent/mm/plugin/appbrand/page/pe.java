package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class pe extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.h3 f87017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f87018e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(com.tencent.mm.plugin.appbrand.page.h3 h3Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        super(1);
        this.f87017d = h3Var;
        this.f87018e = k0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            android.view.View view = this.f87017d.f86514g;
            if (view instanceof com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader) {
                com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader = (com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader) view;
                appBrandMenuHeader.f86348e.findViewById(com.tencent.mm.R.id.jgp).setPadding(appBrandMenuHeader.f86348e.getPaddingLeft(), appBrandMenuHeader.f86348e.getPaddingTop(), appBrandMenuHeader.f86348e.getPaddingRight(), 0);
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f87018e;
            if (k0Var.P.size() > 0 && k0Var.D1 == null) {
                k0Var.g();
                k0Var.b(0);
            }
        }
        return jz5.f0.f302826a;
    }
}
