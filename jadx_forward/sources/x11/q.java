package x11;

/* loaded from: classes12.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f532916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x11.t f532917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.f2 f532918f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x11.t tVar, p3325xe03a0797.p3326xc267989b.f2 f2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f532917e = tVar;
        this.f532918f = f2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new x11.q(this.f532917e, this.f532918f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((x11.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        java.lang.StringBuilder sb6;
        java.lang.Object f17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f532916d;
        p3325xe03a0797.p3326xc267989b.f2 f2Var = this.f532918f;
        x11.t tVar = this.f532917e;
        boolean z18 = true;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                ah3.v vVar = new ah3.v(10);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "tryBatchGetContact() called launch begin name:" + java.lang.Thread.currentThread().getName());
                x11.n nVar = new x11.n(tVar);
                x11.o oVar = new x11.o(tVar);
                x11.p pVar = new x11.p(tVar);
                this.f532916d = 1;
                f17 = p3325xe03a0797.p3326xc267989b.z0.f(new ah3.u(vVar, nVar, oVar, pVar, null), this);
                if (f17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                f17 = obj;
            }
            z17 = ((java.lang.Boolean) f17).booleanValue();
            try {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tryBatchGetContact() called launch end requestResult:");
                if (!z17) {
                    z18 = false;
                }
                sb7.append(z18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", sb7.toString());
                sb6 = new java.lang.StringBuilder("tryBatchGetContact() called finally end requestResult:");
            } catch (java.lang.Throwable th6) {
                th = th6;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneInit.dkInit", th, "tryBatchGetContact err", new java.lang.Object[0]);
                    sb6 = new java.lang.StringBuilder("tryBatchGetContact() called finally end requestResult:");
                    sb6.append(z17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", sb6.toString());
                    x11.g gVar = x11.t.D;
                    tVar.e(z17);
                    f2Var.close();
                    return jz5.f0.f384359a;
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "tryBatchGetContact() called finally end requestResult:" + z17);
                    x11.g gVar2 = x11.t.D;
                    tVar.e(z17);
                    f2Var.close();
                    throw th7;
                }
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            z17 = false;
        }
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", sb6.toString());
        x11.g gVar3 = x11.t.D;
        tVar.e(z17);
        f2Var.close();
        return jz5.f0.f384359a;
    }
}
