package kz5;

/* loaded from: classes.dex */
public abstract class g0 extends kz5.f0 {
    public static final void s(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        if (list.size() > 1) {
            java.util.Collections.sort(list);
        }
    }

    public static final void t(java.util.List list, java.util.Comparator comparator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comparator, "comparator");
        if (list.size() > 1) {
            java.util.Collections.sort(list, comparator);
        }
    }
}
