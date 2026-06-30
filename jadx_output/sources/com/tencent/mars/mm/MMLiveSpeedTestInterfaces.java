package com.tencent.mars.mm;

/* loaded from: classes12.dex */
public class MMLiveSpeedTestInterfaces {
    private static final java.lang.String TAG = "MMLiveSpeedTestInterfaces";
    private static com.tencent.mars.mm.MMLiveSpeedTestInterfaces mInstance;
    private static java.util.Map<java.lang.Integer, com.tencent.mm.network.c1> speedTestCallbackMap = new java.util.HashMap();
    private static int speedTestTaskId = 1;

    private MMLiveSpeedTestInterfaces() {
    }

    public static synchronized com.tencent.mars.mm.MMLiveSpeedTestInterfaces getInstance() {
        com.tencent.mars.mm.MMLiveSpeedTestInterfaces mMLiveSpeedTestInterfaces;
        synchronized (com.tencent.mars.mm.MMLiveSpeedTestInterfaces.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.mars.mm.MMLiveSpeedTestInterfaces();
            }
            mMLiveSpeedTestInterfaces = mInstance;
        }
        return mMLiveSpeedTestInterfaces;
    }

    public int doLiveSpeedTest(java.lang.String str, int i17, int i18, int i19, int i27, byte[] bArr, byte[] bArr2, com.tencent.mm.network.c1 c1Var) {
        int i28;
        if (c1Var == null || bArr == null || bArr2 == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("speed test callback is null ");
            sb6.append(c1Var == null);
            sb6.append(" ");
            sb6.append(bArr == null);
            sb6.append(" ");
            sb6.append(bArr2 == null);
            com.tencent.mars.xlog.Log.e(TAG, sb6.toString());
            return -1;
        }
        synchronized (com.tencent.mars.mm.MMLiveSpeedTestInterfaces.class) {
            i28 = speedTestTaskId;
            speedTestTaskId = i28 + 1;
            speedTestCallbackMap.put(java.lang.Integer.valueOf(i28), c1Var);
        }
        com.tencent.mars.xlog.Log.i(TAG, "start speed test " + str + " " + bArr.length + " " + bArr2.length + " id is " + i28);
        new java.lang.String(bArr);
        new java.lang.String(bArr2);
        com.tencent.mars.mm.SpeedTestCtx speedTestCtx = new com.tencent.mars.mm.SpeedTestCtx();
        speedTestCtx.uploadCtx = bArr;
        speedTestCtx.downloadCtx = bArr2;
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).doLiveSpeedTest(str, i17, i18, i19, i27, speedTestCtx, i28);
        return 0;
    }

    public void onLiveSpeedTestCallback(com.tencent.mars.mm.LiveSpeedTestResult liveSpeedTestResult, boolean z17) {
        com.tencent.mm.network.c1 c1Var;
        com.tencent.mars.xlog.Log.i(TAG, "receive onSpeedTestUploadDone " + z17 + " id " + liveSpeedTestResult.taskId);
        synchronized (com.tencent.mars.mm.MMLiveSpeedTestInterfaces.class) {
            c1Var = speedTestCallbackMap.get(java.lang.Integer.valueOf(liveSpeedTestResult.taskId));
        }
        if (c1Var == null) {
            com.tencent.mars.xlog.Log.e(TAG, "speed test callback is null");
            return;
        }
        try {
            try {
                if (z17) {
                    c1Var.Za(liveSpeedTestResult.pingRttSuccessful, liveSpeedTestResult.averagePingRtt, liveSpeedTestResult.pingJitter, liveSpeedTestResult.uploadSuccessful, liveSpeedTestResult.avgUploadSpeed, liveSpeedTestResult.minUploadSpeed, liveSpeedTestResult.maxUploadSpeed, liveSpeedTestResult.downloadSuccessful, liveSpeedTestResult.avgDownloadSpeed, liveSpeedTestResult.minDownloadSpeed, liveSpeedTestResult.maxDownloadSpeed);
                } else {
                    c1Var.le(liveSpeedTestResult.pingRttSuccessful, liveSpeedTestResult.averagePingRtt, liveSpeedTestResult.pingJitter, liveSpeedTestResult.uploadSuccessful, liveSpeedTestResult.avgUploadSpeed, liveSpeedTestResult.minUploadSpeed, liveSpeedTestResult.maxUploadSpeed);
                }
                if (z17) {
                    synchronized (com.tencent.mars.mm.MMLiveSpeedTestInterfaces.class) {
                        speedTestCallbackMap.remove(java.lang.Integer.valueOf(liveSpeedTestResult.taskId));
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(TAG, "error " + e17.toString());
                if (z17) {
                    synchronized (com.tencent.mars.mm.MMLiveSpeedTestInterfaces.class) {
                        speedTestCallbackMap.remove(java.lang.Integer.valueOf(liveSpeedTestResult.taskId));
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            if (z17) {
                synchronized (com.tencent.mars.mm.MMLiveSpeedTestInterfaces.class) {
                    speedTestCallbackMap.remove(java.lang.Integer.valueOf(liveSpeedTestResult.taskId));
                }
            }
            throw th6;
        }
    }
}
