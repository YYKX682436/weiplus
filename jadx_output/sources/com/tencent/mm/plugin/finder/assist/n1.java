package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class n1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f102396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.RoundedCornerFrameLayout f102397e;

    public n1(com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout) {
        this.f102396d = k0Var;
        this.f102397e = roundedCornerFrameLayout;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f102396d;
        k0Var.o(null);
        k0Var.o(this.f102397e);
    }
}
