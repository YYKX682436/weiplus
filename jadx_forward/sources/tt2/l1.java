package tt2;

/* loaded from: classes3.dex */
public final class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.n1 f503489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xv2 f503490e;

    public l1(tt2.n1 n1Var, r45.xv2 xv2Var) {
        this.f503489d = n1Var;
        this.f503490e = xv2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/adapter/FinderProductLabelAdapter$ProductLabelViewHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tt2.n1 n1Var = this.f503489d;
        n1Var.getClass();
        r45.xv2 labelItem = this.f503490e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelItem, "labelItem");
        n1Var.f503503e.f503509d.a(labelItem, n1Var.m8188xa86cd69f(), true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderProductLabelAdapter$ProductLabelViewHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
