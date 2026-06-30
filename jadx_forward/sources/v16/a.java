package v16;

/* loaded from: classes15.dex */
public class a implements o26.d {

    /* renamed from: a, reason: collision with root package name */
    public static final v16.a f514128a = new v16.a();

    @Override // o26.d
    public java.lang.Iterable a(java.lang.Object obj) {
        int i17 = v16.f.f514134a;
        java.util.Collection i18 = ((r06.s1) ((o06.l2) obj)).i();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(i18, 10));
        java.util.Iterator it = ((java.util.ArrayList) i18).iterator();
        while (it.hasNext()) {
            arrayList.add(((r06.s1) ((o06.l2) it.next())).a());
        }
        return arrayList;
    }
}
