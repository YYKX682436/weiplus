package bm2;

/* loaded from: classes5.dex */
public final class m7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.hy1 f22114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.n7 f22115e;

    public m7(r45.hy1 hy1Var, bm2.n7 n7Var) {
        this.f22114d = hy1Var;
        this.f22115e = n7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongSmartBoxAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Choose smartbox ");
        r45.hy1 hy1Var = this.f22114d;
        sb6.append(hy1Var.f376553f);
        sb6.append(", id ");
        sb6.append(hy1Var.f376552e);
        sb6.append(", real key ");
        sb6.append(hy1Var.f376554g);
        sb6.append(", type ");
        sb6.append(hy1Var.f376551d);
        com.tencent.mars.xlog.Log.i("FinderLiveRequestSongSmartBoxAdapter", sb6.toString());
        ((kotlinx.coroutines.flow.q2) this.f22115e.f22165e.f329197f).e(hy1Var);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongSmartBoxAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
