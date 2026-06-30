package ih1;

/* loaded from: classes7.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f373060d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f373061e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ih1.u f373062f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ih1.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f373062f = uVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ih1.t tVar = new ih1.t(this.f373062f, interfaceC29045xdcb5ca57);
        tVar.f373061e = obj;
        return tVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ih1.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f373060d;
        ih1.u uVar = this.f373062f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f373061e;
            ih1.s sVar = new ih1.s(uVar, null);
            this.f373061e = y0Var2;
            this.f373060d = 1;
            java.lang.Object c17 = p3325xe03a0797.p3326xc267989b.a4.c(300000L, sVar, this);
            if (c17 == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
            obj = c17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f373061e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean z17 = obj == null;
        if (!p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "appId[" + uVar.f373063a + "], heartbeat coroutine cancelled");
        } else if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "appId[" + uVar.f373063a + "], heartbeat stopped after 300 seconds");
        }
        return jz5.f0.f384359a;
    }
}
