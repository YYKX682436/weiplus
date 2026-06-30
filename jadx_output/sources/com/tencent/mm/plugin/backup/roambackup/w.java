package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes.dex */
public final class w implements com.tencent.wechat.aff.affroam.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f92921a;

    public w(yz5.p pVar) {
        this.f92921a = pVar;
    }

    @Override // com.tencent.wechat.aff.affroam.y0
    public final void a(int i17, java.util.ArrayList arrayList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", "[+] Create backup package complete, error = " + i17 + ", packageId = " + arrayList);
        long j17 = arrayList.isEmpty() ? -1L : (java.lang.Long) arrayList.get(0);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        kotlin.jvm.internal.o.d(j17);
        this.f92921a.invoke(valueOf, j17);
    }
}
