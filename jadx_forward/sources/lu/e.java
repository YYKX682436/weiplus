package lu;

/* loaded from: classes9.dex */
public final class e extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.m126731xdc93280d(simpleMsgInfo.m75945x2fec8307(simpleMsgInfo.f427150d + 13), true);
        int i17 = recordDataItem.f384955d;
        recordDataItem.set(i17 + 2, 1);
        v05.b k17 = cVar.k();
        if (k17 == null || (str = k17.m75945x2fec8307(k17.f449898d + 2)) == null) {
            str = "";
        }
        recordDataItem.set(i17 + 1, str);
        return true;
    }
}
