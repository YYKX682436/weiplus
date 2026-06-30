package df2;

/* loaded from: classes5.dex */
public final class mb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f312299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zb f312300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f312301f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, df2.zb zbVar, java.util.List list) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312299d = hVar;
        this.f312300e = zbVar;
        this.f312301f = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.mb(this.f312299d, interfaceC29045xdcb5ca57, this.f312300e, this.f312301f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.mb mbVar = (df2.mb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        mbVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312300e.f313472m, "[aiAssistant] reportInitToolList: success, reported " + this.f312301f.size() + " tools");
        return jz5.f0.f384359a;
    }
}
