package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class l implements java.lang.Runnable {
    public l(com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI exdeviceAddDataSourceUI) {
    }

    @Override // java.lang.Runnable
    public void run() {
        new com.tencent.mm.autogen.events.StopAllChannelEvent().e();
    }
}
