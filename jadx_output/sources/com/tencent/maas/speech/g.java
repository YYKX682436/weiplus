package com.tencent.maas.speech;

/* loaded from: classes5.dex */
public class g extends com.tencent.maas.speech.MJSpeechManagerCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.speech.d f48566a;

    public g(com.tencent.maas.speech.MJSpeechManager mJSpeechManager, com.tencent.maas.speech.d dVar, boolean z17) {
        super(mJSpeechManager, z17);
        this.f48566a = dVar;
    }

    @Override // com.tencent.maas.speech.MJSpeechManagerCallback$BaseCallback
    public void onInvoke(com.tencent.maas.speech.MJSpeechManager mJSpeechManager, java.lang.Object obj) {
        com.tencent.maas.speech.MJSpeechManagerCallback$MJSpeechManagerCallbackArg.CompleteArg completeArg = (com.tencent.maas.speech.MJSpeechManagerCallback$MJSpeechManagerCallbackArg.CompleteArg) obj;
        com.tencent.maas.speech.d dVar = this.f48566a;
        if (dVar == null || completeArg == null) {
            return;
        }
        dVar.a(completeArg.responseData, completeArg.error, completeArg.httpRetCode, completeArg.taskID);
    }
}
