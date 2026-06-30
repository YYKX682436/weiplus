package u70;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5989x2fac034c) abstractC20979x809547d1).f136284g.f88805a;
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: u70.e$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.this;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f27 = pt0.f0.f2(f9Var2.Q0(), f9Var2.m124847x74d37ac6());
                if (f27 == null || f27.I0() != 0) {
                    if (f27 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendImageMsgListener", "sendImg already send msgId:%s msgSvrId:%s", java.lang.Long.valueOf(f27.m124847x74d37ac6()), java.lang.Long.valueOf(f27.I0()));
                        return;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendImageMsgListener", "sendImg msg not exist msgId:%s", java.lang.Long.valueOf(f27.m124847x74d37ac6()));
                        return;
                    }
                }
                f27.r1(1);
                int s17 = pt0.f0.f439742b1.s(f27.Q0(), f27.m124847x74d37ac6(), f27);
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                m11.b0 S1 = m11.b1.Di().S1(f27);
                if (S1 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendImageMsgListener", "sendImg imgInfo is null msgId:%s", java.lang.Long.valueOf(f27.m124847x74d37ac6()));
                    return;
                }
                java.lang.String Q0 = f27.Q0();
                if (Q0 == null) {
                    Q0 = "";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendImageMsgListener", "sendImg updateRet:%s msgId:%s imgLocalId:%s", java.lang.Integer.valueOf(s17), java.lang.Long.valueOf(f27.m124847x74d37ac6()), java.lang.Long.valueOf(S1.f404166a));
                o70.l lVar = new o70.l(f27.m124847x74d37ac6(), f27.mo78012x3fdd41df(), S1.f404166a, Q0);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var2.j())) {
                    r15.b bVar = new r15.b();
                    bVar.m126729xdc93280d(f9Var2.j(), "msg");
                    if (bVar.n() != null) {
                        lVar.f424816s = bVar;
                    }
                }
                g80.p pVar = (g80.p) ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).hj(Q0, f27.m124847x74d37ac6());
                java.lang.String str = (java.lang.String) pVar.a(s70.c.f485450e).f384366d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                lVar.f424803f = str;
                java.lang.String str2 = (java.lang.String) pVar.a(s70.c.f485451f).f384366d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
                lVar.f424806i = str2;
                jz5.l a17 = pVar.a(s70.c.f485452g);
                java.lang.String str3 = (java.lang.String) a17.f384366d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
                lVar.f424804g = str3;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(str3)) {
                    lVar.f424807j = str3;
                } else {
                    java.lang.String str4 = (java.lang.String) a17.f384367e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str4, "<set-?>");
                    lVar.f424807j = str4;
                }
                java.lang.String str5 = (java.lang.String) pVar.a(s70.c.f485453h).f384366d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str5, "<set-?>");
                lVar.f424805h = str5;
                j15.a ij6 = ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).ij(f27);
                lVar.f424809l = ij6.q();
                lVar.f424810m = ij6.n();
                lVar.f424811n = S1.f404182q;
                java.lang.String str6 = S1.f404176k;
                if (str6 == null) {
                    str6 = "";
                }
                lVar.f424808k = str6;
                java.lang.String str7 = f27.G;
                if (str7 == null) {
                    str7 = "";
                }
                lVar.f424812o = str7;
                java.lang.String U1 = f27.U1();
                if (U1 == null) {
                    U1 = "";
                }
                lVar.f424814q = U1;
                j15.d dVar = new j15.d();
                java.lang.String U12 = f27.U1();
                if (U12 == null) {
                    U12 = "";
                }
                dVar.m126728xdc93280d(U12);
                lVar.f424817t = dVar.o().t();
                k70.i0 i0Var = new k70.i0();
                i0Var.f386175a = S1.f404183r;
                i0Var.f386188n = S1.f404174i;
                i0Var.f386180f = f27.G;
                i0Var.f386194t = lVar.f424816s;
                if (dVar.n() != null) {
                    i0Var.f386190p = dVar.n().j();
                }
                boolean j17 = S1.j();
                java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar.f424805h) ? lVar.f424804g : lVar.f424805h;
                java.lang.String r17 = c01.z1.r();
                r70.g gVar = new r70.g(str8, j17 ? 1 : 0, r17 == null ? "" : r17, Q0, i0Var);
                gVar.f474641j = "send_image_event";
                lVar.f424813p = j17 ? 1 : 0;
                ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).oj(gVar, lVar);
            }
        }, "Thread_SendImageMsgListener");
        return false;
    }
}
