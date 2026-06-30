package com.tencent.maas.speech;

/* loaded from: classes5.dex */
public class MJSpeechManagerCallback$MJSpeechManagerCallbackArg extends com.tencent.maas.internal.NativeCallbackManager.CallbackArgs {

    /* loaded from: classes5.dex */
    public static class AsyncQueryCompleteArg extends com.tencent.maas.speech.MJSpeechManagerCallback$MJSpeechManagerCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;
        public final com.tencent.maas.speech.MJAsyncSpeechQueryResponseInfo responseInfo;

        public AsyncQueryCompleteArg(com.tencent.maas.speech.MJAsyncSpeechQueryResponseInfo mJAsyncSpeechQueryResponseInfo, com.tencent.maas.instamovie.base.MJError mJError) {
            this.responseInfo = mJAsyncSpeechQueryResponseInfo;
            this.error = mJError;
        }
    }

    /* loaded from: classes5.dex */
    public static class AsyncSubmitCompleteArg extends com.tencent.maas.speech.MJSpeechManagerCallback$MJSpeechManagerCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;
        public final com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo responseInfo;

        public AsyncSubmitCompleteArg(com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo mJAsyncSpeechSubmitResponseInfo, com.tencent.maas.instamovie.base.MJError mJError) {
            this.responseInfo = mJAsyncSpeechSubmitResponseInfo;
            this.error = mJError;
        }
    }

    /* loaded from: classes5.dex */
    public static class CompleteArg extends com.tencent.maas.speech.MJSpeechManagerCallback$MJSpeechManagerCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;
        public final int httpRetCode;
        public final java.nio.ByteBuffer responseData;
        public final int taskID;

        public CompleteArg(java.nio.ByteBuffer byteBuffer, com.tencent.maas.instamovie.base.MJError mJError, int i17, int i18) {
            this.responseData = byteBuffer;
            this.error = mJError;
            this.httpRetCode = i17;
            this.taskID = i18;
        }
    }
}
