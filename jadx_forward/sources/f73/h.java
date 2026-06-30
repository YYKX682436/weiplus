package f73;

/* loaded from: classes15.dex */
public final class h extends f73.g {
    @Override // f73.g, f73.a
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parser, "parser");
        switch (tag.hashCode()) {
            case -103833126:
                if (tag.equals("handofftype")) {
                    java.lang.String f17 = f(parser);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef) g()).m65039xcd356818(f17.length() == 0 ? 0 : java.lang.Integer.parseInt(f17));
                    break;
                }
                break;
            case 116079:
                if (tag.equals("url")) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef) g()).m65140xca029dad(f(parser));
                    break;
                }
                break;
            case 3226745:
                if (tag.equals("icon")) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef) g()).m65137x764b6bfb(f(parser));
                    break;
                }
                break;
            case 110371416:
                if (tag.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef) g()).m65139x53bfe316(f(parser));
                    break;
                }
                break;
        }
        super.b(tag, parser);
    }

    @Override // f73.g
    public com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 h() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef();
    }
}
