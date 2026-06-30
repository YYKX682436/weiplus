package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271874d;

    public h3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271874d = c19666xfd6e2f33;
    }

    @Override // java.lang.Runnable
    public void run() {
        hv4.l lVar = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.f271483x6;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271874d;
        c19666xfd6e2f33.f271628x5 = java.lang.Math.round(com.p314xaae8f345.mm.ui.gk.a(c19666xfd6e2f33.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a8t)));
        c19666xfd6e2f33.B5 = java.lang.Math.round(com.p314xaae8f345.mm.ui.gk.a(c19666xfd6e2f33.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a8s)));
        int bottom = (c19666xfd6e2f33.f271489a4.getBottom() - com.p314xaae8f345.mm.ui.zk.a(c19666xfd6e2f33.getContext(), 48)) - com.p314xaae8f345.mm.ui.bk.p(c19666xfd6e2f33.getContext());
        c19666xfd6e2f33.f271635y5 = bottom;
        int i17 = c19666xfd6e2f33.f271590r5;
        if (bottom <= i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "invalid maxHeight, value:%s", java.lang.Integer.valueOf(bottom));
            c19666xfd6e2f33.f271635y5 = i17 * 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "transMinHeight:%s, transHeight:%s, normalHeight:%s, maxHeight:%s, cancelWidth:%s, voiceWidth:%s, transWidth:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c19666xfd6e2f33.f271628x5), java.lang.Integer.valueOf(c19666xfd6e2f33.B5), java.lang.Integer.valueOf(c19666xfd6e2f33.f271635y5), java.lang.Integer.valueOf(c19666xfd6e2f33.f271602t5), java.lang.Integer.valueOf(c19666xfd6e2f33.C5), java.lang.Integer.valueOf(c19666xfd6e2f33.f271596s5));
    }
}
