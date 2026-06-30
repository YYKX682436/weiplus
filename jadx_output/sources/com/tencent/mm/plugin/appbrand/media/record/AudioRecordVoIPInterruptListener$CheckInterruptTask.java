package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes14.dex */
class AudioRecordVoIPInterruptListener$CheckInterruptTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$CheckInterruptTask> CREATOR = new com.tencent.mm.plugin.appbrand.media.record.e0();

    /* renamed from: f, reason: collision with root package name */
    public boolean f85770f = false;

    public AudioRecordVoIPInterruptListener$CheckInterruptTask(com.tencent.mm.plugin.appbrand.media.record.k kVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f85770f = parcel.readInt() == 1;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f85770f ? 1 : 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        this.f85770f = false;
        com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.e();
        boolean z17 = voipCheckIsDeviceUsingEvent.f54943g.f8247c;
        boolean H = iq.b.H();
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "isVoipUsing:%b, isMultiTalkUsing:%b, isAppBrandVoiceUsing:%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(H), java.lang.Boolean.valueOf(iq.b.d()));
        this.f85770f = z17 || H;
        c();
    }

    public AudioRecordVoIPInterruptListener$CheckInterruptTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
