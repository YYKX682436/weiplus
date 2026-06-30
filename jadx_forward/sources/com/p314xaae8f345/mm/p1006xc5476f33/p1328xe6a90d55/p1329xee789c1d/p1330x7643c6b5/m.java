package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class m implements com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o f177477a;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o oVar) {
        this.f177477a = oVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b
    public int a(byte[] bArr, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o oVar = this.f177477a;
        if (oVar.f177505d != 2) {
            return -1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE.getClass();
        int m119982x1468ea0a = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.g0.f177443c.m119982x1468ea0a(bArr, i17);
        java.util.Iterator it = oVar.f177521t.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Iterator it6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.v1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.n) ((java.util.Map.Entry) it.next()).getValue())).f177650a.T1.entrySet().iterator();
            while (it6.hasNext()) {
                try {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c0) ((java.util.Map.Entry) it6.next()).getValue()).a(bArr, java.lang.System.nanoTime() / 1000);
                } catch (java.lang.IllegalStateException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "Failed to encode audio %s", e17);
                }
            }
        }
        if (oVar.f177512k) {
            return -10086;
        }
        return m119982x1468ea0a < 0 ? -1 : 0;
    }
}
