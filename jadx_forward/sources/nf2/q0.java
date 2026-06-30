package nf2;

/* loaded from: classes10.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.d1 f418325d;

    public q0(nf2.d1 d1Var) {
        this.f418325d = d1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView$setupMenuClickListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nf2.h0 h0Var = this.f418325d.I;
        if (h0Var != null) {
            nf2.w wVar = ((nf2.c) h0Var).f418192a;
            r45.z22 P6 = wVar.Z6().P6(wVar.f418352x);
            sf2.e1 e1Var = (sf2.e1) wVar.m56789x25fe639c(sf2.e1.class);
            if (e1Var != null) {
                sf2.e1.m7(e1Var, P6, true, false, false, null, 28, null);
            }
            te2.a9.f499416a.e(4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView$setupMenuClickListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
