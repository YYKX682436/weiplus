package com.tencent.maas.speech;

/* loaded from: classes5.dex */
public class e extends com.tencent.maas.speech.MJSpeechManagerCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.speech.b f48564a;

    public e(com.tencent.maas.speech.MJSpeechManager mJSpeechManager, com.tencent.maas.speech.b bVar, boolean z17) {
        super(mJSpeechManager, z17);
        this.f48564a = bVar;
    }

    @Override // com.tencent.maas.speech.MJSpeechManagerCallback$BaseCallback
    public void onInvoke(com.tencent.maas.speech.MJSpeechManager mJSpeechManager, java.lang.Object obj) {
        com.tencent.maas.speech.MJSpeechManagerCallback$MJSpeechManagerCallbackArg.AsyncQueryCompleteArg asyncQueryCompleteArg = (com.tencent.maas.speech.MJSpeechManagerCallback$MJSpeechManagerCallbackArg.AsyncQueryCompleteArg) obj;
        com.tencent.maas.speech.b bVar = this.f48564a;
        if (bVar == null || asyncQueryCompleteArg == null) {
            return;
        }
        bVar.a(asyncQueryCompleteArg.responseInfo, asyncQueryCompleteArg.error);
    }
}
