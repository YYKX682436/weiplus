package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes7.dex */
public abstract class x0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static android.support.v4.os.ResultReceiver a(android.support.v4.os.ResultReceiver resultReceiver, android.content.Context context) {
        return (resultReceiver == null || !(context instanceof androidx.core.app.ComponentActivity)) ? resultReceiver : new com.tencent.mm.plugin.appbrand.ipc.ResultReceiverFixLeak$ResultReceiverLifecycleWrapper(resultReceiver, (androidx.lifecycle.y) context);
    }
}
