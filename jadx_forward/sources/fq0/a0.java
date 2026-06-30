package fq0;

/* loaded from: classes.dex */
public abstract class a0 {
    public static final java.lang.String a(java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(copyOnWriteArraySet, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            sb6.append(((java.lang.Integer) it.next()) + ", ");
        }
        sb6.append("]");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
