package ut;

/* loaded from: classes12.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f512235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f512236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f512237f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, ut.q0 q0Var, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f512235d = str;
        this.f512236e = q0Var;
        this.f512237f = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ut.p(this.f512235d, this.f512236e, this.f512237f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ut.p pVar = (ut.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        pVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ct.w2 w2Var = (ct.w2) i95.n0.c(ct.w2.class);
        java.lang.String str = this.f512235d;
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d3) w2Var).getClass();
        int a17 = com.p314xaae8f345.mm.ui.p2731xc84c5534.f0.a(str);
        this.f512236e.f512245o.f512275z = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.SendFileTask", this.f512237f + " html js scan done path=" + this.f512235d + " hasJs=" + a17);
        return jz5.f0.f384359a;
    }
}
