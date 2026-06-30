package q16;

/* loaded from: classes13.dex */
public abstract class p0 {
    public static final java.lang.String a(n16.g gVar) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gVar, "<this>");
        java.lang.String h17 = gVar.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "asString(...)");
        boolean z18 = true;
        if (!((java.util.HashSet) q16.i0.f441292a).contains(h17)) {
            int i17 = 0;
            while (true) {
                if (i17 >= h17.length()) {
                    z17 = false;
                    break;
                }
                char charAt = h17.charAt(i17);
                if ((java.lang.Character.isLetterOrDigit(charAt) || charAt == '_') ? false : true) {
                    z17 = true;
                    break;
                }
                i17++;
            }
            if (!z17) {
                if (!(h17.length() == 0) && java.lang.Character.isJavaIdentifierStart(h17.codePointAt(0))) {
                    z18 = false;
                }
            }
        }
        if (!z18) {
            java.lang.String h18 = gVar.h();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h18, "asString(...)");
            return h18;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String h19 = gVar.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h19, "asString(...)");
        sb6.append("`".concat(h19));
        sb6.append('`');
        return sb6.toString();
    }

    public static final java.lang.String b(java.util.List pathSegments) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pathSegments, "pathSegments");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = pathSegments.iterator();
        while (it.hasNext()) {
            n16.g gVar = (n16.g) it.next();
            if (sb6.length() > 0) {
                sb6.append(".");
            }
            sb6.append(a(gVar));
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public static final java.lang.String c(java.lang.String lowerRendered, java.lang.String lowerPrefix, java.lang.String upperRendered, java.lang.String upperPrefix, java.lang.String foldedPrefix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lowerRendered, "lowerRendered");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lowerPrefix, "lowerPrefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(upperRendered, "upperRendered");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(upperPrefix, "upperPrefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(foldedPrefix, "foldedPrefix");
        if (!r26.i0.y(lowerRendered, lowerPrefix, false) || !r26.i0.y(upperRendered, upperPrefix, false)) {
            return null;
        }
        java.lang.String substring = lowerRendered.substring(lowerPrefix.length());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        java.lang.String substring2 = upperRendered.substring(upperPrefix.length());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
        java.lang.String concat = foldedPrefix.concat(substring);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(substring, substring2)) {
            return concat;
        }
        if (!d(substring, substring2)) {
            return null;
        }
        return concat + '!';
    }

    public static final boolean d(java.lang.String lower, java.lang.String upper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lower, "lower");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(upper, "upper");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lower, r26.i0.t(upper, "?", "", false)) && (!r26.i0.n(upper, "?", false) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lower.concat("?"), upper))) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("(" + lower + ")?", upper)) {
                return false;
            }
        }
        return true;
    }
}
