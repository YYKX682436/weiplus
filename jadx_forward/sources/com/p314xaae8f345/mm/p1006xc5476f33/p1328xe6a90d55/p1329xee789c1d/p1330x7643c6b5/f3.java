package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class f3 implements dz.n {

    /* renamed from: a, reason: collision with root package name */
    public dz.m f177437a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.C13125xbb100430 f177438b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.C13126xf20dbd9a f177439c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f177440d = false;

    public void a() {
        dz.m mVar = this.f177437a;
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "callback is invalid");
            return;
        }
        if (this.f177438b == null) {
            this.f177438b = new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.C13125xbb100430(mVar);
        }
        this.f177440d = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "startListenInterruptEvent");
        this.f177438b.d();
    }

    public void b() {
        if (!this.f177440d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "not start listen");
            return;
        }
        this.f177440d = false;
        if (this.f177439c == null) {
            this.f177439c = new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.C13126xf20dbd9a();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "stopListenInterruptEvent");
        this.f177439c.s();
    }
}
