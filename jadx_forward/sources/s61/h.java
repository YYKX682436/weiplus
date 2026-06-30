package s61;

/* loaded from: classes15.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11375x7be2c669 f484887d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11375x7be2c669 activityC11375x7be2c669) {
        this.f484887d = activityC11375x7be2c669;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/friend/ui/FindMContactAddUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11375x7be2c669 activityC11375x7be2c669 = this.f484887d;
        sb6.append(activityC11375x7be2c669.getClass().getName());
        sb6.append(",R300_300_AddAllButton,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R300_300_AddAllButton"));
        sb6.append(",3");
        n71.a.b(10645, sb6.toString());
        int i17 = activityC11375x7be2c669.f154661t;
        if (i17 == 2) {
            activityC11375x7be2c669.f154650f.f(true);
            activityC11375x7be2c669.f154650f.notifyDataSetChanged();
            activityC11375x7be2c669.f154657p.setVisibility(8);
            android.widget.TextView textView = activityC11375x7be2c669.f154656o;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else if (i17 == 1) {
            activityC11375x7be2c669.f154650f.f(true);
            activityC11375x7be2c669.f154650f.notifyDataSetChanged();
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11375x7be2c669.Z6(activityC11375x7be2c669);
        } else {
            activityC11375x7be2c669.f154650f.f(true);
            activityC11375x7be2c669.f154650f.notifyDataSetChanged();
            activityC11375x7be2c669.f154657p.setVisibility(8);
            android.widget.TextView textView2 = activityC11375x7be2c669.f154656o;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/friend/ui/FindMContactAddUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
