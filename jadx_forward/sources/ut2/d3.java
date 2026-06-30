package ut2;

/* loaded from: classes3.dex */
public final class d3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f512390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f512391e;

    public d3(ut2.s3 s3Var, cm2.m0 m0Var) {
        this.f512390d = s3Var;
        this.f512391e = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setupPrehotConfigEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.k84 k84Var = (r45.k84) this.f512391e.f124901v.m75936x14adae67(45);
        ut2.s3.n(this.f512390d, k84Var != null ? (r45.k74) k84Var.m75936x14adae67(3) : null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setupPrehotConfigEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
