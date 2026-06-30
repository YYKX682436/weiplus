package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener$StartInterruptEventListenTask */
/* loaded from: classes14.dex */
class C13125xbb100430 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.C13125xbb100430> f35429x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d3();

    /* renamed from: g, reason: collision with root package name */
    public final dz.m f177338g;

    /* renamed from: f, reason: collision with root package name */
    public int f177337f = -1;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f177339h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener$StartInterruptEventListenTask.2
        {
            this.f39173x3fe91575 = -797557590;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba) {
            int i17 = c6231x4f3054ba.f136478g.f89948b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.C13125xbb100430 c13125xbb100430 = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.C13125xbb100430.this;
            if (i17 == 11) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "stop voIP event");
                c13125xbb100430.f177337f = 11;
                c13125xbb100430.c();
                return false;
            }
            if (i17 != 3) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "start invite voIP event");
            c13125xbb100430.f177337f = 3;
            c13125xbb100430.c();
            return false;
        }
    };

    public C13125xbb100430(dz.m mVar) {
        this.f177338g = mVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f177337f = parcel.readInt();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f177337f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        dz.m mVar = this.f177338g;
        if (mVar != null) {
            int i17 = this.f177337f;
            if (i17 == 11) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "onInterruptEnd");
                mVar.b();
            } else if (i17 == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "onInterruptBegin");
                mVar.a();
            }
            this.f177337f = -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "addListener");
        if (com.p314xaae8f345.mm.sdk.p2600x5c6729a.d.f273903d.b(this.f177339h)) {
            return;
        }
        this.f177339h.mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c3 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c3.a();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f177339h;
        a17.getClass();
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c3.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c3.a().f177417a.add(abstractC20980x9b9ad01d);
        }
    }

    public C13125xbb100430(android.os.Parcel parcel) {
        v(parcel);
    }
}
