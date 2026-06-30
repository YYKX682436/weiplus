package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes13.dex */
public class gd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f280632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hd f280633e;

    public gd(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hd hdVar, k91.v5 v5Var) {
        this.f280633e = hdVar;
        this.f280632d = v5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        n11.a b17 = n11.a.b();
        k91.v5 v5Var = this.f280632d;
        java.lang.String str = v5Var != null ? v5Var.f68920x68aa7b8d : "";
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hd hdVar = this.f280633e;
        b17.h(str, hdVar.f280694a.f280578f, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fd.f280575n);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hdVar.f280695b.f66263x29dd02d3) || v5Var == null) {
            return;
        }
        hdVar.f280694a.f280579g.setText(v5Var.f68913x21f9b213);
    }
}
