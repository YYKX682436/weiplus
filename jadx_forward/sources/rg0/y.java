package rg0;

/* loaded from: classes3.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f476734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rg0.z f476735e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(rg0.z zVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f476735e = zVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rg0.y(this.f476735e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rg0.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f476734d;
        rg0.z zVar = this.f476735e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                rg0.x xVar = new rg0.x(zVar, null);
                this.f476734d = 1;
                if (p3325xe03a0797.p3326xc267989b.a4.b(3000L, xVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
        } catch (java.lang.Exception e17) {
            zVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SecinfoOnKindaNotifyEventListener", "initHonorSecResult error: " + e17.getMessage());
        }
        return jz5.f0.f384359a;
    }
}
