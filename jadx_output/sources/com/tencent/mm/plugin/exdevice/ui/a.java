package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI f99392d;

    public a(com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI exdeviceAddDataSourceUI) {
        this.f99392d = exdeviceAddDataSourceUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI exdeviceAddDataSourceUI = this.f99392d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = exdeviceAddDataSourceUI.f99172p;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        exdeviceAddDataSourceUI.f99172p.dismiss();
    }
}
