package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class n0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k0 f281061a;

    public n0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k0 k0Var) {
        this.f281061a = k0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatBotComponent", "msg.what = %s", java.lang.Integer.valueOf(message.what));
        int i17 = message.what;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k0 k0Var = this.f281061a;
        if (i17 == 1) {
            k0Var.m0(true);
            return;
        }
        if (i17 == 2) {
            k0Var.getClass();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            k0Var.f280865h = currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatBotComponent", "setTypingChattingTitle, tick = %s", java.lang.Long.valueOf(currentTimeMillis));
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) k0Var.f280113d.f542241c.a(sb5.z0.class))).A0(com.p314xaae8f345.mm.R.C30867xcad56011.b67);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe peVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) k0Var.f280113d.f542241c.a(sb5.z0.class));
            peVar.getClass();
            if (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(peVar.f280113d.x())) {
                android.widget.ImageView imageView = (android.widget.ImageView) peVar.f280113d.f542250l.mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.vfy);
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                peVar.f280113d.f542250l.mo78691x3f86539a("");
            }
        }
    }
}
