package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.u f99623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI f99624e;

    public q(com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI exdeviceAddDataSourceUI, com.tencent.mm.plugin.exdevice.ui.u uVar) {
        this.f99624e = exdeviceAddDataSourceUI;
        this.f99623d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.e1.k(this.f99624e, com.tencent.mm.R.string.c2u, com.tencent.mm.R.string.c2s, com.tencent.mm.R.string.c2t, com.tencent.mm.R.string.c2v, false, new com.tencent.mm.plugin.exdevice.ui.o(this), new com.tencent.mm.plugin.exdevice.ui.p(this)).show();
    }
}
