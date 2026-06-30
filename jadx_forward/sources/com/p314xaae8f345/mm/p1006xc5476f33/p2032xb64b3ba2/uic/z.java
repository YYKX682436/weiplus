package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f240086d;

    /* renamed from: e, reason: collision with root package name */
    public int f240087e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f240088f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b0 f240089g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f240090h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b0 b0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f240088f = str;
        this.f240089g = b0Var;
        this.f240090h = u3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.z(this.f240088f, this.f240089g, this.f240090h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.z) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object c17;
        vx3.i iVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f240087e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            vx3.i d17 = mx3.i0.d(this.f240088f);
            java.lang.String str = this.f240088f;
            this.f240086d = d17;
            this.f240087e = 1;
            c17 = xx3.h.f539557a.c(2, 3, 0L, null, 0, 0, str, (r26 & 128) != 0 ? 0 : 0, (r26 & 256) != 0 ? "" : null, this);
            if (c17 == aVar) {
                return aVar;
            }
            iVar = d17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vx3.i iVar2 = (vx3.i) this.f240086d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            iVar = iVar2;
            c17 = obj;
        }
        rm0.i iVar3 = (rm0.i) c17;
        if (iVar3 != null) {
            java.lang.String str2 = this.f240088f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b0 b0Var = this.f240089g;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f240090h;
            if (iVar3.f478954a) {
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.x(u3Var, b0Var, iVar, str2, null), 3, null);
                mx3.i0.m(str2, null, 0L, 4, null);
                px3.j jVar = b0Var.f239879g;
                if (jVar != null) {
                    jVar.f440487i = p3325xe03a0797.p3326xc267989b.l.d(jVar.f440483e, null, null, new px3.i(str2, jVar, null), 3, null);
                }
                mx3.i0.k(str2, null);
            } else {
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.y(u3Var, b0Var, null), 3, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
