package zi2;

/* loaded from: classes.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f554646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f554647e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, yz5.l lVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f554646d = hVar;
        this.f554647e = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zi2.k(this.f554646d, interfaceC29045xdcb5ca57, this.f554647e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        zi2.k kVar = (zi2.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        kVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f554646d).f535914b;
        rm0.j jVar = aVar2.f535912a;
        int i17 = jVar != null ? jVar.f478958f : -1;
        if (jVar == null || (str = jVar.getMessage()) == null) {
            str = "";
        }
        rm0.j jVar2 = aVar2.f535912a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "opChangeLiveMode fail, errCode: " + i17 + " errType: " + (jVar2 != null ? jVar2.f478957e : -1) + " errMsg: " + str);
        yz5.l lVar = this.f554647e;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f384359a;
    }
}
