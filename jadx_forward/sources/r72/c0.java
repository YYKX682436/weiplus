package r72;

/* loaded from: classes12.dex */
public class c0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f474667d;

    public c0() {
        int mo75927x8ded05a8 = super.mo75927x8ded05a8(new com.p314xaae8f345.mm.p2495xc50a8b8b.k[]{com.p314xaae8f345.mm.p2495xc50a8b8b.i.t(-1, "datalist", r72.d.class, "dataitem"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "favlocalid"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "noteauthor"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "noteeditor"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "editusr"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.n(-1, "edittime")});
        this.f474667d = mo75927x8ded05a8;
        super.m126741x8589bfe1("noteinfo");
        super.m126744x8061d213("");
        super.m126742x3674fae4(true);
        super.m75950x7e1708ed(mo75927x8ded05a8, new java.lang.Object[]{new java.util.LinkedList(), "", "", "", "", 0L});
    }

    @Override // e14.l
    /* renamed from: isXmlListNeedCountAttr */
    public boolean mo126758xc983189f(java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemTagName, "itemTagName");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tagName, "datalist")) {
            return true;
        }
        return super.mo126758xc983189f(tagName, itemTagName, z17);
    }

    public java.util.LinkedList j() {
        return super.m75940x3e48ce4d(this.f474667d + 0);
    }

    public long k() {
        return super.m75942xfb822ef2(this.f474667d + 5);
    }

    public java.lang.String l() {
        return super.m75945x2fec8307(this.f474667d + 1);
    }

    public java.lang.String n() {
        return super.m75945x2fec8307(this.f474667d + 2);
    }

    public java.lang.String o() {
        return super.m75945x2fec8307(this.f474667d + 3);
    }

    public void p(long j17) {
        super.set(this.f474667d + 5, java.lang.Long.valueOf(j17));
    }

    public void q(java.lang.String str) {
        super.set(this.f474667d + 4, str);
    }

    public void r(java.lang.String str) {
        super.set(this.f474667d + 1, str);
    }

    public void s(java.lang.String str) {
        super.set(this.f474667d + 2, str);
    }

    public void t(java.lang.String str) {
        super.set(this.f474667d + 3, str);
    }
}
