package cw1;

/* loaded from: classes12.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db f304521d;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db) {
        this.f304521d = activityC13108x43db50db;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$initUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer[][] numArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db.f177187x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db = this.f304521d;
        if (activityC13108x43db50db.V6()) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(activityC13108x43db50db.V6() ? 2 : 1));
            lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(activityC13108x43db50db.f177195m));
            yv1.g1 g1Var = activityC13108x43db50db.f177196n;
            if (g1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("session");
                throw null;
            }
            lVarArr[2] = new jz5.l("storage_manage_sessionid", g1Var.f547576b);
            ((cy1.a) rVar).Hj("cache_remove_button", "view_clk", kz5.c1.k(lVarArr), 32903);
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.W6(activityC13108x43db50db, activityC13108x43db50db.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ni6), false, activityC13108x43db50db.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ni7), null, new cw1.h1(activityC13108x43db50db));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db.U6(activityC13108x43db50db);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$initUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
