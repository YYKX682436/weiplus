package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI f99413e;

    public c(com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI exdeviceAddDataSourceUI, java.lang.String str) {
        this.f99413e = exdeviceAddDataSourceUI;
        this.f99412d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI exdeviceAddDataSourceUI = this.f99413e;
        exdeviceAddDataSourceUI.f99172p = db5.e1.Q(exdeviceAddDataSourceUI.getContext(), "", exdeviceAddDataSourceUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.exdevice.ui.b(this));
    }
}
