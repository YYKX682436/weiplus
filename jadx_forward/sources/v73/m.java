package v73;

/* loaded from: classes8.dex */
public class m implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344 f515243d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344 activityC16099xbf243344) {
        this.f515243d = activityC16099xbf243344;
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
        yj0.a.b("com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        r45.v55 v55Var = (r45.v55) adapterView.getAdapter().getItem(i17);
        if (v55Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v55Var.f469452f)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344 activityC16099xbf243344 = this.f515243d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16099xbf243344.f223793d, "click item: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(v55Var.f469451e));
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(activityC16099xbf243344.mo55332x76847179(), v55Var.f469452f, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15191, 0, 0, 0, 0, 1, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
