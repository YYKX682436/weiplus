package nu;

/* loaded from: classes9.dex */
public final class k extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        s15.v vVar;
        s15.v vVar2;
        java.lang.String j17;
        java.lang.String str2;
        s15.v vVar3;
        s15.v vVar4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(simpleMsgInfo.m75945x2fec8307(simpleMsgInfo.f427150d + 13));
        v05.b k17 = cVar.k();
        boolean z17 = false;
        if (k17 != null && (vVar4 = (s15.v) k17.m75936x14adae67(k17.f513848e + 38)) != null && vVar4.n() == 1) {
            z17 = true;
        }
        java.lang.String str3 = "";
        int i17 = recordDataItem.f384955d;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n3t));
            v05.b k18 = cVar.k();
            if (k18 == null || (vVar3 = (s15.v) k18.m75936x14adae67(k18.f513848e + 38)) == null || (str2 = vVar3.k()) == null) {
                str2 = "";
            }
            sb6.append(str2);
            recordDataItem.set(i17 + 0, sb6.toString());
        } else {
            v05.b k19 = cVar.k();
            if (k19 == null || (vVar = (s15.v) k19.m75936x14adae67(k19.f513848e + 38)) == null || (str = vVar.k()) == null) {
                str = "";
            }
            recordDataItem.set(i17 + 0, str);
        }
        v05.b k27 = cVar.k();
        if (k27 != null && (vVar2 = (s15.v) k27.m75936x14adae67(k27.f513848e + 38)) != null && (j17 = vVar2.j()) != null) {
            str3 = j17;
        }
        recordDataItem.set(i17 + 1, str3);
        recordDataItem.set(i17 + 2, 27);
        v05.b k28 = cVar.k();
        recordDataItem.B0(k28 != null ? (s15.v) k28.m75936x14adae67(k28.f513848e + 38) : null);
        return true;
    }
}
