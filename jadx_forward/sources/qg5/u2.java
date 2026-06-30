package qg5;

/* loaded from: classes5.dex */
public final class u2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.z2 f444737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f444738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f444739f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f444740g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f444741h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444742i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(qg5.z2 z2Var, android.content.Context context, java.util.List list, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, yz5.a aVar) {
        super(1);
        this.f444737d = z2Var;
        this.f444738e = context;
        this.f444739f = list;
        this.f444740g = z3Var;
        this.f444741h = z17;
        this.f444742i = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        qg5.z2 service = this.f444737d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        if (!jm0.g.class.isAssignableFrom(qg5.q4.class)) {
            throw new java.lang.IllegalArgumentException(qg5.z2.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(service.getViewModel(), new jm0.e(service)).a(qg5.q4.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ((qg5.q4) ((jm0.g) a17)).W6(this.f444738e, this.f444739f, this.f444740g, this.f444741h, mVar, this.f444742i);
        return jz5.f0.f384359a;
    }
}
