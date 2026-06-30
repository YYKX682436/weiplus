package ju1;

/* loaded from: classes9.dex */
public final class c0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 f383234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju1.a f383235e;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 activityC13076xc17cada1, ju1.a aVar) {
        this.f383234d = activityC13076xc17cada1;
        this.f383235e = aVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            ju1.j0 j0Var = this.f383234d.f176951o;
            if (j0Var != null) {
                j0Var.P6(this.f383235e);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
        }
    }
}
