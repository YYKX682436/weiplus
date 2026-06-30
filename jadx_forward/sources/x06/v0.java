package x06;

/* loaded from: classes15.dex */
public abstract class v0 {
    public static n16.g a(n16.g gVar, java.lang.String str, boolean z17, java.lang.String str2, int i17, java.lang.Object obj) {
        java.lang.Object obj2;
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        if ((i17 & 8) != 0) {
            str2 = null;
        }
        if (!gVar.f415703e) {
            java.lang.String i18 = gVar.i();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i18, "getIdentifier(...)");
            boolean z18 = false;
            if (r26.i0.y(i18, str, false) && i18.length() != str.length()) {
                char charAt = i18.charAt(str.length());
                if (!('a' <= charAt && charAt < '{')) {
                    if (str2 != null) {
                        return n16.g.k(str2.concat(r26.n0.W(i18, str)));
                    }
                    if (!z17) {
                        return gVar;
                    }
                    java.lang.String W = r26.n0.W(i18, str);
                    if (!(W.length() == 0) && m26.a.b(W, 0, true)) {
                        if (W.length() == 1 || !m26.a.b(W, 1, true)) {
                            if (!(W.length() == 0)) {
                                char charAt2 = W.charAt(0);
                                if ('A' <= charAt2 && charAt2 < '[') {
                                    z18 = true;
                                }
                                if (z18) {
                                    char lowerCase = java.lang.Character.toLowerCase(charAt2);
                                    java.lang.String substring = W.substring(1);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                                    W = lowerCase + substring;
                                }
                            }
                        } else {
                            kz5.x0 it = r26.n0.G(W).iterator();
                            while (true) {
                                if (!((e06.j) it).f327747f) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it.next();
                                if (!m26.a.b(W, ((java.lang.Number) obj2).intValue(), true)) {
                                    break;
                                }
                            }
                            java.lang.Integer num = (java.lang.Integer) obj2;
                            if (num != null) {
                                int intValue = num.intValue() - 1;
                                java.lang.String substring2 = W.substring(0, intValue);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                                java.lang.String c17 = m26.a.c(substring2);
                                java.lang.String substring3 = W.substring(intValue);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring3, "substring(...)");
                                W = c17.concat(substring3);
                            } else {
                                W = m26.a.c(W);
                            }
                        }
                    }
                    if (n16.g.l(W)) {
                        return n16.g.k(W);
                    }
                }
            }
        }
        return null;
    }
}
