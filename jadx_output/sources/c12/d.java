package c12;

/* loaded from: classes4.dex */
public final class d extends com.tencent.mm.modelbase.i {
    public d(java.lang.String keyword, java.lang.String uxinfo, int i17, java.lang.String traceId) {
        kotlin.jvm.internal.o.g(keyword, "keyword");
        kotlin.jvm.internal.o.g(uxinfo, "uxinfo");
        kotlin.jvm.internal.o.g(traceId, "traceId");
        uq.g gVar = new uq.g();
        gVar.f430141d = keyword;
        gVar.f430142e = uxinfo;
        gVar.f430143f = i17;
        gVar.f430144g = traceId;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = gVar;
        lVar.f70665b = new uq.h();
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70666c = "/cgi-bin/mmoc-bin/interaction/get_interaction_material";
        lVar.f70667d = 4310;
        p(lVar.a());
    }
}
