package p15;

/* loaded from: classes9.dex */
public class r extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f432796d;

    public r() {
        int mo75927x8ded05a8 = super.mo75927x8ded05a8(new com.p314xaae8f345.mm.p2495xc50a8b8b.k[]{com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "code_content"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "src_type")});
        this.f432796d = mo75927x8ded05a8;
        super.m126741x8589bfe1("code_info");
        super.m126744x8061d213("");
        super.m126742x3674fae4(true);
        super.m75950x7e1708ed(mo75927x8ded05a8, new java.lang.Object[]{null, 0});
    }

    public java.lang.String j() {
        return super.m75945x2fec8307(this.f432796d + 0);
    }

    public int k() {
        return super.m75939xb282bd08(this.f432796d + 1);
    }

    public void l(java.lang.String str) {
        super.set(this.f432796d + 0, str);
    }

    public void n(int i17) {
        super.set(this.f432796d + 1, java.lang.Integer.valueOf(i17));
    }

    @Override // e14.l
    /* renamed from: processXmlValueUseCData */
    public boolean mo9591x1c1437af(java.lang.Object value, java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemTagName, "itemTagName");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tagName, "code_content")) {
            return true;
        }
        return super.mo9591x1c1437af(value, tagName, itemTagName, z17);
    }
}
