package com.tencent.kinda.framework.module.impl;

/* loaded from: classes15.dex */
public class KindaUIEventLoop implements com.tencent.kinda.gen.KEventLoop {
    @Override // com.tencent.kinda.gen.KEventLoop
    public void post(final com.tencent.kinda.gen.IAsyncTask iAsyncTask) {
        com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.module.impl.KindaUIEventLoop.1
            @Override // java.lang.Runnable
            public void run() {
                iAsyncTask.execute();
            }
        });
    }
}
