package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/wccoin/o;", "Lcom/tencent/mm/ipcinvoker/i;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCLong;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class o implements com.tencent.mm.ipcinvoker.i<android.os.Bundle, com.tencent.mm.ipcinvoker.type.IPCLong> {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f83775d = "MicroMsg.JsApiGetWCCoinBalance";

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        android.os.Bundle data = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).b(new com.tencent.mm.plugin.appbrand.jsapi.wccoin.n(this, callback));
    }
}
