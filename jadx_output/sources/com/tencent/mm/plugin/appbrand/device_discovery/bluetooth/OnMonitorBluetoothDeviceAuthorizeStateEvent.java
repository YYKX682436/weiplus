package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/device_discovery/bluetooth/OnMonitorBluetoothDeviceAuthorizeStateEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class OnMonitorBluetoothDeviceAuthorizeStateEvent extends com.tencent.mm.sdk.event.IEvent {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f77861g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f77862h;

    public OnMonitorBluetoothDeviceAuthorizeStateEvent(java.lang.String appId, boolean z17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f77861g = appId;
        this.f77862h = z17;
    }

    public java.lang.String toString() {
        return "OnMonitorBluetoothDeviceAuthorizeStateEvent(appId='" + this.f77861g + "', authorized=" + this.f77862h + ')';
    }
}
