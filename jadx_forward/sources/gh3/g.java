package gh3;

/* loaded from: classes.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f353423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.j f353424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f353425f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f353426g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f353427h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f353428i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f353429m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f353430n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ gh3.i f353431o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17, android.content.Context context, android.content.Intent intent, int i17, gh3.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f353424e = jVar;
        this.f353425f = h0Var;
        this.f353426g = f9Var;
        this.f353427h = z17;
        this.f353428i = context;
        this.f353429m = intent;
        this.f353430n = i17;
        this.f353431o = iVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gh3.g(this.f353424e, this.f353425f, this.f353426g, this.f353427h, this.f353428i, this.f353429m, this.f353430n, this.f353431o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gh3.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f353423d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gh3.f fVar = new gh3.f(this.f353425f, this.f353426g, this.f353427h, this.f353428i, this.f353429m, this.f353430n, this.f353431o);
            this.f353423d = 1;
            if (this.f353424e.a(fVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
