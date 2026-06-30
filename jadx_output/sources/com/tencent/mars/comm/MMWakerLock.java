package com.tencent.mars.comm;

/* loaded from: classes12.dex */
public class MMWakerLock extends com.tencent.mars.comm.WakerLock {
    private static final java.lang.String TAG = "MicroMsg.MMWakerLock";
    private static long lastChecktime = 0;
    private static boolean sReentrantGuard = true;
    private static java.lang.Boolean shouldLock;
    private byte _hellAccFlag_;
    private com.tencent.mars.comm.MMWakerLock.IAutoUnlockCallback autoUnlockCallback;
    private android.content.Context context;
    private java.lang.String mCreatePosStackLine;
    private com.tencent.mm.sdk.platformtools.n3 mHandler;
    private java.lang.Runnable mReleaser;
    private android.os.PowerManager.WakeLock wakeLock;

    /* loaded from: classes12.dex */
    public interface IAutoUnlockCallback {
        void autoUnlockCallback();
    }

    public MMWakerLock(android.content.Context context, java.lang.String str, com.tencent.mars.comm.MMWakerLock.IAutoUnlockCallback iAutoUnlockCallback) {
        this(context, str);
        this.autoUnlockCallback = iAutoUnlockCallback;
    }

    private java.lang.String getCallerStack() {
        for (java.lang.StackTraceElement stackTraceElement : new java.lang.Throwable().getStackTrace()) {
            if (!stackTraceElement.getClassName().contains(com.tencent.mars.comm.MMWakerLock.class.getName())) {
                return stackTraceElement.toString();
            }
        }
        return "<native>";
    }

    public static void setReentrantGuard(boolean z17) {
        sReentrantGuard = z17;
    }

    @Override // com.tencent.mars.comm.WakerLock
    public void finalize() {
        com.tencent.mars.xlog.Log.i(TAG, "finalize unlock [%d,%d] @[%s]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.wakeLock.hashCode()), this.mCreatePosStackLine);
        unLock();
        super.finalize();
    }

    public java.lang.String getCreatePosStackLine() {
        return this.mCreatePosStackLine;
    }

    public int innerWakeLockHashCode() {
        return this.wakeLock.hashCode();
    }

    @Override // com.tencent.mars.comm.WakerLock
    public boolean isLocking() {
        try {
            boolean isHeld = this.wakeLock.isHeld();
            com.tencent.mars.xlog.Log.i(TAG, "check is held [%d,%d] :%b caller:[%s] @[%s]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.wakeLock.hashCode()), java.lang.Boolean.valueOf(isHeld), getCallerStack(), getCreatePosStackLine());
            return isHeld;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", "");
            return false;
        }
    }

    @Override // com.tencent.mars.comm.WakerLock
    public void lock(long j17) {
        lock(j17, getCallerStack());
    }

    @Override // com.tencent.mars.comm.WakerLock
    public void unLock() {
        if (this.wakeLock.isHeld()) {
            this.mHandler.removeCallbacks(this.mReleaser);
            synchronized (al0.h.f5729c) {
                al0.d dVar = (al0.d) al0.h.f5727a.get(hashCode());
                if (dVar != null) {
                    com.tencent.mm.sdk.platformtools.n3 n3Var = al0.h.f5728b;
                    if (dVar.f5709a) {
                        dVar.f5709a = false;
                        n3Var.removeCallbacks(dVar.f5710b);
                    }
                    java.util.Iterator it = ((java.util.HashMap) dVar.f5711c).values().iterator();
                    while (it.hasNext()) {
                        al0.g.a(((al0.c) it.next()).f5707a, false);
                    }
                    ((java.util.HashMap) dVar.f5711c).clear();
                }
            }
            com.tencent.mars.xlog.Log.i(TAG, "unlock [%d,%d] caller:[%s] @[%s]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.wakeLock.hashCode()), getCallerStack(), getCreatePosStackLine());
            try {
                android.os.PowerManager.WakeLock wakeLock = this.wakeLock;
                yj0.a.c(wakeLock, "com/tencent/mars/comm/MMWakerLock", "unLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                wakeLock.release();
                yj0.a.f(wakeLock, "com/tencent/mars/comm/MMWakerLock", "unLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", "");
            }
        }
    }

    @Override // com.tencent.mars.comm.WakerLock
    public void lock() {
        lock(getCallerStack());
    }

    public MMWakerLock(android.content.Context context, java.lang.String str) {
        this(context, str, 1);
    }

    public void lock(java.lang.String str) {
        lock(-1L, str);
    }

    public MMWakerLock(android.content.Context context, java.lang.String str, int i17) {
        super(context);
        this.mCreatePosStackLine = null;
        this.wakeLock = null;
        this.mHandler = null;
        this.autoUnlockCallback = null;
        this.mReleaser = new java.lang.Runnable() { // from class: com.tencent.mars.comm.MMWakerLock.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.tencent.mars.comm.MMWakerLock.this.wakeLock.isHeld()) {
                    com.tencent.mars.xlog.Log.w(com.tencent.mars.comm.MMWakerLock.TAG, "unlock by timeout handler! [%d,%d] @[%s]", java.lang.Integer.valueOf(com.tencent.mars.comm.MMWakerLock.this.hashCode()), java.lang.Integer.valueOf(com.tencent.mars.comm.MMWakerLock.this.wakeLock.hashCode()), com.tencent.mars.comm.MMWakerLock.this.mCreatePosStackLine);
                    com.tencent.mars.comm.MMWakerLock.this.unLock();
                    if (com.tencent.mars.comm.MMWakerLock.this.autoUnlockCallback != null) {
                        com.tencent.mars.comm.MMWakerLock.this.autoUnlockCallback.autoUnlockCallback();
                    }
                }
            }
        };
        this.mCreatePosStackLine = getCallerStack();
        android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) context.getSystemService("power")).newWakeLock(i17, str);
        this.wakeLock = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        this.mHandler = new com.tencent.mm.sdk.platformtools.n3(context.getMainLooper());
        this.context = context;
        com.tencent.mars.xlog.Log.i(TAG, "init [%d,%d] @[%s]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.wakeLock.hashCode()), this.mCreatePosStackLine);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void lock(long r23, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mars.comm.MMWakerLock.lock(long, java.lang.String):void");
    }
}
