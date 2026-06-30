package di5;

/* loaded from: classes12.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ di5.s f314341d;

    public q(di5.s sVar) {
        this.f314341d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        mf3.k kVar;
        dg3.m mVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/finder/live/finderpost/FinderPostVideoBottomBarLayer$createView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dg3.q qVar = dg3.q.f313874e;
        di5.s sVar = this.f314341d;
        mf3.s sVar2 = sVar.f407643m;
        if (sVar2 != null && (kVar = sVar2.f407650a) != null && (mVar = (dg3.m) sVar.H(dg3.m.class)) != null) {
            mVar.Z0(kVar, sVar.f435359s, qVar);
        }
        di5.s.g0(sVar, "live_playback_high_clip_share");
        yj0.a.h(this, "com/tencent/mm/ui/media/finder/live/finderpost/FinderPostVideoBottomBarLayer$createView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
