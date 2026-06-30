package df2;

/* loaded from: classes3.dex */
public final class qm extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.cn f312705e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312706f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm(df2.cn cnVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312705e = cnVar;
        this.f312706f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.qm(this.f312705e, this.f312706f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.qm) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312704d;
        df2.cn cnVar = this.f312705e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long j17 = cnVar.A;
            this.f312704d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String str = cnVar.f311425p;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = this.f312706f;
        sb6.append(str2);
        sb6.append(" dismiss after like, delay = ");
        sb6.append(cnVar.A);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        cnVar.n7(str2 + "-dismissAfterLikeJob", false);
        return jz5.f0.f384359a;
    }
}
