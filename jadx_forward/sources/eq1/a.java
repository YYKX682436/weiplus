package eq1;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final eq1.a f337318a = new eq1.a();

    public final eq1.o0 a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        try {
            android.net.Uri parse = android.net.Uri.parse(str);
            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(parse.getQueryParameter("mid"), 0L);
            long V2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(parse.getQueryParameter("idx"), 0L);
            byte[] decode = android.util.Base64.decode(parse.getQueryParameter("__biz"), 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
            return new eq1.o0(V, V2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(new java.lang.String(decode, r26.c.f450398a), 0L));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BizArticleHelper", e17, "getTripletInfo", new java.lang.Object[0]);
            return null;
        }
    }
}
