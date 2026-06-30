package f73;

/* loaded from: classes15.dex */
public final class c extends f73.a {

    /* renamed from: a, reason: collision with root package name */
    public final e73.k f341586a = new e73.k(0, null, 0, 7, null);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f341587b = new java.util.ArrayList();

    @Override // f73.a
    public void a(org.xmlpull.v1.XmlPullParser parser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parser, "parser");
        int c17 = c(parser, "opcode");
        e73.k kVar = this.f341586a;
        kVar.f331485a = c17;
        d(parser, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb);
        kVar.getClass();
        super.a(parser);
        java.util.List list = this.f341587b;
        kVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<set-?>");
        kVar.f331486b = list;
    }

    @Override // f73.a
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parser, "parser");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, "handoff")) {
            int c17 = c(parser, "type");
            f73.g dVar = c17 != 1 ? c17 != 2 ? c17 != 3 ? c17 != 4 ? null : new f73.d() : new f73.e() : new f73.h() : new f73.b();
            if (dVar != null) {
                dVar.a(parser);
                com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 g17 = dVar.g();
                if (g17 != null) {
                    ((java.util.ArrayList) this.f341587b).add(g17);
                }
            }
        }
    }
}
