package ch2;

/* loaded from: classes3.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f122885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.q f122886e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ch2.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122886e = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ch2.g(this.f122886e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((ch2.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f122885d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ch2.q qVar = this.f122886e;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = ((om2.l) qVar.m56788xbba4bfc0(om2.l.class)).f427875g;
            ch2.f fVar = new ch2.f(qVar);
            this.f122885d = 1;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.q2 q2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) i2Var;
            q2Var.getClass();
            if (p3325xe03a0797.p3326xc267989b.p3328x30012e.q2.l(q2Var, fVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        throw new jz5.d();
    }
}
