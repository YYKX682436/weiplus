package qe5;

/* loaded from: classes12.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.n1 f443659d;

    public i1(qe5.n1 n1Var) {
        this.f443659d = n1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$initPreview$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qe5.n1 n1Var = this.f443659d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = n1Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c.C21859x7e56223) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c.C21859x7e56223.class)).W6()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = n1Var.P6();
            if (P6 != null) {
                P6.finish();
            }
            yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$initPreview$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        kd5.e T6 = n1Var.T6();
        jz5.f0 f0Var = null;
        if (T6 != null && T6.f388417o) {
            kd5.e T62 = n1Var.T6();
            if (T62 != null) {
                T62.M = true;
            }
            kd5.e T63 = n1Var.T6();
            if (T63 != null) {
                T63.L = false;
            }
            j75.f Q6 = n1Var.Q6();
            if (Q6 != null) {
                Q6.B3(new kd5.u(6, 0, 2, null));
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = n1Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ((qe5.z) pf5.z.f435481a.a(activity2).a(qe5.z.class)).X6(0L);
        } else {
            kd5.e T64 = n1Var.T6();
            if (T64 != null && (f9Var = T64.f388410e) != null) {
                sc5.g gVar = sc5.g.f488105a;
                android.app.Activity m80379x76847179 = n1Var.m80379x76847179();
                kd5.e T65 = n1Var.T6();
                sc5.g.g(gVar, m80379x76847179, f9Var, false, false, T65 != null ? T65.f388419q : null, 12, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = n1Var.P6();
                if (P62 != null) {
                    P62.finish();
                    f0Var = jz5.f0.f384359a;
                }
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FilePageLogicUIC", "openOriginFileBtn: msg is null");
            }
        }
        j75.f Q62 = n1Var.Q6();
        if (Q62 != null) {
            kd5.n nVar = new kd5.n(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291257i);
            nVar.f388437c = false;
            Q62.B3(nVar);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$initPreview$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
