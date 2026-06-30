package ft1;

/* loaded from: classes8.dex */
public abstract class k {
    public static final java.lang.String a(r45.mx6 mx6Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mx6Var, "<this>");
        return "direction:" + mx6Var.f462433d + " msgid:" + mx6Var.f462434e + " create_time:" + mx6Var.f462436g + " content:" + mx6Var.f462435f;
    }

    public static final java.lang.String b(r45.yx6 yx6Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yx6Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("status: ");
        sb6.append(yx6Var.f473015e);
        sb6.append(", version: ");
        sb6.append(yx6Var.f473017g);
        sb6.append(" VerifyMsg: ");
        sb6.append(yx6Var.f473016f.size());
        sb6.append(", username: ");
        sb6.append(yx6Var.f473014d);
        sb6.append(", lastRecvMsg:");
        r45.mx6 mx6Var = yx6Var.f473018h;
        sb6.append(mx6Var != null ? a(mx6Var) : null);
        return sb6.toString();
    }
}
