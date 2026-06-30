package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener$StopInterruptEventListenTask */
/* loaded from: classes14.dex */
class C13126xf20dbd9a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.C13126xf20dbd9a> f35430x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.e3();

    public C13126xf20dbd9a() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "removeListener");
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c3 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c3.a();
        a17.getClass();
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c3.class) {
            java.util.Iterator it = a17.f177417a.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) it.next()).mo48814x2efc64();
            }
            a17.f177417a.clear();
        }
    }

    public C13126xf20dbd9a(android.os.Parcel parcel) {
        v(parcel);
    }
}
