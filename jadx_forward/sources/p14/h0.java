package p14;

/* loaded from: classes11.dex */
public class h0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17368x689ea64e f432758d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17368x689ea64e activityC17368x689ea64e) {
        this.f432758d = activityC17368x689ea64e;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p957x53236a1b.e1 e1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17368x689ea64e activityC17368x689ea64e = this.f432758d;
        activityC17368x689ea64e.f241652h = true;
        int i17 = activityC17368x689ea64e.f241650f;
        if (i17 == 2 || i17 == 1) {
            de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
            java.lang.String obj = activityC17368x689ea64e.f241649e.getText().toString();
            int i18 = activityC17368x689ea64e.f241650f;
            boolean z17 = i18 == 1;
            boolean z18 = i18 == 2;
            ((ce0.e) jVar).getClass();
            e1Var = new com.p314xaae8f345.mm.p957x53236a1b.e1(obj, z17, false, z18, true);
        } else {
            if (i17 != 4) {
                db5.e1.i(activityC17368x689ea64e.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.j3t, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
                return true;
            }
            long r17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) gm0.j1.u().c().l(65831, null));
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(65830, null);
            if (str == null) {
                str = "";
            }
            if (java.lang.System.currentTimeMillis() - r17 > 86400000 && str.length() > 0) {
                activityC17368x689ea64e.f241651g = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l();
                activityC17368x689ea64e.f241651g.g(str);
                new v61.q0(activityC17368x689ea64e.f241651g, new p14.f0(this)).c();
            }
            de0.j jVar2 = (de0.j) i95.n0.c(de0.j.class);
            java.lang.String obj2 = activityC17368x689ea64e.f241649e.getText().toString();
            ((ce0.e) jVar2).getClass();
            e1Var = new com.p314xaae8f345.mm.p957x53236a1b.e1(obj2);
        }
        gm0.j1.d().g(e1Var);
        activityC17368x689ea64e.f241648d = db5.e1.Q(activityC17368x689ea64e.mo55332x76847179(), activityC17368x689ea64e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC17368x689ea64e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), true, true, new p14.g0(this, e1Var));
        return true;
    }
}
