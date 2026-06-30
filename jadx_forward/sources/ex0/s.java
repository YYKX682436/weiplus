package ex0;

/* loaded from: classes5.dex */
public final class s implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final ex0.s f338705d = new ex0.s();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        ex0.r rVar = (ex0.r) obj;
        ex0.r rVar2 = (ex0.r) obj2;
        if (rVar.k().m33986x9f3f7b48(rVar2.k())) {
            return -1;
        }
        if (!rVar.k().m33971xf922bec1(rVar2.k())) {
            if (rVar.j().m33986x9f3f7b48(rVar2.j())) {
                return -1;
            }
            if (!rVar.j().m33971xf922bec1(rVar2.j())) {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                return 0;
            }
        }
        return 1;
    }
}
