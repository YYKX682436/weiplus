package cb1;

/* loaded from: classes7.dex */
public final class k implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cb1.j0 f40261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fl1.g1 f40262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40263c;

    public k(cb1.j0 j0Var, fl1.g1 g1Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f40261a = j0Var;
        this.f40262b = g1Var;
        this.f40263c = v5Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        this.f40261a.getClass();
        km5.b b17 = km5.u.b();
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40263c;
        java.lang.String string = v5Var.getF147807d().getString(com.tencent.mm.R.string.a3p);
        fl1.g1 g1Var = this.f40262b;
        g1Var.setMessage(string);
        g1Var.setOnCancelListener(new cb1.i0(b17));
        fl1.g2 dialogContainer = v5Var.getDialogContainer();
        if (dialogContainer != null) {
            dialogContainer.c(g1Var);
        }
        return new java.lang.Object();
    }
}
