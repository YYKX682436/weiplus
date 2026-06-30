package pi0;

/* loaded from: classes4.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f436166d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f436167e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f436168f;

    /* renamed from: g, reason: collision with root package name */
    public int f436169g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f436170h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f436171i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f436172m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.view.ViewGroup viewGroup, pi0.l1 l1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f436170h = h0Var;
        this.f436171i = viewGroup;
        this.f436172m = l1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pi0.k1(this.f436170h, this.f436171i, this.f436172m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pi0.k1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f436169g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.view.ViewGroup viewGroup = this.f436171i;
            this.f436166d = viewGroup;
            pi0.l1 l1Var = this.f436172m;
            this.f436167e = l1Var;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f436170h;
            this.f436168f = h0Var2;
            this.f436169g = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            viewGroup.post(new pi0.j1(viewGroup, l1Var, rVar));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f436168f;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        h0Var.f391656d = obj;
        return jz5.f0.f384359a;
    }
}
