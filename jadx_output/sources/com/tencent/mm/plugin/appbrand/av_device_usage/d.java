package com.tencent.mm.plugin.appbrand.av_device_usage;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "kotlin.jvm.PlatformType", "params", "Lcom/tencent/mm/plugin/appbrand/av_device_usage/AVDeviceUsageClientService$MarkInUseParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class d<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.av_device_usage.d f76692a = new com.tencent.mm.plugin.appbrand.av_device_usage.d();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.av_device_usage.AVDeviceUsageClientService$MarkInUseParams aVDeviceUsageClientService$MarkInUseParams = (com.tencent.mm.plugin.appbrand.av_device_usage.AVDeviceUsageClientService$MarkInUseParams) obj;
        com.tencent.mm.ipcinvoker.type.IPCVoid iPCVoid = com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d;
        if (aVDeviceUsageClientService$MarkInUseParams == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AVDeviceUsageClientService", "IPCSyncInvokeTask.invoke, params is null");
        } else {
            com.tencent.mm.plugin.appbrand.av_device_usage.q.f76731d.F3(aVDeviceUsageClientService$MarkInUseParams.f76673d.f76684d, aVDeviceUsageClientService$MarkInUseParams.f76674e, aVDeviceUsageClientService$MarkInUseParams.f76675f);
        }
        return iPCVoid;
    }
}
