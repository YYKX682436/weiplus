package bm2;

/* loaded from: classes8.dex */
public final class y6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.k7 f103991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f103992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f103993f;

    public y6(bm2.k7 k7Var, int i17, r45.yx1 yx1Var) {
        this.f103991d = k7Var;
        this.f103992e = i17;
        this.f103993f = yx1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.k7.E(this.f103991d, this.f103992e, this.f103993f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
