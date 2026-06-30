package qw3;

/* loaded from: classes9.dex */
public class s implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 f448733d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569) {
        this.f448733d = activityC17101x8420a569;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBankcardInputUI$27", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitBankcardInputUI", "name_remind_list click: %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569 = this.f448733d;
        activityC17101x8420a569.H = false;
        activityC17101x8420a569.G = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65) adapterView.getAdapter().getItem(i17);
        activityC17101x8420a569.h7();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65 c17100xa183cf65 = activityC17101x8420a569.G;
        java.lang.String str = c17100xa183cf65.f238003d;
        java.lang.String str2 = activityC17101x8420a569.f238028y;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitBankcardInputUI", "do query bankinfo by seq: %s", str);
        activityC17101x8420a569.m83099x5406100e(new ow3.a(str, str2, c17100xa183cf65.f238007h), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new qw3.r(this), 500L);
        activityC17101x8420a569.f238019p.setVisibility(8);
        activityC17101x8420a569.mo48674x36654fab();
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBankcardInputUI$27", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
