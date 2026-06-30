package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
class OpenVoiceVoIPInterruptListener$StopInterruptEventListenTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener$StopInterruptEventListenTask> CREATOR = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e3();

    public OpenVoiceVoIPInterruptListener$StopInterruptEventListenTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "removeListener");
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c3 a17 = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c3.a();
        a17.getClass();
        synchronized (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c3.class) {
            java.util.Iterator it = a17.f95884a.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.sdk.event.IListener) it.next()).dead();
            }
            a17.f95884a.clear();
        }
    }

    public OpenVoiceVoIPInterruptListener$StopInterruptEventListenTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
