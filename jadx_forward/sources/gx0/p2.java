package gx0;

/* loaded from: classes5.dex */
public final class p2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f358346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vv0.n f358347e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(gx0.u2 u2Var, vv0.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358346d = u2Var;
        this.f358347e = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.p2(this.f358346d, this.f358347e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        gx0.p2 p2Var = (gx0.p2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        p2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ow0.g gVar;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        gx0.u2 u2Var = this.f358346d;
        dx0.g gVar2 = u2Var.B;
        if (gVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverThumbnailProvider");
            throw null;
        }
        vv0.n nVar = this.f358347e;
        gVar2.f(nVar.f521931a);
        dx0.g gVar3 = u2Var.B;
        if (gVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverThumbnailProvider");
            throw null;
        }
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = nVar.f521931a;
        gVar3.b(c3971x241f78);
        dx0.g gVar4 = u2Var.B;
        if (gVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverThumbnailProvider");
            throw null;
        }
        dx0.p d17 = gVar4.d(c3971x241f78);
        if (d17 != null && (gVar = (ow0.g) u2Var.f150773i) != null) {
            gVar.E(c3971x241f78, d17);
        }
        return jz5.f0.f384359a;
    }
}
