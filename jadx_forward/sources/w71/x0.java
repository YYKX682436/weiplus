package w71;

/* loaded from: classes11.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f524998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.a0 f524999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f525000f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(long j17, bw5.a0 a0Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f524998d = j17;
        this.f524999e = a0Var;
        this.f525000f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new w71.x0(this.f524998d, this.f524999e, this.f525000f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        w71.x0 x0Var = (w71.x0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        x0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("response ");
        sb6.append(this.f524998d);
        sb6.append(", resp ");
        bw5.a0 a0Var = this.f524999e;
        sb6.append((a0Var.f106490i[4] ? a0Var.f106488g : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b).f273689a.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeCgi", sb6.toString());
        this.f525000f.mo146xb9724478(a0Var);
        return jz5.f0.f384359a;
    }
}
