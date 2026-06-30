package p61;

/* loaded from: classes.dex */
public class d2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11364xda6e5bc5 f433766d;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11364xda6e5bc5 activityC11364xda6e5bc5) {
        this.f433766d = activityC11364xda6e5bc5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMobilePolicyUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11364xda6e5bc5 activityC11364xda6e5bc5 = this.f433766d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC11364xda6e5bc5.mo55332x76847179());
        u1Var.g(activityC11364xda6e5bc5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.agf));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.agg);
        u1Var.a(true);
        u1Var.b(new p61.c2(this));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMobilePolicyUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
