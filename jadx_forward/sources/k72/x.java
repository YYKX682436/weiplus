package k72;

/* loaded from: classes13.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final k72.x f386306a = new k72.x();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f386307b = "S2WsXV254K2S3DE";

    /* renamed from: c, reason: collision with root package name */
    public static int f386308c = -1;

    public final java.lang.String a(int i17) {
        java.util.List t07 = kz5.n0.t0(kz5.n0.r0(new e06.c('a', 'z'), new e06.c('A', 'Z')), new e06.c('0', '9'));
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        e06.k kVar = new e06.k(1, i17);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(kVar, 10));
        java.util.Iterator it = kVar.iterator();
        while (it.hasNext()) {
            ((kz5.x0) it).b();
            arrayList.add(java.lang.Integer.valueOf(secureRandom.nextInt(((java.util.ArrayList) t07).size())));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(java.lang.Character.valueOf(((java.lang.Character) ((java.util.ArrayList) t07).get(((java.lang.Number) it6.next()).intValue())).charValue()));
        }
        return kz5.n0.g0(arrayList2, "", null, null, 0, null, null, 62, null);
    }
}
