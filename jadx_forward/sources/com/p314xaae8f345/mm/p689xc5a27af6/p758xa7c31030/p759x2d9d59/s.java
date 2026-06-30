package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes12.dex */
public final class s extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: e, reason: collision with root package name */
    public jz5.l f149011e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Handler f149012f;

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f149007a = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.r.f149002d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f149008b = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.k.f148969d);

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f149009c = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.j.f148963d);

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s f149010d = this;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f149013g = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.m(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f149014h = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.q(this));

    public final void a() {
        synchronized (this.f149010d) {
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.a2.a().removeCallbacks((java.lang.Runnable) ((jz5.n) this.f149013g).mo141623x754a37bb());
            android.os.Handler handler = this.f149012f;
            if (handler != null) {
                handler.removeCallbacks((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.p) ((jz5.n) this.f149014h).mo141623x754a37bb());
            }
            this.f149011e = null;
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState) ((jz5.n) this.f149007a).mo141623x754a37bb()).mo45068xfec5eff7();
        a();
        synchronized (this.f149010d) {
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.a2.a().postDelayed((java.lang.Runnable) ((jz5.n) this.f149013g).mo141623x754a37bb(), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState) ((jz5.n) this.f149007a).mo141623x754a37bb()).mo45067xcd4bed6d();
        a();
    }
}
