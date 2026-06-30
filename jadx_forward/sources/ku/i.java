package ku;

/* loaded from: classes9.dex */
public final class i extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        int i17 = recordDataItem.f384955d;
        recordDataItem.set(i17 + 2, 1);
        int i18 = simpleMsgInfo.f427150d;
        int i19 = i17 + 1;
        recordDataItem.set(i19, simpleMsgInfo.m75945x2fec8307(i18 + 13));
        java.lang.String m75945x2fec8307 = simpleMsgInfo.m75945x2fec8307(i18 + 12);
        int i27 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307) && m75945x2fec8307.contains("announcement@all")) {
            recordDataItem.set(i19, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571882ml3) + '\n' + recordDataItem.m75945x2fec8307(i19));
        }
        return true;
    }
}
