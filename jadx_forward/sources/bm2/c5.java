package bm2;

/* loaded from: classes3.dex */
public final class c5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.n5 f103348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.m4 f103349e;

    public c5(bm2.n5 n5Var, bm2.m4 m4Var) {
        this.f103348d = n5Var;
        this.f103349e = m4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$bindMember$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f103348d.C;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f103349e.f103634a);
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Xj(ml2.r3.f409433e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$bindMember$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
