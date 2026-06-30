package nf2;

/* loaded from: classes10.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.d1 f418327d;

    public r0(nf2.d1 d1Var) {
        this.f418327d = d1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView$setupMenuClickListeners$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nf2.h0 h0Var = this.f418327d.I;
        if (h0Var != null) {
            nf2.w wVar = ((nf2.c) h0Var).f418192a;
            mm2.j6 j6Var = (mm2.j6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) wVar.Z6().f410784s).mo144003x754a37bb();
            mm2.i6 i6Var = j6Var instanceof mm2.i6 ? (mm2.i6) j6Var : null;
            if (i6Var != null ? i6Var.f410676c : true) {
                te2.a9.f499416a.e(((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) wVar.Z6().f410789x).mo144003x754a37bb()).booleanValue() ^ true ? 5 : 6, null);
                sf2.e1 e1Var = (sf2.e1) wVar.m56789x25fe639c(sf2.e1.class);
                if (e1Var != null) {
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) e1Var.g7().f410788w).k(java.lang.Boolean.valueOf(!((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) e1Var.g7().f410789x).mo144003x754a37bb()).booleanValue()));
                }
            } else {
                java.lang.Object obj = wVar.f372632e;
                android.view.View view2 = obj instanceof android.view.View ? (android.view.View) obj : null;
                android.content.Context context = view2 != null ? view2.getContext() : null;
                if (context != null) {
                    db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.oo8, 0).show();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView$setupMenuClickListeners$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
