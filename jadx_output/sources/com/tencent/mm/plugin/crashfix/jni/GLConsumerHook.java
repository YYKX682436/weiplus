package com.tencent.mm.plugin.crashfix.jni;

/* loaded from: classes3.dex */
public class GLConsumerHook {
    public static native int hook();

    public static void report(long j17) {
        if (j17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GLConsumerHook", "test succ");
        } else {
            if (j17 == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GLConsumerHook", "null pointer");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GLConsumerHook", "pointer addr " + java.lang.Long.toHexString(j17));
        }
    }
}
