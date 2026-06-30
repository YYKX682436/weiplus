package h41;

/* loaded from: classes14.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.x f360356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f360357e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h41.x xVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f360356d = xVar;
        this.f360357e = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new h41.l(this.f360356d, this.f360357e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        h41.l lVar = (h41.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        lVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        h41.x xVar = this.f360356d;
        h41.j jVar = xVar.f360418b;
        jVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCChatBot", "destroy");
        g41.f fVar = jVar.f360348q;
        if (fVar != null) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new g41.d(fVar, null), 3, null);
        }
        jVar.f360348q = null;
        wx.f1 f1Var = jVar.f360340f;
        if (f1Var != null) {
            ((hy.a0) f1Var).d(jVar);
        }
        wx.f1 f1Var2 = jVar.f360340f;
        if (f1Var2 != null) {
            ((hy.a0) f1Var2).c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d3.HANGUP_REASON_MANUAL, h41.b.f360292d);
        }
        jVar.f360340f = null;
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.a aVar2 = xVar.f360417a;
        if (aVar2 != null) {
            aVar2.L0(this.f360357e);
        }
        return jz5.f0.f384359a;
    }
}
