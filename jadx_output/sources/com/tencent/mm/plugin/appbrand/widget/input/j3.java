package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class j3 extends com.tencent.mm.sdk.platformtools.n3 {
    public j3(com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var, android.os.Looper looper) {
        super(looper);
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (1 == message.what) {
            ((java.lang.Runnable) message.obj).run();
        }
    }
}
