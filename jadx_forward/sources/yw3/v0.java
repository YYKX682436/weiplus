package yw3;

/* loaded from: classes.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17160xbdca513b f548439d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17160xbdca513b activityC17160xbdca513b) {
        this.f548439d = activityC17160xbdca513b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rd0.g1 g1Var = (rd0.g1) i95.n0.c(rd0.g1.class);
        kz5.p0 p0Var = kz5.p0.f395529d;
        ((qd0.u0) g1Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17160xbdca513b activity = this.f548439d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", "");
        intent.putExtra("list_attr", 64);
        intent.putExtra("chatroomlist", kz5.n0.g0(p0Var, ",", null, null, 0, null, null, 62, null));
        intent.putExtra("already_select_contact", kz5.n0.g0(p0Var, ",", null, null, 0, null, null, 62, null));
        intent.putExtra("openMenuStyle", 11);
        intent.putExtra("key_canSelectOpenIM", true);
        intent.putExtra("showLabelWhenSearch", false);
        intent.putExtra("showContactScrollbar", false);
        pf5.j0.a(intent, ij5.n0.class);
        pf5.j0.a(intent, ij5.f.class);
        pf5.j0.a(intent, ij5.d0.class);
        pf5.j0.a(intent, ij5.t.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, ij5.c.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        bh5.c cVar = new bh5.c();
        cVar.f102455a.f102457a = activity.mo55332x76847179();
        cVar.d(intent);
        cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
        cVar.i(yw3.u0.f548430a);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
