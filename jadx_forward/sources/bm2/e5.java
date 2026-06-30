package bm2;

/* loaded from: classes3.dex */
public final class e5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.n5 f103396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.m4 f103397e;

    public e5(bm2.n5 n5Var, bm2.m4 m4Var) {
        this.f103396d = n5Var;
        this.f103397e = m4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$fillStickView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f103396d.C;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f103397e.f103634a);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$fillStickView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
