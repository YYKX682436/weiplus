package k16;

/* loaded from: classes16.dex */
public abstract class i {
    public static final java.lang.Object a(p16.s sVar, p16.u extension) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extension, "extension");
        if (sVar.g(extension)) {
            return sVar.f(extension);
        }
        return null;
    }

    public static final java.lang.Object b(p16.s sVar, p16.u extension, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extension, "extension");
        sVar.k(extension);
        p16.n nVar = sVar.f432876d;
        nVar.getClass();
        p16.t tVar = extension.f432889d;
        if (!tVar.f432881f) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object e17 = nVar.e(tVar);
        if (i17 >= (e17 == null ? 0 : ((java.util.List) e17).size())) {
            return null;
        }
        sVar.k(extension);
        nVar.getClass();
        if (!tVar.f432881f) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object e18 = nVar.e(tVar);
        if (e18 != null) {
            return extension.a(((java.util.List) e18).get(i17));
        }
        throw new java.lang.IndexOutOfBoundsException();
    }
}
