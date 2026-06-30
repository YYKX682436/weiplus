package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes8.dex */
public final class m6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f183917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f183918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f183919f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(ya2.b2 b2Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f183918e = b2Var;
        this.f183919f = abstractActivityC21394xb3d2c0cf;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m6(this.f183918e, this.f183919f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f183917d;
        ya2.b2 b2Var = this.f183918e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            s40.b1 b1Var = (s40.b1) i95.n0.c(s40.b1.class);
            java.lang.String r17 = c01.z1.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
            java.lang.String D0 = b2Var.D0();
            this.f183917d = 1;
            obj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6) b1Var).Ni(r17, 4, D0, 0L, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f183919f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n;
        ot0.q qVar = new ot0.q();
        zy2.h hVar = new zy2.h();
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        hVar.f558931i = str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) pf5.z.f435481a.a(activity).c(zy2.v9.class))).Q6(hVar.f558924b);
        qVar.f(hVar);
        qVar.f430199i = 50;
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", 20);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(qVar, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        intent.putExtra("content_type_forward_to_wework", 8);
        j45.l.w(activity, ".ui.transmit.MsgRetransmitUI", intent, 1003, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l6(b2Var, i18));
        return jz5.f0.f384359a;
    }
}
