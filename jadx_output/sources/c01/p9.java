package c01;

/* loaded from: classes2.dex */
public final class p9 extends com.tencent.mm.modelbase.i {
    public p9(java.lang.String query, java.lang.String region) {
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(region, "region");
        r45.ai4 ai4Var = new r45.ai4();
        ai4Var.f370025e = query;
        ai4Var.f370026f = region;
        ai4Var.f370024d = gm0.j1.b().h();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMVisionRelatedWordCgi", "req >> " + ai4Var.f370025e + ", " + ai4Var.f370026f + ", " + ai4Var.f370024d);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ai4Var;
        lVar.f70665b = new r45.bi4();
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mmvision_relatedword";
        lVar.f70667d = 4083;
        p(lVar.a());
    }
}
