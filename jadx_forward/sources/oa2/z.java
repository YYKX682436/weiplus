package oa2;

/* loaded from: classes2.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oa2.b0 f425379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vb2.k0 f425380e;

    public z(oa2.b0 b0Var, vb2.k0 k0Var) {
        this.f425379d = b0Var;
        this.f425380e = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicTabUIC$onError$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f425379d.G7();
        vb2.k0 k0Var = this.f425380e;
        k0Var.f516174b.setVisibility(0);
        k0Var.f516176d.setVisibility(8);
        k0Var.f516175c.setVisibility(0);
        k0Var.f516174b.setOnClickListener(null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicTabUIC$onError$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
