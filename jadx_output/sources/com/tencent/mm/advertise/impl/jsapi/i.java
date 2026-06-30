package com.tencent.mm.advertise.impl.jsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/advertise/impl/jsapi/i;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/advertise/impl/jsapi/MBJsApiClearAdPushMsg$RequestType;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "ad-impl_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class i implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.advertise.impl.jsapi.MBJsApiClearAdPushMsg$RequestType requestType = (com.tencent.mm.advertise.impl.jsapi.MBJsApiClearAdPushMsg$RequestType) obj;
        kotlin.jvm.internal.o.g(requestType, "requestType");
        boolean Ai = ((wj.g1) ((wj.m) i95.n0.c(wj.m.class))).Ai(requestType.f53163e, requestType.f53162d);
        if (!Ai) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiClearAdPushMsg", "db operation failed");
        }
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(Ai));
        }
    }
}
