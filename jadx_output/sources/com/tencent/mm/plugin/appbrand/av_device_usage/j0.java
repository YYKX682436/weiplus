package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class j0 {
    public j0(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene a(fb1.d raw) {
        kotlin.jvm.internal.o.g(raw, "raw");
        for (com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene parcelableAVDeviceUsageScene : com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene.values()) {
            if (raw == parcelableAVDeviceUsageScene.f76684d) {
                return parcelableAVDeviceUsageScene;
            }
        }
        throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
    }
}
