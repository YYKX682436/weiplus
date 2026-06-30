package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes8.dex */
public final class up extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f281629d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f281630e;

    /* renamed from: f, reason: collision with root package name */
    public int f281631f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f281632g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wp f281633h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wp wpVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f281633h = wpVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.up upVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.up(this.f281633h, interfaceC29045xdcb5ca57);
        upVar.f281632g = obj;
        return upVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.up) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wp wpVar;
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f281631f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f281632g;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wp wpVar2 = this.f281633h;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar2 = wpVar2.f281721a;
            this.f281632g = y0Var;
            this.f281629d = dVar2;
            this.f281630e = wpVar2;
            this.f281631f = 1;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.k kVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar2;
            if (kVar.b(null, this) == aVar) {
                return aVar;
            }
            wpVar = wpVar2;
            dVar = kVar;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wpVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wp) this.f281630e;
            dVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f281629d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        try {
            try {
                xj.m mVar = wpVar.f281722b;
                if (mVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.YuanBaoCopyAdReportHelper", "onAdExposeEnd: no ad info");
                } else {
                    ((wj.j0) wpVar.a()).mj(mVar.f536286a, wj.w0.f528075e, null);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.YuanBaoCopyAdReportHelper", "onAdExposeEnd: exception", e17);
            }
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).d(null);
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).d(null);
            throw th6;
        }
    }
}
