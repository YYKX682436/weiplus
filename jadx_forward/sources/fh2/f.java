package fh2;

/* loaded from: classes3.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh2.g f344180d;

    public f(fh2.g gVar) {
        this.f344180d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ktv/panel/FinderLiveKTVCloseTipsPanel$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fh2.g gVar = this.f344180d;
        gVar.y(4);
        gVar.a();
        gVar.f344183m.mo152xb9724478();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/panel/FinderLiveKTVCloseTipsPanel$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
