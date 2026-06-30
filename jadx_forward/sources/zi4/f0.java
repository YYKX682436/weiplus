package zi4;

/* loaded from: classes.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.g0 f554742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f554743e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(zi4.g0 g0Var, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f554742d = g0Var;
        this.f554743e = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zi4.f0(this.f554742d, this.f554743e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        zi4.f0 f0Var = (zi4.f0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        f0Var.mo150x989b7ca4(f0Var2);
        return f0Var2;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.HashSet hashSet = (java.util.HashSet) ((jz5.n) this.f554742d.f554750c).mo141623x754a37bb();
        java.util.List list = this.f554743e;
        hashSet.removeAll(list);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FLTStatusActionHost", "unRegisterCmdId success " + list);
        return jz5.f0.f384359a;
    }
}
