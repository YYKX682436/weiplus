package fc3;

/* loaded from: classes9.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(java.util.List list, int i17) {
        int i18 = 0;
        if (list == null || list.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            int i19 = i18 + 1;
            z21.c cVar = (z21.c) it.next();
            java.lang.String str = (i18 == 0 ? "" : "|") + cVar.f551093b + '-' + cVar.f551092a;
            if (i17 > 0) {
                byte[] bytes = (sb6.toString() + str).getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                if (bytes.length > i17) {
                    break;
                }
            }
            sb6.append(str);
            i18 = i19;
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sb7);
        return sb7;
    }
}
