package el2;

/* loaded from: classes3.dex */
public final class m2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.r2 f335394d;

    public m2(el2.r2 r2Var) {
        this.f335394d = r2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveShareBtnWidget$mount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jf2.x xVar = jf2.k0.f380910y;
        el2.r2 r2Var = this.f335394d;
        xVar.a(2, el2.r2.k(r2Var));
        df2.ox oxVar = (df2.ox) r2Var.f335433e.U0(df2.ox.class);
        if (oxVar != null) {
            oxVar.d7();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveShareBtnWidget$mount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
