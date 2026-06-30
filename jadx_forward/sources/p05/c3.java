package p05;

/* loaded from: classes15.dex */
public final class c3 extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public int f432005b;

    /* renamed from: c, reason: collision with root package name */
    public int f432006c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f432007d = new java.util.LinkedList();

    @Override // gr.b
    public void a(org.xmlpull.v1.XmlPullParser parser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parser, "parser");
        this.f432007d.clear();
        super.a(parser);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parser, "parser");
        switch (tag.hashCode()) {
            case -6913209:
                if (tag.equals("ModelList")) {
                    return;
                }
                g(parser);
                return;
            case 74517257:
                if (tag.equals(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3252x58f9a604)) {
                    p05.b3 b3Var = new p05.b3();
                    b3Var.a(parser);
                    this.f432007d.add(b3Var);
                    return;
                }
                g(parser);
                return;
            case 632394518:
                if (tag.equals("ConfigVersion")) {
                    this.f432006c = e(parser);
                    return;
                }
                g(parser);
                return;
            case 2099446622:
                if (tag.equals("SDKVersion")) {
                    this.f432005b = e(parser);
                    return;
                }
                g(parser);
                return;
            default:
                g(parser);
                return;
        }
    }
}
