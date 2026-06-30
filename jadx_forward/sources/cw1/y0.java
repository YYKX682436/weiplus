package cw1;

/* loaded from: classes12.dex */
public final class y0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db f305040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f305041e;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db, int i17) {
        this.f305040d = activityC13108x43db50db;
        this.f305041e = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.Class cls = i17 == 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13116xef072354.class : com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5.class;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db = this.f305040d;
        android.content.Intent intent = new android.content.Intent(activityC13108x43db50db, (java.lang.Class<?>) cls);
        lk5.s.e(intent, true);
        android.content.Intent putExtra = intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 3);
        int i18 = this.f305041e;
        android.content.Intent putExtra2 = putExtra.putExtra("isSent", i18 == -1);
        java.lang.String str = activityC13108x43db50db.f177197o;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cleanSessionID");
            throw null;
        }
        android.content.Intent putExtra3 = putExtra2.putExtra("cleanSessionID", str).putExtra("totalSize", i18 == -1 ? activityC13108x43db50db.f177199q : activityC13108x43db50db.f177200r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra3, "putExtra(...)");
        int i19 = i18 == -1 ? 1 : 0;
        putExtra3.putExtra("select", activityC13108x43db50db.f177203u[i19]);
        activityC13108x43db50db.startActivityForResult(putExtra3, i19);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        yv1.g1 g1Var = activityC13108x43db50db.f177196n;
        if (g1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("session");
            throw null;
        }
        lVarArr[0] = new jz5.l("storage_manage_sessionid", g1Var.f547576b);
        java.lang.String str2 = activityC13108x43db50db.f177197o;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cleanSessionID");
            throw null;
        }
        lVarArr[1] = new jz5.l("cache_remove_sessionid", str2);
        lVarArr[2] = new jz5.l("visual_view_type", java.lang.Integer.valueOf(i17 == 0 ? 2 : 1));
        lVarArr[3] = new jz5.l("cache_visual_type", java.lang.Integer.valueOf(i18 != -1 ? 2 : 1));
        ((cy1.a) rVar).Hj("visual_view_selection", "view_clk", kz5.c1.k(lVarArr), 32903);
    }
}
