package com.tencent.mm.plugin.appbrand.debugger.console;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "kotlin.jvm.PlatformType", "bundle", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class e<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.debugger.console.e f77662a = new com.tencent.mm.plugin.appbrand.debugger.console.e();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        bundle.setClassLoader(com.tencent.mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl$LogInfo.class.getClassLoader());
        android.os.Parcelable[] parcelableArray = bundle.getParcelableArray("BatchLogInfo");
        com.tencent.mm.ipcinvoker.type.IPCVoid iPCVoid = com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d;
        if (parcelableArray == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsoleDebugLogImpl", "flushLogBuffer, uncheckedBatchLogInfo is null");
        } else {
            ym5.a1.f(new com.tencent.mm.plugin.appbrand.debugger.console.d(parcelableArray));
        }
        return iPCVoid;
    }
}
