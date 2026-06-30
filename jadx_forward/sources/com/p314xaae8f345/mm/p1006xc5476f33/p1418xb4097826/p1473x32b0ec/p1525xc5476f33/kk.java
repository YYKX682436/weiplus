package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class kk implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm f194797d;

    public kk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar) {
        this.f194797d = hmVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = this.f194797d;
        if (!booleanValue) {
            hmVar.C1 = true;
            return;
        }
        hmVar.C1 = false;
        dk2.xf j17 = dk2.ef.f314905a.j(hmVar.R0());
        if (j17 != null) {
            ((dk2.r4) j17).A(((mm2.e1) hmVar.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) hmVar.P0(mm2.e1.class)).f410516m, ((mm2.e1) hmVar.P0(mm2.e1.class)).f410525v, 1, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jk(hmVar));
        }
    }
}
