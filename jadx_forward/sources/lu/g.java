package lu;

/* loaded from: classes9.dex */
public final class g extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(simpleMsgInfo.m75945x2fec8307(simpleMsgInfo.f427150d + 13));
        int i17 = recordDataItem.f384955d;
        recordDataItem.set(i17 + 2, 1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572122za));
        v05.b k17 = cVar.k();
        if (k17 == null || (str = k17.m75945x2fec8307(k17.f449898d + 2)) == null) {
            str = "";
        }
        sb6.append(str);
        recordDataItem.set(i17 + 1, sb6.toString());
        return true;
    }
}
