package nu;

/* loaded from: classes9.dex */
public final class g extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        w05.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(simpleMsgInfo.m75945x2fec8307(simpleMsgInfo.f427150d + 13));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572122za));
        v05.b k17 = cVar.k();
        if (k17 == null || (bVar = (w05.b) k17.m75936x14adae67(k17.f513848e + 54)) == null || (str = bVar.G()) == null) {
            str = "";
        }
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        int i17 = recordDataItem.f384955d;
        recordDataItem.set(i17 + 1, sb7);
        recordDataItem.set(i17 + 2, 40);
        v05.b k18 = cVar.k();
        recordDataItem.w0(k18 != null ? (s15.a) k18.m75936x14adae67(k18.f513848e + 67) : null);
        return true;
    }
}
