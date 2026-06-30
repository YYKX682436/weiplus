package dk2;

/* loaded from: classes.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f315826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315827e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, dk2.r4 r4Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f315826d = hVar;
        this.f315827e = r4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dk2.x0(this.f315826d, interfaceC29045xdcb5ca57, this.f315827e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        dk2.x0 x0Var = (dk2.x0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        x0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        rm0.j jVar = ((xg2.a) ((xg2.b) this.f315826d).f535914b).f535912a;
        if (jVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f315827e.f315542d, "[cancelGiftText] errCode = " + jVar.f478958f + ", errType = " + jVar.f478957e);
        }
        return jz5.f0.f384359a;
    }
}
