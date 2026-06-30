package df2;

/* loaded from: classes3.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311376d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f311377e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f311378f;

    /* renamed from: g, reason: collision with root package name */
    public int f311379g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ df2.d1 f311380h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ in0.q f311381i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f311382m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311383n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(df2.d1 d1Var, in0.q qVar, int i17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311380h = d1Var;
        this.f311381i = qVar;
        this.f311382m = i17;
        this.f311383n = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.c1(this.f311380h, this.f311381i, this.f311382m, this.f311383n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f311379g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            df2.d1 d1Var = this.f311380h;
            this.f311376d = d1Var;
            in0.q qVar = this.f311381i;
            this.f311377e = qVar;
            java.lang.String str = this.f311383n;
            this.f311378f = str;
            this.f311379g = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d1Var.f311466m, "startPlay");
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(str, false);
            if (i18 == null) {
                i18 = "";
            }
            java.lang.String i19 = com.p314xaae8f345.mm.vfs.w6.i(df2.d1.f311465p + "PhysicalGiftV1", false);
            p05.m0 m0Var = new p05.m0(this.f311382m, i18, i19 != null ? i19 : "");
            df2.b1 b1Var = new df2.b1(c0Var, d1Var, rVar);
            qVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "setFallingGiftEffect " + m0Var);
            qVar.f502304r.l(new in0.j(qVar, m0Var, b1Var));
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
