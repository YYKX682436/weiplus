package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13043x76f8a15a f176535d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13043x76f8a15a activityC13043x76f8a15a) {
        this.f176535d = activityC13043x76f8a15a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardAcceptCardListUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13043x76f8a15a.M;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13043x76f8a15a activityC13043x76f8a15a = this.f176535d;
        activityC13043x76f8a15a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAcceptCardListUI", "doSelectShareUser");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11582, "OpenShareUserSelectView", 0, "", "", "", "");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KLabel_range_index", activityC13043x76f8a15a.D);
        intent.putExtra("Klabel_name_list", activityC13043x76f8a15a.E);
        intent.putExtra("Kother_user_name_list", activityC13043x76f8a15a.F);
        intent.putExtra("k_sns_label_ui_title", activityC13043x76f8a15a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.av9));
        intent.putExtra("k_sns_label_ui_style", 0);
        intent.putExtra("KLabel_is_filter_private", true);
        j45.l.n(activityC13043x76f8a15a, "sns", ".ui.SnsLabelUI", intent, 2);
        activityC13043x76f8a15a.m78545xde66c1f2(activityC13043x76f8a15a);
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
