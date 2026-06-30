package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class e9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f282427d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f282428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk4.d f282429f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750 f282430g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja f282431h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(pk4.d dVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750 c19737x80a67750, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f282429f = dVar;
        this.f282430g = c19737x80a67750;
        this.f282431h = jaVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e9 e9Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e9(this.f282429f, this.f282430g, this.f282431h, interfaceC29045xdcb5ca57);
        e9Var.f282428e = obj;
        return e9Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        long j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f282427d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f282428e;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f282428e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        while (p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
            pk4.d dVar = this.f282429f;
            int m158649x9746038c = dVar.m158649x9746038c() / 1000;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750 c19737x80a67750 = this.f282430g;
            if (c19737x80a67750.m69282xd98b9220() != m158649x9746038c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video.tp", "progress: " + m158649x9746038c);
                c19737x80a67750.a(m158649x9746038c);
            }
            long min = java.lang.Math.min(1000 - (dVar.m158649x9746038c() % 1000), 500L);
            if (dVar.getIsOnlineVideo()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar = this.f282431h;
                fk4.u uVar = jaVar.f282615w;
                if (uVar != null && ((fk4.k) uVar).h()) {
                    j17 = dVar.m158650x51e8b0a();
                } else {
                    fk4.u uVar2 = jaVar.f282615w;
                    j17 = uVar2 != null ? ((fk4.k) uVar2).f345160o : 0L;
                }
                int i18 = (int) (j17 / 1000);
                if (i18 > 0) {
                    c19737x80a67750.v(i18);
                }
            }
            this.f282428e = y0Var;
            this.f282427d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(min, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
