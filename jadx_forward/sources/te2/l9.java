package te2;

/* loaded from: classes10.dex */
public final class l9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f499743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.m9 f499744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(te2.m9 m9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f499744e = m9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te2.l9(this.f499744e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((te2.l9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f499743d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            te2.m9 m9Var = this.f499744e;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var = ((mm2.m6) m9Var.f499683e.a(mm2.m6.class)).f410784s;
            te2.k9 k9Var = new te2.k9(m9Var);
            this.f499743d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) f3Var).a(k9Var, this) == aVar) {
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
