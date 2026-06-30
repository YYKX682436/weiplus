package ns4;

/* loaded from: classes8.dex */
public final class k4 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ka7 f421111a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f421112b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f421113c;

    public k4(r45.ka7 halfPageData, yz5.l clickConfirmCallback, yz5.l clickCancelCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(halfPageData, "halfPageData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickConfirmCallback, "clickConfirmCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickCancelCallback, "clickCancelCallback");
        this.f421111a = halfPageData;
        this.f421112b = clickConfirmCallback;
        this.f421113c = clickCancelCallback;
    }

    /* renamed from: equals */
    public boolean m149952xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns4.k4)) {
            return false;
        }
        ns4.k4 k4Var = (ns4.k4) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f421111a, k4Var.f421111a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f421112b, k4Var.f421112b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f421113c, k4Var.f421113c);
    }

    /* renamed from: hashCode */
    public int m149953x8cdac1b() {
        return (((this.f421111a.hashCode() * 31) + this.f421112b.hashCode()) * 31) + this.f421113c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m149954x9616526c() {
        return "WeCoinSubscriptionAgreementViewParameter(halfPageData=" + this.f421111a + ", clickConfirmCallback=" + this.f421112b + ", clickCancelCallback=" + this.f421113c + ')';
    }
}
