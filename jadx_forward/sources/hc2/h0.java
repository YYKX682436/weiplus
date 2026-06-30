package hc2;

/* loaded from: classes5.dex */
public abstract class h0 {
    public static java.lang.Number a(java.util.List list, int i17, java.lang.Number number, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            number = 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(number, "default");
        if (list == null || i17 < 0) {
            return number;
        }
        try {
            return i17 >= list.size() ? number : (java.lang.Number) list.get(i17);
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "safeGet");
            return number;
        }
    }
}
