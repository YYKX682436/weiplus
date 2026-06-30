package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes14.dex */
public class i0 implements com.tencent.mm.plugin.appbrand.media.record.l {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.media.record.k f85812a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$CheckInterruptTask f85813b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask f85814c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StopInterruptEventListenTask f85815d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f85816e = false;

    public boolean a() {
        com.tencent.mm.plugin.appbrand.media.record.k kVar = this.f85812a;
        if (kVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioRecordVoIPInterruptListener", "callback is invalid");
            return false;
        }
        if (this.f85813b == null) {
            this.f85813b = new com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$CheckInterruptTask(kVar);
        }
        this.f85813b.s();
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "isInterrupted:%b", java.lang.Boolean.valueOf(this.f85813b.f85770f));
        return this.f85813b.f85770f;
    }

    public void b() {
        com.tencent.mm.plugin.appbrand.media.record.k kVar = this.f85812a;
        if (kVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioRecordVoIPInterruptListener", "callback is invalid");
            return;
        }
        if (this.f85814c == null) {
            this.f85814c = new com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask(kVar);
        }
        this.f85816e = true;
        this.f85814c.d();
    }
}
