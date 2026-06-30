package yd2;

/* loaded from: classes5.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f542598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yd2.j f542599e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, yd2.j jVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f542598d = hVar;
        this.f542599e = jVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yd2.g(this.f542598d, interfaceC29045xdcb5ca57, this.f542599e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yd2.g gVar = (yd2.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        gVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        yd2.j.a(this.f542599e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.Live.AiAssistant.ToolManager", "reportToolResults: failed");
        return jz5.f0.f384359a;
    }
}
