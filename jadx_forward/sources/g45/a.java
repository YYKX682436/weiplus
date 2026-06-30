package g45;

/* loaded from: classes9.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String userName, java.lang.String str, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(userName)) {
            ((qg5.a) ((ct.p2) i95.n0.c(ct.p2.class))).getClass();
            java.util.HashMap a17 = com.p314xaae8f345.mm.ui.i1.a(str);
            if (a17 != null) {
                if (w11.t1.a(userName)) {
                    w11.r1 b17 = w11.s1.b(userName, null, 2, null);
                    b17.e(str);
                    b17.h(c01.e2.C(userName));
                    b17.f523664f = 1;
                    b17.f523666h = a17;
                    w11.r1.d(b17, null, 1, null);
                    return;
                }
                w11.r1 b18 = w11.s1.b(userName, null, 2, null);
                b18.g(userName);
                b18.e(str);
                b18.h(c01.e2.C(userName));
                b18.f523664f = 1;
                b18.f523666h = a17;
                b18.f523667i = 5;
                b18.a().a();
                return;
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
        am.mt mtVar = c5990xd50ae361.f136285g;
        mtVar.f88895a = userName;
        mtVar.f88896b = str;
        mtVar.f88897c = c01.e2.C(userName);
        mtVar.f88898d = i17;
        c5990xd50ae361.e();
    }

    public final oi3.g b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        int mo78013xfb85f7b0 = msgInfo.mo78013xfb85f7b0() & 65535;
        int i17 = 0;
        if (mo78013xfb85f7b0 == 49) {
            l15.c cVar = new l15.c();
            java.lang.String U1 = msgInfo.U1();
            if (U1 == null) {
                U1 = "";
            }
            cVar.m126731xdc93280d(U1, true);
            v05.b k17 = cVar.k();
            if (k17 != null) {
                i17 = k17.m75939xb282bd08(k17.f449898d + 6);
            }
        }
        oi3.g gVar = new oi3.g();
        int i18 = gVar.f427150d;
        gVar.set(i18 + 4, java.lang.Integer.valueOf(mo78013xfb85f7b0));
        gVar.set(i18 + 5, java.lang.Integer.valueOf(i17));
        java.lang.String V1 = msgInfo.V1();
        if (V1 == null) {
            V1 = "";
        }
        gVar.set(i18 + 11, V1);
        java.lang.String Q0 = msgInfo.Q0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
        gVar.set(i18 + 3, Q0);
        gVar.set(i18 + 2, java.lang.Long.valueOf(msgInfo.mo78012x3fdd41df()));
        gVar.set(i18 + 0, java.lang.Long.valueOf(msgInfo.m124847x74d37ac6()));
        gVar.set(i18 + 1, java.lang.Long.valueOf(msgInfo.I0()));
        gVar.set(i18 + 7, java.lang.Integer.valueOf(msgInfo.P0()));
        java.lang.String str = msgInfo.G;
        if (str == null) {
            str = "";
        }
        gVar.set(i18 + 12, str);
        java.lang.String U12 = msgInfo.U1();
        gVar.set(i18 + 13, U12 != null ? U12 : "");
        gVar.set(i18 + 10, java.lang.Integer.valueOf(msgInfo.w0()));
        gVar.set(i18 + 9, java.lang.Integer.valueOf(msgInfo.A0()));
        return gVar;
    }
}
