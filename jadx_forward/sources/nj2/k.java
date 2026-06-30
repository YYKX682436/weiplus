package nj2;

/* loaded from: classes3.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final nj2.k f419371d = new nj2.k();

    public k() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        km2.q user = (km2.q) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(user, "user");
        boolean z17 = false;
        if (!user.f390710h && !pm0.v.z((int) user.f390719q, intValue)) {
            int i17 = user.f390714l;
            if (!(i17 == 3 || i17 == 4)) {
                z17 = true;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
