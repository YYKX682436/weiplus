package aa2;

/* loaded from: classes2.dex */
public final class h implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa2.j f84035d;

    public h(aa2.j jVar) {
        this.f84035d = jVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        if (menuItem.getItemId() == 10001) {
            aa2.j jVar = this.f84035d;
            r45.e21 e21Var = jVar.f84038d;
            if (e21Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityShareHandler", "closeActivity invalid eventInfo null");
                return;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1);
            if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                str = "";
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = jVar.f515691a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            db2.g2 g2Var = new db2.g2(1, java.lang.Long.valueOf(e21Var.m75942xfb822ef2(0)), str, null, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
            g2Var.t(activity, activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L);
            pq5.g l17 = g2Var.l();
            if (activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity);
            }
            pm0.v.T(l17, new aa2.c(jVar));
        }
    }
}
