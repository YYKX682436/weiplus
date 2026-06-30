package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes.dex */
public final class f0 implements com.tencent.wechat.aff.affroam.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f92591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f92592b;

    public f0(kotlin.jvm.internal.h0 h0Var, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f92591a = h0Var;
        this.f92592b = countDownLatch;
    }

    @Override // com.tencent.wechat.aff.affroam.a1
    public final void a(int i17, java.util.ArrayList arrayList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", "[+] Get all backup packages complete, error = " + i17 + ", pkgs.size= " + arrayList.size());
        this.f92591a.f310123d = arrayList;
        this.f92592b.countDown();
    }
}
