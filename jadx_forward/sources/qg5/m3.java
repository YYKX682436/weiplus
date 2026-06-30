package qg5;

/* loaded from: classes8.dex */
public final class m3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.u3 f444607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f444608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f444609f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f444610g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xj.m f444611h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f444612i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f444613m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444614n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(qg5.u3 u3Var, java.util.List list, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, android.content.Context context, xj.m mVar, boolean z17, boolean z18, yz5.a aVar) {
        super(0);
        this.f444607d = u3Var;
        this.f444608e = list;
        this.f444609f = z3Var;
        this.f444610g = context;
        this.f444611h = mVar;
        this.f444612i = z17;
        this.f444613m = z18;
        this.f444614n = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) this.f444607d.f444743f).mo141623x754a37bb();
        if (o4Var != null) {
            o4Var.putBoolean("yuanbao_copy_agreed", true);
        }
        this.f444607d.W6(this.f444608e, this.f444609f, this.f444610g, this.f444611h, this.f444612i, this.f444613m, this.f444614n);
        return jz5.f0.f384359a;
    }
}
