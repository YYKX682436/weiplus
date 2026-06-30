package db2;

/* loaded from: classes2.dex */
public final class b5 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(android.content.Context context, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.u uVar = pf5.u.f435469a;
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) uVar.b(context).c(zy2.ra.class))).V6();
        jz5.l P6 = ((ey2.k0) uVar.e(c61.l7.class).a(ey2.k0.class)).P6();
        float floatValue = ((java.lang.Number) P6.f384366d).floatValue();
        float floatValue2 = ((java.lang.Number) P6.f384367e).floatValue();
        bw5.gg ggVar = new bw5.gg();
        bw5.sc scVar = new bw5.sc();
        scVar.mo11468x92b714fd(db2.t4.f309704a.b(14246, V6).mo14344x5f01b1f6());
        ggVar.f109367d = scVar;
        boolean[] zArr = ggVar.f109372i;
        zArr[2] = true;
        ggVar.f109368e = V6.m75945x2fec8307(18);
        zArr[3] = true;
        ggVar.f109369f = floatValue;
        zArr[4] = true;
        ggVar.f109370g = floatValue2;
        zArr[5] = true;
        ggVar.f109371h = gVar;
        zArr[6] = true;
        bw5.ig igVar = new bw5.ig();
        igVar.f76492x92037252 = new r45.ie();
        igVar.f110109i[1] = true;
        r45.ie mo11484xe92ab0a8 = igVar.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ggVar;
        lVar.f152198b = igVar;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetoftenreadauthor";
        lVar.f152200d = 14246;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GetOftenReadAuthorReqCgi", "[init] request=" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.i00.a(ggVar) + " thread=" + java.lang.Thread.currentThread());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        bw5.ig resp = (bw5.ig) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GetOftenReadAuthorReqCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ", resp=" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.i00.a(resp));
    }
}
