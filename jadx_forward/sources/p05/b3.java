package p05;

/* loaded from: classes15.dex */
public final class b3 extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f431995b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f431996c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f431997d = "";

    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parser, "parser");
        int hashCode = tag.hashCode();
        if (hashCode != 75327) {
            if (hashCode != 2420395) {
                if (hashCode == 2575653 && tag.equals("Sha1")) {
                    this.f431997d = f(parser);
                    return;
                }
            } else if (tag.equals("Name")) {
                this.f431996c = f(parser);
                return;
            }
        } else if (tag.equals("Key")) {
            this.f431995b = f(parser);
            return;
        }
        g(parser);
    }
}
