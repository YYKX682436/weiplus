package di5;

/* loaded from: classes12.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ di5.m f314332d;

    public g(di5.m mVar) {
        this.f314332d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/finder/live/finderpost/FinderPostImageBottomBarLayer$attach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        di5.m.g0(this.f314332d, dg3.q.f313875f);
        yj0.a.h(this, "com/tencent/mm/ui/media/finder/live/finderpost/FinderPostImageBottomBarLayer$attach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
