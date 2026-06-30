package qg5;

/* loaded from: classes5.dex */
public final class g4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f444525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qg5.q4 f444526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f444527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f444528g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f444529h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f444530i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ xj.m f444531m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444532n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var, qg5.q4 q4Var, android.content.Context context, java.util.List list, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, xj.m mVar, yz5.a aVar) {
        super(0);
        this.f444525d = o4Var;
        this.f444526e = q4Var;
        this.f444527f = context;
        this.f444528g = list;
        this.f444529h = z3Var;
        this.f444530i = z17;
        this.f444531m = mVar;
        this.f444532n = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f444525d;
        if (o4Var != null) {
            o4Var.putBoolean("yuanbao_forward_agreed", true);
        }
        this.f444526e.a7(this.f444527f, this.f444528g, this.f444529h, this.f444530i, this.f444531m, this.f444532n);
        return jz5.f0.f384359a;
    }
}
