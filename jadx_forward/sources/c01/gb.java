package c01;

/* loaded from: classes12.dex */
public abstract class gb {
    public static final void a(oi3.f fVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        java.lang.String z07 = msgInfo.z0();
        if (z07 == null) {
            z07 = "";
        }
        fVar.p(z07);
        j15.a b17 = g45.c.b(msgInfo);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.y())) {
            fVar.s(b17.I());
            fVar.r(b17.F());
        } else {
            fVar.s(b17.q());
            fVar.r(b17.n());
        }
        fVar.q(msgInfo.h2());
        fVar.o(msgInfo.f317698J);
        java.lang.String str = msgInfo.G;
        if (str == null) {
            str = "";
        }
        int i17 = fVar.f427150d;
        fVar.set(i17 + 12, str);
        fVar.set(i17 + 9, java.lang.Integer.valueOf(msgInfo.A0()));
        fVar.set(i17 + 2, java.lang.Long.valueOf(msgInfo.mo78012x3fdd41df()));
        fVar.set(i17 + 0, java.lang.Long.valueOf(msgInfo.m124847x74d37ac6()));
        fVar.set(i17 + 1, java.lang.Long.valueOf(msgInfo.I0()));
        java.lang.String Q0 = msgInfo.Q0();
        if (Q0 == null) {
            Q0 = "";
        }
        fVar.set(i17 + 3, Q0);
        fVar.set(i17 + 4, java.lang.Integer.valueOf(msgInfo.mo78013xfb85f7b0()));
        fVar.set(i17 + 7, java.lang.Integer.valueOf(msgInfo.P0()));
        java.lang.String j17 = msgInfo.j();
        if (j17 == null) {
            j17 = "";
        }
        fVar.set(i17 + 13, j17);
        fVar.set(i17 + 10, java.lang.Integer.valueOf(msgInfo.w0()));
        java.lang.String V1 = msgInfo.V1();
        if (V1 == null) {
            V1 = msgInfo.y0();
        }
        fVar.set(i17 + 11, V1 != null ? V1 : "");
    }

    public static final j15.a b(oi3.f fVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        if (fVar.n() > 0 && fVar.l() > 0) {
            j15.a aVar = new j15.a();
            aVar.Y(fVar.n());
            aVar.U(fVar.l());
            return aVar;
        }
        j15.d dVar = new j15.d();
        java.lang.String m75945x2fec8307 = fVar.m75945x2fec8307(fVar.f427150d + 13);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        dVar.m126728xdc93280d(m75945x2fec8307);
        return dVar.o();
    }
}
