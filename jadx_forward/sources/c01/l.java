package c01;

/* loaded from: classes9.dex */
public abstract class l implements com.p314xaae8f345.mm.p944x882e457a.t0 {

    /* renamed from: d, reason: collision with root package name */
    public static final c01.o f118825d = new c01.o();

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 b(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        r45.j4 j4Var = p0Var.f152259a;
        java.lang.String str4 = str3.equals(str) ? str2 : str;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str4, j4Var.f459101r);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseMsgExtension", "summerbadcr dkmsgid prepareMsgInfo svrid:%d localid:%d  from:%s to:%s talker:%s", java.lang.Long.valueOf(j4Var.f459101r), java.lang.Long.valueOf(o27.m124847x74d37ac6()), str, str2, str4);
        if (o27.m124847x74d37ac6() != 0 && o27.mo78012x3fdd41df() + 604800000 < c01.w9.m(str4, j4Var.f459098o)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseMsgExtension", "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d localid:%d", java.lang.Long.valueOf(j4Var.f459101r), java.lang.Long.valueOf(o27.m124847x74d37ac6()));
            c01.w9.f(o27.m124847x74d37ac6(), o27.Q0());
            o27.m124849x5361953a(0L);
        }
        if (o27.m124847x74d37ac6() == 0) {
            o27 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            o27.u1(str4);
            o27.o1(j4Var.f459101r);
            o27.m124850x7650bebc(j4Var.f459093g);
            java.lang.String g17 = x51.j1.g(j4Var.f459094h);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (g17 == null) {
                g17 = "";
            }
            java.lang.String o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o(g17);
            o27.d1(o17);
            o27.e1(k(str4, j4Var, o17));
        }
        return o27;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024f  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p944x882e457a.q0 b1(final com.p314xaae8f345.mm.p944x882e457a.p0 r29) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c01.l.b1(com.tencent.mm.modelbase.p0):com.tencent.mm.modelbase.q0");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.t0
    public void x5(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
