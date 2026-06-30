package qe5;

/* loaded from: classes12.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.z f443713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(qe5.z zVar) {
        super(1);
        this.f443713d = zVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ot0.q v17;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d o17;
        kd5.e state = (kd5.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        kd5.m mVar = (kd5.m) state.a(kd5.m.class);
        qe5.z zVar = this.f443713d;
        if (mVar != null && zVar.b7()) {
            kd5.e V6 = zVar.V6();
            java.lang.String str = V6 != null ? V6.f388426x : null;
            kd5.e V62 = zVar.V6();
            java.lang.String str2 = V62 != null ? V62.F : null;
            kd5.e V63 = zVar.V6();
            java.lang.String str3 = V63 != null ? V63.f388425w : null;
            ((ht.s) ((jt.a0) i95.n0.c(jt.a0.class))).getClass();
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.t3.l(str)) {
                ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
                if (!((java.util.ArrayList) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.f273145a).contains(str2)) {
                    zVar.d7(true);
                }
            }
            kd5.e V64 = zVar.V6();
            if (V64 != null) {
                V64.f388409J = true;
            }
            kd5.e V65 = zVar.V6();
            ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Ri(zVar.m80379x76847179(), 3, new qe5.s(zVar, str2, str, V65 != null && V65.f388417o ? 5 : 1, str3));
        }
        if (((kd5.d) state.a(kd5.d.class)) != null) {
            kd5.e V66 = zVar.V6();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = V66 != null ? V66.f388410e : null;
            if (f9Var != null) {
                kd5.e V67 = zVar.V6();
                if ((V67 != null ? V67.G : false) || !f9Var.k2() || (v17 = ot0.q.v(f9Var.j())) == null || !ez.v0.f339310a.j(java.lang.Integer.valueOf(v17.f430199i)) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.A) || (o17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.o(f9Var, v17.f430227p)) == null || (com.p314xaae8f345.mm.vfs.w6.j(o17.f68099xfeae815) && com.p314xaae8f345.mm.vfs.w6.k(o17.f68099xfeae815) == o17.f68113xeb1a61d6)) {
                    kd5.e V68 = zVar.V6();
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = V68 != null ? V68.f388410e : null;
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.j(c5303xc75d2f73, f9Var2, false);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = zVar.m158354x19263085();
                    am.c4 c4Var = c5303xc75d2f73.f135623g;
                    c4Var.f87856i = m158354x19263085;
                    c4Var.f87860m = 39;
                    c5303xc75d2f73.e();
                } else {
                    zVar.f443757f = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilePreviewUtil", "getFileSendStatus: isSend = false, stack = " + new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                    o17.f68112x10a0fed7 = (long) 101;
                    o17.f68103x4a777c2 = (long) c01.id.e();
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(o17, new java.lang.String[0]);
                    j75.f Q6 = zVar.Q6();
                    if (Q6 != null) {
                        Q6.B3(new kd5.y());
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
