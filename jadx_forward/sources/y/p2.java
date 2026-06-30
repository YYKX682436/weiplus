package y;

/* loaded from: classes16.dex */
public final class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi2.h f539959d;

    public p2(mi2.h hVar) {
        this.f539959d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget$setupAcceptWayContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mi2.h hVar = this.f539959d;
        if (hVar.T == 1) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget$setupAcceptWayContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        fj2.s.c(fj2.s.f344716a, ml2.q2.B, "1", null, 0, 0, 28, null);
        hVar.T = 1;
        int i17 = hVar.S;
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        hVar.S = i17 & (-17);
        hVar.U();
        hVar.V(hVar.S);
        hVar.Q(hVar.S);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget$setupAcceptWayContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
