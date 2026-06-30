package so5;

/* loaded from: classes14.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f492376d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f492377e;

    /* renamed from: f, reason: collision with root package name */
    public int f492378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so5.k0 f492379g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(so5.k0 k0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492379g = k0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new so5.h0(this.f492379g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((so5.h0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        so5.k0 k0Var;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f492378f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            so5.k0 k0Var2 = this.f492379g;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar = k0Var2.f492403t;
            this.f492376d = dVar;
            this.f492377e = k0Var2;
            this.f492378f = 1;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.k kVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar;
            if (kVar.b(null, this) == aVar) {
                return aVar;
            }
            k0Var = k0Var2;
            obj2 = kVar;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0Var = (so5.k0) this.f492377e;
            java.lang.Object obj3 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f492376d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            obj2 = obj3;
        }
        try {
            zq4.b bVar = k0Var.f492392f;
            if (bVar != null) {
                bVar.e();
            }
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) obj2).d(null);
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) obj2).d(null);
            throw th6;
        }
    }
}
