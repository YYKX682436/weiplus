package az0;

/* loaded from: classes5.dex */
public final class y5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f97605d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f97606e;

    /* renamed from: f, reason: collision with root package name */
    public int f97607f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97608g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f97609h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ az0.b0 f97610i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 f97611m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(az0.n7 n7Var, az0.b0 b0Var, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 c4069xbe747ef4, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97609h = n7Var;
        this.f97610i = b0Var;
        this.f97611m = c4069xbe747ef4;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        az0.y5 y5Var = new az0.y5(this.f97609h, this.f97610i, this.f97611m, interfaceC29045xdcb5ca57);
        y5Var.f97608g = obj;
        return y5Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.y5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97607f;
        az0.b0 b0Var = this.f97610i;
        az0.n7 n7Var = this.f97609h;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 c4069xbe747ef4 = this.f97611m;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f97608g;
            c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            e0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.e0();
            p3325xe03a0797.p3326xc267989b.p3328x30012e.l0 l0Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.l0(az0.n7.b(n7Var, b0Var, c4069xbe747ef4, false), new az0.v5(c4069xbe747ef4, c0Var, null));
            az0.w5 w5Var = new az0.w5(e0Var, kVar);
            this.f97608g = kVar;
            this.f97605d = c0Var;
            this.f97606e = e0Var;
            this.f97607f = 1;
            if (l0Var.a(w5Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            e0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.e0) this.f97606e;
            c0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.c0) this.f97605d;
            kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f97608g;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (c0Var.f391645d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasMovieSessionManager", "retry export");
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j b17 = az0.n7.b(n7Var, b0Var, c4069xbe747ef4, true);
            az0.x5 x5Var = new az0.x5(e0Var, kVar);
            this.f97608g = null;
            this.f97605d = null;
            this.f97606e = null;
            this.f97607f = 2;
            if (((v26.g) b17).a(x5Var, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
