package gc0;

/* loaded from: classes5.dex */
public abstract class m1 {
    public static final boolean a(r45.nl5 nl5Var, r45.nl5 newData, yz5.l getRecommendField, yz5.l getRecommendFieldMsgId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newData, "newData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getRecommendField, "getRecommendField");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getRecommendFieldMsgId, "getRecommendFieldMsgId");
        java.lang.String str = (java.lang.String) getRecommendField.mo146xb9724478(newData);
        java.lang.String str2 = (java.lang.String) getRecommendField.mo146xb9724478(nl5Var);
        if (str2 == null || r26.n0.N(str2)) {
            if (!(str == null || r26.n0.N(str))) {
                return true;
            }
        } else {
            if (str == null || r26.n0.N(str)) {
                long longValue = ((java.lang.Number) getRecommendFieldMsgId.mo146xb9724478(nl5Var)).longValue();
                if (longValue > 0 && !newData.m75941xfb821914(5).contains(java.lang.Long.valueOf(longValue))) {
                    return true;
                }
            } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(r45.nl5 nl5Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nl5Var, "<this>");
        if (((r45.kl5) nl5Var.m75936x14adae67(1)) == null) {
            return true;
        }
        java.lang.String m75945x2fec8307 = ((r45.kl5) nl5Var.m75936x14adae67(1)).m75945x2fec8307(1);
        return m75945x2fec8307 == null || r26.n0.N(m75945x2fec8307);
    }

    public static final boolean c(r45.nl5 nl5Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nl5Var, "<this>");
        if (((r45.kl5) nl5Var.m75936x14adae67(0)) != null) {
            java.lang.String m75945x2fec8307 = ((r45.kl5) nl5Var.m75936x14adae67(0)).m75945x2fec8307(0);
            if (!(m75945x2fec8307 == null || r26.n0.N(m75945x2fec8307))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean d(r45.nl5 nl5Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nl5Var, "<this>");
        return c(nl5Var) && b(nl5Var) && ((nl5Var.m75942xfb822ef2(2) > 0L ? 1 : (nl5Var.m75942xfb822ef2(2) == 0L ? 0 : -1)) == 0);
    }

    public static final java.util.Map e(r45.nl5 nl5Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nl5Var, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        boolean c17 = c(nl5Var);
        gc0.z0 z0Var = gc0.e1.f351674o;
        if (!c17) {
            r45.kl5 kl5Var = (r45.kl5) nl5Var.m75936x14adae67(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(kl5Var, "getRemarkData(...)");
            z0Var.a(linkedHashMap, 1, kl5Var);
        }
        if (!b(nl5Var)) {
            r45.kl5 kl5Var2 = (r45.kl5) nl5Var.m75936x14adae67(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(kl5Var2, "getPhoneData(...)");
            z0Var.a(linkedHashMap, 2, kl5Var2);
        }
        if (!(nl5Var.m75942xfb822ef2(2) == 0)) {
            r45.kl5 kl5Var3 = new r45.kl5();
            kl5Var3.set(4, java.lang.Long.valueOf(nl5Var.m75942xfb822ef2(2)));
            kl5Var3.set(5, (r45.ll5) nl5Var.m75936x14adae67(6));
            z0Var.a(linkedHashMap, 3, kl5Var3);
        }
        return linkedHashMap;
    }
}
