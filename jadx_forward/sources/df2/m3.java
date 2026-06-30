package df2;

/* loaded from: classes3.dex */
public final class m3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f312283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.p3 f312284f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f312285g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(java.lang.Object obj, df2.p3 p3Var, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312283e = obj;
        this.f312284f = p3Var;
        this.f312285g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.m3(this.f312283e, this.f312284f, this.f312285g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.m3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312282d;
        df2.p3 p3Var = this.f312284f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRenderController", "viewScopeLaunch start panelClass: " + this.f312283e);
            this.f312282d = 1;
            p3Var.getClass();
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0) p3Var.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0.class);
            if (ob0Var != null) {
                mn0.b0 B1 = ob0Var.B1();
                com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10845x833056b0 debugCanvasView = ((com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614) ob0Var.C1()).getDebugCanvasView();
                if (B1 != null && debugCanvasView != null) {
                    nn0.c cVar = B1 instanceof nn0.c ? (nn0.c) B1 : null;
                    nn0.i iVar = cVar != null ? (nn0.i) cVar.p() : null;
                    if (!(iVar instanceof nn0.i)) {
                        iVar = null;
                    }
                    nn0.o oVar = iVar != null ? iVar.f420117b : null;
                    nn0.s sVar = oVar instanceof nn0.s ? (nn0.s) oVar : null;
                    if (sVar != null) {
                        df2.o3 o3Var = new df2.o3(java.lang.System.currentTimeMillis(), nVar, sVar, p3Var, debugCanvasView);
                        nn0.q qVar = sVar.f420145h;
                        if (qVar == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(sVar.f420141d, "fastQueue: gl handler is null");
                        } else {
                            qVar.removeMessages(2);
                            sVar.f420145h.post(o3Var);
                        }
                    }
                }
            }
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.graphics.RectF rectF = (android.graphics.RectF) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRenderController", "startCaptureVideoFrameRect cost: " + (java.lang.System.currentTimeMillis() - this.f312285g));
        if (rectF != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            df2.l3 l3Var = new df2.l3(rectF, p3Var, null);
            this.f312282d = 2;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, l3Var, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
