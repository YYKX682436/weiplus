package t22;

/* loaded from: classes10.dex */
public final class j implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t22.l f496624a;

    public j(t22.l lVar) {
        this.f496624a = lVar;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        u85.o task = (u85.o) dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1 c21046x5cf452f1 = task.f507252f;
        java.lang.String str = c21046x5cf452f1.f275227i;
        t22.l lVar = this.f496624a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, lVar.f496627b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f496629d, "onLoaderFin: " + status + ' ' + lVar.f496630e);
            if (lVar.f496630e) {
                return;
            }
            fp0.u uVar = fp0.u.f346823f;
            android.content.Context context = lVar.f496626a;
            if (status == uVar) {
                lVar.f496628c.a(false);
                lVar.f496631f.dismiss();
                o22.i.a(context);
                u85.i.f507240a.f(lVar.f496632g);
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            int i17 = c21046x5cf452f1.f275228m;
            if (i17 == 1 || i17 == 2) {
                u1Var.g(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574814jk4));
                u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f572077y3);
                u1Var.j(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
                u1Var.l(new t22.f(lVar));
                u1Var.i(new t22.g(lVar));
            } else if (i17 == 4) {
                u1Var.g(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jk6));
                u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
                u1Var.l(new t22.h(lVar));
            } else if (i17 == 5) {
                u1Var.g(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574815jk5));
                u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
                u1Var.l(new t22.i(lVar));
            }
            u1Var.q(false);
        }
    }
}
