package yw3;

/* loaded from: classes.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17160xbdca513b f548448d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17160xbdca513b activityC17160xbdca513b) {
        this.f548448d = activityC17160xbdca513b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qd0.q0 q0Var = (qd0.q0) ((rd0.e1) i95.n0.c(rd0.e1.class));
        q0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17160xbdca513b context = this.f548448d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent Ui = q0Var.Ui(context, true, false, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17160xbdca513b activityC17160xbdca513b = this.f548448d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(Ui);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC17160xbdca513b, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17160xbdca513b.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC17160xbdca513b, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
