package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class me implements com.tencent.map.tools.net.processor.ResponseProcessor {
    @Override // com.tencent.map.tools.net.processor.ResponseProcessor
    public void onResponse(com.tencent.map.tools.net.NetResponse netResponse) {
        try {
            if (netResponse.available()) {
                netResponse.data = com.tencent.map.tools.net.NetUtil.toBytesThrow(netResponse.dataStream);
            }
        } catch (java.io.IOException unused) {
        } catch (java.lang.Throwable th6) {
            com.tencent.mapsdk.internal.kt.a((java.io.Closeable) netResponse.dataStream);
            netResponse.dataStream = null;
            throw th6;
        }
        com.tencent.mapsdk.internal.kt.a((java.io.Closeable) netResponse.dataStream);
        netResponse.dataStream = null;
    }
}
