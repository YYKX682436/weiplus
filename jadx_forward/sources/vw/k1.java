package vw;

/* loaded from: classes11.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f522207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vw.m2 f522208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(vw.m2 m2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f522208e = m2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vw.k1(this.f522208e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vw.k1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f522207d;
        vw.m2 m2Var = this.f522208e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pi0.l1 l1Var = m2Var.f522220g;
            if (l1Var != null) {
                this.f522207d = 1;
                if (l1Var.h(m2Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        m2Var.f522220g = null;
        return jz5.f0.f384359a;
    }
}
