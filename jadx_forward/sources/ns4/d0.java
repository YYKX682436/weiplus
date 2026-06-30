package ns4;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final pr4.l f421027a;

    /* renamed from: b, reason: collision with root package name */
    public final long f421028b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.js3 f421029c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f421030d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f421031e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f421032f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f421033g;

    public d0(pr4.l consumeParameter, long j17, r45.js3 priceListResp, yz5.l clickBalanceButtonCallback, yz5.l clickCloseButtonCallback, yz5.l clickConsumeButton, yz5.l clickConsumeTips) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(consumeParameter, "consumeParameter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(priceListResp, "priceListResp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickBalanceButtonCallback, "clickBalanceButtonCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickCloseButtonCallback, "clickCloseButtonCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickConsumeButton, "clickConsumeButton");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickConsumeTips, "clickConsumeTips");
        this.f421027a = consumeParameter;
        this.f421028b = j17;
        this.f421029c = priceListResp;
        this.f421030d = clickBalanceButtonCallback;
        this.f421031e = clickCloseButtonCallback;
        this.f421032f = clickConsumeButton;
        this.f421033g = clickConsumeTips;
    }

    /* renamed from: equals */
    public boolean m149948xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns4.d0)) {
            return false;
        }
        ns4.d0 d0Var = (ns4.d0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f421027a, d0Var.f421027a) && this.f421028b == d0Var.f421028b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f421029c, d0Var.f421029c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f421030d, d0Var.f421030d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f421031e, d0Var.f421031e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f421032f, d0Var.f421032f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f421033g, d0Var.f421033g);
    }

    /* renamed from: hashCode */
    public int m149949x8cdac1b() {
        return (((((((((((this.f421027a.hashCode() * 31) + java.lang.Long.hashCode(this.f421028b)) * 31) + this.f421029c.hashCode()) * 31) + this.f421030d.hashCode()) * 31) + this.f421031e.hashCode()) * 31) + this.f421032f.hashCode()) * 31) + this.f421033g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m149950x9616526c() {
        return "WeCoinConsumePanelParameter(consumeParameter=" + this.f421027a + ", wecoinBalance=" + this.f421028b + ", priceListResp=" + this.f421029c + ", clickBalanceButtonCallback=" + this.f421030d + ", clickCloseButtonCallback=" + this.f421031e + ", clickConsumeButton=" + this.f421032f + ", clickConsumeTips=" + this.f421033g + ')';
    }
}
