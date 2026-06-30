package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class f3 implements dz.n {

    /* renamed from: a, reason: collision with root package name */
    public dz.m f95904a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener$StartInterruptEventListenTask f95905b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener$StopInterruptEventListenTask f95906c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f95907d = false;

    public void a() {
        dz.m mVar = this.f95904a;
        if (mVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "callback is invalid");
            return;
        }
        if (this.f95905b == null) {
            this.f95905b = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener$StartInterruptEventListenTask(mVar);
        }
        this.f95907d = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "startListenInterruptEvent");
        this.f95905b.d();
    }

    public void b() {
        if (!this.f95907d) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "not start listen");
            return;
        }
        this.f95907d = false;
        if (this.f95906c == null) {
            this.f95906c = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener$StopInterruptEventListenTask();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "stopListenInterruptEvent");
        this.f95906c.s();
    }
}
