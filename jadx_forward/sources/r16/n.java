package r16;

/* loaded from: classes15.dex */
public class n implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final r16.n f450201d = new r16.n();

    public static int a(o06.m mVar) {
        if (r16.i.n(mVar)) {
            return 8;
        }
        if (mVar instanceof o06.l) {
            return 7;
        }
        if (mVar instanceof o06.o1) {
            return ((o06.o1) mVar).c0() == null ? 6 : 5;
        }
        if (mVar instanceof o06.n0) {
            return ((o06.n0) mVar).c0() == null ? 4 : 3;
        }
        if (mVar instanceof o06.g) {
            return 2;
        }
        return mVar instanceof o06.d2 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer valueOf;
        o06.m mVar = (o06.m) obj;
        o06.m mVar2 = (o06.m) obj2;
        int a17 = a(mVar2) - a(mVar);
        if (a17 != 0) {
            valueOf = java.lang.Integer.valueOf(a17);
        } else if (r16.i.n(mVar) && r16.i.n(mVar2)) {
            valueOf = 0;
        } else {
            int compareTo = mVar.mo132800xfb82e301().f415702d.compareTo(mVar2.mo132800xfb82e301().f415702d);
            valueOf = compareTo != 0 ? java.lang.Integer.valueOf(compareTo) : null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
