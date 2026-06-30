package r10;

/* loaded from: classes7.dex */
public abstract class a {
    public static final bw5.x7 a(bw5.x7 x7Var, java.lang.String base64Str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(x7Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(base64Str, "base64Str");
        try {
            x7Var.mo11468x92b714fd(android.util.Base64.decode(base64Str, 0));
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("EcsJumpInfo", e17, "parse bytes failed", new java.lang.Object[0]);
        } catch (java.lang.IllegalArgumentException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("EcsJumpInfo", e18, "invalid base64", new java.lang.Object[0]);
        }
        return x7Var;
    }
}
