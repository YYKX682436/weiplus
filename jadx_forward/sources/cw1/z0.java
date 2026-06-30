package cw1;

/* loaded from: classes4.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db f305062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f305063e;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db, int i17) {
        this.f305062d = activityC13108x43db50db;
        this.f305063e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$ItemViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        view.setEnabled(false);
        ku5.u0 u0Var = ku5.t0.f394148d;
        cw1.w0 w0Var = new cw1.w0(view);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(w0Var, 200L, false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this.f305062d, 1, true);
        k0Var.r(this.f305062d.getString(this.f305063e == -1 ? com.p314xaae8f345.mm.R.C30867xcad56011.n8g : com.p314xaae8f345.mm.R.C30867xcad56011.n8f), 17, i65.a.b(this.f305062d, 14), null);
        k0Var.f293405n = cw1.x0.f305017d;
        k0Var.f293414s = new cw1.y0(this.f305062d, this.f305063e);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$ItemViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
