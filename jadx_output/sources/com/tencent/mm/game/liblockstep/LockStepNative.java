package com.tencent.mm.game.liblockstep;

/* loaded from: classes7.dex */
public class LockStepNative {
    public static int INIT_ERROR = -1002;
    public static int NEW_LOCKSTEP_ERROR = -1000;
    public static int REPEAT_INIT_ERROR = -1001;
    public static java.lang.String TAG = "LockStepNative";
    private boolean initCallBackFlag = false;
    volatile long mNativeInst;

    /* loaded from: classes7.dex */
    public interface ILockStepListener {
        void onCallBack(long j17, java.lang.String str);
    }

    /* loaded from: classes7.dex */
    public interface ILockStepReportListener {
        int getNetworkType();

        void onIdKeyStat(int[] iArr, int[] iArr2, int[] iArr3);

        void onKvStat(int i17, java.lang.String str);
    }

    public LockStepNative(long j17, long j18, long j19) {
        this.mNativeInst = 0L;
        this.mNativeInst = initBindingLockStep(j17, j18, j19);
    }

    private native void destoryBindingLockStep(long j17);

    private native long initBindingLockStep(long j17, long j18, long j19);

    private native int initCallBack(long j17, com.tencent.mm.game.liblockstep.LockStepNative.ILockStepListener iLockStepListener, com.tencent.mm.game.liblockstep.LockStepNative.ILockStepReportListener iLockStepReportListener);

    private static native void initConfigLockStep(long j17, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    public static native void test();

    private native void testLockStepBinding(long j17);

    private native void updateNativeUdpInterface(long j17, long j18);

    public void destoryLockStep() {
        if (this.mNativeInst != -1 && this.initCallBackFlag) {
            this.initCallBackFlag = false;
            destoryBindingLockStep(this.mNativeInst);
            this.mNativeInst = -1L;
        }
    }

    public void initConfig(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        if (this.mNativeInst == -1) {
            return;
        }
        initConfigLockStep(this.mNativeInst, hashMap);
    }

    public int setCallback(com.tencent.mm.game.liblockstep.LockStepNative.ILockStepListener iLockStepListener, com.tencent.mm.game.liblockstep.LockStepNative.ILockStepReportListener iLockStepReportListener) {
        if (this.mNativeInst == -1) {
            return NEW_LOCKSTEP_ERROR;
        }
        if (this.initCallBackFlag) {
            return REPEAT_INIT_ERROR;
        }
        int initCallBack = initCallBack(this.mNativeInst, new com.tencent.mm.game.liblockstep.a(this, iLockStepListener), new com.tencent.mm.game.liblockstep.b(this, iLockStepReportListener));
        if (initCallBack != 0) {
            return INIT_ERROR;
        }
        this.initCallBackFlag = true;
        return initCallBack;
    }

    public void testLockStepBinding() {
        if (this.mNativeInst == -1) {
            return;
        }
        testLockStepBinding(this.mNativeInst);
    }

    public void updateNativeInterface(long j17) {
        if (this.mNativeInst == -1) {
            return;
        }
        updateNativeUdpInterface(this.mNativeInst, j17);
    }
}
