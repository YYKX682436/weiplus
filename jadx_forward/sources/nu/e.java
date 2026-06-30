package nu;

/* loaded from: classes9.dex */
public final class e extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        s15.n nVar;
        java.lang.String j17;
        s15.n nVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(simpleMsgInfo.m75945x2fec8307(simpleMsgInfo.f427150d + 13));
        v05.b k17 = cVar.k();
        java.lang.String str2 = "";
        if (k17 == null || (nVar2 = (s15.n) k17.m75936x14adae67(k17.f513848e + 59)) == null || (str = nVar2.m163612x7531c8a2()) == null) {
            str = "";
        }
        int i17 = recordDataItem.f384955d;
        recordDataItem.set(i17 + 0, str);
        v05.b k18 = cVar.k();
        if (k18 != null && (nVar = (s15.n) k18.m75936x14adae67(k18.f513848e + 59)) != null && (j17 = nVar.j()) != null) {
            str2 = j17;
        }
        recordDataItem.set(i17 + 1, str2);
        recordDataItem.set(i17 + 2, 28);
        v05.b k19 = cVar.k();
        recordDataItem.t0(k19 != null ? (s15.n) k19.m75936x14adae67(k19.f513848e + 59) : null);
        return true;
    }
}
