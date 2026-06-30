package yn1;

/* loaded from: classes11.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f545277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f545278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f545279f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(yn1.r2 r2Var, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545278e = r2Var;
        this.f545279f = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yn1.l2(this.f545278e, this.f545279f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.l2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean booleanValue;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f545277d;
        long j17 = this.f545279f;
        yn1.r2 r2Var = this.f545278e;
        boolean z17 = true;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                yn1.z0 z0Var = yn1.z0.f545466a;
                p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = yn1.r2.f545342f;
                vn1.m a17 = r2Var.a();
                this.f545277d = 1;
                obj = z0Var.r(a17, this);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Mig.MigrationPlatformImpl", "[startBLEAdvertisingAsync] error", e17);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar2 = r2Var.f545343a;
            if (gVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
                throw null;
            }
            gVar2.k(j17, false, "");
        }
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
            throw null;
        }
        if (!booleanValue) {
            z17 = false;
        }
        gVar.k(j17, z17, "");
        return jz5.f0.f384359a;
    }
}
