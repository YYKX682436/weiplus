package kf3;

/* loaded from: classes5.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f388874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf3.k0 f388875e;

    public f0(kf3.k0 k0Var, java.lang.String str) {
        this.f388875e = k0Var;
        this.f388874d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnSendAgainClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if3.y n07 = if3.k0.Ai().n0(this.f388874d);
        java.lang.String e17 = n07.e();
        kf3.k0 k0Var = this.f388875e;
        java.lang.String t17 = kf3.k0.t(k0Var, e17);
        int c17 = if3.k0.Bi().c();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t17)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(k0Var.f388914t);
            u1Var.u(k0Var.f388914t.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m6e));
            u1Var.n(k0Var.f388914t.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            u1Var.l(new kf3.d0(this));
            u1Var.q(false);
        } else if (k0Var.f388917w > c17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(k0Var.f388914t);
            u1Var2.u(k0Var.f388914t.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m69, java.lang.Integer.valueOf(c17)));
            u1Var2.n(k0Var.f388914t.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            u1Var2.l(new kf3.e0(this));
            u1Var2.q(false);
        } else {
            android.content.Intent intent = new android.content.Intent(k0Var.f388914t, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679.class);
            intent.putExtra("mass_send_contact_list", kf3.k0.t(k0Var, n07.e()));
            intent.putExtra("mass_send_again", true);
            k0Var.f388914t.startActivityForResult(intent, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnSendAgainClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
