package df2;

/* loaded from: classes3.dex */
public final class ge extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f311745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f311746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.qe f311747f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(java.util.LinkedList linkedList, df2.qe qeVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311746e = linkedList;
        this.f311747f = qeVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        df2.ge geVar = new df2.ge(this.f311746e, this.f311747f, interfaceC29045xdcb5ca57);
        geVar.f311745d = obj;
        return geVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.ge geVar = (df2.ge) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        geVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f311745d;
        java.util.Iterator it = this.f311746e.iterator();
        while (it.hasNext()) {
            ((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new df2.fe((r45.vm1) it.next(), this.f311747f, null), 3, null)).mo143976x68ac462();
        }
        return jz5.f0.f384359a;
    }
}
