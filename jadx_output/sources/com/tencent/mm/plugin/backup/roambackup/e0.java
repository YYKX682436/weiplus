package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes.dex */
public final class e0 implements com.tencent.wechat.aff.affroam.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f92584a;

    public e0(kotlinx.coroutines.q qVar) {
        this.f92584a = qVar;
    }

    @Override // com.tencent.wechat.aff.affroam.a1
    public final void a(int i17, java.util.ArrayList arrayList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", "[getAllBackupPackage] GetAllBackupPackages complete, error=" + i17 + ", pkgs.size=" + arrayList.size());
        kotlinx.coroutines.q qVar = this.f92584a;
        if (i17 == 0) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(arrayList));
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.mm.plugin.backup.roambackup.x1(i17, "Fail to get all backup package"))));
        }
    }
}
