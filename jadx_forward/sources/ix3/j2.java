package ix3;

/* loaded from: classes3.dex */
public final class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.l2 f376998d;

    public j2(ix3.l2 l2Var) {
        this.f376998d = l2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerFloatBallDebugUIC$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.p();
        }
        dp.a.m125854x26a183b(this.f376998d.m80379x76847179(), "清除成功", 0).show();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerFloatBallDebugUIC$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
