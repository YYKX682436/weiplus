package lu;

/* loaded from: classes9.dex */
public final class a extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        java.lang.String str2;
        s05.d dVar;
        java.lang.String str3;
        s05.d dVar2;
        s05.d dVar3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(simpleMsgInfo.m75945x2fec8307(simpleMsgInfo.f427150d + 13));
        v05.b k17 = cVar.k();
        boolean z17 = (k17 == null || (dVar3 = (s05.d) k17.m75936x14adae67(k17.f513848e + 39)) == null || dVar3.m163514xfb85f7b0() != 3) ? false : true;
        int i17 = recordDataItem.f384955d;
        if (!z17) {
            v05.b k18 = cVar.k();
            if (!((k18 == null || (dVar2 = (s05.d) k18.m75936x14adae67(k18.f513848e + 39)) == null || dVar2.k() != 1) ? false : true)) {
                recordDataItem.set(i17 + 2, 19);
                v05.b k19 = cVar.k();
                if (k19 == null || (str = k19.m75945x2fec8307(k19.f449898d + 2)) == null) {
                    str = "";
                }
                recordDataItem.set(i17 + 0, str);
                v05.b k27 = cVar.k();
                if (k27 == null || (str2 = k27.m75945x2fec8307(k27.f449898d + 3)) == null) {
                    str2 = "";
                }
                recordDataItem.set(i17 + 1, str2);
                v05.b k28 = cVar.k();
                if (k28 != null && (dVar = (s05.d) k28.m75936x14adae67(k28.f513848e + 39)) != null) {
                    s15.e eVar = new s15.e();
                    java.lang.String y17 = dVar.y();
                    if (y17 == null) {
                        y17 = "";
                    }
                    recordDataItem.g0(y17);
                    java.lang.String y18 = dVar.y();
                    if (y18 == null) {
                        y18 = "";
                    }
                    eVar.z(y18);
                    java.lang.String m163512x74292566 = dVar.m163512x74292566();
                    if (m163512x74292566 == null) {
                        m163512x74292566 = "";
                    }
                    eVar.o(m163512x74292566);
                    s05.e q17 = dVar.q();
                    eVar.t(q17 != null ? q17.m163516xfb85f7b0() : 0);
                    java.lang.String B = dVar.B();
                    if (B == null) {
                        B = "";
                    }
                    eVar.q(B);
                    eVar.y(dVar.m163514xfb85f7b0());
                    java.lang.String p17 = dVar.p();
                    if (p17 == null) {
                        p17 = "";
                    }
                    eVar.s(p17);
                    v05.b k29 = cVar.k();
                    if (k29 == null || (str3 = k29.m75945x2fec8307(k29.f513848e + 12)) == null) {
                        str3 = "";
                    }
                    eVar.w(str3);
                    eVar.A(dVar.m163515x52c258a2());
                    eVar.p(dVar.k());
                    eVar.u(dVar.x());
                    java.lang.String n17 = dVar.n();
                    eVar.r(n17 != null ? n17 : "");
                    eVar.x(dVar.m163513xce6ddd64());
                    recordDataItem.e0(eVar);
                }
                return true;
            }
        }
        recordDataItem.set(i17 + 2, 1);
        java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572015wb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getString(...)");
        recordDataItem.set(i17 + 1, g17);
        return true;
    }
}
