package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes13.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f177657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 f177658e;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var, byte[] bArr) {
        this.f177658e = p0Var;
        this.f177657d = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f177658e.T1.entrySet().iterator();
        while (it.hasNext()) {
            try {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c0) ((java.util.Map.Entry) it.next()).getValue()).b(this.f177657d, java.lang.System.nanoTime() / 1000);
            } catch (java.lang.IllegalStateException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "Failed to encode audio %s", e17);
            }
        }
    }
}
