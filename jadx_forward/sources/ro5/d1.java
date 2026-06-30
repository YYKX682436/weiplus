package ro5;

/* loaded from: classes14.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f479713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(ro5.m1 m1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f479713d = m1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ro5.d1(this.f479713d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ro5.d1 d1Var = (ro5.d1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        d1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        zo5.i iVar;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ro5.m1 m1Var = this.f479713d;
        m1Var.f479788q.a();
        jz5.g gVar = m1Var.f479790s;
        if (gVar.mo141624xf582434a() && (iVar = (zo5.i) gVar.mo141623x754a37bb()) != null) {
            iVar.a();
        }
        m1Var.f479785n.getClass();
        zo5.k kVar = m1Var.f479786o;
        kVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuvRenderLogic", "release");
        android.opengl.GLES20.glDeleteProgram(((ap5.a) ((jz5.n) kVar.f556428a).mo141623x754a37bb()).f94323m);
        return jz5.f0.f384359a;
    }
}
