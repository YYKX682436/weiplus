package yw3;

/* loaded from: classes.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17160xbdca513b f548457d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17160xbdca513b activityC17160xbdca513b) {
        this.f548457d = activityC17160xbdca513b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((qd0.q0) ((rd0.e1) i95.n0.c(rd0.e1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17160xbdca513b activity = this.f548457d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
        intent.putExtra("titile", "选择自动备份的聊天");
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.k.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.v0.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.h1.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e0.class);
        pf5.j0.a(intent, cj5.j0.class);
        intent.putExtra("KEY_IS_ONLY_MULTI_SELECT_MODE", true);
        pf5.j0.a(intent, ej5.b.class);
        pf5.j0.a(intent, cj5.m0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17160xbdca513b activityC17160xbdca513b = this.f548457d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC17160xbdca513b, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17160xbdca513b.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC17160xbdca513b, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
