package dz4;

/* loaded from: classes5.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib f326846d;

    public j1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar) {
        this.f326846d = ibVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View findViewById = this.f326846d.findViewById(com.p314xaae8f345.mm.R.id.f569150p71);
        if (findViewById != null) {
            findViewById.setFocusable(true);
            findViewById.setFocusableInTouchMode(true);
            findViewById.sendAccessibilityEvent(128);
        }
    }
}
