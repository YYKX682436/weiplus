package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class mi extends com.tencent.mapsdk.internal.me implements com.tencent.map.tools.net.processor.RequestProcessor {
    @Override // com.tencent.map.tools.net.processor.RequestProcessor
    public final void onRequest(com.tencent.map.tools.net.NetRequest netRequest) {
        netRequest.setRespHeaders("User-ReturnCode");
    }

    @Override // com.tencent.mapsdk.internal.me, com.tencent.map.tools.net.processor.ResponseProcessor
    public final void onResponse(com.tencent.map.tools.net.NetResponse netResponse) {
        java.lang.String headerField = netResponse.getHeaderField("User-ReturnCode");
        int parseInt = java.lang.Integer.parseInt(headerField);
        if (parseInt != 0) {
            if (parseInt == -2) {
                netResponse.exception(new com.tencent.map.tools.net.exception.FileUploadResetException());
            }
            netResponse.exception(new java.lang.Exception("FileUploader user error:".concat(java.lang.String.valueOf(headerField))));
        }
    }
}
