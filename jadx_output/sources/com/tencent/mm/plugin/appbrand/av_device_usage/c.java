package com.tencent.mm.plugin.appbrand.av_device_usage;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "kotlin.jvm.PlatformType", "parcelableScene", "Lcom/tencent/mm/plugin/appbrand/av_device_usage/ParcelableAVDeviceUsageScene;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class c<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {
    static {
        new com.tencent.mm.plugin.appbrand.av_device_usage.c();
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene parcelableAVDeviceUsageScene = (com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene) obj;
        if (parcelableAVDeviceUsageScene == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AVDeviceUsageClientService", "IPCSyncInvokeTask.invoke, parcelableScene is null");
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(false);
        }
        com.tencent.mm.plugin.appbrand.av_device_usage.q qVar = com.tencent.mm.plugin.appbrand.av_device_usage.q.f76731d;
        fb1.d scene = parcelableAVDeviceUsageScene.f76684d;
        kotlin.jvm.internal.o.g(scene, "scene");
        return new com.tencent.mm.ipcinvoker.type.IPCBoolean(com.tencent.mm.plugin.appbrand.av_device_usage.o.f76715a.a(scene).a());
    }
}
