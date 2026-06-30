package mm2;

/* loaded from: classes10.dex */
public final class t4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f410970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f410971e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.v4 f410972f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, mm2.v4 v4Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f410970d = hVar;
        this.f410971e = h0Var;
        this.f410972f = v4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mm2.t4(this.f410970d, interfaceC29045xdcb5ca57, this.f410971e, this.f410972f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mm2.t4 t4Var = (mm2.t4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        t4Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.lt1 lt1Var = (r45.lt1) ((xg2.i) this.f410970d).f535926b;
        r45.f02 f02Var = lt1Var.f461345d;
        if (f02Var != null) {
            this.f410972f.N6(f02Var, "cgi");
        }
        this.f410971e.f391656d = lt1Var.f461345d;
        return jz5.f0.f384359a;
    }
}
