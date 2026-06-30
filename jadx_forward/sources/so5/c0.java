package so5;

/* loaded from: classes14.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so5.k0 f492333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f492334e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(so5.k0 k0Var, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492333d = k0Var;
        this.f492334e = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new so5.c0(this.f492333d, this.f492334e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((so5.c0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        so5.k0 k0Var = this.f492333d;
        boolean z17 = k0Var.f492404u;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ILinkVoIPCameraHelper", "is fliping");
            return f0Var;
        }
        k0Var.f492404u = true;
        k0Var.f492398o = true;
        zq4.b bVar = this.f492333d.f492392f;
        if (bVar != null) {
            bVar.a();
        }
        this.f492333d.f492398o = false;
        this.f492333d.d();
        this.f492334e.mo152xb9724478();
        this.f492333d.f492404u = false;
        return f0Var;
    }
}
