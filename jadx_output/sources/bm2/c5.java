package bm2;

/* loaded from: classes3.dex */
public final class c5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.n5 f21815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.m4 f21816e;

    public c5(bm2.n5 n5Var, bm2.m4 m4Var) {
        this.f21815d = n5Var;
        this.f21816e = m4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$bindMember$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f21815d.C;
        if (lVar != null) {
            lVar.invoke(this.f21816e.f22101a);
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Xj(ml2.r3.f327900e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$bindMember$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
