package jf5;

/* loaded from: classes14.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 f381047d;

    public w(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 c22095x76baed77) {
        this.f381047d = c22095x76baed77;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jf5.h hVar;
        yz5.l lVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 c22095x76baed77 = this.f381047d;
        c22095x76baed77.B = false;
        jf5.r0 selectionMenuHost = c22095x76baed77.getSelectionMenuHost();
        if (selectionMenuHost == null || (lVar = (hVar = (jf5.h) selectionMenuHost).f380992c) == null) {
            return;
        }
        hVar.a();
        lVar.mo146xb9724478(c22095x76baed77);
    }
}
