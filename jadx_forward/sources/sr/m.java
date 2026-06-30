package sr;

/* loaded from: classes10.dex */
public final class m extends sr.l {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 f492933d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f492934e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f492935f;

    /* renamed from: g, reason: collision with root package name */
    public long f492936g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 emojiView, yz5.p downloadListener) {
        super(emojiView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiView, "emojiView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadListener, "downloadListener");
        this.f492933d = emojiView;
        this.f492934e = "MicroMsg.FinderEmojiViewDelegate";
        this.f492935f = downloadListener;
    }

    @Override // sr.l, dr.q
    public void a(boolean z17) {
        super.a(z17);
        if (this.f492936g != 0) {
            this.f492935f.mo149xb9724478(java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f492936g));
            this.f492936g = 0L;
        }
        this.f492933d.requestLayout();
    }

    @Override // sr.l, sr.a
    /* renamed from: destroy */
    public void mo165058x5cd39ffa() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy: md5=");
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f492932c;
        sb6.append(interfaceC4987x84e327cb != null ? interfaceC4987x84e327cb.mo42933xb5885648() : null);
        sb6.append(' ');
        sb6.append(this);
        sb6.append(' ');
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 abstractC10447x8c9cf7d9 = this.f492930a;
        sb6.append(abstractC10447x8c9cf7d9);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f492934e, sb6.toString());
        zq.h.f556505a.b(abstractC10447x8c9cf7d9);
    }

    @Override // sr.l, sr.a
    /* renamed from: reload */
    public void mo165059xc84a8199() {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f492932c;
        if (interfaceC4987x84e327cb != null) {
            boolean z17 = false;
            if (interfaceC4987x84e327cb != null && !interfaceC4987x84e327cb.E0()) {
                z17 = true;
            }
            if (z17) {
                this.f492936g = java.lang.System.currentTimeMillis();
            }
        }
        super.mo165059xc84a8199();
    }
}
