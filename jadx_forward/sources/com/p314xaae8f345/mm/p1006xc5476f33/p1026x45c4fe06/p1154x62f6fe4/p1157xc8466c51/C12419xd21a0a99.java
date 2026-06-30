package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51;

/* renamed from: com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StopInterruptEventListenTask */
/* loaded from: classes14.dex */
class C12419xd21a0a99 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.C12419xd21a0a99> f35102x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.h0();

    public C12419xd21a0a99() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "removeListener");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.f0 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.f0.a();
        a17.getClass();
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.f0.class) {
            java.util.Iterator it = a17.f167341a.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) it.next()).mo48814x2efc64();
            }
            a17.f167341a.clear();
        }
    }

    public C12419xd21a0a99(android.os.Parcel parcel) {
        v(parcel);
    }
}
