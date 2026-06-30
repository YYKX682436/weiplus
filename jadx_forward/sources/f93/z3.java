package f93;

/* loaded from: classes11.dex */
public class z3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 f342062d;

    public z3(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868) {
        this.f342062d = activityC16172xa598f868;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd3130;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/ContactLabelUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868 = this.f342062d;
        f93.x2 x2Var = activityC16172xa598f868.f224843u;
        if (x2Var == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactLabelUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        java.lang.String item = x2Var.getItem(i17);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item) && (c16180x2cdd3130 = activityC16172xa598f868.f224835m) != null) {
            c16180x2cdd3130.g();
            activityC16172xa598f868.f224835m.d(item, true);
            activityC16172xa598f868.f224840r.s(item, true);
            activityC16172xa598f868.F.add(item);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactLabelUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
