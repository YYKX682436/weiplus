package xt2;

/* loaded from: classes.dex */
public final class s3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f538542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qa5 f538543e;

    public s3(yz5.l lVar, r45.qa5 qa5Var) {
        this.f538542d = lVar;
        this.f538543e = qa5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCouponCardView$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f538542d.mo146xb9724478(this.f538543e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCouponCardView$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
