package kz5;

/* loaded from: classes2.dex */
public abstract class j0 extends kz5.i0 {
    public static final java.util.List I(java.lang.Iterable iterable, java.lang.Class klass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iterable, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(klass, "klass");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : iterable) {
            if (klass.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
