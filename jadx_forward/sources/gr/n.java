package gr;

/* loaded from: classes15.dex */
public final class n extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f356205b = new java.util.ArrayList();

    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parser, "parser");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, "VerRange")) {
            g(parser);
            return;
        }
        jz5.u b17 = r26.q0.b(r26.n0.W(d(parser, "min"), "0x"), 16);
        int i17 = b17 != null ? b17.f384381d : 0;
        jz5.u b18 = r26.q0.b(r26.n0.W(d(parser, "max"), "0x"), 16);
        ((java.util.ArrayList) this.f356205b).add(new jz5.l(new jz5.u(i17), new jz5.u(b18 != null ? b18.f384381d : 0)));
        g(parser);
    }
}
