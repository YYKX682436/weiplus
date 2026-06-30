package el2;

/* loaded from: classes3.dex */
public final class t implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f335443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z42 f335444e;

    public t(el2.i0 i0Var, r45.z42 z42Var) {
        this.f335443d = i0Var;
        this.f335444e = z42Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        el2.i0 i0Var = this.f335443d;
        if (itemId == i0Var.Z) {
            wt2.a aVar = i0Var.I;
            if (aVar != null) {
                wt2.a.x4(aVar, this.f335444e, null, 2, null);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
        }
    }
}
