package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class i2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 f260925d;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 activityC19082x760c9ba5) {
        this.f260925d = activityC19082x760c9ba5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 activityC19082x760c9ba5 = this.f260925d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5.U6(activityC19082x760c9ba5);
        activityC19082x760c9ba5.mo48632xd46dd964();
        if (activityC19082x760c9ba5.f260832z) {
            activityC19082x760c9ba5.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "go to detail address ui");
            android.content.Intent intent = new android.content.Intent(activityC19082x760c9ba5.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19078xd7766fa3.class);
            intent.putExtra("key_countrycode", (java.lang.String) activityC19082x760c9ba5.A.f260997i.mo3195x754a37bb());
            intent.putExtra("key_provincecode", (java.lang.String) activityC19082x760c9ba5.A.f260998m.mo3195x754a37bb());
            intent.putExtra("key_citycode", (java.lang.String) activityC19082x760c9ba5.A.f260999n.mo3195x754a37bb());
            intent.putExtra("key_zone", (java.lang.String) activityC19082x760c9ba5.A.f261000o.mo3195x754a37bb());
            intent.putExtra("key_address", (java.lang.String) activityC19082x760c9ba5.A.f261001p.mo3195x754a37bb());
            intent.putExtra("key_exclude_country", activityC19082x760c9ba5.E);
            activityC19082x760c9ba5.startActivityForResult(intent, 4);
        } else {
            activityC19082x760c9ba5.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "go to select address ui");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("GetAddress", true);
            intent2.putExtra("ShowSelectedLocation", false);
            intent2.putExtra("IsRealNameVerifyScene", true);
            intent2.putExtra("IsNeedShowSearchBar", true);
            j45.l.v(activityC19082x760c9ba5.mo55332x76847179(), ".ui.tools.MultiStageCitySelectUI", intent2, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
