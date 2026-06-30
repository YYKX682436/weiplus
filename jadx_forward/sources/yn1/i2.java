package yn1;

/* loaded from: classes11.dex */
public final class i2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f545235d;

    /* renamed from: e, reason: collision with root package name */
    public long f545236e;

    /* renamed from: f, reason: collision with root package name */
    public int f545237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f545238g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f545239h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(yn1.r2 r2Var, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545238g = r2Var;
        this.f545239h = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yn1.i2(this.f545238g, this.f545239h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.i2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar;
        long j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f545237f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar2 = this.f545238g.f545343a;
            if (gVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
                throw null;
            }
            bp1.d dVar = bp1.e.f104573a;
            bp1.f[] fVarArr = bp1.e.f104575c;
            this.f545235d = gVar2;
            long j18 = this.f545239h;
            this.f545236e = j18;
            this.f545237f = 1;
            java.lang.Object a17 = dVar.a(fVarArr, this);
            if (a17 == aVar) {
                return aVar;
            }
            gVar = gVar2;
            obj = a17;
            j17 = j18;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f545236e;
            gVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g) this.f545235d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        gVar.s1(j17, ((java.lang.Boolean) obj).booleanValue());
        return jz5.f0.f384359a;
    }
}
