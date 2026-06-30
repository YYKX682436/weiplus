package a24;

/* loaded from: classes.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17508x8f0972f6 f82427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe f82428e;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17508x8f0972f6 abstractActivityC17508x8f0972f6, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe) {
        this.f82427d = abstractActivityC17508x8f0972f6;
        this.f82428e = c16718x7059cefe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17508x8f0972f6 abstractActivityC17508x8f0972f6 = this.f82427d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) abstractActivityC17508x8f0972f6.findViewById(com.p314xaae8f345.mm.R.id.lqa);
        if (c22849x81a93d25 == null || (viewTreeObserver = c22849x81a93d25.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a24.n(abstractActivityC17508x8f0972f6, this.f82428e));
    }
}
