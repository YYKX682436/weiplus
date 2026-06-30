package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class n3 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272030d;

    public n3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272030d = c19666xfd6e2f33;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what == 5000) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272030d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.e eVar = c19666xfd6e2f33.N3;
            eVar.f256926q = 1;
            eVar.f256927r = java.lang.System.currentTimeMillis();
            c19666xfd6e2f33.N3.f256931v = 0;
            c19666xfd6e2f33.f271597s6.d();
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.c cVar = c19666xfd6e2f33.f271571o6;
            if (cVar != null) {
                cVar.a(false, false);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) ((java.util.HashMap) c19666xfd6e2f33.f271513e6).get(java.lang.Integer.valueOf(c19666xfd6e2f33.f271615v6)))) {
                c19666xfd6e2f33.f271494b4.setFocusable(true);
                c19666xfd6e2f33.f271494b4.setFocusableInTouchMode(true);
                c19666xfd6e2f33.f271494b4.requestFocus();
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.e(c19666xfd6e2f33);
            c19666xfd6e2f33.f271559m6 = false;
        }
        return true;
    }
}
