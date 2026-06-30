package fa5;

/* loaded from: classes7.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f342331d;

    /* renamed from: e, reason: collision with root package name */
    public int f342332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f342333f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fa5.j f342334g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342335h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342336i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f342337m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yz5.l lVar, fa5.j jVar, java.lang.String str, java.lang.String str2, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f342333f = lVar;
        this.f342334g = jVar;
        this.f342335h = str;
        this.f342336i = str2;
        this.f342337m = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fa5.f(this.f342333f, this.f342334g, this.f342335h, this.f342336i, this.f342337m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fa5.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yz5.l lVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f342332e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yz5.l lVar2 = this.f342333f;
            this.f342331d = lVar2;
            this.f342332e = 1;
            java.lang.Object Bi = this.f342334g.Bi(this.f342335h, this.f342336i, this.f342337m, this);
            if (Bi == aVar) {
                return aVar;
            }
            lVar = lVar2;
            obj = Bi;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (yz5.l) this.f342331d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        lVar.mo146xb9724478(obj);
        return jz5.f0.f384359a;
    }
}
