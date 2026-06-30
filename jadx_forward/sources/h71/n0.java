package h71;

/* loaded from: classes14.dex */
public class n0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11395xb9d37a9a f360937d;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11395xb9d37a9a activityC11395xb9d37a9a) {
        this.f360937d = activityC11395xb9d37a9a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        r61.e1 e1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11395xb9d37a9a activityC11395xb9d37a9a = this.f360937d;
        java.lang.String trim = activityC11395xb9d37a9a.f154767e.getText().toString().trim();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
            db5.e1.i(activityC11395xb9d37a9a, com.p314xaae8f345.mm.R.C30867xcad56011.ahp, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            return true;
        }
        activityC11395xb9d37a9a.mo48674x36654fab();
        activityC11395xb9d37a9a.f154774o = e71.j.a(activityC11395xb9d37a9a);
        java.lang.String str = android.os.Build.MANUFACTURER + "-" + wo.w0.m();
        activityC11395xb9d37a9a.getClass();
        if (activityC11395xb9d37a9a.f154777r) {
            e1Var = new r61.e1(activityC11395xb9d37a9a.f154772m, 11, trim, 0, "", activityC11395xb9d37a9a.f154774o, str);
        } else {
            java.lang.String str2 = activityC11395xb9d37a9a.f154772m;
            java.lang.String str3 = activityC11395xb9d37a9a.f154773n;
            java.lang.String str4 = activityC11395xb9d37a9a.f154774o;
            h11.e eVar = new h11.e(str2, 11, trim, 0, "", str3);
            r45.di diVar = ((o45.eh) eVar.f359604d.mo47979x2d63726f()).f424455a;
            diVar.f454023o = str4;
            diVar.f454024p = str;
            e1Var = eVar;
        }
        gm0.j1.d().g(e1Var);
        activityC11395xb9d37a9a.f154776q = db5.e1.Q(activityC11395xb9d37a9a, activityC11395xb9d37a9a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC11395xb9d37a9a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ahe), true, true, new h71.m0(this, e1Var));
        return true;
    }
}
