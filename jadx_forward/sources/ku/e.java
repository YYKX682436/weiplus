package ku;

/* loaded from: classes9.dex */
public final class e extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String sb6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        m15.a aVar = new m15.a();
        int i17 = simpleMsgInfo.f427150d;
        aVar.m126728xdc93280d(simpleMsgInfo.m75945x2fec8307(i17 + 13));
        int o17 = aVar.o();
        java.util.Set set = c01.e2.f118650a;
        boolean D3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(o17);
        int i18 = recordDataItem.f384955d;
        if (D3) {
            recordDataItem.set(i18 + 2, 16);
            recordDataItem.set(i18 + 1, simpleMsgInfo.m75945x2fec8307(i17 + 13));
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(aVar.m146661x6c03c64c())) {
            java.lang.String Ni = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ni(aVar.s(), "openim_card_type_name", j41.a0.TYPE_WORDING);
            recordDataItem.set(i18 + 2, 1);
            if (Ni == null || r26.n0.N(Ni)) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571980vb));
                java.lang.String m146660x8010e5e4 = aVar.m146660x8010e5e4();
                if (r26.n0.N(m146660x8010e5e4)) {
                    m146660x8010e5e4 = aVar.j();
                    if (r26.n0.N(m146660x8010e5e4)) {
                        m146660x8010e5e4 = aVar.m146659xc0914d16();
                    }
                }
                sb7.append(m146660x8010e5e4);
                sb6 = sb7.toString();
            } else {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[");
                sb8.append(Ni);
                sb8.append(']');
                java.lang.String m146660x8010e5e42 = aVar.m146660x8010e5e4();
                if (r26.n0.N(m146660x8010e5e42)) {
                    m146660x8010e5e42 = aVar.j();
                    if (r26.n0.N(m146660x8010e5e42)) {
                        m146660x8010e5e42 = aVar.m146659xc0914d16();
                    }
                }
                sb8.append(m146660x8010e5e42);
                sb6 = sb8.toString();
            }
            recordDataItem.set(i18 + 1, sb6);
        } else {
            recordDataItem.set(i18 + 2, 1);
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571980vb));
            java.lang.String m146660x8010e5e43 = aVar.m146660x8010e5e4();
            if (r26.n0.N(m146660x8010e5e43)) {
                m146660x8010e5e43 = aVar.j();
                if (r26.n0.N(m146660x8010e5e43)) {
                    m146660x8010e5e43 = aVar.m146659xc0914d16();
                }
            }
            sb9.append(m146660x8010e5e43);
            recordDataItem.set(i18 + 1, sb9.toString());
        }
        return true;
    }
}
