package t05;

/* loaded from: classes9.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f496061d;

    public b() {
        int mo75927x8ded05a8 = super.mo75927x8ded05a8(new com.p314xaae8f345.mm.p2495xc50a8b8b.k[]{com.p314xaae8f345.mm.p2495xc50a8b8b.i.t(-1, "datalist", h15.a.class, "dataitem")});
        this.f496061d = mo75927x8ded05a8;
        super.m126741x8589bfe1("group_notice_item");
        super.m126744x8061d213("");
        super.m126742x3674fae4(true);
        super.m75950x7e1708ed(mo75927x8ded05a8, new java.lang.Object[]{new java.util.LinkedList()});
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
        return super.m75940x3e48ce4d(this.f496061d + 0);
    }
}
