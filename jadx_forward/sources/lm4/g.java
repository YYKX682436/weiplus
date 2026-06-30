package lm4;

/* loaded from: classes8.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2304x373aa5.DialogC18732x79d0ea5b f401094d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2304x373aa5.DialogC18732x79d0ea5b dialogC18732x79d0ea5b) {
        this.f401094d = dialogC18732x79d0ea5b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/view/TingAddToListenEducationDialog$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qk.a8 a8Var = (qk.a8) i95.n0.c(qk.a8.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2304x373aa5.DialogC18732x79d0ea5b dialogC18732x79d0ea5b = this.f401094d;
        android.content.Context context = dialogC18732x79d0ea5b.f256350r;
        if (context == null) {
            context = dialogC18732x79d0ea5b.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        }
        ((ef0.q1) a8Var).Ai(context, bw5.ar0.TingScene_ListenLaterNewUserGuideJump);
        ku5.u0 u0Var = ku5.t0.f394148d;
        lm4.f fVar = new lm4.f(this.f401094d);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(fVar, 500L, false);
        yj0.a.h(this, "com/tencent/mm/plugin/ting/view/TingAddToListenEducationDialog$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
