package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class ma implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.na f167263d;

    public ma(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.na naVar) {
        this.f167263d = naVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w
    /* renamed from: onDestroy */
    public void mo32094xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmbedHalfScreenWxaManager", "page view destroyed, don't resume embed wxa for this page view  [" + hashCode() + ']');
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.na naVar = this.f167263d;
        naVar.f167592b = "";
        naVar.f167593c = 0;
        naVar.f167594d.set(false);
    }
}
