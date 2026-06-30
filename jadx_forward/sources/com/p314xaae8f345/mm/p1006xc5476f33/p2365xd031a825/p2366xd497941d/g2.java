package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes8.dex */
public class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 f260911d;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 activityC19082x760c9ba5) {
        this.f260911d = activityC19082x760c9ba5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 activityC19082x760c9ba5 = this.f260911d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5.U6(activityC19082x760c9ba5);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(activityC19082x760c9ba5.mo55332x76847179(), "com.tencent.mm.ui.tools.CountryCodeUI");
        java.lang.String[] strArr = activityC19082x760c9ba5.E;
        if (strArr != null) {
            intent.putExtra("exclude_countries_iso", strArr);
        }
        intent.putExtra("CountryCodeUI_isShowCountryCode", false);
        intent.putExtra("ui_title", activityC19082x760c9ba5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kzf));
        activityC19082x760c9ba5.startActivityForResult(intent, 3);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
