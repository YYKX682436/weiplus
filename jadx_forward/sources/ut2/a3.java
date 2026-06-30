package ut2;

/* loaded from: classes3.dex */
public final class a3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f512350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.mw3 f512351e;

    public a3(ut2.s3 s3Var, r45.mw3 mw3Var) {
        this.f512350d = s3Var;
        this.f512351e = mw3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setupPrehotBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ut2.s3.n(this.f512350d, (r45.k74) this.f512351e.m75936x14adae67(9));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setupPrehotBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
