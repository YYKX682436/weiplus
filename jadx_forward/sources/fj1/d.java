package fj1;

/* loaded from: classes7.dex */
public final class d implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final fj1.d f344641d = new fj1.d();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        fj1.k kVar = (fj1.k) obj;
        fj1.k kVar2 = (fj1.k) obj2;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar, kVar2)) {
            return 0;
        }
        return kVar.hashCode() - kVar2.hashCode();
    }
}
