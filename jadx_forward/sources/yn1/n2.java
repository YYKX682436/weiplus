package yn1;

/* loaded from: classes11.dex */
public final class n2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f545301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f545302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f545303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f545304g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(yn1.r2 r2Var, java.lang.String str, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545302e = r2Var;
        this.f545303f = str;
        this.f545304g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yn1.n2(this.f545302e, this.f545303f, this.f545304g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.n2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean booleanValue;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f545301d;
        long j17 = this.f545304g;
        yn1.r2 r2Var = this.f545302e;
        boolean z17 = true;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                yn1.z0 z0Var = yn1.z0.f545466a;
                p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = yn1.r2.f545342f;
                vn1.m a17 = r2Var.a();
                java.lang.String str = this.f545303f;
                this.f545301d = 1;
                obj = z0Var.s(a17, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            booleanValue = ((java.lang.Boolean) obj).booleanValue();
            gVar = r2Var.f545343a;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Mig.MigrationPlatformImpl", "[startBLEScanningAsync] error", e17);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar2 = r2Var.f545343a;
            if (gVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
                throw null;
            }
            gVar2.x(j17, false);
        }
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
            throw null;
        }
        if (!booleanValue) {
            z17 = false;
        }
        gVar.x(j17, z17);
        return jz5.f0.f384359a;
    }
}
