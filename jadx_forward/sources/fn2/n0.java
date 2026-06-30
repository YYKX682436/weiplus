package fn2;

/* loaded from: classes5.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.s0 f345868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f345869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f345870f;

    public n0(fn2.s0 s0Var, int i17, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        this.f345868d = s0Var;
        this.f345869e = i17;
        this.f345870f = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabView$initSubTabs$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f345868d.b(this.f345869e, null, this.f345870f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabView$initSubTabs$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
