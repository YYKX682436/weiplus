package s10;

/* loaded from: classes7.dex */
public abstract class b {
    public static final java.lang.String a(bw5.z5 z5Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(z5Var, "<this>");
        java.lang.String str = "brs_article_" + z5Var.m13462xb5887639();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(digest);
        return kz5.z.a0(digest, "", null, null, 0, null, s10.a.f483632d, 30, null);
    }
}
