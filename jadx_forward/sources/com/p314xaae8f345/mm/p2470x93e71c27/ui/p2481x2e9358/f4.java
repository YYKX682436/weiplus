package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class f4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271841d;

    public f4(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271841d = c19666xfd6e2f33;
    }

    @Override // java.lang.Runnable
    public void run() {
        hv4.l lVar = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.f271483x6;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271841d;
        c19666xfd6e2f33.U0(true);
        c19666xfd6e2f33.m75516xbe62a411(true);
        boolean showSoftInput = c19666xfd6e2f33.U1.showSoftInput(c19666xfd6e2f33.f271554m.j(), 0);
        c19666xfd6e2f33.f271599t2++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "showSoftInput %b, %s", java.lang.Boolean.valueOf(showSoftInput), java.lang.Integer.valueOf(c19666xfd6e2f33.f271599t2));
        if (showSoftInput || c19666xfd6e2f33.f271599t2 >= 10) {
            return;
        }
        c19666xfd6e2f33.postDelayed(this, 100L);
    }
}
