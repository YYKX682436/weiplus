package f12;

/* loaded from: classes4.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 f340210d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79) {
        this.f340210d = activityC13254xf536ee79;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/eggspring/ui/SpringLuckyEggActivity$setupViews$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringLuckyEggActivity", "setupViews: click close");
        b12.k kVar = b12.k.f98593a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79.f178970o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79 = this.f340210d;
        uq.n nVar = (uq.n) activityC13254xf536ee79.X6().f340160q.mo3195x754a37bb();
        kVar.d(25, nVar != null ? nVar.f511706u : 0L);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC13254xf536ee79);
        u1Var.u(activityC13254xf536ee79.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bsy));
        u1Var.g(activityC13254xf536ee79.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bsx));
        u1Var.n(activityC13254xf536ee79.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bsv));
        u1Var.b(new f12.y(activityC13254xf536ee79));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/eggspring/ui/SpringLuckyEggActivity$setupViews$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
