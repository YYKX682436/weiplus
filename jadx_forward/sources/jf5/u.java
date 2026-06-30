package jf5;

/* loaded from: classes14.dex */
public final class u implements android.view.ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 f381045a;

    public u(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 c22095x76baed77) {
        this.f381045a = c22095x76baed77;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 c22095x76baed77 = this.f381045a;
        if (c22095x76baed77.f286202p) {
            c22095x76baed77.removeCallbacks(c22095x76baed77.H);
            if (c22095x76baed77.f286206t == null) {
                c22095x76baed77.G = true;
                c22095x76baed77.k();
                c22095x76baed77.removeCallbacks(c22095x76baed77.V);
                c22095x76baed77.postDelayed(c22095x76baed77.V, 120L);
            }
            c22095x76baed77.v();
        }
    }
}
