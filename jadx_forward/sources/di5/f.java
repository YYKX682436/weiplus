package di5;

/* loaded from: classes12.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ di5.m f314331d;

    public f(di5.m mVar) {
        this.f314331d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/finder/live/finderpost/FinderPostImageBottomBarLayer$attach$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        di5.m.g0(this.f314331d, dg3.q.f313881o);
        yj0.a.h(this, "com/tencent/mm/ui/media/finder/live/finderpost/FinderPostImageBottomBarLayer$attach$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
