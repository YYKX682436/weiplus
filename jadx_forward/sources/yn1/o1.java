package yn1;

/* loaded from: classes11.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f545311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f545312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f545313f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(yn1.r2 r2Var, java.lang.String str, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545311d = r2Var;
        this.f545312e = str;
        this.f545313f = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yn1.o1(this.f545311d, this.f545312e, this.f545313f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yn1.o1 o1Var = (yn1.o1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        o1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar;
        long j17 = this.f545313f;
        yn1.r2 r2Var = this.f545311d;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = yn1.r2.f545342f;
            r2Var.a().d(this.f545312e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationPlatformImpl", "[disconnectDeviceAsync] success=true");
            gVar = r2Var.f545343a;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Mig.MigrationPlatformImpl", "[disconnectDeviceAsync] error", e17);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar2 = r2Var.f545343a;
            if (gVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
                throw null;
            }
            gVar2.i(j17, false);
        }
        if (gVar != null) {
            gVar.i(j17, true);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
        throw null;
    }
}
