package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes15.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w f225406e;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w wVar, java.lang.String str) {
        this.f225406e = wVar;
        this.f225405d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w wVar = this.f225406e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LiteAppHandOffInfo i17 = wVar.i(this.f225405d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 Bi = ((a70.e) ((b70.e) i95.n0.c(b70.e.class))).Bi(i17.f37235x368f3a, i17.f37231x313c79, i17.f37234x6942258, i17.f37229x58b7f1c, i17.f37232x34628f, i17.f37233x66f18c8, i17.url, i17.f37230xf0df6fda, i17.f224937id);
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260 = wVar.f226063j;
        if (abstractC16085x8c838260 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "onSetCurrentHandOff but mCurrentHandOff != null! currentHandOff key:%s newHandOff key:%s", abstractC16085x8c838260.getKey(), Bi.getKey());
        }
        wVar.f226063j = Bi;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "onSetCurrentHandOff mCurrentHandOff:%s", Bi.toString());
        ((d73.i) i95.n0.c(d73.i.class)).Jc(wVar.f226063j);
    }
}
