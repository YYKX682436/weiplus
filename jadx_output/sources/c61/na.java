package c61;

/* loaded from: classes5.dex */
public final class na extends com.tencent.mm.modelbase.i {
    public na(com.tencent.pigeon.mm_foundation.FlutterCgiRequest flutterRequest, com.tencent.pigeon.mm_foundation.FlutterCgiFinderExtInfo extInfo) {
        kotlin.jvm.internal.o.g(flutterRequest, "flutterRequest");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new c61.oa(flutterRequest.getData(), flutterRequest.getFuncId(), extInfo);
        lVar.f70665b = new c61.qa(true);
        lVar.f70667d = (int) flutterRequest.getFuncId();
        lVar.f70666c = flutterRequest.getUri();
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70673j = flutterRequest.getLongPolling();
        lVar.f70674k = (int) flutterRequest.getLongPollingTimeout();
        p(lVar.a());
    }
}
