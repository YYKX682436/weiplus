package com.tencent.mars.comm;

/* loaded from: classes12.dex */
public class Utils {
    private static final int MAX_TASK_ID = 2147483646;
    protected static final java.lang.String TAG = "Utils";
    private static final java.util.concurrent.atomic.AtomicInteger sTaskId = new java.util.concurrent.atomic.AtomicInteger(1);

    public static int genTaskId() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i17;
        do {
            atomicInteger = sTaskId;
            i17 = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i17, i17 >= MAX_TASK_ID ? 1 : i17 + 1));
        com.tencent.mars.xlog.Log.i(TAG, "genTaskId: " + i17);
        return i17;
    }
}
