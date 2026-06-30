package i55;

/* loaded from: classes8.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f370387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i55.k f370388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f370389f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i55.k kVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f370388e = kVar;
        this.f370389f = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new i55.j(this.f370388e, this.f370389f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((i55.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f370387d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f370387d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(50L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                i55.b.d(this.f370388e, "onPageResume_delay_check", this.f370389f, null, false, 12, null);
                int i18 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MoreTabExposureLogic", "Layout check completed after 50ms delay end", null);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        i55.b.d(this.f370388e, "onPageResume_delay_check", this.f370389f, null, false, 12, null);
        int i19 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MoreTabExposureLogic", "Layout check completed after 50ms delay", null);
        this.f370387d = 2;
        if (p3325xe03a0797.p3326xc267989b.k1.b(50L, this) == aVar) {
            return aVar;
        }
        i55.b.d(this.f370388e, "onPageResume_delay_check", this.f370389f, null, false, 12, null);
        int i182 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MoreTabExposureLogic", "Layout check completed after 50ms delay end", null);
        return jz5.f0.f384359a;
    }
}
