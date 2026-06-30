package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes3.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI f99635d;

    public r(com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI exdeviceAddDataSourceUI) {
        this.f99635d = exdeviceAddDataSourceUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f99635d.f99164e.notifyDataSetChanged();
    }
}
