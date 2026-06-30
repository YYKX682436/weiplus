package d52;

/* loaded from: classes13.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f308067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d52.b f308068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d52.n f308069f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d52.b bVar, d52.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f308068e = bVar;
        this.f308069f = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new d52.i(this.f308068e, this.f308069f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((d52.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f308067d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            d52.b bVar = this.f308068e;
            int i18 = bVar.f308061a;
            java.lang.Object obj2 = this.f308069f.f308079c;
            r45.hw3 b17 = d52.e.b(bVar);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "localToHellMsg(...)");
            this.f308067d = 1;
            if (((u26.o) obj2).t(b17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
