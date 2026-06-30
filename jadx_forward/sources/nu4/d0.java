package nu4;

/* loaded from: classes7.dex */
public abstract class d0 {
    public static final java.lang.String a(java.lang.String host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        return "_manifest_" + host.hashCode();
    }

    public static final java.lang.String b(nu4.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<this>");
        r45.m83 m83Var = aVar.f421767b;
        java.lang.String str = m83Var.f461768i;
        boolean z17 = true;
        if (!(str == null || str.length() == 0)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            return str;
        }
        java.lang.String str2 = m83Var.f461763d;
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        r45.l83 l83Var = aVar.f421766a;
        if (z17) {
            java.lang.String str3 = l83Var.f460759d;
            return str3 == null ? "" : str3;
        }
        java.lang.String str4 = m83Var.f461763d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
        if (!r26.i0.y(str4, "/", false)) {
            str4 = "/".concat(str4);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "let(...)");
        java.lang.String t17 = r26.i0.t(str4, "/", "_", false);
        java.lang.String str5 = l83Var.f460759d;
        return (str5 != null ? str5 : "").concat(t17);
    }
}
