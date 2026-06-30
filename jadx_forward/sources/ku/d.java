package ku;

/* loaded from: classes9.dex */
public final class d extends ku.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ku.c f393592a = new ku.c(null);

    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        s05.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(simpleMsgInfo.m75945x2fec8307(simpleMsgInfo.f427150d + 13));
        v05.b k17 = cVar.k();
        boolean z17 = k17 != null && k17.m75939xb282bd08(k17.f449898d + 6) == 44;
        int i17 = recordDataItem.f384955d;
        if (z17) {
            v05.b k18 = cVar.k();
            if ((k18 == null || (dVar = (s05.d) k18.m75936x14adae67(k18.f513848e + 39)) == null || dVar.k() != 1) ? false : true) {
                recordDataItem.set(i17 + 2, 1);
                recordDataItem.set(i17 + 1, f393592a.a(cVar));
                return true;
            }
        }
        v05.b k19 = cVar.k();
        recordDataItem.set(i17 + 2, java.lang.Integer.valueOf((k19 != null ? k19.m75939xb282bd08(k19.f449898d + 6) : 0) + 10000));
        v05.b k27 = cVar.k();
        java.lang.String str2 = "";
        if (k27 == null || (str = k27.m75945x2fec8307(k27.f449898d + 2)) == null) {
            str = "";
        }
        recordDataItem.set(i17 + 0, str);
        v05.b k28 = cVar.k();
        if (k28 != null && (m75945x2fec8307 = k28.m75945x2fec8307(k28.f449898d + 3)) != null) {
            str2 = m75945x2fec8307;
        }
        recordDataItem.set(i17 + 1, str2);
        recordDataItem.V0(cVar.m126747x696739c());
        return true;
    }
}
