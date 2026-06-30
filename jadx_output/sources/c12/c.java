package c12;

/* loaded from: classes4.dex */
public final class c extends com.tencent.mm.modelbase.i {
    public c(java.lang.String keyword, java.lang.String uxinfo, int i17) {
        kotlin.jvm.internal.o.g(keyword, "keyword");
        kotlin.jvm.internal.o.g(uxinfo, "uxinfo");
        uq.e eVar = new uq.e();
        eVar.f430135d = keyword;
        eVar.f430136e = uxinfo;
        eVar.f430137f = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = eVar;
        uq.f fVar = new uq.f();
        r45.ie ieVar = new r45.ie();
        ieVar.f376960e = new r45.du5();
        fVar.setBaseResponse(ieVar);
        lVar.f70665b = fVar;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70666c = "/cgi-bin/mmoc-bin/interaction/get_interaction_ad";
        lVar.f70667d = 4947;
        p(lVar.a());
    }
}
