package au3;

/* loaded from: classes10.dex */
public final class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f95639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ au3.l f95640e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f95641f;

    public i(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, au3.l lVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f95639d = c0Var;
        this.f95640e = lVar;
        this.f95641f = k0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        au3.l lVar = this.f95640e;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f95639d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f95641f;
        if (itemId == 0) {
            c0Var.f391645d = false;
            lVar.c(true);
            nu3.i.f421751a.j(1L);
            k0Var.u();
            return;
        }
        if (itemId == 1) {
            c0Var.f391645d = false;
            lVar.f();
            nu3.i.f421751a.j(2L);
            k0Var.u();
            return;
        }
        if (itemId != 2) {
            k0Var.u();
            return;
        }
        c0Var.f391645d = false;
        lVar.e();
        nu3.i.f421751a.j(4L);
        k0Var.u();
    }
}
