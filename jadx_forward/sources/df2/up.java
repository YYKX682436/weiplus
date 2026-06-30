package df2;

/* loaded from: classes10.dex */
public final class up extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f313080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.vp f313081e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(df2.vp vpVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f313081e = vpVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.up(this.f313081e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.up) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        mn0.i0 n17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f313080d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            tn0.w0 w0Var = dk2.ef.f314911d;
            co0.s sVar = w0Var instanceof co0.s ? (co0.s) w0Var : null;
            mn0.b0 b0Var = sVar != null ? sVar.R1.f363942a : null;
            df2.vp vpVar = this.f313081e;
            vpVar.f313153m = b0Var;
            if ((b0Var == null || (n17 = ((mn0.y) b0Var).n()) == null || !n17.f411293z) ? false : true) {
                vpVar.f313155o = 2;
            }
            mn0.b0 b0Var2 = vpVar.f313153m;
            if (b0Var2 != null) {
                df2.tp tpVar = new df2.tp(vpVar);
                this.f313080d = 1;
                mn0.y.c((mn0.y) b0Var2, tpVar, this);
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
