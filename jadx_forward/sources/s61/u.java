package s61;

/* loaded from: classes15.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69 f484925d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69 activityC11376x2afd0f69) {
        this.f484925d = activityC11376x2afd0f69;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/friend/ui/FindMContactInviteUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69 activityC11376x2afd0f69 = this.f484925d;
        activityC11376x2afd0f69.f154675p.setVisibility(0);
        activityC11376x2afd0f69.f154674o.setVisibility(8);
        activityC11376x2afd0f69.f154668f.f(false);
        activityC11376x2afd0f69.f154668f.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/account/friend/ui/FindMContactInviteUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
