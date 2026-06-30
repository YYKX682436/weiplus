package com.tencent.mm.advertise.impl.jsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/advertise/impl/jsapi/f;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/advertise/impl/jsapi/MBJsApiAdDataReport$ADDataReportEvent;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "ad-impl_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
public final class f implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        com.tencent.mm.advertise.impl.jsapi.MBJsApiAdDataReport$ADDataReportEvent data = (com.tencent.mm.advertise.impl.jsapi.MBJsApiAdDataReport$ADDataReportEvent) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MBJsApiAdDataReport", "invoke: " + data);
        ((n34.c) ((p94.c0) i95.n0.c(p94.c0.class))).wi(data.f53161e, data.f53160d, (int) com.tencent.mm.sdk.platformtools.t8.i1());
        callback.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
    }
}
