package com.tencent.kinda.framework.module.impl;

/* loaded from: classes7.dex */
public class KindaNotifyImpl implements com.tencent.kinda.gen.KindaNotify {
    public static final java.lang.String TAG = "MicroMsg.KindaNotifyImpl";

    @Override // com.tencent.kinda.gen.KindaNotify
    public void notify(java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        com.tencent.mars.xlog.Log.i(TAG, "key:%s, value:%s", str, hashMap.toString());
        com.tencent.mm.autogen.events.KindaNotifyEvent kindaNotifyEvent = new com.tencent.mm.autogen.events.KindaNotifyEvent();
        am.ii iiVar = kindaNotifyEvent.f54459g;
        iiVar.getClass();
        iiVar.f6954a = hashMap;
        kindaNotifyEvent.e();
    }
}
