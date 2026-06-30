package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272207d;

    public u2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272207d = c19666xfd6e2f33;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View findViewById = this.f272207d.f271520g.findViewById(com.p314xaae8f345.mm.R.id.f569150p71);
        findViewById.setFocusable(true);
        findViewById.setFocusableInTouchMode(true);
        findViewById.requestFocus();
        findViewById.sendAccessibilityEvent(128);
    }
}
