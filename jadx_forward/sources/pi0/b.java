package pi0;

/* loaded from: classes11.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f436049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi0.q f436050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f436051f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint f436052g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f436053h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f436054i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f436055m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(pi0.q qVar, android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint, java.lang.String str, boolean z17, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f436050e = qVar;
        this.f436051f = context;
        this.f436052g = dartEntrypoint;
        this.f436053h = str;
        this.f436054i = z17;
        this.f436055m = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pi0.b(this.f436050e, this.f436051f, this.f436052g, this.f436053h, this.f436054i, this.f436055m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pi0.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f436049d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pi0.q qVar = this.f436050e;
            android.content.Context context = this.f436051f;
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint = this.f436052g;
            java.lang.String str = this.f436053h;
            boolean z17 = this.f436054i;
            java.util.List list = this.f436055m;
            this.f436049d = 1;
            obj = qVar.c(context, dartEntrypoint, str, z17, list, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
