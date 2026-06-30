package du3;

/* loaded from: classes.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static du3.b a(du3.a aVar, java.lang.String template, java.lang.String title, java.lang.String hostUrl, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            aVar.getClass();
            hostUrl = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_photo_edit_ai_generate_host, "https://yuanbao.tencent.com/aigi/generate/", true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hostUrl, "getExpt(...)");
        }
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(template, "template");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hostUrl, "hostUrl");
        return new du3.b(du3.b.f325052k, template, title, hostUrl);
    }

    public final du3.b b() {
        java.lang.String r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.pdt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        du3.a aVar = du3.b.f325046e;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_photo_edit_ai_generate_host, "https://yuanbao.tencent.com/aigi/generate/", true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Zi, "getExpt(...)");
        return new du3.b(0, "", r17, Zi);
    }
}
