package fo5;

/* loaded from: classes14.dex */
public final class b3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er4.r f346492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f346493e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(er4.r rVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f346492d = rVar;
        this.f346493e = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fo5.b3(this.f346492d, this.f346493e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        fo5.b3 b3Var = (fo5.b3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        b3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (this.f346492d != null) {
            fo5.a aVar2 = fo5.f3.f346519c;
            if (aVar2 != null) {
                fo5.r0 r0Var = (fo5.r0) aVar2;
                r0Var.I = null;
                r0Var.f346615J = false;
                lo5.h.b(r0Var.f346628n, false, 1, null);
            }
        } else {
            fo5.a aVar3 = fo5.f3.f346519c;
            if (aVar3 != null) {
                fo5.r0 r0Var2 = (fo5.r0) aVar3;
                r0Var2.I = null;
                r0Var2.f346615J = false;
                lo5.h.b(r0Var2.f346628n, false, 1, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
