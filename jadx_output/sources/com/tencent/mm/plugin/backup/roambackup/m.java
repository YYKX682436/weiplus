package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f92652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.ParcelFileDescriptor f92653e;

    public m(int i17, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.f92652d = i17;
        this.f92653e = parcelFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "open accessory successfully, fd=" + this.f92652d);
        com.tencent.mm.plugin.backup.roambackup.MmAoaManager mmAoaManager = com.tencent.mm.plugin.backup.roambackup.MmAoaManager.f92553a;
        int i17 = this.f92652d;
        mmAoaManager.getClass();
        java.util.ArrayList arrayList = com.tencent.mm.plugin.backup.roambackup.MmAoaManager.f92557e;
        synchronized (arrayList) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.backup.roambackup.k) it.next()).a(true);
            }
        }
        if (i17 >= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "Notify affroam a new fd=" + i17 + " is opened");
            com.tencent.wechat.aff.affroam.c0 c0Var = new com.tencent.wechat.aff.affroam.c0();
            c0Var.f215802e = true;
            c0Var.f215801d = 2;
            c0Var.f215805h = i17;
            c0Var.f215804g = true;
            com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().j(c0Var);
        }
        this.f92653e.close();
    }
}
