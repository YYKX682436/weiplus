package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class hf implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f194337d;

    public hf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar) {
        this.f194337d = mgVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = this.f194337d;
        boolean x07 = mgVar.x0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "onCardVisibleLiveData, visible = " + bool + ", isLandscape = " + x07);
        if (x07) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14364x8eb8469 c14364x8eb8469 = mgVar.f195043w;
        if (booleanValue) {
            c14364x8eb8469.m57537x8e6ff544(com.p314xaae8f345.mm.ui.bl.b(mgVar.f446856d.getContext()).x - com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.f195031x1);
            c14364x8eb8469.requestLayout();
        } else {
            c14364x8eb8469.m57537x8e6ff544(0);
            c14364x8eb8469.requestLayout();
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gf(mgVar));
    }
}
