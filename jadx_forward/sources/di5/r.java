package di5;

/* loaded from: classes12.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ di5.s f314342d;

    public r(di5.s sVar) {
        this.f314342d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        mf3.k kVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/finder/live/finderpost/FinderPostVideoBottomBarLayer$createView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        di5.s sVar = this.f314342d;
        mf3.s sVar2 = sVar.f407643m;
        if (sVar2 != null && (kVar = sVar2.f407650a) != null) {
            di5.t tVar = (di5.t) sVar.H(di5.t.class);
            if (tVar != null) {
                ((di5.b) tVar).V6(kVar);
            }
            di5.s.g0(sVar, "live_playback_high_clip_publish");
        }
        yj0.a.h(this, "com/tencent/mm/ui/media/finder/live/finderpost/FinderPostVideoBottomBarLayer$createView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
