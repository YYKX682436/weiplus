package cw1;

/* loaded from: classes3.dex */
public final class h7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da f304502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304505g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f304506h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f304507i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yv1.g1 f304508m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304509n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304510o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f304511p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304512q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304513r;

    public h7(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da activityC13123x212a66da, android.view.View view, android.view.View view2, android.view.View view3, boolean z17, long j17, yv1.g1 g1Var, android.widget.TextView textView, android.widget.TextView textView2, boolean z18, android.widget.TextView textView3, android.widget.TextView textView4) {
        this.f304502d = activityC13123x212a66da;
        this.f304503e = view;
        this.f304504f = view2;
        this.f304505g = view3;
        this.f304506h = z17;
        this.f304507i = j17;
        this.f304508m = g1Var;
        this.f304509n = textView;
        this.f304510o = textView2;
        this.f304511p = z18;
        this.f304512q = textView3;
        this.f304513r = textView4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f304502d.f177331h;
        if (k0Var != null) {
            k0Var.u();
        }
        this.f304502d.f177331h = null;
        android.view.View view = this.f304503e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$cleanCb$1$onCleanDone$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$cleanCb$1$onCleanDone$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f304504f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$cleanCb$1$onCleanDone$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$cleanCb$1$onCleanDone$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f304505g;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$cleanCb$1$onCleanDone$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$cleanCb$1$onCleanDone$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f304506h) {
            this.f304509n.setText(this.f304502d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8k));
            this.f304510o.setVisibility(8);
            this.f304513r.setVisibility(8);
        } else {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[5];
            lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(((java.lang.Boolean) ((jz5.n) this.f304502d.f177329f).mo141623x754a37bb()).booleanValue() ? 2 : 1));
            lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(this.f304502d.f177328e));
            lVarArr[2] = new jz5.l("removed_size_byte", java.lang.Long.valueOf(this.f304507i));
            lVarArr[3] = new jz5.l("cache_removed_size", java.lang.Long.valueOf(this.f304507i));
            lVarArr[4] = new jz5.l("storage_manage_sessionid", this.f304508m.f547576b);
            ((cy1.a) rVar).Ej("resource_other_remove_complete", kz5.c1.k(lVarArr), 32903);
            this.f304509n.setText(this.f304502d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d1f));
            this.f304510o.setVisibility(0);
            if (this.f304511p) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da activityC13123x212a66da = this.f304502d;
                activityC13123x212a66da.f177327d = true;
                this.f304512q.setText(activityC13123x212a66da.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b7r));
                this.f304513r.setText(this.f304502d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b7s, 5));
                this.f304513r.setVisibility(0);
                cw1.g7 g7Var = new cw1.g7(this.f304502d, this.f304513r);
                ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
                t0Var.getClass();
                t0Var.z(g7Var, 1000L, false);
            } else {
                this.f304512q.setText(this.f304502d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.apm));
                this.f304513r.setVisibility(8);
            }
        }
        this.f304502d.setResult(-1);
    }
}
