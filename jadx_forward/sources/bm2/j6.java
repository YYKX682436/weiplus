package bm2;

/* loaded from: classes10.dex */
public final class j6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.o6 f103547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hn2.d f103548e;

    public j6(bm2.o6 o6Var, hn2.d dVar, bm2.i6 i6Var) {
        this.f103547d = o6Var;
        this.f103548e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongListAdapter$bindSongItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.o6 o6Var = this.f103547d;
        o6Var.getClass();
        hn2.d dVar = this.f103548e;
        if (dVar.b() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongListAdapter", "no audition resource");
        } else {
            sf2.d3 d3Var = o6Var.f103729i;
            d3Var.getClass();
            nm2.a aVar = (nm2.a) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) d3Var.g7()).mo144003x754a37bb();
            if (aVar == null) {
                d3Var.x7("", false, true);
            } else {
                java.lang.String str = dVar.f364038a;
                boolean c17 = aVar.c(str != null ? str : "", dVar.f364049l);
                if (aVar instanceof nm2.b ? true : aVar instanceof nm2.c) {
                    if (c17) {
                        o6Var.I(3, 4, dVar);
                        d3Var.x7(aVar.b(), aVar.d(), true);
                    } else {
                        o6Var.I(2, 4, dVar);
                        d3Var.x7(aVar.b(), aVar.d(), false);
                        d3Var.f7().j(dVar);
                    }
                } else if (aVar instanceof nm2.d) {
                    o6Var.I(2, 4, dVar);
                    d3Var.f7().j(dVar);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongListAdapter$bindSongItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
