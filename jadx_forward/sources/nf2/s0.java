package nf2;

/* loaded from: classes10.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.d1 f418330d;

    public s0(nf2.d1 d1Var) {
        this.f418330d = d1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView$setupMenuClickListeners$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nf2.h0 h0Var = this.f418330d.I;
        if (h0Var != null) {
            nf2.w wVar = ((nf2.c) h0Var).f418192a;
            wVar.getClass();
            te2.a9.f499416a.e(9, null);
            java.lang.Object obj = wVar.f372632e;
            android.view.View view2 = obj instanceof android.view.View ? (android.view.View) obj : null;
            android.content.Context context = view2 != null ? view2.getContext() : null;
            if (context != null) {
                nf2.h hVar = new nf2.h(wVar);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
                k0Var.f293405n = new of2.o(context);
                k0Var.f293414s = new of2.p(hVar);
                k0Var.v();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView$setupMenuClickListeners$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
