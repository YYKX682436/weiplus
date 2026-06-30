package nf2;

/* loaded from: classes10.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.d0 f418357d;

    public y(nf2.d0 d0Var) {
        this.f418357d = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nf2.d0 d0Var = this.f418357d;
        if (d0Var.f418206h) {
            return;
        }
        d0Var.f418206h = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLyricsGestureHelper", "enterDragMode");
        android.view.View view = ((nf2.d1) d0Var.f418199a).f418218f;
        if (view != null) {
            view.performHapticFeedback(0);
        }
        nf2.x xVar = d0Var.f418210l;
        if (xVar != null) {
            nf2.w wVar = ((nf2.b) xVar).f418189a;
            wVar.getClass();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_LYRICS_GESTURE_EDU_SHOWN_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            if (wVar.f418354z) {
                wVar.c7(false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = wVar.f372632e;
            if (ubVar != null) {
                ubVar.mo57727x9929ae66(1.0f, 0.3f);
            }
        }
    }
}
