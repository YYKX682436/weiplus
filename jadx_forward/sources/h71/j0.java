package h71;

/* loaded from: classes14.dex */
public class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11395xb9d37a9a f360929d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11395xb9d37a9a activityC11395xb9d37a9a) {
        this.f360929d = activityC11395xb9d37a9a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/security/ui/SecurityAccountVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11395xb9d37a9a activityC11395xb9d37a9a = this.f360929d;
        activityC11395xb9d37a9a.f154771i.setVisibility(8);
        activityC11395xb9d37a9a.f154769g.setTag(60);
        activityC11395xb9d37a9a.f154775p.d();
        activityC11395xb9d37a9a.f154775p.c(1000L, 1000L);
        h11.e eVar = new h11.e(activityC11395xb9d37a9a.f154772m, 10, "", 0, "", activityC11395xb9d37a9a.f154773n);
        gm0.j1.d().g(eVar);
        activityC11395xb9d37a9a.f154776q = db5.e1.Q(activityC11395xb9d37a9a.mo55332x76847179(), activityC11395xb9d37a9a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC11395xb9d37a9a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574448i83), true, true, new h71.i0(this, eVar));
        yj0.a.h(this, "com/tencent/mm/plugin/account/security/ui/SecurityAccountVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
