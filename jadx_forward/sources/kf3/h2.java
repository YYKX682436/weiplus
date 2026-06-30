package kf3;

/* loaded from: classes11.dex */
public class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16489x8d6e80bc f388890d;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16489x8d6e80bc activityC16489x8d6e80bc) {
        this.f388890d = activityC16489x8d6e80bc;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/masssend/ui/MassSendSelectContactUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendSelectContactUI", "Click SelectAll");
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16489x8d6e80bc activityC16489x8d6e80bc = this.f388890d;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p4 p4Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.p4) ((android.widget.HeaderViewListAdapter) activityC16489x8d6e80bc.f287979d.getAdapter()).getWrappedAdapter();
        if (activityC16489x8d6e80bc.F) {
            activityC16489x8d6e80bc.C.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gte);
            activityC16489x8d6e80bc.G.e(new java.util.LinkedList());
            ((java.util.LinkedList) activityC16489x8d6e80bc.E).clear();
        } else {
            activityC16489x8d6e80bc.C.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574015gt3);
            ((java.util.LinkedList) activityC16489x8d6e80bc.E).clear();
            int count = p4Var.getCount();
            for (int i17 = 0; i17 < count; i17++) {
                com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = p4Var.getItem(i17);
                if (item != null && (str = item.f288383s) != null && !((java.util.LinkedList) activityC16489x8d6e80bc.E).contains(str)) {
                    ((java.util.LinkedList) activityC16489x8d6e80bc.E).add(item.f288383s);
                }
            }
            activityC16489x8d6e80bc.G.e(activityC16489x8d6e80bc.E);
        }
        activityC16489x8d6e80bc.F = !activityC16489x8d6e80bc.F;
        activityC16489x8d6e80bc.w7(((java.util.LinkedList) activityC16489x8d6e80bc.E).size());
        p4Var.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/masssend/ui/MassSendSelectContactUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
