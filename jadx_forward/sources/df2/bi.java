package df2;

/* loaded from: classes3.dex */
public final class bi extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f311345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.fi f311346e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(df2.fi fiVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311346e = fiVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.bi(this.f311346e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((df2.bi) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f311345d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            df2.fi fiVar = this.f311346e;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = ((mm2.g1) fiVar.m56788xbba4bfc0(mm2.g1.class)).f410604i;
            df2.ai aiVar = new df2.ai(fiVar);
            this.f311345d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).a(aiVar, this) == aVar) {
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
