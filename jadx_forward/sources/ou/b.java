package ou;

/* loaded from: classes9.dex */
public final class b extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        e15.h hVar;
        java.lang.String j17;
        e15.h hVar2;
        e15.h hVar3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        int i17 = recordDataItem.f384955d;
        recordDataItem.set(i17 + 2, 33);
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(simpleMsgInfo.m75945x2fec8307(simpleMsgInfo.f427150d + 13));
        v05.b k17 = cVar.k();
        java.lang.String str7 = "";
        if (k17 == null || (str = k17.m75945x2fec8307(k17.f449898d + 2)) == null) {
            str = "";
        }
        recordDataItem.set(i17 + 0, str);
        v05.b k18 = cVar.k();
        if (k18 == null || (str2 = k18.m75945x2fec8307(k18.f449898d + 3)) == null) {
            str2 = "";
        }
        recordDataItem.set(i17 + 1, str2);
        v05.b k19 = cVar.k();
        if (k19 == null || (str3 = k19.m75945x2fec8307(k19.f513848e + 2)) == null) {
            str3 = "";
        }
        recordDataItem.Y0(str3);
        v05.b k27 = cVar.k();
        if (k27 == null || (str4 = k27.m75945x2fec8307(k27.f513848e + 3)) == null) {
            str4 = "";
        }
        recordDataItem.Z0(str4);
        v05.b k28 = cVar.k();
        if (k28 == null || (str5 = k28.m75945x2fec8307(k28.f449898d + 9)) == null) {
            str5 = "";
        }
        recordDataItem.b1(str5);
        s15.f0 f0Var = new s15.f0();
        v05.b k29 = cVar.k();
        f0Var.n((k29 == null || (hVar3 = (e15.h) k29.m75936x14adae67(k29.f513848e + 45)) == null) ? 0 : hVar3.m126780xfb85f7b0());
        v05.b k37 = cVar.k();
        if (k37 == null || (hVar2 = (e15.h) k37.m75936x14adae67(k37.f513848e + 45)) == null || (str6 = hVar2.k()) == null) {
            str6 = "";
        }
        f0Var.l(str6);
        v05.b k38 = cVar.k();
        if (k38 != null && (hVar = (e15.h) k38.m75936x14adae67(k38.f513848e + 45)) != null && (j17 = hVar.j()) != null) {
            str7 = j17;
        }
        f0Var.k(str7);
        recordDataItem.f1(f0Var);
        return true;
    }
}
