package f73;

/* loaded from: classes15.dex */
public abstract class g extends f73.a {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f341589a = jz5.h.b(new f73.f(this));

    @Override // f73.a
    public void a(org.xmlpull.v1.XmlPullParser parser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parser, "parser");
        java.lang.String e17 = e(parser, dm.i4.f66865x76d1ec5a);
        long d17 = d(parser, "createtime");
        g().m65040x684351d(e17);
        g().m65036x6e018feb(d17);
        super.a(parser);
    }

    @Override // f73.a
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parser, "parser");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, "displaySourceName")) {
            g().m65037x82d0cf66(f(parser));
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 g() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) ((jz5.n) this.f341589a).mo141623x754a37bb();
    }

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 h();
}
