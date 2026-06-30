package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19078xd7766fa3 f260937d;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19078xd7766fa3 activityC19078xd7766fa3) {
        this.f260937d = activityC19078xd7766fa3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameInputAddressUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19078xd7766fa3.f260778t;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19078xd7766fa3 activityC19078xd7766fa3 = this.f260937d;
        activityC19078xd7766fa3.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameInputAddressUI", "go to select address ui");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("GetAddress", true);
        intent.putExtra("ShowSelectedLocation", false);
        intent.putExtra("IsRealNameVerifyScene", true);
        intent.putExtra("IsNeedShowSearchBar", true);
        java.util.ArrayList<java.lang.String> arrayList2 = activityC19078xd7766fa3.f260791s;
        if (!arrayList2.isEmpty()) {
            intent.putStringArrayListExtra("BlockedCountries", arrayList2);
        }
        j45.l.v(activityC19078xd7766fa3.mo55332x76847179(), ".ui.tools.MultiStageCitySelectUI", intent, activityC19078xd7766fa3.f260783h);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameInputAddressUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
