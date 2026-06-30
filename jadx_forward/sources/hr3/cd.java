package hr3;

/* loaded from: classes10.dex */
public final class cd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d f364986d;

    public cd(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d activityC16867xd9c62d0d) {
        this.f364986d = activityC16867xd9c62d0d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d activityC16867xd9c62d0d = this.f364986d;
        if (!activityC16867xd9c62d0d.f235328o) {
            yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        activityC16867xd9c62d0d.U6();
        activityC16867xd9c62d0d.Y6(false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("infrequentcontactsortpage_refresh_button", "view_clk", kz5.b1.e(new jz5.l("contacts_max_limit_sort_sessionid", activityC16867xd9c62d0d.W6())), 32337);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
