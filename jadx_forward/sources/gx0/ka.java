package gx0;

/* loaded from: classes5.dex */
public final class ka extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f358156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.r f358157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(gx0.ac acVar, ex0.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358156d = acVar;
        this.f358157e = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.ka(this.f358156d, this.f358157e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        gx0.ka kaVar = (gx0.ka) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        kaVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ex0.a0 e86 = this.f358156d.e8();
        if (e86 != null) {
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID = this.f358157e.f338701b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
            e86.H.b(segmentID);
        }
        return jz5.f0.f384359a;
    }
}
