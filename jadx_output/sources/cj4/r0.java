package cj4;

/* loaded from: classes11.dex */
public final class r0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f42027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f42028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42029f;

    public r0(cj4.i1 i1Var, android.content.Context context, java.lang.String str) {
        this.f42027d = i1Var;
        this.f42028e = context;
        this.f42029f = str;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.res.Resources resources;
        android.content.res.Resources resources2;
        if (menuItem.getItemId() == com.tencent.mm.R.id.jgi) {
            android.content.Context context = this.f42028e;
            java.lang.String string = (context == null || (resources2 = context.getResources()) == null) ? null : resources2.getString(com.tencent.mm.R.string.f493362jv5);
            android.content.Context context2 = this.f42028e;
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, string, (context2 == null || (resources = context2.getResources()) == null) ? null : resources.getString(com.tencent.mm.R.string.f493362jv5), false, false, null);
            cj4.i1 i1Var = this.f42027d;
            i1Var.S = Q;
            cj4.i1.s(i1Var, 5967);
            gm0.j1.d().g(new ej4.a(this.f42029f, 2));
            qj4.s.m(qj4.s.f363958a, this.f42028e, 43L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
        }
    }
}
