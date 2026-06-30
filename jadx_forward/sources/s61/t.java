package s61;

/* loaded from: classes15.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69 f484923d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69 activityC11376x2afd0f69) {
        this.f484923d = activityC11376x2afd0f69;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/friend/ui/FindMContactInviteUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69 activityC11376x2afd0f69 = this.f484923d;
        sb6.append(activityC11376x2afd0f69.getClass().getName());
        sb6.append(",R300_400_AddAllButton,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R300_300_AddAllButton"));
        sb6.append(",3");
        n71.a.b(10645, sb6.toString());
        int i17 = activityC11376x2afd0f69.f154678s;
        if (i17 == 2) {
            activityC11376x2afd0f69.f154668f.f(true);
            activityC11376x2afd0f69.f154668f.notifyDataSetChanged();
            activityC11376x2afd0f69.f154675p.setVisibility(8);
            android.widget.TextView textView = activityC11376x2afd0f69.f154674o;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else if (i17 == 1) {
            activityC11376x2afd0f69.f154668f.f(true);
            activityC11376x2afd0f69.f154668f.notifyDataSetChanged();
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69.Z6(activityC11376x2afd0f69);
        } else {
            activityC11376x2afd0f69.f154668f.f(true);
            activityC11376x2afd0f69.f154668f.notifyDataSetChanged();
            activityC11376x2afd0f69.f154675p.setVisibility(8);
            android.widget.TextView textView2 = activityC11376x2afd0f69.f154674o;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/friend/ui/FindMContactInviteUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
