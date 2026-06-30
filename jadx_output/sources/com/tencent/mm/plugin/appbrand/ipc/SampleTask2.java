package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes15.dex */
public class SampleTask2 extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.ipc.SampleTask2> CREATOR = new com.tencent.mm.plugin.appbrand.ipc.z0();

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.e("SampleTask2", "Run in Main Process");
    }
}
