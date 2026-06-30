package pe3;

/* loaded from: classes7.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f435183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pe3.g0 f435184e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(pe3.g0 g0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f435184e = g0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pe3.e0(this.f435184e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pe3.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f435183d;
        pe3.g0 g0Var = this.f435184e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            se3.e eVar = g0Var.f435191d;
            this.f435183d = 1;
            if (eVar.O6("frames", "", this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p012xc85e97e9.p093xedfae76a.j0 j0Var = g0Var.f435191d.f488448e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < 20; i18++) {
            arrayList.add(new se3.g());
        }
        j0Var.mo523x53d8522f(arrayList);
        return jz5.f0.f384359a;
    }
}
