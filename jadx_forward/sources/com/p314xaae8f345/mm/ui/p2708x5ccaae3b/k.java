package com.p314xaae8f345.mm.ui.p2708x5ccaae3b;

/* loaded from: classes12.dex */
public class k extends com.p314xaae8f345.mm.ui.p2708x5ccaae3b.q implements java.lang.Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b f290285f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b c22410xc19c546b, com.p314xaae8f345.mm.ui.p2708x5ccaae3b.i iVar) {
        super(c22410xc19c546b, null);
        this.f290285f = c22410xc19c546b;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b c22410xc19c546b = this.f290285f;
        if (c22410xc19c546b.d(c22410xc19c546b.I) != null) {
            int i17 = c22410xc19c546b.I;
            if (i17 != -2) {
                c22410xc19c546b.H.a(c22410xc19c546b.getFirstVisiblePosition() + i17);
            }
            com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b c22410xc19c546b2 = this.f290290e;
            if (c22410xc19c546b2.hasWindowFocus()) {
                c22410xc19c546b2.getWindowAttachCount();
                int i18 = this.f290289d;
            }
            c22410xc19c546b.f290238J = 2;
        }
    }
}
