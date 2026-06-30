package com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc;

/* renamed from: com.tencent.mm.game.liblockstep.LockStepNative */
/* loaded from: classes7.dex */
public class C10722xbbfb2dae {

    /* renamed from: INIT_ERROR */
    public static int f28963x769b8df9 = -1002;

    /* renamed from: NEW_LOCKSTEP_ERROR */
    public static int f28964xf5f706bf = -1000;

    /* renamed from: REPEAT_INIT_ERROR */
    public static int f28965x651b431d = -1001;
    public static java.lang.String TAG = "LockStepNative";

    /* renamed from: initCallBackFlag */
    private boolean f28966x64b1eea1 = false;

    /* renamed from: mNativeInst */
    volatile long f28967x95333f4a;

    /* renamed from: com.tencent.mm.game.liblockstep.LockStepNative$ILockStepListener */
    /* loaded from: classes7.dex */
    public interface ILockStepListener {
        /* renamed from: onCallBack */
        void mo45670x9ac7b764(long j17, java.lang.String str);
    }

    /* renamed from: com.tencent.mm.game.liblockstep.LockStepNative$ILockStepReportListener */
    /* loaded from: classes7.dex */
    public interface ILockStepReportListener {
        /* renamed from: getNetworkType */
        int mo45671x662add52();

        /* renamed from: onIdKeyStat */
        void mo45672x94ceb499(int[] iArr, int[] iArr2, int[] iArr3);

        /* renamed from: onKvStat */
        void mo45673x4c31b11e(int i17, java.lang.String str);
    }

    public C10722xbbfb2dae(long j17, long j18, long j19) {
        this.f28967x95333f4a = 0L;
        this.f28967x95333f4a = m45659x901d010c(j17, j18, j19);
    }

    /* renamed from: destoryBindingLockStep */
    private native void m45658xfb1c4888(long j17);

    /* renamed from: initBindingLockStep */
    private native long m45659x901d010c(long j17, long j18, long j19);

    /* renamed from: initCallBack */
    private native int m45660x7ccb4d95(long j17, com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc.C10722xbbfb2dae.ILockStepListener iLockStepListener, com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc.C10722xbbfb2dae.ILockStepReportListener iLockStepReportListener);

    /* renamed from: initConfigLockStep */
    private static native void m45661xfdb34d29(long j17, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    /* renamed from: test */
    public static native void m45662x364492();

    /* renamed from: testLockStepBinding */
    private native void m45663x871948fc(long j17);

    /* renamed from: updateNativeUdpInterface */
    private native void m45664xf6d760d8(long j17, long j18);

    /* renamed from: destoryLockStep */
    public void m45665xb96f57cb() {
        if (this.f28967x95333f4a != -1 && this.f28966x64b1eea1) {
            this.f28966x64b1eea1 = false;
            m45658xfb1c4888(this.f28967x95333f4a);
            this.f28967x95333f4a = -1L;
        }
    }

    /* renamed from: initConfig */
    public void m45666xf3d9c872(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        if (this.f28967x95333f4a == -1) {
            return;
        }
        m45661xfdb34d29(this.f28967x95333f4a, hashMap);
    }

    /* renamed from: setCallback */
    public int m45667x6c4ebec7(com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc.C10722xbbfb2dae.ILockStepListener iLockStepListener, com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc.C10722xbbfb2dae.ILockStepReportListener iLockStepReportListener) {
        if (this.f28967x95333f4a == -1) {
            return f28964xf5f706bf;
        }
        if (this.f28966x64b1eea1) {
            return f28965x651b431d;
        }
        int m45660x7ccb4d95 = m45660x7ccb4d95(this.f28967x95333f4a, new com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc.a(this, iLockStepListener), new com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc.b(this, iLockStepReportListener));
        if (m45660x7ccb4d95 != 0) {
            return f28963x769b8df9;
        }
        this.f28966x64b1eea1 = true;
        return m45660x7ccb4d95;
    }

    /* renamed from: testLockStepBinding */
    public void m45668x871948fc() {
        if (this.f28967x95333f4a == -1) {
            return;
        }
        m45663x871948fc(this.f28967x95333f4a);
    }

    /* renamed from: updateNativeInterface */
    public void m45669x3efb1ad9(long j17) {
        if (this.f28967x95333f4a == -1) {
            return;
        }
        m45664xf6d760d8(this.f28967x95333f4a, j17);
    }
}
