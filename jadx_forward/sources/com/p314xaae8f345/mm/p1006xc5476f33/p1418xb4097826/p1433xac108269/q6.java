package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes8.dex */
public final class q6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f184018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f184019e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(ya2.b2 b2Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f184018d = b2Var;
        this.f184019e = abstractActivityC21394xb3d2c0cf;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.q6(this.f184018d, this.f184019e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.q6 q6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.q6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        q6Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ot0.q qVar = new ot0.q();
        zy2.h hVar = new zy2.h();
        ya2.b2 b2Var = this.f184018d;
        hVar.m(b2Var.D0());
        java.lang.String z07 = b2Var.z0();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        hVar.l(z07);
        hVar.j(b2Var.y0());
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = b2Var.f69300x731cac1b;
        hVar.h(c19780xceb4c4dc != null ? c19780xceb4c4dc.m76027x1cbb0791() : 0);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc2 = b2Var.f69300x731cac1b;
        java.lang.String m76029xad9975ba = c19780xceb4c4dc2 != null ? c19780xceb4c4dc2.m76029xad9975ba() : null;
        if (m76029xad9975ba == null) {
            m76029xad9975ba = "";
        }
        hVar.i(m76029xad9975ba);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc3 = b2Var.f69300x731cac1b;
        java.lang.String m76028x11716638 = c19780xceb4c4dc3 != null ? c19780xceb4c4dc3.m76028x11716638() : null;
        hVar.f558930h = m76028x11716638 != null ? m76028x11716638 : "";
        hVar.k(1);
        qVar.f(hVar);
        qVar.f430199i = 105;
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", 35);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(qVar, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        intent.putExtra("content_type_forward_to_wework", 8);
        j45.l.w(this.f184019e, ".ui.transmit.MsgRetransmitUI", intent, 1018, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p6(b2Var));
        return jz5.f0.f384359a;
    }
}
