package p00;

/* loaded from: classes11.dex */
public final class b implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final p00.b f431883d = new p00.b();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        p00.d dVar = (p00.d) obj;
        p00.d dVar2 = (p00.d) obj2;
        int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(dVar.f431890a.f489859a, dVar2.f431890a.f489859a);
        return i17 != 0 ? i17 : dVar.f431890a.f489860b.compareTo(dVar2.f431890a.f489860b);
    }
}
