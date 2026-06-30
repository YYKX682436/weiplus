package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f240065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b0 f240066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vx3.i f240067f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f240068g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b0 b0Var, vx3.i iVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f240065d = u3Var;
        this.f240066e = b0Var;
        this.f240067f = iVar;
        this.f240068g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.x(this.f240065d, this.f240066e, this.f240067f, this.f240068g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f240065d;
        if (u3Var != null) {
            u3Var.hide();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b0 b0Var = this.f240066e;
        db5.t7.h(b0Var.m158354x19263085(), b0Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bor));
        jz5.f0 f0Var = jz5.f0.f384359a;
        vx3.i iVar = this.f240067f;
        if (iVar == null) {
            return f0Var;
        }
        boolean z17 = (iVar.f522834r == null || iVar.i().f339137b == null || !co4.c.b(iVar.i())) ? false : true;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = b0Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d3) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d3.class)).P6(iVar, this.f240068g, z17);
        return f0Var;
    }
}
