package gr;

/* loaded from: classes4.dex */
public final class b0 extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public final f21.d0 f356195b = new f21.d0();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0012. Please report as an issue. */
    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parser, "parser");
        int hashCode = tag.hashCode();
        f21.d0 d0Var = this.f356195b;
        switch (hashCode) {
            case -2025406440:
                if (tag.equals("SubTitle")) {
                    d0Var.f340388g = f(parser);
                    return;
                }
                g(parser);
                return;
            case -1563547017:
                if (tag.equals("CouponSmallTitle")) {
                    d0Var.f340397s = f(parser);
                    return;
                }
                g(parser);
                return;
            case -1282287868:
                if (tag.equals("ButtonTextColor")) {
                    d0Var.f340400v = f(parser);
                    return;
                }
                g(parser);
                return;
            case -1061003427:
                if (tag.equals("EntryAnimType")) {
                    f21.e0 e0Var = new f21.e0();
                    e0Var.f340423f = c(parser, "size");
                    e0Var.f340421d = d(parser, com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207);
                    e0Var.f340422e = e(parser);
                    d0Var.f340402x = e0Var;
                    return;
                }
                g(parser);
                return;
            case -834434302:
                if (tag.equals("UseLightStyle")) {
                    d0Var.f340403y = e(parser);
                    return;
                }
                g(parser);
                return;
            case -511925738:
                if (tag.equals("DefaultCover")) {
                    d0Var.f340401w = f(parser);
                    return;
                }
                g(parser);
                return;
            case -473313749:
                if (tag.equals("SubTitleColor")) {
                    d0Var.f340389h = f(parser);
                    return;
                }
                g(parser);
                return;
            case -270362873:
                if (tag.equals("RedEnvelopeCoverSmallTitle")) {
                    d0Var.f340395q = f(parser);
                    return;
                }
                g(parser);
                return;
            case 6969246:
                if (tag.equals("CouponBigTitle")) {
                    d0Var.f340396r = f(parser);
                    return;
                }
                g(parser);
                return;
            case 63475452:
                if (tag.equals("AppId")) {
                    d0Var.f340385d = f(parser);
                    return;
                }
                g(parser);
                return;
            case 231778350:
                if (tag.equals("RedEnvelopeCoverBigTitle")) {
                    d0Var.f340394p = f(parser);
                    return;
                }
                g(parser);
                return;
            case 290107061:
                if (tag.equals("BackgroundColor")) {
                    d0Var.f340392n = f(parser);
                    return;
                }
                g(parser);
                return;
            case 425268249:
                if (tag.equals("BackgroundLogo")) {
                    d0Var.f340393o = f(parser);
                    return;
                }
                g(parser);
                return;
            case 1216348288:
                if (tag.equals("BrandIcon")) {
                    d0Var.f340390i = f(parser);
                    return;
                }
                g(parser);
                return;
            case 1216495250:
                if (tag.equals("BrandName")) {
                    d0Var.f340391m = f(parser);
                    return;
                }
                g(parser);
                return;
            case 1435418957:
                if (tag.equals("LoadingAnim")) {
                    d0Var.f340398t = f(parser);
                    return;
                }
                g(parser);
                return;
            case 1465142563:
                if (tag.equals("ButtonBackgroundColor")) {
                    d0Var.f340399u = f(parser);
                    return;
                }
                g(parser);
                return;
            case 1742469119:
                if (tag.equals("MainTitle")) {
                    d0Var.f340386e = f(parser);
                    return;
                }
                g(parser);
                return;
            case 2098097828:
                if (tag.equals("MainTitleColor")) {
                    d0Var.f340387f = f(parser);
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
