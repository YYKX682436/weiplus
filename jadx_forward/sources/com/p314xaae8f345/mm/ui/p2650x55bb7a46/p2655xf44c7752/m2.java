package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes4.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewTreeObserverOnPreDrawListenerC21747x53cf88d1 f282724d;

    public m2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewTreeObserverOnPreDrawListenerC21747x53cf88d1 viewTreeObserverOnPreDrawListenerC21747x53cf88d1) {
        this.f282724d = viewTreeObserverOnPreDrawListenerC21747x53cf88d1;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewTreeObserverOnPreDrawListenerC21747x53cf88d1 viewTreeObserverOnPreDrawListenerC21747x53cf88d1 = this.f282724d;
        android.widget.GridView gridView = viewTreeObserverOnPreDrawListenerC21747x53cf88d1.f282104h;
        if (gridView == null || gridView.getVisibility() == 0) {
            return;
        }
        viewTreeObserverOnPreDrawListenerC21747x53cf88d1.f282104h.setVisibility(0);
    }
}
