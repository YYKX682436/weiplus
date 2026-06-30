package a24;

/* loaded from: classes.dex */
public final class n implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17508x8f0972f6 f82425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe f82426e;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17508x8f0972f6 abstractActivityC17508x8f0972f6, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe) {
        this.f82425d = abstractActivityC17508x8f0972f6;
        this.f82426e = c16718x7059cefe;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.ViewTreeObserver viewTreeObserver2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17508x8f0972f6 abstractActivityC17508x8f0972f6 = this.f82425d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) abstractActivityC17508x8f0972f6.findViewById(com.p314xaae8f345.mm.R.id.lqa);
        if (c22849x81a93d25 != null && (viewTreeObserver2 = c22849x81a93d25.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this);
        }
        java.lang.String str = abstractActivityC17508x8f0972f6.f243372f;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) abstractActivityC17508x8f0972f6.findViewById(com.p314xaae8f345.mm.R.id.lqa);
        if (c22849x81a93d252 == null || (viewTreeObserver = c22849x81a93d252.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a24.s(c22849x81a93d252, this.f82426e, str, abstractActivityC17508x8f0972f6));
    }
}
