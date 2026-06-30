package o26;

/* loaded from: classes15.dex */
public abstract class a {
    public static final void a(java.util.Collection collection, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collection, "<this>");
        if (obj != null) {
            collection.add(obj);
        }
    }

    public static final java.util.List b(java.util.ArrayList arrayList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return kz5.p0.f395529d;
        }
        if (size == 1) {
            return kz5.b0.c(kz5.n0.X(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
