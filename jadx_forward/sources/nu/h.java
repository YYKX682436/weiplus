package nu;

/* loaded from: classes9.dex */
public final class h extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        x05.c cVar;
        x05.c cVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        l15.c cVar3 = new l15.c();
        cVar3.m126728xdc93280d(simpleMsgInfo.m75945x2fec8307(simpleMsgInfo.f427150d + 13));
        v05.b k17 = cVar3.k();
        if (k17 == null || (cVar2 = (x05.c) k17.m75936x14adae67(k17.f513848e + 57)) == null || (str = cVar2.m174809x8010e5e4()) == null) {
            str = "";
        }
        int i17 = recordDataItem.f384955d;
        recordDataItem.set(i17 + 0, str);
        recordDataItem.set(i17 + 2, 41);
        v05.b k18 = cVar3.k();
        if (k18 == null || (cVar = (x05.c) k18.m75936x14adae67(k18.f513848e + 57)) == null) {
            return true;
        }
        s15.s sVar = new s15.s();
        java.lang.String m174810x6c03c64c = cVar.m174810x6c03c64c();
        if (m174810x6c03c64c == null) {
            m174810x6c03c64c = "";
        }
        sVar.t(m174810x6c03c64c);
        java.lang.String m174809x8010e5e4 = cVar.m174809x8010e5e4();
        if (m174809x8010e5e4 == null) {
            m174809x8010e5e4 = "";
        }
        sVar.s(m174809x8010e5e4);
        java.lang.String l17 = cVar.l();
        if (l17 == null) {
            l17 = "";
        }
        sVar.q(l17);
        java.lang.String k19 = cVar.k();
        if (k19 == null) {
            k19 = "";
        }
        sVar.p(k19);
        sVar.o(cVar.j());
        java.lang.String o17 = cVar.o();
        sVar.r(o17 != null ? o17 : "");
        recordDataItem.z0(sVar);
        return true;
    }
}
