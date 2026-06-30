package xq;

/* loaded from: classes15.dex */
public final class c extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f537504b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f537505c = "";

    /* renamed from: d, reason: collision with root package name */
    public xq.d f537506d;

    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parser, "parser");
        int hashCode = tag.hashCode();
        if (hashCode != -2092800739) {
            if (hashCode != -796017875) {
                if (hashCode == 106079 && tag.equals("key")) {
                    this.f537504b = f(parser);
                    return;
                }
            } else if (tag.equals("animFile")) {
                this.f537505c = f(parser);
                return;
            }
        } else if (tag.equals("screenEffect")) {
            xq.d dVar = new xq.d();
            dVar.a(parser);
            this.f537506d = dVar;
            return;
        }
        g(parser);
    }
}
