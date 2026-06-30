package kz5;

/* loaded from: classes10.dex */
public abstract class q1 extends kz5.p1 {
    public static final java.util.Set g(java.util.Set set, java.lang.Iterable elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        java.util.Collection<?> x17 = kz5.h0.x(elements);
        if (x17.isEmpty()) {
            return kz5.n0.X0(set);
        }
        if (!(x17 instanceof java.util.Set)) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(set);
            linkedHashSet.removeAll(x17);
            return linkedHashSet;
        }
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        for (java.lang.Object obj : set) {
            if (!x17.contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static final java.util.Set h(java.util.Set set, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "<this>");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(kz5.b1.d(set.size()));
        boolean z17 = false;
        for (java.lang.Object obj2 : set) {
            boolean z18 = true;
            if (!z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, obj)) {
                z17 = true;
                z18 = false;
            }
            if (z18) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static final java.util.Set i(java.util.Set set, java.lang.Iterable elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        java.lang.Integer valueOf = elements instanceof java.util.Collection ? java.lang.Integer.valueOf(((java.util.Collection) elements).size()) : null;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(kz5.b1.d(valueOf != null ? set.size() + valueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        kz5.h0.u(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final java.util.Set j(java.util.Set set, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "<this>");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(kz5.b1.d(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
