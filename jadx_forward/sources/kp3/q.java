package kp3;

/* loaded from: classes10.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f392568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp3.x f392569e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kp3.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f392569e = xVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kp3.q(this.f392569e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp3.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f392568d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        kp3.x xVar = this.f392569e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17013x966ea0d1 c17013x966ea0d1 = xVar.f392584g;
            if (c17013x966ea0d1 != null) {
                this.f392568d = 1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitRecordViewLayout", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d3.f33784x24728b);
                java.lang.Object i18 = c17013x966ea0d1.f237339e.i(0, false, this);
                if (i18 != aVar) {
                    i18 = f0Var;
                }
                if (i18 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        xVar.Q6(3);
        return f0Var;
    }
}
