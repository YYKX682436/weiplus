package sr2;

/* loaded from: classes8.dex */
public final class q3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 f493217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.l f493218e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6, jz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f493217d = c14609xb4d6eef6;
        this.f493218e = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sr2.q3(this.f493217d, this.f493218e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sr2.q3 q3Var = (sr2.q3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        q3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6 = this.f493217d;
        c14609xb4d6eef6.w7();
        jz5.l lVar = this.f493218e;
        java.lang.String str = (java.lang.String) lVar.f384367e;
        if (((java.lang.Boolean) lVar.f384366d).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6.U6(c14609xb4d6eef6, bw5.cr.FinderModifyFeedRetSuc);
            c14609xb4d6eef6.m158354x19263085().finish();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6.U6(c14609xb4d6eef6, bw5.cr.FinderModifyFeedRetFail);
            if (str == null || str.length() == 0) {
                str = c14609xb4d6eef6.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nlz);
            }
        }
        if (!(str == null || str.length() == 0)) {
            db5.t7.m(c14609xb4d6eef6.m158354x19263085(), str);
        }
        return jz5.f0.f384359a;
    }
}
