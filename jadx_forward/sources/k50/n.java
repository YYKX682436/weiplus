package k50;

/* loaded from: classes9.dex */
public final class n {
    public n(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, java.lang.String toUser, p15.n nVar, java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (msgInfo.j() == null) {
            return;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 S1 = m11.b1.Di().S1(msgInfo);
        j15.d dVar = new j15.d();
        java.lang.String j17 = msgInfo.j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getContent(...)");
        dVar.m126728xdc93280d(j17);
        c01.h7 h7Var = new c01.h7();
        h7Var.f118760b = msgInfo.m124847x74d37ac6();
        h7Var.f118762d = msgInfo.Q0();
        h7Var.f118759a = S1.f404166a;
        msgInfo.mo78012x3fdd41df();
        int i17 = S1.j() ? 1 : 0;
        k70.i0 i0Var = new k70.i0();
        i0Var.f386175a = 4;
        i0Var.f386188n = 2;
        i0Var.f386189o = h7Var;
        i0Var.f386194t = new r15.b();
        if (!(str == null || r26.n0.N(str))) {
            r15.b bVar = i0Var.f386194t;
            if (bVar != null) {
                r15.b l17 = dVar.l();
                bVar.o(l17 != null ? l17.j() : null);
            }
            r15.b bVar2 = i0Var.f386194t;
            r15.d j18 = bVar2 != null ? bVar2.j() : null;
            if (j18 != null) {
                j18.k(str);
            }
        }
        i0Var.f386184j = nVar != null ? nVar.k() : null;
        i0Var.f386185k = nVar != null ? nVar.l() : null;
        i0Var.f386186l = nVar != null ? nVar.j() : null;
        java.lang.String r17 = c01.z1.r();
        if (r17 == null) {
            r17 = "";
        }
        r70.g gVar = new r70.g("", i17, r17, toUser, i0Var);
        gVar.f474641j = "forward_single_img";
        gm0.b bVar3 = gm0.j1.b().f354778h;
        if (bVar3 == null || (c20976x6ba6452a = bVar3.f354678e) == null) {
            return;
        }
        v65.i.b(c20976x6ba6452a, null, new k50.m(gVar, null), 1, null);
    }
}
