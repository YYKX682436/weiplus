package xq;

/* loaded from: classes15.dex */
public final class e extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public int f537509b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f537510c = new java.util.ArrayList();

    @Override // gr.b
    public void a(org.xmlpull.v1.XmlPullParser parser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parser, "parser");
        this.f537510c.clear();
        super.a(parser);
    }

    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parser, "parser");
        int hashCode = tag.hashCode();
        if (hashCode != 3242771) {
            if (hashCode != 96632902) {
                if (hashCode == 1660947809 && tag.equals("emojiAnimVersion")) {
                    this.f537509b = e(parser);
                    return;
                }
            } else if (tag.equals("emoji")) {
                return;
            }
        } else if (tag.equals("item")) {
            xq.c cVar = new xq.c();
            cVar.a(parser);
            this.f537510c.add(cVar);
            return;
        }
        g(parser);
    }
}
