package sj3;

/* loaded from: classes12.dex */
public final class n2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f490187d;

    public n2(sj3.g3 g3Var) {
        this.f490187d = g3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$initButtonSplit$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sj3.g3 g3Var = this.f490187d;
        rl5.r rVar = new rl5.r(g3Var.f490053a, view);
        rVar.F = true;
        rVar.G = true;
        rVar.f478868J = g3Var.f490053a.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k28);
        rVar.f478888y = new sj3.l2(g3Var);
        rVar.f478887x = new sj3.m2(g3Var);
        rVar.m();
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$initButtonSplit$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
