package qg5;

/* loaded from: classes5.dex */
public final class v2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.z2 f444752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f444753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f444754f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444755g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(qg5.z2 z2Var, android.content.Context context, java.util.List list, yz5.a aVar) {
        super(1);
        this.f444752d = z2Var;
        this.f444753e = context;
        this.f444754f = list;
        this.f444755g = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        qg5.z2 service = this.f444752d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        if (!jm0.g.class.isAssignableFrom(qg5.q4.class)) {
            throw new java.lang.IllegalArgumentException(qg5.z2.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(service.getViewModel(), new jm0.e(service)).a(qg5.q4.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ((qg5.q4) ((jm0.g) a17)).X6(this.f444753e, this.f444754f, mVar, this.f444755g);
        return jz5.f0.f384359a;
    }
}
