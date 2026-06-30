package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276851d;

    /* renamed from: e, reason: collision with root package name */
    public int f276852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.b0 f276853f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dw5.h f276854g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.p314xaae8f345.mm.p2621x8fb0427b.b0 b0Var, dw5.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f276853f = b0Var;
        this.f276854g = hVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p2621x8fb0427b.t0(this.f276853f, this.f276854g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p2621x8fb0427b.t0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a1 a1Var;
        r45.il ilVar;
        java.util.LinkedList linkedList;
        r45.vn vnVar;
        r45.qm5 qm5Var;
        r45.vn vnVar2;
        r45.vn vnVar3;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f276852e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2621x8fb0427b.a1 a1Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275249a;
            this.f276851d = a1Var2;
            this.f276852e = 1;
            java.lang.Object e17 = com.p314xaae8f345.mm.p2621x8fb0427b.a1.e(a1Var2, true, this.f276853f, this.f276854g, this);
            if (e17 == aVar) {
                return aVar;
            }
            a1Var = a1Var2;
            obj = e17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1Var = (com.p314xaae8f345.mm.p2621x8fb0427b.a1) this.f276851d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        a1Var.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275257i = (r45.rm5) obj;
        com.p314xaae8f345.mm.p2621x8fb0427b.a1 a1Var3 = com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275249a;
        r45.cm5 cm5Var = com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275256h;
        java.lang.Integer num = null;
        r45.qm5 qm5Var2 = (cm5Var == null || (vnVar3 = cm5Var.f453200d) == null) ? null : vnVar3.f469923n;
        if (qm5Var2 != null) {
            qm5Var2.f465628d = com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275257i;
        }
        r45.cm5 cm5Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275256h;
        r45.qm5 qm5Var3 = (cm5Var2 == null || (vnVar2 = cm5Var2.f453200d) == null) ? null : vnVar2.f469923n;
        if (qm5Var3 != null) {
            qm5Var3.f465629e = null;
        }
        if (cm5Var2 != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.x xVar = com.p314xaae8f345.mm.p2621x8fb0427b.x.f277847e;
            cm5Var2.f453202f = 1;
        }
        r45.cm5 cm5Var3 = com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275256h;
        if (cm5Var3 != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275260l.add(cm5Var3);
        }
        r45.cm5 cm5Var4 = com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275256h;
        r45.rm5 rm5Var = (cm5Var4 == null || (vnVar = cm5Var4.f453200d) == null || (qm5Var = vnVar.f469923n) == null) ? null : qm5Var.f465628d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reddot_report ACT_TYPE_EXPOSE_BOX 1. begin_moment time= ");
        sb6.append(rm5Var != null ? new java.lang.Long(rm5Var.f466548f) : null);
        sb6.append("  scene=");
        sb6.append(rm5Var != null ? new java.lang.Integer(rm5Var.f466547e) : null);
        sb6.append("  last_page_name=");
        sb6.append(rm5Var != null ? rm5Var.f466549g : null);
        sb6.append(" tab_box size=");
        if (rm5Var != null && (ilVar = rm5Var.f466546d) != null && (linkedList = ilVar.f458659i) != null) {
            num = new java.lang.Integer(linkedList.size());
        }
        sb6.append(num);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMainCellExposeHelper", sb6.toString());
        a1Var3.p(com.p314xaae8f345.mm.p2621x8fb0427b.x.f277847e);
        return jz5.f0.f384359a;
    }
}
