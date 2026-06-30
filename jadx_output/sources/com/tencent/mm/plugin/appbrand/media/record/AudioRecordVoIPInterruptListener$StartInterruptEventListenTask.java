package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes14.dex */
class AudioRecordVoIPInterruptListener$StartInterruptEventListenTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask> CREATOR = new com.tencent.mm.plugin.appbrand.media.record.g0();

    /* renamed from: f, reason: collision with root package name */
    public int f85771f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.media.record.k f85772g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f85773h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f85774i;

    public AudioRecordVoIPInterruptListener$StartInterruptEventListenTask(com.tencent.mm.plugin.appbrand.media.record.k kVar) {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f85773h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExitMultiTalkRoomEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask.2
            {
                this.__eventId = -2057571736;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExitMultiTalkRoomEvent exitMultiTalkRoomEvent) {
                com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask.this.c();
                com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "exit multi talk room event");
                return false;
            }
        };
        this.f85774i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask.3
            {
                this.__eventId = -797557590;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipEvent voipEvent) {
                int i17 = voipEvent.f54945g.f8415b;
                com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask audioRecordVoIPInterruptListener$StartInterruptEventListenTask = com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask.this;
                if (i17 == 11) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "stop voIP event");
                    audioRecordVoIPInterruptListener$StartInterruptEventListenTask.f85771f = 11;
                    audioRecordVoIPInterruptListener$StartInterruptEventListenTask.c();
                    return true;
                }
                if (i17 != 3) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "start invite voIP event");
                audioRecordVoIPInterruptListener$StartInterruptEventListenTask.f85771f = 3;
                audioRecordVoIPInterruptListener$StartInterruptEventListenTask.c();
                return true;
            }
        };
        this.f85772g = kVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f85771f = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f85771f);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        com.tencent.mm.plugin.appbrand.media.record.k kVar = this.f85772g;
        if (kVar != null) {
            int i17 = this.f85771f;
            if (i17 == 11) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "onInterruptEnd");
                kVar.b();
            } else if (i17 == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "onInterruptBegin");
                kVar.a();
            }
            this.f85771f = -1;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "addListener");
        com.tencent.mm.sdk.event.d dVar = com.tencent.mm.sdk.event.d.f192370d;
        com.tencent.mm.sdk.event.IListener iListener = this.f85773h;
        if (!dVar.b(iListener)) {
            iListener.alive();
            com.tencent.mm.plugin.appbrand.media.record.f0.a().getClass();
            synchronized (com.tencent.mm.plugin.appbrand.media.record.f0.class) {
                com.tencent.mm.plugin.appbrand.media.record.f0.a().f85808a.add(iListener);
            }
        }
        com.tencent.mm.sdk.event.IListener iListener2 = this.f85774i;
        if (dVar.b(iListener2)) {
            return;
        }
        iListener2.alive();
        com.tencent.mm.plugin.appbrand.media.record.f0.a().getClass();
        synchronized (com.tencent.mm.plugin.appbrand.media.record.f0.class) {
            com.tencent.mm.plugin.appbrand.media.record.f0.a().f85808a.add(iListener2);
        }
    }

    public AudioRecordVoIPInterruptListener$StartInterruptEventListenTask(android.os.Parcel parcel) {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f85773h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExitMultiTalkRoomEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask.2
            {
                this.__eventId = -2057571736;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExitMultiTalkRoomEvent exitMultiTalkRoomEvent) {
                com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask.this.c();
                com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "exit multi talk room event");
                return false;
            }
        };
        this.f85774i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask.3
            {
                this.__eventId = -797557590;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipEvent voipEvent) {
                int i17 = voipEvent.f54945g.f8415b;
                com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask audioRecordVoIPInterruptListener$StartInterruptEventListenTask = com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask.this;
                if (i17 == 11) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "stop voIP event");
                    audioRecordVoIPInterruptListener$StartInterruptEventListenTask.f85771f = 11;
                    audioRecordVoIPInterruptListener$StartInterruptEventListenTask.c();
                    return true;
                }
                if (i17 != 3) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "start invite voIP event");
                audioRecordVoIPInterruptListener$StartInterruptEventListenTask.f85771f = 3;
                audioRecordVoIPInterruptListener$StartInterruptEventListenTask.c();
                return true;
            }
        };
        v(parcel);
    }
}
