package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes.dex */
public final class d0 implements com.tencent.wechat.aff.affroam.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f92581a;

    public d0(yz5.p pVar) {
        this.f92581a = pVar;
    }

    @Override // com.tencent.wechat.aff.affroam.a1
    public final void a(int i17, java.util.ArrayList arrayList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", "[+] Get all backup packages complete, error = " + i17 + ", pkgs.size= " + arrayList.size());
        this.f92581a.invoke(java.lang.Integer.valueOf(i17), arrayList);
    }
}
