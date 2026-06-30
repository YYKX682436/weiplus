package androidx.recyclerview.widget;

/* loaded from: classes10.dex */
public abstract class r3 extends androidx.recyclerview.widget.u2 {

    /* renamed from: a, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f12212a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.Scroller f12213b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.recyclerview.widget.w2 f12214c = new androidx.recyclerview.widget.p3(this);

    @Override // androidx.recyclerview.widget.u2
    public boolean a(int i17, int i18) {
        androidx.recyclerview.widget.g3 d17;
        int g17;
        boolean z17;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f12212a.getLayoutManager();
        if (layoutManager == null || this.f12212a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f12212a.getMinFlingVelocity();
        if (java.lang.Math.abs(i18) <= minFlingVelocity && java.lang.Math.abs(i17) <= minFlingVelocity) {
            return false;
        }
        if (!(layoutManager instanceof androidx.recyclerview.widget.f3) || (d17 = d(layoutManager)) == null || (g17 = g(layoutManager, i17, i18)) == -1) {
            z17 = false;
        } else {
            d17.f12049a = g17;
            layoutManager.startSmoothScroll(d17);
            z17 = true;
        }
        return z17;
    }

    public void b(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f12212a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        androidx.recyclerview.widget.w2 w2Var = this.f12214c;
        if (recyclerView2 != null) {
            recyclerView2.V0(w2Var);
            this.f12212a.setOnFlingListener(null);
        }
        this.f12212a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new java.lang.IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f12212a.i(w2Var);
            this.f12212a.setOnFlingListener(this);
            this.f12213b = new android.widget.Scroller(this.f12212a.getContext(), new android.view.animation.DecelerateInterpolator());
            h();
        }
    }

    public abstract int[] c(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View view);

    public androidx.recyclerview.widget.g3 d(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        return e(layoutManager);
    }

    public androidx.recyclerview.widget.o1 e(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof androidx.recyclerview.widget.f3) {
            return new androidx.recyclerview.widget.q3(this, this.f12212a.getContext());
        }
        return null;
    }

    public abstract android.view.View f(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager);

    public abstract int g(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17, int i18);

    public void h() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        android.view.View f17;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f12212a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (f17 = f(layoutManager)) == null) {
            return;
        }
        int[] c17 = c(layoutManager, f17);
        int i17 = c17[0];
        if (i17 == 0 && c17[1] == 0) {
            return;
        }
        this.f12212a.smoothScrollBy(i17, c17[1]);
    }
}
