package kz5;

/* loaded from: classes3.dex */
public abstract class e1 extends kz5.d1 {
    public static final q26.n u(java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "<this>");
        return kz5.n0.J(map.entrySet());
    }

    public static final java.util.List v(java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "<this>");
        int size = map.size();
        kz5.p0 p0Var = kz5.p0.f395529d;
        if (size == 0) {
            return p0Var;
        }
        java.util.Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return p0Var;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        if (!it.hasNext()) {
            return kz5.b0.c(new jz5.l(entry.getKey(), entry.getValue()));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        arrayList.add(new jz5.l(entry.getKey(), entry.getValue()));
        do {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
            arrayList.add(new jz5.l(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
