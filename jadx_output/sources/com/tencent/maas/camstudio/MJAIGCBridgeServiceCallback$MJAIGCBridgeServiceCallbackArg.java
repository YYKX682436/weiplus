package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJAIGCBridgeServiceCallback$MJAIGCBridgeServiceCallbackArg extends com.tencent.maas.internal.NativeCallbackManager.CallbackArgs {

    /* loaded from: classes5.dex */
    public static class OnCancelArg extends com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$MJAIGCBridgeServiceCallbackArg {
        public final com.tencent.maas.camstudio.MJAIGCTaskInfo taskInfo;

        public OnCancelArg(com.tencent.maas.camstudio.MJAIGCTaskInfo mJAIGCTaskInfo) {
            this.taskInfo = mJAIGCTaskInfo;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnCancelWithInfoArg extends com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$MJAIGCBridgeServiceCallbackArg {
        public final com.tencent.maas.camstudio.MJAIGCCancelInfo cancelInfo;
        public final com.tencent.maas.camstudio.MJAIGCTaskInfo taskInfo;

        public OnCancelWithInfoArg(com.tencent.maas.camstudio.MJAIGCTaskInfo mJAIGCTaskInfo, com.tencent.maas.camstudio.MJAIGCCancelInfo mJAIGCCancelInfo) {
            this.taskInfo = mJAIGCTaskInfo;
            this.cancelInfo = mJAIGCCancelInfo;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnQueryArg extends com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$MJAIGCBridgeServiceCallbackArg {
        public final com.tencent.maas.camstudio.MJAIGCTaskInfo taskInfo;

        public OnQueryArg(com.tencent.maas.camstudio.MJAIGCTaskInfo mJAIGCTaskInfo) {
            this.taskInfo = mJAIGCTaskInfo;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnSubmitArg extends com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$MJAIGCBridgeServiceCallbackArg {
        public final com.tencent.maas.camstudio.MJAIGCSubmitRequest request;

        public OnSubmitArg(com.tencent.maas.camstudio.MJAIGCSubmitRequest mJAIGCSubmitRequest) {
            this.request = mJAIGCSubmitRequest;
        }
    }
}
