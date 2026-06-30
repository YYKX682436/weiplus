package qf2;

/* loaded from: classes.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f444181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.q f444182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444183f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, km2.q qVar, yz5.a aVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444181d = hVar;
        this.f444182e = qVar;
        this.f444183f = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.y(this.f444181d, interfaceC29045xdcb5ca57, this.f444182e, this.f444183f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.y yVar = (qf2.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        yVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.q22 q22Var = (r45.q22) ((xg2.i) this.f444181d).f535926b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", "apply pk response success apply_id: " + q22Var.m75945x2fec8307(1));
        km2.q qVar = this.f444182e;
        if (qVar != null) {
            qVar.f390727y = q22Var.m75945x2fec8307(1);
            qVar.z();
            yz5.a aVar2 = this.f444183f;
            if (aVar2 != null) {
                aVar2.mo152xb9724478();
            }
        }
        return jz5.f0.f384359a;
    }
}
