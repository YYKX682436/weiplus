package vp;

/* loaded from: classes14.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp.v0 f520349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wp.a f520350e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(vp.v0 v0Var, wp.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f520349d = v0Var;
        this.f520350e = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vp.n0(this.f520349d, this.f520350e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vp.n0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f520349d.f520384m;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            return f0Var;
        }
        java.lang.Object obj2 = this.f520349d.f520378g;
        if (obj2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("taskChannel");
            throw null;
        }
        java.lang.Object e17 = ((u26.o) obj2).e(new vp.k0(this.f520350e));
        if (e17 instanceof u26.b0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuAsyncDataSource", "addDanmakuToDrawListAsync: trySend failed, result=" + ((java.lang.Object) u26.c0.c(e17)));
        }
        return f0Var;
    }
}
