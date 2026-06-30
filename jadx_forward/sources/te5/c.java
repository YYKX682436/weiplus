package te5;

/* loaded from: classes12.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f500147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l70.d f500148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f500149f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l70.d dVar, java.lang.ref.WeakReference weakReference, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f500148e = dVar;
        this.f500149f = weakReference;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te5.c(this.f500148e, this.f500149f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((te5.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yz5.a aVar;
        pz5.a aVar2 = pz5.a.f440719d;
        int i17 = this.f500147d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            x70.g a17 = x70.g.f533948f.a();
            this.f500147d = 1;
            obj = a17.T6(this.f500148e, this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (((l70.e) obj).f398351a == l70.f.f398353d && (aVar = (yz5.a) this.f500149f.get()) != null) {
            aVar.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
