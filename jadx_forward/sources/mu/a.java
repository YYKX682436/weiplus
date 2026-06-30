package mu;

/* loaded from: classes9.dex */
public final class a extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        u05.a aVar;
        java.lang.String m75945x2fec8307;
        u05.a aVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(simpleMsgInfo.m75945x2fec8307(simpleMsgInfo.f427150d + 13));
        v05.b k17 = cVar.k();
        int m75939xb282bd08 = k17 != null ? k17.m75939xb282bd08(k17.f449898d + 6) : 0;
        int i17 = recordDataItem.f384955d;
        recordDataItem.set(i17 + 2, java.lang.Integer.valueOf(m75939xb282bd08 + 10000));
        v05.b k18 = cVar.k();
        java.lang.String str2 = "";
        if (k18 == null || (aVar2 = (u05.a) k18.m75936x14adae67(k18.f513848e + 60)) == null || (str = aVar2.m167298x8010e5e4()) == null) {
            str = "";
        }
        recordDataItem.set(i17 + 0, str);
        v05.b k19 = cVar.k();
        if (k19 != null && (m75945x2fec8307 = k19.m75945x2fec8307(k19.f449898d + 3)) != null) {
            str2 = m75945x2fec8307;
        }
        recordDataItem.set(i17 + 1, str2);
        recordDataItem.V0(cVar.m126747x696739c());
        v05.b k27 = cVar.k();
        if (k27 != null && (aVar = (u05.a) k27.m75936x14adae67(k27.f513848e + 60)) != null) {
            s15.b0 b0Var = new s15.b0();
            b0Var.o(aVar.m167302x6c03c64c());
            b0Var.n(aVar.m167298x8010e5e4());
            b0Var.j(aVar.k());
            b0Var.l(aVar.n());
            b0Var.k(aVar.l());
            recordDataItem.K0(b0Var);
        }
        return true;
    }
}
