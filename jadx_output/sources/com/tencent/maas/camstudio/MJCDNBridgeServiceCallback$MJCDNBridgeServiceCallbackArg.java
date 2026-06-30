package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJCDNBridgeServiceCallback$MJCDNBridgeServiceCallbackArg extends com.tencent.maas.internal.NativeCallbackManager.CallbackArgs {

    /* loaded from: classes5.dex */
    public static class OnBeginDownloadArg extends com.tencent.maas.camstudio.MJCDNBridgeServiceCallback$MJCDNBridgeServiceCallbackArg {
        public final com.tencent.maas.camstudio.MJCDNDownloadRequest request;

        public OnBeginDownloadArg(com.tencent.maas.camstudio.MJCDNDownloadRequest mJCDNDownloadRequest) {
            this.request = mJCDNDownloadRequest;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnBeginUploadArg extends com.tencent.maas.camstudio.MJCDNBridgeServiceCallback$MJCDNBridgeServiceCallbackArg {
        public final com.tencent.maas.camstudio.MJCDNUploadRequest request;

        public OnBeginUploadArg(com.tencent.maas.camstudio.MJCDNUploadRequest mJCDNUploadRequest) {
            this.request = mJCDNUploadRequest;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnCancelArg extends com.tencent.maas.camstudio.MJCDNBridgeServiceCallback$MJCDNBridgeServiceCallbackArg {
        public final java.lang.String taskKey;

        public OnCancelArg(java.lang.String str) {
            this.taskKey = str;
        }
    }
}
