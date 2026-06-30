package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class da implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 f288202d;

    public da(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8) {
        this.f288202d = activityC22325x8baa24f8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SelectContactUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "click warn to retry");
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8 = this.f288202d;
        activityC22325x8baa24f8.J1 = null;
        activityC22325x8baa24f8.N1 = null;
        activityC22325x8baa24f8.H1 = false;
        activityC22325x8baa24f8.L1 = false;
        activityC22325x8baa24f8.G1 = true;
        activityC22325x8baa24f8.K1 = true;
        activityC22325x8baa24f8.K7();
        activityC22325x8baa24f8.M1 = new java.util.ArrayList(com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.f287761a.f287734a);
        android.util.Pair i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.i(activityC22325x8baa24f8, "msginfo@fakeuser", true, "msginfo@fakeuser");
        activityC22325x8baa24f8.I1 = i17;
        if (((java.lang.Boolean) i17.second).booleanValue()) {
            activityC22325x8baa24f8.O7();
        } else {
            activityC22325x8baa24f8.f288072b2.mo48813x58998cd();
        }
        a14.a.a().f82122h++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "click warn to retry, msgId:%s direct:%s", java.lang.Long.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) activityC22325x8baa24f8.I1.first).f231013d), activityC22325x8baa24f8.I1.second);
        yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
