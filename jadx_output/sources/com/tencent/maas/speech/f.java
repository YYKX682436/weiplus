package com.tencent.maas.speech;

/* loaded from: classes5.dex */
public class f extends com.tencent.maas.speech.MJSpeechManagerCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.speech.c f48565a;

    public f(com.tencent.maas.speech.MJSpeechManager mJSpeechManager, com.tencent.maas.speech.c cVar, boolean z17) {
        super(mJSpeechManager, z17);
        this.f48565a = cVar;
    }

    @Override // com.tencent.maas.speech.MJSpeechManagerCallback$BaseCallback
    public void onInvoke(com.tencent.maas.speech.MJSpeechManager mJSpeechManager, java.lang.Object obj) {
        com.tencent.maas.speech.MJSpeechManagerCallback$MJSpeechManagerCallbackArg.AsyncSubmitCompleteArg asyncSubmitCompleteArg = (com.tencent.maas.speech.MJSpeechManagerCallback$MJSpeechManagerCallbackArg.AsyncSubmitCompleteArg) obj;
        com.tencent.maas.speech.c cVar = this.f48565a;
        if (cVar == null || asyncSubmitCompleteArg == null) {
            return;
        }
        cVar.a(asyncSubmitCompleteArg.responseInfo, asyncSubmitCompleteArg.error);
    }
}
