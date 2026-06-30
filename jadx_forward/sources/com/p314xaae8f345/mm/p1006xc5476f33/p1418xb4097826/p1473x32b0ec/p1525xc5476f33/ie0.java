package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ie0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0 f194496d;

    public ie0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0 le0Var) {
        this.f194496d = le0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Float f17 = (java.lang.Float) obj;
        if (f17 != null) {
            float floatValue = f17.floatValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0 le0Var = this.f194496d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(le0Var.f194923s, "initPlugin scrollAlphaData data:" + floatValue);
            le0Var.f194920p.setAlpha(floatValue);
        }
    }
}
