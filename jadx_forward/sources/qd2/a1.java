package qd2;

/* loaded from: classes10.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f443232d;

    public a1(qd2.g1 g1Var) {
        this.f443232d = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$showAgreementConfirmDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qd2.g1.a(this.f443232d, qd2.g1.f443278u);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$showAgreementConfirmDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
