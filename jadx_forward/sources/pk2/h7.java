package pk2;

/* loaded from: classes3.dex */
public final class h7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.l7 f437349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.h4 f437350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f437351f;

    public h7(pk2.l7 l7Var, db5.h4 h4Var, int i17) {
        this.f437349d = l7Var;
        this.f437350e = h4Var;
        this.f437351f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/FinderStartLiveMoreActionBottomSheet$RecycleViewAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        db5.t4 t4Var = this.f437349d.f437492e;
        if (t4Var != null) {
            t4Var.mo888x34063ac(this.f437350e, this.f437351f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/FinderStartLiveMoreActionBottomSheet$RecycleViewAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
