package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51;

/* renamed from: com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask */
/* loaded from: classes14.dex */
class C12418xdc8d5711 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.C12418xdc8d5711> f35101x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.g0();

    /* renamed from: f, reason: collision with root package name */
    public int f167304f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.k f167305g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f167306h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f167307i;

    public C12418xdc8d5711(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.k kVar) {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f167306h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5384x2da57458>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask.2
            {
                this.f39173x3fe91575 = -2057571736;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5384x2da57458 c5384x2da57458) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.C12418xdc8d5711.this.c();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "exit multi talk room event");
                return false;
            }
        };
        this.f167307i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask.3
            {
                this.f39173x3fe91575 = -797557590;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba) {
                int i17 = c6231x4f3054ba.f136478g.f89948b;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.C12418xdc8d5711 c12418xdc8d5711 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.C12418xdc8d5711.this;
                if (i17 == 11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "stop voIP event");
                    c12418xdc8d5711.f167304f = 11;
                    c12418xdc8d5711.c();
                    return true;
                }
                if (i17 != 3) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "start invite voIP event");
                c12418xdc8d5711.f167304f = 3;
                c12418xdc8d5711.c();
                return true;
            }
        };
        this.f167305g = kVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f167304f = parcel.readInt();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f167304f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.k kVar = this.f167305g;
        if (kVar != null) {
            int i17 = this.f167304f;
            if (i17 == 11) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "onInterruptEnd");
                kVar.b();
            } else if (i17 == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "onInterruptBegin");
                kVar.a();
            }
            this.f167304f = -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "addListener");
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.d dVar = com.p314xaae8f345.mm.sdk.p2600x5c6729a.d.f273903d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f167306h;
        if (!dVar.b(abstractC20980x9b9ad01d)) {
            abstractC20980x9b9ad01d.mo48813x58998cd();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.f0.a().getClass();
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.f0.class) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.f0.a().f167341a.add(abstractC20980x9b9ad01d);
            }
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d2 = this.f167307i;
        if (dVar.b(abstractC20980x9b9ad01d2)) {
            return;
        }
        abstractC20980x9b9ad01d2.mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.f0.a().getClass();
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.f0.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.f0.a().f167341a.add(abstractC20980x9b9ad01d2);
        }
    }

    public C12418xdc8d5711(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f167306h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5384x2da57458>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask.2
            {
                this.f39173x3fe91575 = -2057571736;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5384x2da57458 c5384x2da57458) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.C12418xdc8d5711.this.c();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "exit multi talk room event");
                return false;
            }
        };
        this.f167307i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask.3
            {
                this.f39173x3fe91575 = -797557590;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba) {
                int i17 = c6231x4f3054ba.f136478g.f89948b;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.C12418xdc8d5711 c12418xdc8d5711 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.C12418xdc8d5711.this;
                if (i17 == 11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "stop voIP event");
                    c12418xdc8d5711.f167304f = 11;
                    c12418xdc8d5711.c();
                    return true;
                }
                if (i17 != 3) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "start invite voIP event");
                c12418xdc8d5711.f167304f = 3;
                c12418xdc8d5711.c();
                return true;
            }
        };
        v(parcel);
    }
}
