package hu3;

/* loaded from: classes5.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f366744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f366745e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(hu3.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f366745e = n0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hu3.w(this.f366745e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hu3.w) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f366744d;
        hu3.n0 n0Var = this.f366745e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            n0Var.n();
            xr0.j jVar = n0Var.f366701o.f366733b;
            int i18 = jVar.f537706a;
            int i19 = jVar.f537707b;
            this.f366744d = 1;
            if (n0Var.e(i18, i19, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        bs0.h hVar = n0Var.f366699m;
        if (hVar != null) {
            android.media.ImageReader imageReader = n0Var.f366702p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageReader);
            android.view.Surface surface = imageReader.getSurface();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(surface, "getSurface(...)");
            hVar.A(surface, new java.lang.Integer(n0Var.f366701o.f366733b.f537706a), new java.lang.Integer(n0Var.f366701o.f366733b.f537707b));
        }
        return jz5.f0.f384359a;
    }
}
