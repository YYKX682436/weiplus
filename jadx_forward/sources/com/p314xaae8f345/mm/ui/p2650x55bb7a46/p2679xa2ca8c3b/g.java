package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes10.dex */
public final class g extends yn.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j f285533d;

    public g(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j jVar) {
        this.f285533d = jVar;
    }

    @Override // yn.a, yn.l
    public void J() {
        yn.j jVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j jVar2 = this.f285533d;
        android.view.View view = jVar2.f285750y;
        android.view.View findViewWithTag = view != null ? view.findViewWithTag("fluent_view_tag") : null;
        if (findViewWithTag != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatingItemAppMsgFinderLiveFeed", "onChattingExitAnimEnd detach fluent view " + findViewWithTag + " feedId: " + jVar2.f285751z);
            if (jVar2.f285751z == 0) {
                android.view.View view2 = jVar2.f285750y;
                android.view.ViewGroup viewGroup = view2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) view2 : null;
                if (viewGroup != null) {
                    viewGroup.removeView(findViewWithTag);
                }
            } else {
                zy2.c8 c8Var = (zy2.c8) i95.n0.c(zy2.c8.class);
                long j17 = jVar2.f285751z;
                ((c61.d8) c8Var).getClass();
                ig2.m mVar = ig2.m.f372926a;
                ig2.r h17 = mVar.h(j17, true);
                if (h17 != null) {
                    h17.h();
                }
                ((c61.d8) ((zy2.c8) i95.n0.c(zy2.c8.class))).getClass();
                mVar.d();
            }
        }
        yb5.d dVar = jVar2.f285749x;
        if (dVar == null || (jVar = (yn.j) dVar.f542241c.a(yn.j.class)) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y4) jVar).c(this);
    }
}
