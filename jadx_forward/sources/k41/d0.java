package k41;

/* loaded from: classes9.dex */
public final class d0 extends c01.l implements com.p314xaae8f345.mm.p944x882e457a.i1 {
    @Override // c01.l
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 b(com.p314xaae8f345.mm.p944x882e457a.p0 addMsgInfo, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsgInfo, "addMsgInfo");
        r45.j4 j4Var = addMsgInfo.f152259a;
        k41.k0 b17 = k41.o0.b(x51.j1.g(j4Var.f459094h));
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuCardExtension", "kefuCard content parse failed");
            return super.b(addMsgInfo, str, str2, str3);
        }
        if (j4Var.f459093g == 67) {
            ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).cj(b17.f385554e);
        }
        if (b17.f385550a.length() > 0) {
            com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
            r0Var.f152062a = b17.f385550a;
            r0Var.f152063b = 3;
            r0Var.f152067f = 1;
            r0Var.f152066e = b17.f385552c;
            r0Var.f152065d = b17.f385553d;
            r0Var.f152070i = -1;
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
        }
        return super.b(addMsgInfo, str, str2, str3);
    }
}
