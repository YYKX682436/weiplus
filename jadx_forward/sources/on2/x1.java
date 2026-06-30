package on2;

/* loaded from: classes3.dex */
public final class x1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.a2 f428599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f428600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f428601f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f428602g;

    public x1(on2.a2 a2Var, r45.dz1 dz1Var, android.content.Context context, int i17) {
        this.f428599d = a2Var;
        this.f428600e = dz1Var;
        this.f428601f = context;
        this.f428602g = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        rl5.r m152021xdab03575;
        if (menuItem.getItemId() == 1000) {
            on2.a2 a2Var = this.f428599d;
            m152021xdab03575 = a2Var.m152021xdab03575();
            m152021xdab03575.a();
            if (this.f428600e.m75939xb282bd08(7) != 1) {
                p3325xe03a0797.p3326xc267989b.l.d(a2Var.m58106x7520e49e(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new on2.w1(this.f428599d, this.f428601f, this.f428600e, this.f428602g, null), 2, null);
            } else {
                android.content.Context context = this.f428601f;
                db5.t7.g(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lij));
            }
        }
    }
}
