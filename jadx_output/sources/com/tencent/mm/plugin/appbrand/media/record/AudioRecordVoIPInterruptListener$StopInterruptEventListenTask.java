package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes14.dex */
class AudioRecordVoIPInterruptListener$StopInterruptEventListenTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StopInterruptEventListenTask> CREATOR = new com.tencent.mm.plugin.appbrand.media.record.h0();

    public AudioRecordVoIPInterruptListener$StopInterruptEventListenTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "removeListener");
        com.tencent.mm.plugin.appbrand.media.record.f0 a17 = com.tencent.mm.plugin.appbrand.media.record.f0.a();
        a17.getClass();
        synchronized (com.tencent.mm.plugin.appbrand.media.record.f0.class) {
            java.util.Iterator it = a17.f85808a.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.sdk.event.IListener) it.next()).dead();
            }
            a17.f85808a.clear();
        }
    }

    public AudioRecordVoIPInterruptListener$StopInterruptEventListenTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
