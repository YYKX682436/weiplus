package bm2;

/* loaded from: classes3.dex */
public final class u2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.v2 f22340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f22341e;

    public u2(bm2.v2 v2Var, r45.xn1 xn1Var) {
        this.f22340d = v2Var;
        this.f22341e = xn1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveFansListAdapter$bindFansItem$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f22340d.f22379h;
        if (lVar != null) {
            lVar.invoke(this.f22341e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveFansListAdapter$bindFansItem$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
