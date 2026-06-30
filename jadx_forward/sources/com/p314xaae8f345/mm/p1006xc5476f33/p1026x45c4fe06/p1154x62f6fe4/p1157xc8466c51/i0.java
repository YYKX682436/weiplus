package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51;

/* loaded from: classes14.dex */
public class i0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.l {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.k f167345a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.C12417x29f23294 f167346b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.C12418xdc8d5711 f167347c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.C12419xd21a0a99 f167348d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f167349e = false;

    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.k kVar = this.f167345a;
        if (kVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioRecordVoIPInterruptListener", "callback is invalid");
            return false;
        }
        if (this.f167346b == null) {
            this.f167346b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.C12417x29f23294(kVar);
        }
        this.f167346b.s();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "isInterrupted:%b", java.lang.Boolean.valueOf(this.f167346b.f167303f));
        return this.f167346b.f167303f;
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.k kVar = this.f167345a;
        if (kVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioRecordVoIPInterruptListener", "callback is invalid");
            return;
        }
        if (this.f167347c == null) {
            this.f167347c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.C12418xdc8d5711(kVar);
        }
        this.f167349e = true;
        this.f167347c.d();
    }
}
