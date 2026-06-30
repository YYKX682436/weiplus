package sp2;

/* loaded from: classes2.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.b0 f492826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f492827e;

    public z(sp2.b0 b0Var, int i17) {
        this.f492826d = b0Var;
        this.f492827e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$renderTagView$startShow$renderDefault$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sp2.b0 b0Var = this.f492826d;
        b0Var.Q6(this.f492827e, b0Var.m80379x76847179(), null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$renderTagView$startShow$renderDefault$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
