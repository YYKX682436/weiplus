package ph2;

/* loaded from: classes10.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f435904d;

    /* renamed from: e, reason: collision with root package name */
    public int f435905e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f435906f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ph2.b f435907g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ph2.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f435907g = bVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ph2.a aVar = new ph2.a(this.f435907g, interfaceC29045xdcb5ca57);
        aVar.f435906f = obj;
        return aVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ph2.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long intValue;
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f435905e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f435906f;
            ae2.in inVar = ae2.in.f85221a;
            intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85341m).mo141623x754a37bb()).r()).intValue();
            y0Var = y0Var2;
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intValue = this.f435904d;
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f435906f;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        while (p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
            ph2.b bVar = this.f435907g;
            if (!bVar.f435909e) {
                break;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                ph2.d dVar = bVar.f435908d;
                if (dVar != null) {
                    dVar.b();
                }
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis2 < intValue) {
                    this.f435906f = y0Var;
                    this.f435904d = intValue;
                    this.f435905e = 1;
                    if (p3325xe03a0797.p3326xc267989b.k1.b(intValue - currentTimeMillis2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    this.f435906f = y0Var;
                    this.f435904d = intValue;
                    this.f435905e = 2;
                    if (p3325xe03a0797.p3326xc267989b.k1.b(intValue, this) == aVar) {
                        return aVar;
                    }
                }
            } catch (java.lang.Throwable th6) {
                java.lang.System.currentTimeMillis();
                throw th6;
            }
        }
        return jz5.f0.f384359a;
    }
}
