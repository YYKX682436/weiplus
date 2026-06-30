package cn4;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final cn4.a f125210a = new cn4.a();

    public final tm4.b a(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        tm4.b bVar = new tm4.b();
        if (!((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ri()) {
            bVar.l(false);
            return bVar;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(path)) {
            bVar.l(false);
        } else {
            bVar.j(path);
            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0(path);
            r45.f03 I0 = nk6.I0(path);
            if (I0 == null || L0 == null) {
                bVar.l(false);
            } else {
                tm4.c cVar = new tm4.c();
                try {
                    java.lang.String str = I0.f455425i;
                    if (str == null) {
                        str = "";
                    }
                    cVar.o(str);
                    java.lang.String field_tipsId = L0.f65880x11c19d58;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_tipsId, "field_tipsId");
                    cVar.r(field_tipsId);
                    cVar.p(I0.f455420d);
                    java.lang.String str2 = I0.f455422f;
                    if (str2 == null) {
                        str2 = "";
                    }
                    cVar.s(str2);
                    java.lang.String str3 = I0.f455423g;
                    cVar.l(str3 != null ? str3 : "");
                    cVar.n(I0.f455421e);
                    if (L0.D0() != null) {
                        r45.ez2 D0 = L0.D0();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(D0);
                        if (D0.m75934xbce7f2f(4) != null) {
                            r45.ez2 D02 = L0.D0();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(D02);
                            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = D02.m75934xbce7f2f(4);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75934xbce7f2f);
                            cVar.k(m75934xbce7f2f.i());
                        }
                    }
                    r45.xs2 xs2Var = new r45.xs2();
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = L0.f65874xb5f7102a.f470021f;
                    if (gVar != null) {
                        xs2Var.mo11468x92b714fd(gVar.f273689a);
                    }
                    cVar.q(xs2Var.m75939xb282bd08(9));
                    cVar.j(L0.Q0(false));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStoryRedDotUtils", e17, "createRedDotDetail", new java.lang.Object[0]);
                }
                bVar.k(cVar);
                bVar.l(true);
            }
        }
        return bVar;
    }
}
