package dz4;

/* loaded from: classes11.dex */
public final class z3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.h4 f327011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz4.g f327012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3164x6bba817.h f327013f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(dz4.h4 h4Var, dz4.g gVar, com.p314xaae8f345.p3133xd0ce8b26.aff.p3164x6bba817.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f327011d = h4Var;
        this.f327012e = gVar;
        this.f327013f = hVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dz4.z3(this.f327011d, this.f327012e, this.f327013f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        dz4.z3 z3Var = (dz4.z3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        z3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        dz4.h4 h4Var = this.f327011d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = h4Var.f326820e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h4Var.f326820e = null;
        h4Var.d(this.f327012e, this.f327013f);
        return jz5.f0.f384359a;
    }
}
