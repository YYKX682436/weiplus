package c61;

/* loaded from: classes5.dex */
public final class ka extends com.tencent.mm.modelbase.i {
    public ka(com.tencent.pigeon.mm_foundation.FlutterCgiRequest flutterRequest) {
        kotlin.jvm.internal.o.g(flutterRequest, "flutterRequest");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new c61.pa(flutterRequest.getData());
        lVar.f70665b = new c61.qa(false, 1, null);
        lVar.f70667d = (int) flutterRequest.getFuncId();
        lVar.f70666c = flutterRequest.getUri();
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70673j = flutterRequest.getLongPolling();
        lVar.f70674k = (int) flutterRequest.getLongPollingTimeout();
        p(lVar.a());
    }

    public final java.lang.Object s(kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        pq5.g l17 = l();
        l17.K(new c61.ja(rVar));
        rVar.m(new c61.ia(l17));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }
}
