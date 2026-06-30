package zr0;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr0.c f556640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f556641e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f556642f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(zr0.c cVar, boolean z17, java.lang.Runnable runnable, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f556640d = cVar;
        this.f556641e = z17;
        this.f556642f = runnable;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zr0.b(this.f556640d, this.f556641e, this.f556642f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zr0.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        rs0.h hVar = this.f556640d.f556647h;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (hVar == null && this.f556641e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCustomRenderCallback", "renderLaunch not exec for egl not ready");
            return f0Var;
        }
        this.f556642f.run();
        return f0Var;
    }
}
