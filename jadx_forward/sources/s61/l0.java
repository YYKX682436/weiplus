package s61;

/* loaded from: classes8.dex */
public class l0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11378xa7f41e6e f484897d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11378xa7f41e6e activityC11378xa7f41e6e) {
        this.f484897d = activityC11378xa7f41e6e;
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
        yj0.a.b("com/tencent/mm/plugin/account/friend/ui/RecommendFriendUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11378xa7f41e6e activityC11378xa7f41e6e = this.f484897d;
        if (activityC11378xa7f41e6e.f154702n) {
            s61.c0 c0Var = activityC11378xa7f41e6e.f154696e;
            activityC11378xa7f41e6e.U6(c0Var.f484867g ? ((r45.e53) c0Var.f484866f.get(i17)).f454552d : 0);
        } else {
            s61.c0 c0Var2 = activityC11378xa7f41e6e.f154696e;
            if (i17 >= 0) {
                boolean[] zArr = c0Var2.f484868h;
                if (i17 < zArr.length) {
                    zArr[i17] = !zArr[i17];
                    c0Var2.notifyDataSetChanged();
                }
            } else {
                c0Var2.getClass();
            }
            if (activityC11378xa7f41e6e.f154696e.a().length > 0) {
                activityC11378xa7f41e6e.mo74408xb0dfae51(true);
            } else {
                activityC11378xa7f41e6e.mo74408xb0dfae51(false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/friend/ui/RecommendFriendUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
