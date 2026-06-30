package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19078xd7766fa3 f260944d;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19078xd7766fa3 activityC19078xd7766fa3) {
        this.f260944d = activityC19078xd7766fa3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameInputAddressUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19078xd7766fa3 activityC19078xd7766fa3 = this.f260944d;
        activityC19078xd7766fa3.mo48674x36654fab();
        android.content.Intent intent = new android.content.Intent();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19078xd7766fa3.f260778t;
        intent.putExtra("key_countrycode", activityC19078xd7766fa3.f260784i);
        intent.putExtra("key_provincecode", activityC19078xd7766fa3.f260785m);
        intent.putExtra("key_citycode", activityC19078xd7766fa3.f260786n);
        intent.putExtra("key_zone", activityC19078xd7766fa3.f260779d.m83183xfb85ada3());
        intent.putExtra("key_address", activityC19078xd7766fa3.f260780e.m83183xfb85ada3());
        activityC19078xd7766fa3.setResult(-1, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameInputAddressUI", "[click okbtn] countryCode: %s, provinceCode: %s ，cityCode：%s , mZoneEt: %s , mAddressEt：%s", activityC19078xd7766fa3.f260784i, activityC19078xd7766fa3.f260785m, activityC19078xd7766fa3.f260786n, activityC19078xd7766fa3.f260779d.m83183xfb85ada3(), activityC19078xd7766fa3.f260780e.m83183xfb85ada3());
        activityC19078xd7766fa3.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameInputAddressUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
