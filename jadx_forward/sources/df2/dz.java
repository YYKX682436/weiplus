package df2;

/* loaded from: classes3.dex */
public final class dz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f311540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.lz f311541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.aq4 f311542f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz(df2.lz lzVar, r45.aq4 aq4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311541e = lzVar;
        this.f311542f = aq4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.dz(this.f311541e, this.f311542f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.dz) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f311540d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            df2.lz lzVar = this.f311541e;
            java.lang.String str = lzVar.f312263m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive moneyoff info ");
            r45.aq4 aq4Var = this.f311542f;
            sb6.append(aq4Var != null ? aq4Var.mo12245xcc313de3() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            this.f311540d = 1;
            if (df2.lz.Z6(lzVar, aq4Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
