package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jg.class)
/* loaded from: classes9.dex */
public final class w7 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jg {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v7 f281690e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f281691f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f281692g;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        m0("onComponentUnInstall");
        super.I();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        m0("onChattingExitAnimEnd");
    }

    public final void m0(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v7 v7Var = this.f281690e;
        java.lang.String str2 = this.f281691f;
        if (v7Var != null) {
            if (!(str2 == null || str2.length() == 0)) {
                ej4.c0.f334868a.a(str2, this);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingTextStatusHeaderComponent", "unregister listener username=" + str2 + " reason=" + str);
            }
        }
        this.f281690e = null;
        this.f281691f = null;
        this.f281692g = false;
    }
}
