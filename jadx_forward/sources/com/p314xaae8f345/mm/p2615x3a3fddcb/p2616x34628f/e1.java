package com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f;

/* loaded from: classes4.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n85.t f274990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n85.t f274991e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(n85.t tVar, n85.t tVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f274990d = tVar;
        this.f274991e = tVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.e1(this.f274990d, this.f274991e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.e1 e1Var = (com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.e1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        e1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        dx1.f fVar = dx1.g.f326022a;
        n85.t tVar = this.f274990d;
        java.lang.String str = tVar.f417257d;
        bx1.u uVar = bx1.u.f117846h;
        fVar.j("MomentsTogetherHistoryBrowsing", "withFriendFeedCount", str, uVar);
        if ((tVar.f417264k & 32) > 0) {
            fVar.j("MomentsTogetherHistoryBrowsing", "withFriendExtraFeedCount", tVar.f417257d, uVar);
        }
        java.lang.String snsId = this.f274991e.f417257d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
        fVar.l("MomentsTogetherHistoryBrowsing", "withFriendDetailAction", pm0.v.u(0L), "0,0,0,0,0", bx1.u.f117842d);
        return jz5.f0.f384359a;
    }
}
