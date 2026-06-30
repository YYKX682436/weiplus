package tt2;

/* loaded from: classes3.dex */
public final class t0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f503529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f503530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f503531f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f503532g;

    public t0(tt2.e1 e1Var, ut2.s3 s3Var, int i17, cm2.m0 m0Var) {
        this.f503529d = e1Var;
        this.f503530e = s3Var;
        this.f503531f = i17;
        this.f503532g = m0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        cm2.m0 m0Var = this.f503532g;
        tt2.e1 e1Var = this.f503529d;
        if (itemId == 1) {
            tt2.e1.X(this.f503529d, this.f503530e, this.f503531f, 1, 0, 2, null, 32, null);
            tt2.e1.I(e1Var, m0Var, 1);
        } else if (menuItem.getItemId() == 2) {
            tt2.e1.X(this.f503529d, this.f503530e, this.f503531f, 1, 1, 2, null, 32, null);
            tt2.e1.I(e1Var, m0Var, 2);
        }
    }
}
