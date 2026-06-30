package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class mh implements com.tencent.map.tools.net.processor.RequestProcessor, com.tencent.map.tools.net.processor.ResponseProcessor {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f50420a;

    public mh(boolean z17) {
        this.f50420a = z17;
    }

    @Override // com.tencent.map.tools.net.processor.RequestProcessor
    public final void onRequest(com.tencent.map.tools.net.NetRequest netRequest) {
        if (this.f50420a) {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50211l, "REQ[" + netRequest.mRequestId + "][" + netRequest.mNetMethod.name() + "]: " + netRequest.toString());
        }
    }

    @Override // com.tencent.map.tools.net.processor.ResponseProcessor
    public final void onResponse(com.tencent.map.tools.net.NetResponse netResponse) {
        if (this.f50420a) {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50211l, "RESP[" + netResponse.mRequestId + "]: " + netResponse.toHumanString());
        }
    }
}
