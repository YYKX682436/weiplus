package cb1;

/* loaded from: classes7.dex */
public final class t implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fl1.g1 f40308b;

    public t(com.tencent.mm.plugin.appbrand.page.v5 v5Var, fl1.g1 g1Var) {
        this.f40307a = v5Var;
        this.f40308b = g1Var;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        fl1.g2 dialogContainer;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40307a;
        if (v5Var == null || (dialogContainer = v5Var.getDialogContainer()) == null) {
            return;
        }
        dialogContainer.a(this.f40308b);
    }
}
