package nu;

/* loaded from: classes9.dex */
public final class d extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        s15.m mVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(simpleMsgInfo.m75945x2fec8307(simpleMsgInfo.f427150d + 13));
        int i17 = recordDataItem.f384955d;
        recordDataItem.set(i17 + 2, 42);
        v05.b k17 = cVar.k();
        if (k17 == null || (mVar = (s15.m) k17.m75936x14adae67(k17.f513848e + 71)) == null || (str = mVar.m163611x7531c8a2()) == null) {
            str = "";
        }
        recordDataItem.set(i17 + 0, str);
        v05.b k18 = cVar.k();
        recordDataItem.r0(k18 != null ? (s15.m) k18.m75936x14adae67(k18.f513848e + 71) : null);
        return true;
    }
}
