package r15;

/* loaded from: classes12.dex */
public class g extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f450179d;

    public g() {
        int mo75927x8ded05a8 = super.mo75927x8ded05a8(new com.p314xaae8f345.mm.p2495xc50a8b8b.k[]{com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "start"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "end"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "startindex"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "endindex"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "quotemd5")});
        this.f450179d = mo75927x8ded05a8;
        super.m126741x8589bfe1("partialtext");
        super.m126744x8061d213("");
        super.m126742x3674fae4(true);
        super.m75950x7e1708ed(mo75927x8ded05a8, new java.lang.Object[]{null, null, 0, 0, null});
    }

    @Override // e14.l
    /* renamed from: checkValueSkip */
    public boolean mo126753x40072e68(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fieldSerializeName, "fieldSerializeName");
        return false;
    }

    /* renamed from: getEndIndex */
    public int m161298xe17b3e2d() {
        return super.m75939xb282bd08(this.f450179d + 3);
    }

    /* renamed from: getMd5 */
    public java.lang.String m161299xb5885648() {
        return super.m75945x2fec8307(this.f450179d + 4);
    }

    public java.lang.String j() {
        return super.m75945x2fec8307(this.f450179d + 1);
    }

    public java.lang.String k() {
        return super.m75945x2fec8307(this.f450179d + 0);
    }

    public int l() {
        return super.m75939xb282bd08(this.f450179d + 2);
    }

    public void n(java.lang.String str) {
        super.set(this.f450179d + 1, str);
    }

    public void o(int i17) {
        super.set(this.f450179d + 3, java.lang.Integer.valueOf(i17));
    }

    public void p(java.lang.String str) {
        super.set(this.f450179d + 4, str);
    }

    @Override // e14.l
    /* renamed from: processXmlValueUseCData */
    public boolean mo9591x1c1437af(java.lang.Object value, java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemTagName, "itemTagName");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tagName, "start") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tagName, "end")) {
            return true;
        }
        return super.mo9591x1c1437af(value, tagName, itemTagName, z17);
    }

    public void q(java.lang.String str) {
        super.set(this.f450179d + 0, str);
    }

    public void r(int i17) {
        super.set(this.f450179d + 2, java.lang.Integer.valueOf(i17));
    }
}
