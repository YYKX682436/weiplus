package qg5;

/* loaded from: classes5.dex */
public final class w2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.z2 f444770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f444771e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f444772f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f444773g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f444774h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f444775i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444776m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(qg5.z2 z2Var, android.content.Context context, java.util.List list, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, boolean z18, yz5.a aVar) {
        super(1);
        this.f444770d = z2Var;
        this.f444771e = context;
        this.f444772f = list;
        this.f444773g = z3Var;
        this.f444774h = z17;
        this.f444775i = z18;
        this.f444776m = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        qg5.z2 service = this.f444770d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        if (!jm0.g.class.isAssignableFrom(qg5.u3.class)) {
            throw new java.lang.IllegalArgumentException(qg5.z2.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(service.getViewModel(), new jm0.e(service)).a(qg5.u3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ((qg5.u3) ((jm0.g) a17)).V6(this.f444771e, this.f444772f, this.f444773g, mVar, this.f444774h, this.f444775i, this.f444776m);
        return jz5.f0.f384359a;
    }
}
