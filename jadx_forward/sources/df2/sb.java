package df2;

/* loaded from: classes3.dex */
public final class sb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zb f312861e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(df2.zb zbVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312861e = zbVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.sb(this.f312861e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.sb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312860d;
        df2.zb zbVar = this.f312861e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.ff1 ff1Var = zbVar.f313477r;
            int m75939xb282bd08 = ff1Var != null ? ff1Var.m75939xb282bd08(5) : 12;
            this.f312860d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(m75939xb282bd08 * 1000, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        df2.zb.w7(zbVar, false, null, 2, null);
        zbVar.q7(7);
        zbVar.s7(r45.n72.kActionType_AiassistantClose, 1, "");
        return jz5.f0.f384359a;
    }
}
