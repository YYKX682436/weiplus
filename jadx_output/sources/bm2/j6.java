package bm2;

/* loaded from: classes10.dex */
public final class j6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.o6 f22014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hn2.d f22015e;

    public j6(bm2.o6 o6Var, hn2.d dVar, bm2.i6 i6Var) {
        this.f22014d = o6Var;
        this.f22015e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongListAdapter$bindSongItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.o6 o6Var = this.f22014d;
        o6Var.getClass();
        hn2.d dVar = this.f22015e;
        if (dVar.b() == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveRequestSongListAdapter", "no audition resource");
        } else {
            sf2.d3 d3Var = o6Var.f22196i;
            d3Var.getClass();
            nm2.a aVar = (nm2.a) ((kotlinx.coroutines.flow.h3) d3Var.g7()).getValue();
            if (aVar == null) {
                d3Var.x7("", false, true);
            } else {
                java.lang.String str = dVar.f282505a;
                boolean c17 = aVar.c(str != null ? str : "", dVar.f282516l);
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
