package gr;

/* loaded from: classes15.dex */
public final class m extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public final f21.i f356204b = new f21.i();

    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parser, "parser");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, "AppId");
        f21.i iVar = this.f356204b;
        if (b17) {
            iVar.f340444d = f(parser);
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, "EntryAnimType")) {
            g(parser);
            return;
        }
        f21.h0 h0Var = new f21.h0();
        h0Var.f340441f = 1;
        int c17 = c(parser, "size");
        h0Var.f340442g = c17;
        h0Var.f340443h = c17;
        h0Var.f340439d = d(parser, com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207);
        h0Var.f340440e = e(parser);
        iVar.f340445e = h0Var;
    }
}
