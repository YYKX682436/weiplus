package com.p314xaae8f345.mm.ui.p2708x5ccaae3b;

/* loaded from: classes15.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b f290286d;

    public l(com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b c22410xc19c546b) {
        this.f290286d = c22410xc19c546b;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b c22410xc19c546b = this.f290286d;
        if (c22410xc19c546b.f290238J == 0) {
            c22410xc19c546b.f290238J = 1;
            android.view.View d17 = c22410xc19c546b.d(c22410xc19c546b.I);
            if (d17 == null || d17.hasFocusable()) {
                return;
            }
            d17.setPressed(true);
            c22410xc19c546b.setPressed(true);
            c22410xc19c546b.refreshDrawableState();
            int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
            if (!c22410xc19c546b.isLongClickable()) {
                c22410xc19c546b.f290238J = 2;
                return;
            }
            if (c22410xc19c546b.f290239d == null) {
                c22410xc19c546b.f290239d = new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.k(c22410xc19c546b, null);
            }
            com.p314xaae8f345.mm.ui.p2708x5ccaae3b.k kVar = c22410xc19c546b.f290239d;
            kVar.f290289d = kVar.f290290e.getWindowAttachCount();
            c22410xc19c546b.f290241f.mo50297x7c4d7ca2(c22410xc19c546b.f290239d, longPressTimeout);
        }
    }
}
