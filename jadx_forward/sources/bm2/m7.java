package bm2;

/* loaded from: classes5.dex */
public final class m7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.hy1 f103647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.n7 f103648e;

    public m7(r45.hy1 hy1Var, bm2.n7 n7Var) {
        this.f103647d = hy1Var;
        this.f103648e = n7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongSmartBoxAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Choose smartbox ");
        r45.hy1 hy1Var = this.f103647d;
        sb6.append(hy1Var.f458086f);
        sb6.append(", id ");
        sb6.append(hy1Var.f458085e);
        sb6.append(", real key ");
        sb6.append(hy1Var.f458087g);
        sb6.append(", type ");
        sb6.append(hy1Var.f458084d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongSmartBoxAdapter", sb6.toString());
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) this.f103648e.f103698e.f410730f).e(hy1Var);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongSmartBoxAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
