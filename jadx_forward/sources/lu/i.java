package lu;

/* loaded from: classes9.dex */
public final class i extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.m126731xdc93280d(simpleMsgInfo.m75945x2fec8307(simpleMsgInfo.f427150d + 13), true);
        int i17 = recordDataItem.f384955d;
        recordDataItem.set(i17 + 2, 1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f571963uv));
        java.lang.String wi6 = ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).wi(cVar.k());
        if (wi6 == null) {
            wi6 = "";
        }
        sb6.append(wi6);
        recordDataItem.set(i17 + 1, sb6.toString());
        return true;
    }
}
