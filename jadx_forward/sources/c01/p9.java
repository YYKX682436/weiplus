package c01;

/* loaded from: classes2.dex */
public final class p9 extends com.p314xaae8f345.mm.p944x882e457a.i {
    public p9(java.lang.String query, java.lang.String region) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(region, "region");
        r45.ai4 ai4Var = new r45.ai4();
        ai4Var.f451558e = query;
        ai4Var.f451559f = region;
        ai4Var.f451557d = gm0.j1.b().h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMVisionRelatedWordCgi", "req >> " + ai4Var.f451558e + ", " + ai4Var.f451559f + ", " + ai4Var.f451557d);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ai4Var;
        lVar.f152198b = new r45.bi4();
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/mmvision_relatedword";
        lVar.f152200d = 4083;
        p(lVar.a());
    }
}
