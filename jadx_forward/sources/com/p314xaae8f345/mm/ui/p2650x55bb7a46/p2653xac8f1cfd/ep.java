package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class ep implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gp f280527d;

    public ep(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gp gpVar) {
        this.f280527d = gpVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        android.view.View view;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gp gpVar = this.f280527d;
        if (gpVar.isShowing() && (view = gpVar.f280657g) != null) {
            int[] iArr = gpVar.f280660j;
            view.getLocationInWindow(iArr);
            gpVar.update((iArr[0] - gpVar.f280661k) + gpVar.f280663m, (iArr[1] - gpVar.f280662l) + gpVar.f280664n, -1, -1);
        }
        return true;
    }
}
