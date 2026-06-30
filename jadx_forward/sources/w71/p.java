package w71;

/* loaded from: classes10.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w71.s f524965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f524966e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w71.s sVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f524965d = sVar;
        this.f524966e = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new w71.p(this.f524965d, this.f524966e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        w71.p pVar = (w71.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        pVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        w71.s sVar = this.f524965d;
        bw5.fs0 fs0Var = sVar.f524973a;
        int i17 = fs0Var.f109043n;
        java.lang.String c17 = fs0Var.c();
        bw5.fs0 fs0Var2 = sVar.f524973a;
        su4.k2.j(4, i17, c17, fs0Var2.c(), fs0Var2.I[9] ? fs0Var2.f109044o : "", 0, true, sVar.f524974b, true, fs0Var2.b(), "", (int) fs0Var2.f109039g, false, this.f524966e);
        return jz5.f0.f384359a;
    }
}
