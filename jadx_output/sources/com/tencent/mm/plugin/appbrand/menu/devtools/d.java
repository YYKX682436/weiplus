package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public final class d implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f85888d;

    public d(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f85888d = n7Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.a(1, com.tencent.mm.R.string.gmx);
        if (com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.c(this.f85888d)) {
            g4Var.a(2, com.tencent.mm.R.string.gth);
        }
    }
}
