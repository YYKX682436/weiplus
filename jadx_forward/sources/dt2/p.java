package dt2;

/* loaded from: classes3.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.t f324724d;

    public p(dt2.t tVar) {
        this.f324724d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayMiniView$miniWindowPauseClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dt2.t tVar = this.f324724d;
        tVar.getClass();
        ((android.view.View.OnClickListener) ((jz5.n) tVar.f324733i).mo141623x754a37bb()).onClick(view);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayMiniView$miniWindowPauseClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
