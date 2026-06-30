package gx0;

/* loaded from: classes5.dex */
public final class b7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f357765e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(gx0.w8 w8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357765e = w8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.b7(this.f357765e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.b7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f357764d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        gx0.w8 w8Var = this.f357765e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.x4 x4Var = (gx0.x4) ((jz5.n) w8Var.f430434o).mo141623x754a37bb();
            this.f357764d = 1;
            if (!x4Var.q() || (obj2 = x4Var.X6().q(false, this)) != aVar) {
                obj2 = f0Var;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        jx0.k kVar = w8Var.V.f367148b;
        if (!kVar.isShowing()) {
            kVar.show();
        }
        return f0Var;
    }
}
