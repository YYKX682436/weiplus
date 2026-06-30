package com.p314xaae8f345.p542x3306d5.p546x2eaf0c;

/* renamed from: com.tencent.mars.comm.Utils */
/* loaded from: classes12.dex */
public class C4558x4e42091 {

    /* renamed from: MAX_TASK_ID */
    private static final int f19342x22b0e21a = 2147483646;
    protected static final java.lang.String TAG = "Utils";

    /* renamed from: sTaskId */
    private static final java.util.concurrent.atomic.AtomicInteger f19343x58507bd3 = new java.util.concurrent.atomic.AtomicInteger(1);

    /* renamed from: genTaskId */
    public static int m40133xf330b0f0() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i17;
        do {
            atomicInteger = f19343x58507bd3;
            i17 = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i17, i17 >= f19342x22b0e21a ? 1 : i17 + 1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "genTaskId: " + i17);
        return i17;
    }
}
