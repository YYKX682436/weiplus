package com.p314xaae8f345.p457x3304c6.p482xca9708e2;

/* renamed from: com.tencent.maas.speech.MJSpeechManagerCallback$MJSpeechManagerCallbackArg */
/* loaded from: classes5.dex */
public class C4200xb93a0434 extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs {

    /* renamed from: com.tencent.maas.speech.MJSpeechManagerCallback$MJSpeechManagerCallbackArg$AsyncQueryCompleteArg */
    /* loaded from: classes5.dex */
    public static class AsyncQueryCompleteArg extends com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4200xb93a0434 {

        /* renamed from: error */
        public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f16165x5c4d208;

        /* renamed from: responseInfo */
        public final com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4194x93c4c6d6 f16166x55c3e48f;

        public AsyncQueryCompleteArg(com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4194x93c4c6d6 c4194x93c4c6d6, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
            this.f16166x55c3e48f = c4194x93c4c6d6;
            this.f16165x5c4d208 = c4093x6b88526b;
        }
    }

    /* renamed from: com.tencent.maas.speech.MJSpeechManagerCallback$MJSpeechManagerCallbackArg$AsyncSubmitCompleteArg */
    /* loaded from: classes5.dex */
    public static class AsyncSubmitCompleteArg extends com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4200xb93a0434 {

        /* renamed from: error */
        public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f16167x5c4d208;

        /* renamed from: responseInfo */
        public final com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4195xcab2df48 f16168x55c3e48f;

        public AsyncSubmitCompleteArg(com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4195xcab2df48 c4195xcab2df48, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
            this.f16168x55c3e48f = c4195xcab2df48;
            this.f16167x5c4d208 = c4093x6b88526b;
        }
    }

    /* renamed from: com.tencent.maas.speech.MJSpeechManagerCallback$MJSpeechManagerCallbackArg$CompleteArg */
    /* loaded from: classes5.dex */
    public static class CompleteArg extends com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4200xb93a0434 {

        /* renamed from: error */
        public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f16169x5c4d208;

        /* renamed from: httpRetCode */
        public final int f16170x74510886;

        /* renamed from: responseData */
        public final java.nio.ByteBuffer f16171x55c16f8b;

        /* renamed from: taskID */
        public final int f16172xcb7ef160;

        public CompleteArg(java.nio.ByteBuffer byteBuffer, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b, int i17, int i18) {
            this.f16171x55c16f8b = byteBuffer;
            this.f16169x5c4d208 = c4093x6b88526b;
            this.f16170x74510886 = i17;
            this.f16172xcb7ef160 = i18;
        }
    }
}
