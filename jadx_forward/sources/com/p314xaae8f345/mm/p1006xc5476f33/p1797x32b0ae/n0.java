package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes8.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w f225676e;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w wVar, java.lang.String str) {
        this.f225676e = wVar;
        this.f225675d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w wVar = this.f225676e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260 = wVar.f226063j;
        if (abstractC16085x8c838260 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "onClearCurrentHandOff but mCurrentHandOff == null");
            return;
        }
        java.lang.String key = abstractC16085x8c838260.getKey();
        java.lang.String str = this.f225675d;
        if (!key.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "onClearCurrentHandOff but mCurrentHandOff key:%s != id:%s", wVar.f226063j.getKey(), str);
            ((d73.i) i95.n0.c(d73.i.class)).A8(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "onClearCurrentHandOff mCurrentHandOff:%s", wVar.f226063j.toString());
            ((d73.i) i95.n0.c(d73.i.class)).A8(wVar.f226063j.getKey());
            wVar.f226063j = null;
        }
    }
}
