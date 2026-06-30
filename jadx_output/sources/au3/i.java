package au3;

/* loaded from: classes10.dex */
public final class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f14106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ au3.l f14107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f14108f;

    public i(kotlin.jvm.internal.c0 c0Var, au3.l lVar, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f14106d = c0Var;
        this.f14107e = lVar;
        this.f14108f = k0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        au3.l lVar = this.f14107e;
        kotlin.jvm.internal.c0 c0Var = this.f14106d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f14108f;
        if (itemId == 0) {
            c0Var.f310112d = false;
            lVar.c(true);
            nu3.i.f340218a.j(1L);
            k0Var.u();
            return;
        }
        if (itemId == 1) {
            c0Var.f310112d = false;
            lVar.f();
            nu3.i.f340218a.j(2L);
            k0Var.u();
            return;
        }
        if (itemId != 2) {
            k0Var.u();
            return;
        }
        c0Var.f310112d = false;
        lVar.e();
        nu3.i.f340218a.j(4L);
        k0Var.u();
    }
}
