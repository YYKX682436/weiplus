package cw1;

/* loaded from: classes3.dex */
public final class z6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da f305075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv1.g1 f305076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f305077f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f305078g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f305079h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f305080i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f305081m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f305082n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.view.View f305083o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ cw1.j7 f305084p;

    public z6(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da activityC13123x212a66da, yv1.g1 g1Var, android.view.View view, android.view.View view2, android.view.View view3, android.widget.TextView textView, android.widget.TextView textView2, int i17, android.view.View view4, cw1.j7 j7Var) {
        this.f305075d = activityC13123x212a66da;
        this.f305076e = g1Var;
        this.f305077f = view;
        this.f305078g = view2;
        this.f305079h = view3;
        this.f305080i = textView;
        this.f305081m = textView2;
        this.f305082n = i17;
        this.f305083o = view4;
        this.f305084p = j7Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(((java.lang.Boolean) ((jz5.n) this.f305075d.f177329f).mo141623x754a37bb()).booleanValue() ? 2 : 1));
        lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(this.f305075d.f177328e));
        lVarArr[2] = new jz5.l("storage_manage_sessionid", this.f305076e.f547576b);
        ((cy1.a) rVar).Hj("resource_other_remove_double_ack_btn", "view_clk", kz5.c1.k(lVarArr), 32903);
        android.view.View view = this.f305077f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f305078g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f305079h;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f305080i.setText(this.f305075d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572448ey3, 0));
        this.f305081m.setText(this.f305075d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4a, java.lang.Integer.valueOf(this.f305082n)));
        android.view.View view4 = this.f305083o;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f305075d.m78560xe21cbbf(false);
        this.f305075d.mo54448x9c8c0d33(cw1.w6.f305015d);
        this.f305075d.m78487x199f61f0(cw1.x6.f305038a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da activityC13123x212a66da = this.f305075d;
        if (activityC13123x212a66da.getF147381t()) {
            activityC13123x212a66da.m78735x28280f95().m81450x8e764904(false);
        }
        this.f305075d.f177330g = new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab();
        this.f305084p.f304584e = java.lang.System.currentTimeMillis();
        ku5.u0 u0Var = ku5.t0.f394148d;
        cw1.j7 j7Var = this.f305084p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da activityC13123x212a66da2 = this.f305075d;
        cw1.y6 y6Var = new cw1.y6(activityC13123x212a66da2);
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = activityC13123x212a66da2.f177330g;
        aw1.y yVar = new aw1.y(j7Var);
        ((ku5.t0) u0Var).a(new aw1.b0(yVar, true, yVar, c26987xeef691ab, y6Var));
    }
}
