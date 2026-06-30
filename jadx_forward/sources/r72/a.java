package r72;

/* loaded from: classes16.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f474663d;

    public a() {
        int mo75927x8ded05a8 = super.mo75927x8ded05a8(new com.p314xaae8f345.mm.p2495xc50a8b8b.k[]{com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, dm.i4.f66875xa013b0d5), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "appid"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "pkgtype"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "iconurl"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "type"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "pagepath"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "sourcedisplayname"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "version"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "disableforward"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "tradingguaranteeflag"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "showRelievedBuyFlag"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "messageextradata"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "subtype")});
        this.f474663d = mo75927x8ded05a8;
        super.m126741x8589bfe1("appbranditem");
        super.m126744x8061d213("");
        super.m126742x3674fae4(true);
        super.m75950x7e1708ed(mo75927x8ded05a8, new java.lang.Object[]{"", "", 0, "", 0, "", "", 0, 0, 0, 0, "", 0});
    }

    public void A(java.lang.String str) {
        super.set(this.f474663d + 6, str);
    }

    public void B(int i17) {
        super.set(this.f474663d + 12, java.lang.Integer.valueOf(i17));
    }

    public void C(int i17) {
        super.set(this.f474663d + 9, java.lang.Integer.valueOf(i17));
    }

    public void E(int i17) {
        super.set(this.f474663d + 4, java.lang.Integer.valueOf(i17));
    }

    public void F(java.lang.String str) {
        super.set(this.f474663d + 0, str);
    }

    public void G(int i17) {
        super.set(this.f474663d + 7, java.lang.Integer.valueOf(i17));
    }

    /* renamed from: getAppid */
    public java.lang.String m161978x74292946() {
        return super.m75945x2fec8307(this.f474663d + 1);
    }

    /* renamed from: getIconUrl */
    public java.lang.String m161979x9f7ace00() {
        return super.m75945x2fec8307(this.f474663d + 3);
    }

    /* renamed from: getSubType */
    public int m161980xce6ddd64() {
        return super.m75939xb282bd08(this.f474663d + 12);
    }

    /* renamed from: getType */
    public int m161981xfb85f7b0() {
        return super.m75939xb282bd08(this.f474663d + 4);
    }

    /* renamed from: getVersion */
    public int m161982x52c258a2() {
        return super.m75939xb282bd08(this.f474663d + 7);
    }

    public int j() {
        return super.m75939xb282bd08(this.f474663d + 8);
    }

    public java.lang.String k() {
        return super.m75945x2fec8307(this.f474663d + 11);
    }

    public java.lang.String l() {
        return super.m75945x2fec8307(this.f474663d + 5);
    }

    public int n() {
        return super.m75939xb282bd08(this.f474663d + 2);
    }

    public int o() {
        return super.m75939xb282bd08(this.f474663d + 10);
    }

    public java.lang.String p() {
        return super.m75945x2fec8307(this.f474663d + 6);
    }

    @Override // e14.l
    /* renamed from: processXmlValueUseCData */
    public boolean mo9591x1c1437af(java.lang.Object value, java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemTagName, "itemTagName");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tagName, "messageextradata")) {
            return true;
        }
        return super.mo9591x1c1437af(value, tagName, itemTagName, z17);
    }

    public int q() {
        return super.m75939xb282bd08(this.f474663d + 9);
    }

    public java.lang.String r() {
        return super.m75945x2fec8307(this.f474663d + 0);
    }

    public void s(java.lang.String str) {
        super.set(this.f474663d + 1, str);
    }

    public void t(int i17) {
        super.set(this.f474663d + 8, java.lang.Integer.valueOf(i17));
    }

    public void u(java.lang.String str) {
        super.set(this.f474663d + 3, str);
    }

    public void w(java.lang.String str) {
        super.set(this.f474663d + 11, str);
    }

    public void x(java.lang.String str) {
        super.set(this.f474663d + 5, str);
    }

    public void y(int i17) {
        super.set(this.f474663d + 2, java.lang.Integer.valueOf(i17));
    }

    public void z(int i17) {
        super.set(this.f474663d + 10, java.lang.Integer.valueOf(i17));
    }
}
