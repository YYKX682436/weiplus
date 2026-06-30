package t71;

/* loaded from: classes15.dex */
public abstract class d {
    public static void a(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, int i17, java.nio.charset.Charset charset, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            charset = r26.c.f450398a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c22621x7603e017, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(charset, "charset");
        android.text.InputFilter[] filters = c22621x7603e017.getFilters();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filters, "getFilters(...)");
        t71.c cVar = new t71.c(i17, charset);
        int length = filters.length;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(filters, length + 1);
        copyOf[length] = cVar;
        c22621x7603e017.mo81583x7e4f2d39((android.text.InputFilter[]) copyOf);
    }
}
