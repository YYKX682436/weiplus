package il2;

/* loaded from: classes3.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f373593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ il2.a f373594e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, il2.a aVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f373593d = hVar;
        this.f373594e = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new il2.h(this.f373593d, interfaceC29045xdcb5ca57, this.f373594e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        il2.h hVar = (il2.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        hVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f373593d).f535914b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleFaceResult verify fail: ");
        sb6.append(aVar2);
        sb6.append(" verifyData: ");
        il2.a aVar3 = this.f373594e;
        sb6.append(aVar3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRestrictConsumePlugin", sb6.toString());
        aVar3.f373569d.mo146xb9724478(java.lang.Boolean.FALSE);
        return jz5.f0.f384359a;
    }
}
