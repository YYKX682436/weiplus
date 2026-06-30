package gr;

/* loaded from: classes15.dex */
public final class i extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public final f21.d f356197b = new f21.d();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0012. Please report as an issue. */
    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parser, "parser");
        int hashCode = tag.hashCode();
        f21.d dVar = this.f356197b;
        switch (hashCode) {
            case -1578523488:
                if (tag.equals("AndroidURL")) {
                    dVar.f340382f = f(parser);
                    return;
                }
                g(parser);
                return;
            case -1213391326:
                if (tag.equals("iOSURL")) {
                    dVar.f340381e = f(parser);
                    return;
                }
                g(parser);
                return;
            case -1140436484:
                if (tag.equals("LiteAppUrl")) {
                    dVar.f340384h = f(parser);
                    return;
                }
                g(parser);
                return;
            case -1061003427:
                if (tag.equals("EntryAnimType")) {
                    f21.h0 h0Var = new f21.h0();
                    h0Var.f340441f = 1;
                    int c17 = c(parser, "size");
                    h0Var.f340442g = c17;
                    h0Var.f340443h = c17;
                    h0Var.f340439d = d(parser, com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207);
                    h0Var.f340440e = e(parser);
                    dVar.f340383g = h0Var;
                    return;
                }
                g(parser);
                return;
            case 63475452:
                if (tag.equals("AppId")) {
                    dVar.f340380d = f(parser);
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
