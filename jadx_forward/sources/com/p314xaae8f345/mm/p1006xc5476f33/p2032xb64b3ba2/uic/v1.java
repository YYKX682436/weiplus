package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class v1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f240052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.x1 f240053e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.x1 x1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f240053e = x1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v1(this.f240053e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f240052d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.x1 x1Var = this.f240053e;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = x1Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            qx3.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.z1) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.z1.class)).f240093d;
            if (oVar == null || (f3Var = oVar.f448909f) == null) {
                return jz5.f0.f384359a;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.u1 u1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.u1(x1Var);
            this.f240052d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) f3Var).a(u1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        throw new jz5.d();
    }
}
