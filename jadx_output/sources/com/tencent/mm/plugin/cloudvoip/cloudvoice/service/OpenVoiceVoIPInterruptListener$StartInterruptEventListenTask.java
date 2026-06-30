package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
class OpenVoiceVoIPInterruptListener$StartInterruptEventListenTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener$StartInterruptEventListenTask> CREATOR = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d3();

    /* renamed from: g, reason: collision with root package name */
    public final dz.m f95805g;

    /* renamed from: f, reason: collision with root package name */
    public int f95804f = -1;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f95806h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener$StartInterruptEventListenTask.2
        {
            this.__eventId = -797557590;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.VoipEvent voipEvent) {
            int i17 = voipEvent.f54945g.f8415b;
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener$StartInterruptEventListenTask openVoiceVoIPInterruptListener$StartInterruptEventListenTask = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener$StartInterruptEventListenTask.this;
            if (i17 == 11) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "stop voIP event");
                openVoiceVoIPInterruptListener$StartInterruptEventListenTask.f95804f = 11;
                openVoiceVoIPInterruptListener$StartInterruptEventListenTask.c();
                return false;
            }
            if (i17 != 3) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "start invite voIP event");
            openVoiceVoIPInterruptListener$StartInterruptEventListenTask.f95804f = 3;
            openVoiceVoIPInterruptListener$StartInterruptEventListenTask.c();
            return false;
        }
    };

    public OpenVoiceVoIPInterruptListener$StartInterruptEventListenTask(dz.m mVar) {
        this.f95805g = mVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f95804f = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f95804f);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        dz.m mVar = this.f95805g;
        if (mVar != null) {
            int i17 = this.f95804f;
            if (i17 == 11) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "onInterruptEnd");
                mVar.b();
            } else if (i17 == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "onInterruptBegin");
                mVar.a();
            }
            this.f95804f = -1;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "addListener");
        if (com.tencent.mm.sdk.event.d.f192370d.b(this.f95806h)) {
            return;
        }
        this.f95806h.alive();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c3 a17 = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c3.a();
        com.tencent.mm.sdk.event.IListener iListener = this.f95806h;
        a17.getClass();
        synchronized (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c3.class) {
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c3.a().f95884a.add(iListener);
        }
    }

    public OpenVoiceVoIPInterruptListener$StartInterruptEventListenTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
