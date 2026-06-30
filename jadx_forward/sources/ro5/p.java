package ro5;

/* loaded from: classes14.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f479806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ro5.b0 f479807e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ro5.b0 b0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f479807e = b0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ro5.p(this.f479807e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ro5.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object e17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f479806d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ro5.b0 b0Var = this.f479807e;
            if (b0Var.f479678b == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "getCameraSurfaceTexture failed");
                b0Var.f479685i = 4;
                ((jp5.o) i95.n0.c(jp5.o.class)).mo129946xf0018e90(2093L, 29L, 1L);
            }
            ro5.m1 m1Var = b0Var.f479678b;
            if (m1Var == null) {
                return null;
            }
            this.f479806d = 1;
            e17 = m1Var.e("camera", 134217728, (yo5.e) m1Var.f479775d.f537329g.mo141623x754a37bb(), ro5.n0.f479799d, this);
            if (e17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            e17 = obj;
        }
        return (android.graphics.SurfaceTexture) e17;
    }
}
