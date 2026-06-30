package com.tencent.mm.game.liblockstep;

/* loaded from: classes7.dex */
public class b implements com.tencent.mm.game.liblockstep.LockStepNative.ILockStepReportListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.game.liblockstep.LockStepNative.ILockStepReportListener f68171a;

    public b(com.tencent.mm.game.liblockstep.LockStepNative lockStepNative, com.tencent.mm.game.liblockstep.LockStepNative.ILockStepReportListener iLockStepReportListener) {
        this.f68171a = iLockStepReportListener;
    }

    @Override // com.tencent.mm.game.liblockstep.LockStepNative.ILockStepReportListener
    public int getNetworkType() {
        return this.f68171a.getNetworkType();
    }

    @Override // com.tencent.mm.game.liblockstep.LockStepNative.ILockStepReportListener
    public void onIdKeyStat(int[] iArr, int[] iArr2, int[] iArr3) {
        this.f68171a.onIdKeyStat(iArr, iArr2, iArr3);
    }

    @Override // com.tencent.mm.game.liblockstep.LockStepNative.ILockStepReportListener
    public void onKvStat(int i17, java.lang.String str) {
        this.f68171a.onKvStat(i17, str);
    }
}
