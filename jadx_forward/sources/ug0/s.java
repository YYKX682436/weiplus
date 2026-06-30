package ug0;

/* loaded from: classes5.dex */
public final class s extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f509012f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f509013g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f509013g = new java.util.HashMap();
    }

    public static final ug0.s T6(jm0.o hostService) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hostService, "hostService");
        if (!jm0.g.class.isAssignableFrom(ug0.s.class)) {
            throw new java.lang.IllegalArgumentException(hostService.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(hostService.getViewModel(), new jm0.e(hostService)).a(ug0.s.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (ug0.s) ((jm0.g) a17);
    }

    @Override // jm0.g
    public void S6() {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f509012f;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        this.f509012f = null;
    }
}
