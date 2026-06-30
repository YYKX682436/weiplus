package com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.jni;

/* renamed from: com.tencent.mm.plugin.crashfix.jni.GLConsumerHook */
/* loaded from: classes3.dex */
public class C13165x4b102fbe {
    /* renamed from: hook */
    public static native int m54622x30f523();

    /* renamed from: report */
    public static void m54623xc84c5534(long j17) {
        if (j17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLConsumerHook", "test succ");
        } else {
            if (j17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLConsumerHook", "null pointer");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLConsumerHook", "pointer addr " + java.lang.Long.toHexString(j17));
        }
    }
}
