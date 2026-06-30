package gr;

/* loaded from: classes15.dex */
public final class l extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public final f21.h f356203b = new f21.h();

    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parser, "parser");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, "AppId");
        f21.h hVar = this.f356203b;
        if (b17) {
            hVar.f340437d = f(parser);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, "UserName")) {
            hVar.f340438e = f(parser);
        } else {
            g(parser);
        }
    }
}
