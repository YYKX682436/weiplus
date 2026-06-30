package r72;

/* loaded from: classes9.dex */
public class g extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f474672d;

    public g() {
        int mo75927x8ded05a8 = super.mo75927x8ded05a8(new com.p314xaae8f345.mm.p2495xc50a8b8b.k[]{com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "desc"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "cdn_thumburl"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "cdn_thumbkey"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "thumb_fullmd5"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.n(-1, "thumb_size"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "favusername"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "favcreatetime"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.t(-1, "datalist", r72.d.class, "dataitem"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.n(-1, "edittime"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "editusr"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "isChatRoom")});
        this.f474672d = mo75927x8ded05a8;
        super.m126741x8589bfe1("recordinfo");
        super.m126744x8061d213("");
        super.m126742x3674fae4(true);
        super.m75950x7e1708ed(mo75927x8ded05a8, new java.lang.Object[]{"", "", "", "", "", 0L, "", "", new java.util.LinkedList(), 0L, "", 0});
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
        return super.m75940x3e48ce4d(this.f474672d + 8);
    }
}
