package te5;

/* loaded from: classes9.dex */
public abstract class p1 {
    public static final java.lang.String a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p15.s q17;
        java.lang.String r17;
        java.lang.Integer q18;
        if (f9Var == null) {
            return "";
        }
        p15.e eVar = new p15.e();
        java.lang.String str = f9Var.G;
        if (str == null) {
            return "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMsgSource(...)");
        eVar.m126728xdc93280d(str);
        if (eVar.q() == null) {
            return "";
        }
        p15.s q19 = eVar.q();
        boolean z17 = false;
        if (q19 != null && (q18 = q19.q()) != null && q18.intValue() == 1) {
            z17 = true;
        }
        if (!z17) {
            return "";
        }
        p15.s q27 = eVar.q();
        return ((q27 != null ? q27.r() : null) == null || (q17 = eVar.q()) == null || (r17 = q17.r()) == null) ? "" : r17;
    }
}
