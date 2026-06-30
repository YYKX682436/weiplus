package id2;

/* loaded from: classes3.dex */
public final class v4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f372392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ il2.a f372393e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, il2.a aVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372392d = hVar;
        this.f372393e = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new id2.v4(this.f372392d, interfaceC29045xdcb5ca57, this.f372393e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        id2.v4 v4Var = (id2.v4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        v4Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f372392d).f535914b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleFaceResult verify fail: ");
        sb6.append(aVar2);
        sb6.append(" verifyData: ");
        il2.a aVar3 = this.f372393e;
        sb6.append(aVar3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRemindRestric", sb6.toString());
        aVar3.f373569d.mo146xb9724478(java.lang.Boolean.FALSE);
        return jz5.f0.f384359a;
    }
}
