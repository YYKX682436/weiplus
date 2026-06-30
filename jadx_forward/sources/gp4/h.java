package gp4;

/* loaded from: classes10.dex */
public final class h implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final gp4.h f355943d = new gp4.h();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        bv3.d dVar = (bv3.d) obj;
        bv3.d dVar2 = (bv3.d) obj2;
        if (dVar.c() == dVar2.c()) {
            return 0;
        }
        return (dVar.c() >= dVar2.c() && (dVar.c() != dVar2.c() || dVar.b() >= dVar2.b())) ? 1 : -1;
    }
}
