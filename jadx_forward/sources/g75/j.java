package g75;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f350909d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f350910e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f350911f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f350912g;

    /* renamed from: h, reason: collision with root package name */
    public int f350913h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f350914i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f350915m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g75.z f350916n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f350917o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.util.List list, g75.z zVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f350914i = h0Var;
        this.f350915m = list;
        this.f350916n = zVar;
        this.f350917o = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new g75.j(this.f350914i, this.f350915m, this.f350916n, this.f350917o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g75.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f350913h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g75.z zVar = this.f350916n;
            java.lang.String str = this.f350917o;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f350914i;
            this.f350909d = h0Var;
            java.util.List list = this.f350915m;
            this.f350910e = list;
            this.f350911f = zVar;
            this.f350912g = str;
            this.f350913h = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            g75.r rVar2 = new g75.r(kz5.n0.X0(list), zVar, str, new g75.h(h0Var, new v65.n(rVar)), false, 16, null);
            rVar2.d();
            h0Var.f391656d = rVar2;
            rVar.m(new g75.i(h0Var));
            obj = rVar.j();
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
