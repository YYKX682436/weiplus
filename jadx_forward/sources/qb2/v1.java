package qb2;

/* loaded from: classes5.dex */
public final class v1 implements vg3.q4 {
    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map values, com.p314xaae8f345.mm.p944x882e457a.p0 addMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsgInfo, "addMsgInfo");
        java.lang.Object obj = addMsgInfo.f152265g;
        if ((obj instanceof r45.w3) && addMsgInfo.f152266h == 1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AddBypMsg");
            java.lang.String str2 = ((r45.w3) obj).f470360e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPrivateSysMsgConsumer", java.lang.String.valueOf(str));
            r45.j4 j4Var = addMsgInfo.f152259a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x51.j1.g(j4Var != null ? j4Var.f459094h : null))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderPrivateSysMsgConsumer", "msg content is null");
                return null;
            }
            java.lang.String g17 = x51.j1.g(j4Var != null ? j4Var.f459091e : null);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g17, j4Var != null ? j4Var.f459101r : 0L);
            o27.o1(j4Var != null ? j4Var.f459101r : 0L);
            o27.e1(c01.w9.m(g17, j4Var != null ? j4Var.f459098o : 0L));
            o27.m124850x7650bebc(10000);
            o27.d1((java.lang.String) values.get(".sysmsg.SysMsgContent"));
            o27.j1(0);
            o27.u1(str2);
            o27.u3(j4Var != null ? j4Var.f459099p : null);
            o27.l1(o27.F & (-129));
            c01.w9.x(o27);
        }
        return null;
    }
}
