package ex0;

/* loaded from: classes5.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f338719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.r f338720e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ex0.a0 a0Var, ex0.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f338719d = a0Var;
        this.f338720e = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ex0.z(this.f338719d, this.f338720e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ex0.z zVar = (ex0.z) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        zVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID = this.f338720e.f338701b;
        ex0.a0 a0Var = this.f338719d;
        a0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        a0Var.H.b(segmentID);
        return jz5.f0.f384359a;
    }
}
