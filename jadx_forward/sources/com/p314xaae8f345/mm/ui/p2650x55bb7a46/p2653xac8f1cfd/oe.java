package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.y0.class)
/* loaded from: classes5.dex */
public final class oe extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.y0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f281173e;

    /* renamed from: f, reason: collision with root package name */
    public final xg3.h0 f281174f = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.me(this);

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).n0(this.f281174f, android.os.Looper.getMainLooper());
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).za(this.f281174f);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        if (this.f280113d.g().getIntent().getBooleanExtra("return_to_origin_when_inactive", false)) {
            if (this.f281173e) {
                this.f280113d.f542250l.m78404x57ea1e4a("finish_direct", false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HasSentMsgComponent", "set KFinishDirect to false");
            } else {
                this.f280113d.f542250l.m78404x57ea1e4a("finish_direct", true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HasSentMsgComponent", "set KFinishDirect to true");
            }
        }
    }
}
