package fn2;

/* loaded from: classes5.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.s f345845d;

    public m(fn2.s sVar) {
        this.f345845d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongSearchWidget$initSearchView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f345845d.f345905h.mo152xb9724478();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongSearchWidget$initSearchView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
