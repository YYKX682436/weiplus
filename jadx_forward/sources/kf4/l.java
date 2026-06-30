package kf4;

/* loaded from: classes4.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public static final kf4.l f389016d = new kf4.l();

    public l() {
        super(4);
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        long longValue = ((java.lang.Number) obj).longValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        java.lang.String fromUser = (java.lang.String) obj3;
        java.lang.String storyOwner = (java.lang.String) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUser, "fromUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyOwner, "storyOwner");
        pm0.v.L("ContactSyncFetcher_checkContactState", true, new kf4.k(longValue, booleanValue, storyOwner, fromUser));
        return jz5.f0.f384359a;
    }
}
