package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13043x76f8a15a f176518d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13043x76f8a15a activityC13043x76f8a15a) {
        this.f176518d = activityC13043x76f8a15a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardAcceptCardListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13043x76f8a15a activityC13043x76f8a15a = this.f176518d;
        if (activityC13043x76f8a15a.C) {
            java.util.LinkedList T6 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13043x76f8a15a.T6(activityC13043x76f8a15a);
            activityC13043x76f8a15a.X6(true);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (int i17 = 0; i17 < T6.size(); i17++) {
                r45.hu huVar = (r45.hu) T6.get(i17);
                r45.a46 a46Var = new r45.a46();
                a46Var.f451252e = huVar.f457979d;
                a46Var.f451253f = huVar.f457980e;
                a46Var.f451255h = activityC13043x76f8a15a.f176278z;
                a46Var.f451254g = activityC13043x76f8a15a.A;
                a46Var.f451256i = activityC13043x76f8a15a.f176277y;
                linkedList.add(a46Var);
            }
            r45.o46 o17 = lu1.a0.o(activityC13043x76f8a15a.D, activityC13043x76f8a15a.G, activityC13043x76f8a15a.H);
            r45.pd6 pd6Var = new r45.pd6();
            pd6Var.f464502d = activityC13043x76f8a15a.L;
            gm0.j1.n().f354821b.g(new fu1.e(0, linkedList, "", activityC13043x76f8a15a.B, o17, activityC13043x76f8a15a.f176276x, pd6Var));
        } else {
            java.util.LinkedList T62 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13043x76f8a15a.T6(activityC13043x76f8a15a);
            activityC13043x76f8a15a.X6(true);
            gm0.j1.n().f354821b.g(new xt1.x(T62, activityC13043x76f8a15a.f176276x, activityC13043x76f8a15a.f176278z, activityC13043x76f8a15a.A, activityC13043x76f8a15a.f176277y));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
