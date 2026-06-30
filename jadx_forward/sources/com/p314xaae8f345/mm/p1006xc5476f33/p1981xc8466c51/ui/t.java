package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f237014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f237015e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s15.h f237016f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.gp0 f237017g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.String str, s15.h hVar, r45.gp0 gp0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f237015e = str;
        this.f237016f = hVar;
        this.f237017g = gp0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.t(this.f237015e, this.f237016f, this.f237017g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.ip0 ip0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f237014d;
        r45.gp0 gp0Var = this.f237017g;
        java.lang.String str = this.f237015e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            zu.b bVar = zu.b.f557168e;
            java.lang.String str2 = gp0Var.V;
            if (str2 == null) {
                str2 = "";
            }
            s15.h hVar = this.f237016f;
            tt.h hVar2 = new tt.h(str, bVar, hVar, str2);
            pt0.e0 e0Var = pt0.f0.f439742b1;
            r45.hp0 hp0Var = gp0Var.J1;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 l17 = e0Var.l((hp0Var == null || (ip0Var = hp0Var.f457886d) == null) ? null : ip0Var.f458764f, hVar.A());
            if (l17 != null) {
                hVar2.f503301e = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(l17);
                hVar2.f503302f = 4;
                hVar2.f503303g = 30;
            }
            pt.k0 k0Var = (pt.k0) i95.n0.c(pt.k0.class);
            this.f237014d = 1;
            ((ot.q) k0Var).getClass();
            obj = tt.f.f503290f.a().T6(hVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        tt.i iVar = (tt.i) obj;
        tt.g gVar = iVar.f503306a;
        if (gVar == tt.g.f503291d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.ForwardRecordMsgDataLogic", str + " download data img " + gVar + ' ' + com.p314xaae8f345.mm.vfs.w6.k(gp0Var.V));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.ForwardRecordMsgDataLogic", str + " download data img " + gVar + ' ' + iVar.f503307b);
        }
        return jz5.f0.f384359a;
    }
}
