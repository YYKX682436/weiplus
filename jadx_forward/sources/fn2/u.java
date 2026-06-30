package fn2;

/* loaded from: classes5.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.b0 f345940d;

    public u(fn2.b0 b0Var) {
        this.f345940d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fn2.b0 b0Var = this.f345940d;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = b0Var.f345748g;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new fn2.t(b0Var, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
