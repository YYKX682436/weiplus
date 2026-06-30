package sx3;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f495105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ox3.f f495106e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ox3.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f495106e = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sx3.o(this.f495106e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sx3.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f495105d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                t45.d1 d1Var = new t45.d1();
                ox3.f fVar = this.f495106e;
                d1Var.f497074d = ((ox3.g) fVar).f431282d.f497148d;
                t45.g gVar = ((ox3.g) fVar).f431282d.f497150f;
                d1Var.f497076f = gVar != null ? gVar.f497093d : null;
                t45.f0 f0Var = ((ox3.g) fVar).f431282d.f497149e;
                d1Var.f497075e = f0Var != null ? f0Var.f497084d : null;
                ux3.c cVar = new ux3.c(d1Var);
                this.f495105d = 1;
                if (rm0.h.a(cVar, 0L, null, this, 3, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingtoneHistoryManager", "doDeleteHistoryRingBack failed: " + e17.getMessage());
        }
        return jz5.f0.f384359a;
    }
}
