package cj4;

/* loaded from: classes11.dex */
public final class r0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f123560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f123561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123562f;

    public r0(cj4.i1 i1Var, android.content.Context context, java.lang.String str) {
        this.f123560d = i1Var;
        this.f123561e = context;
        this.f123562f = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.content.res.Resources resources;
        android.content.res.Resources resources2;
        if (menuItem.getItemId() == com.p314xaae8f345.mm.R.id.jgi) {
            android.content.Context context = this.f123561e;
            java.lang.String string = (context == null || (resources2 = context.getResources()) == null) ? null : resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574895jv5);
            android.content.Context context2 = this.f123561e;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, string, (context2 == null || (resources = context2.getResources()) == null) ? null : resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574895jv5), false, false, null);
            cj4.i1 i1Var = this.f123560d;
            i1Var.S = Q;
            cj4.i1.s(i1Var, 5967);
            gm0.j1.d().g(new ej4.a(this.f123562f, 2));
            qj4.s.m(qj4.s.f445491a, this.f123561e, 43L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
        }
    }
}
