package df2;

/* loaded from: classes10.dex */
public final class on extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.un f312523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312524f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(df2.un unVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312523e = unVar;
        this.f312524f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.on(this.f312523e, this.f312524f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.on) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312522d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            df2.un unVar = this.f312523e;
            rf2.v0 v0Var = unVar.f313075p;
            if (v0Var != null) {
                v0Var.f476450d = null;
            }
            rf2.c2 c2Var = unVar.f313076q;
            if (c2Var != null) {
                this.f312522d = 1;
                if (c2Var.c(this.f312524f, true, this) == aVar) {
                    return aVar;
                }
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
