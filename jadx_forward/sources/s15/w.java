package s15;

/* loaded from: classes9.dex */
public class w extends k15.b {

    /* renamed from: e, reason: collision with root package name */
    public final int f483715e;

    public w() {
        int mo75927x8ded05a8 = super.mo75927x8ded05a8(new com.p314xaae8f345.mm.p2495xc50a8b8b.k[]{com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(-1, "noteinfo", s15.a0.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.t(-1, "datalist", s15.h.class, "dataitem"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "favusername"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "favcreatetime"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.n(-1, "edittime"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "editusr"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "isChatRoom")});
        this.f483715e = mo75927x8ded05a8;
        super.m126741x8589bfe1("recordinfo");
        super.m126744x8061d213("");
        super.m126742x3674fae4(true);
        super.m75950x7e1708ed(mo75927x8ded05a8, new java.lang.Object[]{null, new java.util.LinkedList(), "", "", 0L, "", 0});
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
        return super.m75940x3e48ce4d(this.f483715e + 1);
    }

    public void k(int i17) {
        super.set(this.f483715e + 6, java.lang.Integer.valueOf(i17));
    }

    public void l(java.util.LinkedList linkedList) {
        super.set(this.f483715e + 1, linkedList);
    }

    public void n(long j17) {
        super.set(this.f483715e + 4, java.lang.Long.valueOf(j17));
    }

    public void o(java.lang.String str) {
        super.set(this.f483715e + 5, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f483715e + 3, str);
    }

    public void q(s15.a0 a0Var) {
        super.set(this.f483715e + 0, a0Var);
    }
}
