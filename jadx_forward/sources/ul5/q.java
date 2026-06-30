package ul5;

/* loaded from: classes9.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ul5.x f510174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f510175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f510176f;

    public q(ul5.x xVar, java.util.ArrayList arrayList, android.widget.TextView textView) {
        this.f510174d = xVar;
        this.f510175e = arrayList;
        this.f510176f = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/pulldown/NestScrollBounceSettingDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ul5.x xVar = this.f510174d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(xVar.getContext(), this.f510175e);
        c0Var.i(xVar.f510189t);
        c0Var.f293792t = new ul5.p(c0Var, this.f510176f, xVar);
        c0Var.l();
        yj0.a.h(this, "com/tencent/mm/ui/widget/pulldown/NestScrollBounceSettingDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
