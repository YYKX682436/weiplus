package bm2;

/* loaded from: classes10.dex */
public final class b7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f21801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.k7 f21802f;

    public b7(int i17, r45.yx1 yx1Var, bm2.k7 k7Var) {
        this.f21800d = i17;
        this.f21801e = yx1Var;
        this.f21802f = k7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Top item position ");
        int i17 = this.f21800d;
        sb6.append(i17);
        sb6.append(", name ");
        r45.yx1 yx1Var = this.f21801e;
        sb6.append(yx1Var.f391466o.f371143d.f370351e);
        com.tencent.mars.xlog.Log.i("FinderLiveRequestSongPlayListAdapter", sb6.toString());
        bm2.k7 k7Var = this.f21802f;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = k7Var.f22042n;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        java.lang.Integer valueOf = linearLayoutManager != null ? java.lang.Integer.valueOf(linearLayoutManager.w()) : null;
        if (i17 != 0) {
            ((java.util.ArrayList) k7Var.f22045q).remove(i17);
            ((java.util.ArrayList) k7Var.f22045q).add(0, new bm2.v6(bm2.w6.f22413f, this.f21801e, null, 4, null));
            k7Var.notifyItemMoved(i17, 0);
            k7Var.notifyItemRangeChanged(0, i17 + 1);
            if (valueOf != null && valueOf.intValue() == 0 && (recyclerView = k7Var.f22042n) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$5", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$5", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
            }
            kotlinx.coroutines.y0 y0Var = k7Var.f22043o;
            if (y0Var != null) {
                kotlinx.coroutines.l.d(y0Var, null, null, new bm2.a7(k7Var, yx1Var, null), 3, null);
            }
            bm2.k7 k7Var2 = this.f21802f;
            k7Var2.I(2, bm2.y8.f22463f, k7Var2.f22041m, 1, yx1Var.f391466o.f371143d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
