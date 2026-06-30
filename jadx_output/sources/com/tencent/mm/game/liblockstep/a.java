package com.tencent.mm.game.liblockstep;

/* loaded from: classes7.dex */
public class a implements com.tencent.mm.game.liblockstep.LockStepNative.ILockStepListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.game.liblockstep.LockStepNative.ILockStepListener f68170a;

    public a(com.tencent.mm.game.liblockstep.LockStepNative lockStepNative, com.tencent.mm.game.liblockstep.LockStepNative.ILockStepListener iLockStepListener) {
        this.f68170a = iLockStepListener;
    }

    @Override // com.tencent.mm.game.liblockstep.LockStepNative.ILockStepListener
    public void onCallBack(long j17, java.lang.String str) {
        this.f68170a.onCallBack(j17, str);
    }
}
