package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class y implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2 f178196d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2 activityC13155x6eea6ae2) {
        this.f178196d = activityC13155x6eea6ae2;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        ix1.c cVar;
        r45.gp0 gp0Var;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2 activityC13155x6eea6ae2 = this.f178196d;
        if (itemId == 0) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2.f178010x;
            activityC13155x6eea6ae2.f178017m = activityC13155x6eea6ae2.T6();
            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
            jd5.a aVar = new jd5.a();
            aVar.p(activityC13155x6eea6ae2.f178017m);
            n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
            n13.r a17 = n13.r.a(1001);
            a17.f415653d.f415672a = 9;
            ((dk5.b0) b0Var).Bi(activityC13155x6eea6ae2, aVar, a17);
            return;
        }
        if (itemId == 1) {
            activityC13155x6eea6ae2.getClass();
            return;
        }
        if (itemId == 2) {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2.f178010x;
            activityC13155x6eea6ae2.getClass();
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            java.lang.String T6 = activityC13155x6eea6ae2.T6();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13155x6eea6ae2.mo55332x76847179();
            ((ub0.r) oVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.a(T6, mo55332x76847179, null);
            return;
        }
        if (itemId == 4) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContextTranslate.k(activityC13155x6eea6ae2.mo55332x76847179(), null)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85 c6631xd817ea85 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85();
                c6631xd817ea85.f139850e = 3L;
                c6631xd817ea85.f139851f = 5L;
                int selectedItemPosition = activityC13155x6eea6ae2.f178013f.getSelectedItemPosition();
                if (-1 != selectedItemPosition && (gp0Var = (cVar = (ix1.c) activityC13155x6eea6ae2.f178014g.getItem(selectedItemPosition)).f376857m) != null) {
                    c6631xd817ea85.q(gp0Var.f456967s);
                    c6631xd817ea85.p(cVar.f376857m.f456971u);
                }
                c6631xd817ea85.k();
                activityC13155x6eea6ae2.f178022r.a();
                return;
            }
            return;
        }
        if (itemId != 5) {
            return;
        }
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2.f178010x;
        java.lang.String T62 = activityC13155x6eea6ae2.T6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Editor.EditorImageUI", "edit image path:%s msgId:%s", T62, java.lang.Long.valueOf(activityC13155x6eea6ae2.f178016i));
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.b(T62, "");
        b17.F = 0;
        com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc41468 = new com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468((hp.a) null);
        java.util.Map map = c10402x5bc41468.f146312h;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        hashMap.put("plugin_filter", bool);
        hashMap.put("plugin_poi", bool);
        hashMap.put("plugin_tip", bool);
        hashMap.put("plugin_menu", bool);
        b17.f237210o = c10402x5bc41468;
        ut3.m.f512715a.f(activityC13155x6eea6ae2.mo55332x76847179(), 4369, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, -1, b17, 1, 2);
    }
}
