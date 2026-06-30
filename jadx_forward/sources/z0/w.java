package z0;

/* loaded from: classes12.dex */
public abstract class w {
    public static java.lang.String a(java.util.List list, java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, int i17, java.lang.CharSequence truncated, yz5.l lVar, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            separator = ", ";
        }
        if ((i18 & 2) != 0) {
            prefix = "";
        }
        if ((i18 & 4) != 0) {
            postfix = "";
        }
        if ((i18 & 8) != 0) {
            i17 = -1;
        }
        if ((i18 & 16) != 0) {
            truncated = "...";
        }
        if ((i18 & 32) != 0) {
            lVar = null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(separator, "separator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postfix, "postfix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(truncated, "truncated");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(prefix);
        int size = list.size();
        int i19 = 0;
        for (int i27 = 0; i27 < size; i27++) {
            java.lang.Object obj2 = list.get(i27);
            i19++;
            if (i19 > 1) {
                sb6.append(separator);
            }
            if (i17 >= 0 && i19 > i17) {
                break;
            }
            if (lVar != null) {
                sb6.append((java.lang.CharSequence) lVar.mo146xb9724478(obj2));
            } else if (obj2 != null ? obj2 instanceof java.lang.CharSequence : true) {
                sb6.append((java.lang.CharSequence) obj2);
            } else if (obj2 instanceof java.lang.Character) {
                sb6.append(((java.lang.Character) obj2).charValue());
            } else {
                sb6.append((java.lang.CharSequence) java.lang.String.valueOf(obj2));
            }
        }
        if (i17 >= 0 && i19 > i17) {
            sb6.append(truncated);
        }
        sb6.append(postfix);
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb7;
    }
}
