package e50;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f331069d;

    /* renamed from: e, reason: collision with root package name */
    public int f331070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f331071f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f331072g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331073h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f331074i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f331075m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f331076n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e50.v f331077o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(long j17, long j18, java.lang.String str, byte[] bArr, boolean z17, long j19, e50.v vVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f331071f = j17;
        this.f331072g = j18;
        this.f331073h = str;
        this.f331074i = bArr;
        this.f331075m = z17;
        this.f331076n = j19;
        this.f331077o = vVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new e50.u(this.f331071f, this.f331072g, this.f331073h, this.f331074i, this.f331075m, this.f331076n, this.f331077o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((e50.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long j17;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f331070e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        e50.v vVar = this.f331077o;
        long j18 = this.f331071f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterEngineService", "sendAsync: start " + j18);
                long j19 = this.f331072g;
                java.lang.String str = this.f331073h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                byte[] bArr = this.f331074i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bArr);
                c61.ka kaVar = new c61.ka(new com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24580xe2b43b66(j19, str, bArr, this.f331075m, this.f331076n));
                j17 = currentTimeMillis;
                this.f331069d = j17;
                this.f331070e = 1;
                s17 = kaVar.s(this);
                if (s17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j27 = this.f331069d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                j17 = j27;
                s17 = obj;
            }
            com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24581x76fae64a c24581x76fae64a = (com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24581x76fae64a) s17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterEngineService", "sendAsync: end " + j18 + ", cost:" + (java.lang.System.currentTimeMillis() - j17));
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2.a aVar2 = vVar.f331079b;
            if (aVar2 != null) {
                aVar2.A0(this.f331071f, c24581x76fae64a.m91140x131202ac(), c24581x76fae64a.m91139x130a215f(), c24581x76fae64a.m91138xfb7e5820());
            }
            return f0Var;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2.a aVar3 = vVar.f331079b;
            if (aVar3 != null) {
                aVar3.A0(this.f331071f, 3L, -1L, null);
            }
            return f0Var;
        }
    }
}
