package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes.dex */
public final class x implements com.tencent.wechat.aff.affroam.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f92925a;

    public x(kotlin.coroutines.Continuation continuation) {
        this.f92925a = continuation;
    }

    @Override // com.tencent.wechat.aff.affroam.y0
    public final void a(int i17, java.util.ArrayList arrayList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", "[createBackupPackage] error = " + i17 + ", packageId = " + arrayList);
        kotlin.coroutines.Continuation continuation = this.f92925a;
        if (i17 != 0 || arrayList.isEmpty()) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.mm.plugin.backup.roambackup.x1(i17, "Fail to create backup pacakge"))));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(arrayList.get(0)));
        }
    }
}
